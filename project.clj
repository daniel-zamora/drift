;; IMPORTANT: When bumping the version number here, be sure to bump it also in
;; src/drift/drift_version.clj! 
(defproject org.clojars.daniel-zamora/drift "1.5.5-SNAPSHOT"
  :description "Drift is a rails like migration framework for Clojure."
  :dependencies [[org.clojars.daniel-zamora/clojure-tools "1.1.5-SNAPSHOT"]
                 [org.clojure/tools.logging "0.2.3"]]
  :profiles {:dev {:dependencies [[log4j/log4j "1.2.16"]]}}

  :aot [drift.listener-protocol drift.Drift])