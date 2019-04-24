(defproject dda/cryogen-markdown "0.1.6"
  :description "Markdown parser for Cryogen"
  :url "https://github.com/cryogen-project/cryogen-markdown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [dda/cryogen-core "0.1.53"]
                 [markdown-clj "1.0.7"]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]])
