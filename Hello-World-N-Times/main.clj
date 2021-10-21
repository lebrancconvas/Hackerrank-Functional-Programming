(defn helloworld [n]
 (loop [x 0]
 (when (< x n)
 (println "Hello World")  
 (recur (+ x 1))))) 

(helloworld 4)  