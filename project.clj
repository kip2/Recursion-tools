(defproject scraping "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/tools.cli "1.1.230"]
                 [cheshire "5.13.0"]
                 [etaoin "1.1.42"]
                 [lynxeyes/dotenv "1.1.0"]]
  :main scraping.core
  :aot :all
  :uberjar-name "Recursion-scraping.jar"
  :repl-options {:init-ns scraping.core})