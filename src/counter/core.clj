(ns counter.core
  (:gen-class))

(defn -main []
  (doseq [num (range 0 10)]
    (println num)))