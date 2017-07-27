(ns first-clojure.p3
  "Euler Problem 3")

(defn p-seive
  [p numbers]
  (filter #(not (= 0 (rem % p))) numbers))
  
(defn primes
  [limit]
  (loop [primes [] numbers (range 2 limit)]
    (def p (first numbers))
    (if p 
      (recur (conj primes p)
             (p-seive p numbers))
       primes)))

(defn int-sqrt
  [n]
  (loop [root 1]
    (if (> (* (inc root) (inc root)) n)
        root
        (recur (inc root)))))
        
(defn sol
  []
  (def N 600851475143)
  (def prime-factors
    (filter #(= 0 (rem N %)) (primes (inc (int-sqrt N)))))
  (if (first prime-factors)
    (last prime-factors)
    N))
