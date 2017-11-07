(ns flea-mime.core
  (:require [cljs.nodejs :as node]
            [gpio.core :as gpio]))

(node/enable-util-print!)
(.on js/process "uncaughtException" #(js/console.error %))

(defn -main
  [& args]
  ;; implement brilliant stuff
  (println "Yeah yeah yeah...")
  )

(set! *main-cli-fn* -main)
