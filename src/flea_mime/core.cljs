(ns flea-mime.core
  (:require [cljs.nodejs :as node]
            [clojure.pprint :as pprint]
            [gpio.core :as gpio]))

(node/enable-util-print!)
(.on js/process "uncaughtException" #(js/console.error %))

(def gpio-ports [2 3 4 14 15 18 17 27 22 23 24 10 9 11 25 8 7])

(defn gpio-stroll
  [ports]
  (doseq [port ports]
    (println "Port" port "is currently" (gpio/read-value (gpio/open-port port)))))

(defn -main
  [& args]
  (println "Dumping GPIO port statuses.")
  (gpio-stroll gpio-ports))

(set! *main-cli-fn* -main)
