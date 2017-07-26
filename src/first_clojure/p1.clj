(ns first-clojure.p1
  "Euler Problem 1")

(defn mults-of-n-under-N
  [n N]
  (loop [current n all []]
    (if (>= current N)
      all
      (recur (+ n current) (conj all current)))))

(defn sol
  []
  (reduce + (set (concat (mults-of-n-under-N 3 1000)
                         (mults-of-n-under-N 5 1000)))))