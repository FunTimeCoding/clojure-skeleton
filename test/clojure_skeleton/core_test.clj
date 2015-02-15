(ns clojure-skeleton.core-test
  (:require [clojure.test :refer :all]
            [clojure-skeleton.core :refer :all]))

(deftest a-test
  (testing "Number zero equals zero."
    (is (= 0 0)))

  (testing "Function parse-int parses integers."
    (is (= (parse-int "1") 1))))
