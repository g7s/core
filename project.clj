(defproject duct/core "0.7.0"
  :description "The core library for the Duct framework"
  :url "https://github.com/duct-framework/core"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [integrant "0.7.0"]
                 [medley "1.0.0"]
                 [fipp "0.6.14"]]
  :plugins [[lein-codox "0.10.3"]]
  :profiles {:provided {:dependencies [[hawk "0.2.11"]
                                       [integrant/repl "0.3.1"]]}}
  :codox {:output-path "codox"
          :project  {:name "Duct core"}
          :html     {:namespace-list :flat}
          :metadata {:doc/format :markdown}
          :source-uri
          "https://github.com/duct-framework/core/blob/{version}/{filepath}#L{line}"})
