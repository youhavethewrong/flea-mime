(defproject flea-mime "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [clj-gpio "0.2.0"]]

  :profiles {:dev
             {:dependencies [[com.cemerick/piggieback "0.2.2"]
                             [org.clojure/tools.nrepl "0.2.13"]]
              :plugins [[lein-cljsbuild "1.1.7"]]
              :source-paths ["src" "dev"]
              :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}

  :clean-targets [[:cljsbuild :builds 0 :compiler :output-to]
                  [:cljsbuild :builds 0 :compiler :output-dir]
                  :target-path
                  "node_modules"
                  "package.json"
                  "package-lock.json"]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :compiler {:install-deps true
                           :language-in "es5"
                           :main flea-mime.core
                           :optimizations :simple
                           :output-dir "out"
                           :output-to "out/flea-mime.js"
                           :target :nodejs}}]})
