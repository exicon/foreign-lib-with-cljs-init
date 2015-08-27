(ns demo.foreign-lib-init)

(set! (.-initialData js/window) #js ["stuff"])
(.log js/console "Initializing before loading :foreign-lib")
