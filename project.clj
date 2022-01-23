(defproject advent-of-code-2021-clj "0.1.0-SNAPSHOT"
  :description "Doing advent of code 2021 in clojure"
  :url "https://github.com/noman-land/advent-of-code-2021-clj"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot advent-of-code-2021-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
