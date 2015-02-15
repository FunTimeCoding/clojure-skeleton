(ns clojure-skeleton.core
  (:gen-class))

(defn parse-int [s]
  (Integer/parseInt (re-find #"\A-?\d+" s)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (let [test (read-line) ]
    (if (= test "1")
      (println "yay")
      (println "nay"))
    (let [test2 (* 2 (parse-int test))]
      (println test test2 )))
)
