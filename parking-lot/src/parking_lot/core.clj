(ns parking-lot.core
  (:require [clojure.string :as str]))

(defn report [line]
  (let[command (str/split line #" ")]
  (cond
    (= (str/lower-case (first command)) "create_parking_lot") (println "you are in park method")
    (= (str/lower-case (first command)) "park") (println "you are in park method")
    (= (str/lower-case (first command)) "leave") (println "you are in park method")
    (= (str/lower-case (first command)) "status") (println "you are in park method")
    (= (str/lower-case (first command)) "registration_numbers_for_cars_with_colour") (println "you are in park method")
    (= (str/lower-case (first command)) "slot_numbers_for_cars_with_colour") (println "you are in park method")
    (= (str/lower-case (first command)) "slot_number_for_registration_number") (println "you are in park method")
    (= (str/lower-case (first command)) "exit") (syetm/exit 0))))

(defn -main
  ([]
   (println "Interactive shell is initiated. Please enter the command below:-")
   (doseq [line (line-seq (java.io.BufferedReader. *in*))]                                                                                                                                                                                                                        
                (if (str/blank? line)                                                                                                                                                                                                                                             
                  (println "Please enter a valid command")                                                                                                                                                                                                                                                      
                  (report line)))))
;  ([ & params]
;   (submit-topology!
;    (if (and (seq params)
;             (= (first params) "local"))
;      (let [config-file (second params)]
;        {:remote false
;         :config-file config-file
;         :config      (read-yaml-resource config-file)})
;      (let [config-file (-> params first clojure.string/trim)]
;        {:remote true
;         :config-file config-file
;         :config      (read-yaml-file config-file)})))))
