(defproject pallet "0.0.1-SNAPSHOT"
  :description "Pallet - provisioning of compute nodes using crane"
  :java-source-path "java"
  :javac-fork "true"
  :repositories [["build.clojure.org" "http://build.clojure.org/releases/"]
		 ["snaphsotbuild.clojure.org" "http://build.clojure.org/snapshots/"]]
  :dependencies [[org.clojure/clojure "1.1.0"]
		 [org.clojure/clojure-contrib "1.1.0"]
		 [crane "1.0-SNAPSHOT"]
		 [org.apache.commons/commons-exec "1.0.1"]]
  :dev-dependencies [[leiningen/lein-swank "1.1.0"]
		     [leiningen/lein-javac "1.0.0"]
                     [autodoc "0.7.0"]]
  :autodoc {:name "Pallet"
	    :description "Pallet is used to start provision compute nodes using crane, jclouds and chef."
	    :copyright "Copyright Hugo Duncan 2010. All rights reserved."
	    :web-src-dir "http://github.com/hugoduncan/pallet/blob/"
	    :web-home "http://hugoduncan.github.com/pallet/" })
