(defproject oauth-clj/oauth-clj "0.0.5-SNAPSHOT"
  :description "Clojure OAuth library."
  :dependencies [[clj-http "0.2.7"]
                 [inflections "0.6.5"]
                 [org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.1.2"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.slf4j/slf4j-log4j12 "1.5.6"]]
  :profiles {:dev {:resource-paths ["test-resources"]}}
  :min-lein-version "2.0.0")
