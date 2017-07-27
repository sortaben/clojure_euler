(ns first-clojure.core
  (:gen-class)
  (:require [first-clojure.p1 :as p1]
            [first-clojure.p2 :as p2]
            [first-clojure.p3 :as p3]))

(defn -main
  "Euler 1"
  [& args]
  (println (format "Problem 1: %d" (p1/sol))))