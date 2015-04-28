(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
(println "Cleanliness is next to godliness")
(defn train
  []
  (println "Choo choo!"))

(if true
  "abra cadabra"
  "hocus pocus")

(if true 
  (do (println "Success!")
      "abra cadabra")
  (do (println "Failure :(")
      "hocus pocus"))

(when true
  (println "Success!")
  "abra cadabra")

(def failed-protagonist-names
  ["Larry Potter"
   "Doreen the Explorer"
   "The incredible bulk"])

(def severity :mild)
(def error-message "Oh god.  it's a disaster we're ")
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVENIENCED"))
  (def error-message (str error-message "doomed")))
