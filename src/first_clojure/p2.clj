(ns first-clojure.p2
  "Euler Problem 2")

(defn fibo-inc
  [seq]
  (cons (+ (first seq) (first (rest seq))) seq))

(defn fibo-seq
  ([limit]
    (fibo-seq limit [0 1]))
  ([limit [a b]]
    (loop [seq (list b a)]
      (if (> (first seq) limit)
        (rest seq)
        (recur (fibo-inc seq))))))
        
(defn sol
  []
  (reduce + (map #(if (= (rem % 2) 0) % 0) (fibo-seq 4000000 [1 2]))))