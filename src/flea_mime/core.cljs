(ns flea-mime.core
  (:require [cljs.nodejs :as node]
            [clojure.pprint :as pprint]
            [gpio.core :as gpio]))

(node/enable-util-print!)
(.on js/process "uncaughtException" #(js/console.error %))

(defonce fs (node/require "fs"))

(defn eat-tacos
  [filename]
  (.writeFileSync fs filename (pprint/write {:tacos "delicious"} :pretty true :stream nil)))

(defn -main
  [& args]
  ;; implement brilliant stuff
  (println "Yeah yeah yeah...")
  )

(set! *main-cli-fn* -main)
