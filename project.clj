(defproject org.domaindrivenarchitecture/cryogen-markdown "0.1.5-SNAPSHOT"
  :description "Markdown parser for Cryogen"
  :url "https://github.com/cryogen-project/cryogen-markdown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.domaindrivenarchitecture/cryogen-core "0.1.47-SNAPSHOT"]
                 [markdown-clj "0.9.89"]]
  :deploy-repositories [["snapshots" :clojars]
                        ["releases" :clojars]])
