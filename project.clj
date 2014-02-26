(defproject rikai "0.1-dev"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.fressian "0.2.0"]
                 [com.datomic/datomic-free "0.9.4556"]

                 ; service
                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler rikai.service/app})
