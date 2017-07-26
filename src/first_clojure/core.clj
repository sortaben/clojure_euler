(ns first-clojure.core
  (:gen-class)
  (:require [first-clojure.p1 :as p1]))

(defn -main
  "Euler 1"
  [& args]
  (println (format "Problem 1: %d" (p1/sol))))