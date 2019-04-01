(defproject
  csv2html "0.2.1"
  :url "https://github.com/etalab/csv2html"
  :license {:name "Eclipse Public License v2.0"
            :url  "http://www.eclipse.org/legal/epl-v20.html"}
  :plugins [[lein-ancient "0.6.14"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [compojure "1.6.1"]
                 [hiccup "1.0.5"]
                 [ring "1.7.1"]
                 [http-kit "2.3.0"]
                 [aero "1.1.3"]]
  :description "Convert plain csv into HTML datatables."
  :main csv2html.handler
  :profiles {:uberjar {:aot :all}})
