(defproject aqueductoy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [compojure "1.6.2"]
                 [ring/ring-defaults "0.1.1"]]
  :repl-options {:init-ns aqueductoy.main})
