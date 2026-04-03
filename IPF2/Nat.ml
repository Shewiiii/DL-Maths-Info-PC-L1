module Nat:
    sig
        type t
        exception Negative
        val of_int: int -> t
        val to_int: t -> int
        val add: t -> t -> t
        val mult: t -> t -> t
        val div: t -> t -> t
        val sub: t -> t -> t option
    end = 
    struct
        type t = int
        exception Negative
        let of_int n = if n < 0 then raise Negative else n
        let to_int nt = nt
        let add n m = n + m
        let mult n m = n * m
        let div n m = n / m 
        let sub n m = 
            let r = n - m in
            if r < 0 then None
            else Some r
    end

let incr n = Nat.add n (Nat.of_int 1)
let sum ns = List.fold_left (fun acc n -> Nat.add acc n) (Nat.of_int 0) ns
(*Nat.to_int (sum [Nat.of_int 1; Nat.of_int 2; Nat.of_int 3])*)
let less_than n1 n2 = (Nat.to_int n1) < (Nat.to_int n2)
(*less_than (Nat.of_int 6) (Nat.of_int 7)*)