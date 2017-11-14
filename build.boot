(set-env!
 :source-paths #{"src"}

 :dependencies '[[adzerk/boot-cljs "1.7.228-2"]
                 [org.clojure/clojure "1.9.0-RC1"]
                 [org.clojure/clojurescript "1.9.946"]
                 [clj-gpio "0.2.0"]])

(require '[adzerk.boot-cljs :refer [cljs]])