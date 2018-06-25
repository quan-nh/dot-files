{:user {:plugins [[lein-ancient "0.6.15"]
                  [lein-cljfmt "0.5.6"]
		  [lein-nsorg "0.1.4"]
		  [walmartlabs/vizdeps "0.1.6"]]}
 :repl {:plugins [[cider/cider-nrepl "0.17.0"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.13"]
                       [cider/piggieback "0.3.5"]
                       [figwheel-sidecar "0.5.16"]]
        :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}}
