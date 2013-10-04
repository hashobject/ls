(ns ls.core-test
  (:use clojure.test
        ls.core))

(deftest ls-test
  (testing "Should return just one file in the directory"
    (is (= (count (ls "test/ls")) 1 ))
    (is (= (first (ls "test/ls")) "core_test.clj" )))
  (testing "Should return just file path if input was file path"
    (is (= (count (ls "test/ls/core_test.clj")) 1 ))
    (is (= (first (ls "test/ls")) "core_test.clj" )))
  (testing "Should return nil if there is no such file or directory"
    (is (= (ls "xxx") nil))))
