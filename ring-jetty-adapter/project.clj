(defproject ring/ring-jetty-adapter "1.1.7"
  :description "Ring Jetty adapter."
  :url "https://github.com/ring-clojure/ring"
  :dependencies [[ring/ring-core "1.1.7"]
                 [ring/ring-servlet "1.1.7"]
                 [org.eclipse.jetty/jetty-server "7.6.1.v20120215"]]
  :profiles
  {:dev {:dependencies [[clj-http "0.3.2"]]}})
