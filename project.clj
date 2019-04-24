(defproject org.domaindrivenarchitecture/cryogen-markdown "0.1.6-SNAPSHOT"
  :description "Markdown parser for Cryogen"
  :url "https://github.com/cryogen-project/cryogen-markdown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.domaindrivenarchitecture/cryogen-core "0.1.53.1-SNAPSHOT"]
                 [markdown-clj "1.0.7"]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]])
