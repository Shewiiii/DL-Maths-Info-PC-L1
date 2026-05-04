(*Partie 1*)
type ('n, 'f) tree = Node of ('n, 'f) tree * 'n * ('n, 'f) tree | Leaf of 'f


let leaf l = Leaf l
let node etiquette gauche droite = Node (gauche, etiquette, droite)

let exemple = Node (Node (Leaf 7, 2, Leaf 3), 4, Node (Leaf 5, 6, Leaf 1))

let rec max_leaf t =
    match t with
    | Leaf f -> f
    | Node (g, n, d) -> max (max_leaf g) (max_leaf d)

let rec iter_nodes g = function
    | Leaf f -> ()
    | Node (gauche, n, droite) -> 
        iter_nodes g gauche;
        g n;
        iter_nodes g droite;;

let a = Node (Leaf (), ref 0, Leaf ()) in
let b = Node (a, ref 0, a) in
iter_nodes (fun n -> n := !n+1) b;
iter_nodes (fun n -> print_int !n; print_newline ()) b;;

let rec sums t = 
    let rec aux t acc = match t with
    | Leaf f -> (Leaf f, f)
    | Node (tg, _, td) -> 
        let (tg, sg) = aux tg acc in
        let (td, sd) = aux td acc in
        (Node (tg, sg+sd, td), sg+sd)
    in fst (aux t 0);;
        

(*Partie 2*)

(*
Du cours:
- Un module est une liste de definitions. (ex: Array, String)
- Une signature est une liste de spécifications.
*)

module type DictSig = 
    sig
        type 'a t
        val empty : 'a t
        val add : string -> 'a -> 'a t -> 'a t
        val find_opt : string -> 'a t -> 'a option
        val find : string -> 'a t -> 'a
    end;;

module Dict : DictSig =
    struct
        type 'a t = (string * 'a) list
        let empty = []
        let add str element list = (str, element) :: list
        let rec find_opt str = function
        | [] -> None
        | (str', element) :: xs -> if str = str' then Some element else find_opt str xs
        let find str list = 
        match find_opt str list with
        | None -> raise Not_found
        | Some x -> x
    end;;

(*d n'est pas du bon type dans l'énoncé*)
let d = Dict.empty in (*Pas []*)
let d = Dict.add "A" 1 d in
Dict.find_opt "A" d;;

(*Rappel random: Les foncteurs sont aux modules ce que les fonctions sont aux valeurs.*)
module Dict : DictSig = Map.Make(String);;
(*Complexité en log de la taille de l'entrée*)

type expr = 
| Const of int
| Add of expr * expr
| Mul of expr * expr
| Var of string
| Let of string * expr * expr;;


(*Partie 3*)

let q1 = 1 + let x = 2 in x * x
let q2 = Let ("x", Add (Const 1, Const 1), Mul(Const 2, Let ("y", Mul(Var "x", Var "x"), Add(Var "y", Const 1))))
(*q3: 3 + let x = 2 in x * 2*)
let q3 = 7
(*q4: Peut pas s'évaluer ? z + let z = 0 in z*)
let q5 = let d = Dict.empty in let d = Dict.add "x" 3 d in Dict.add "y" 2 d

let rec eval d = function
| Const x -> x
| Add (a, b) -> (eval d a) + (eval d b)
| Mul (a, b) -> (eval d a) * (eval d b)
| Var s -> Dict.find s d
| Let (s, a, b) -> let d = Dict.add s (eval d a) d in eval d b;;  

let e = Add (Const 1, Let ("x", Const 2, Mul (Var "x", Var "x"))) in
eval Dict.empty e;;

(*q7: z et y*)

module StringSet = Set.Make(String);;

let free_vars e = 
    let rec aux set = function
    | Const _ -> set
    | Var x -> StringSet.add x set
    | Add (a, b) | Mul (a, b) -> let set = aux set a in aux set b
    | Let (x, x_def, body) -> let set = aux set body in aux (StringSet.remove x set) x_def
    in aux StringSet.empty e;;

let print_free_vars e = StringSet.iter (fun s -> print_endline s) (free_vars e)

let e = Add (Var "x", Mul (Var "y", Add (Var "x", Var "z"))) in
print_free_vars e;;