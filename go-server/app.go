package main

import (
	"fmt"
	"net/http"
)

// helloHandler handles HTTP requests to the route it is assigned.
func helloHandler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprint(w, "<h1>Hello from GO Server.</h1>")
}

func main() {
	// Map the root URL ("/") to the helloHandler function
	http.HandleFunc("/", helloHandler)
	port := 8080

	fmt.Printf("Server is starting on port %d...\n", port)

	// Start the server on port 8080. 
	// ListenAndServe blocks indefinitely unless an error occurs.
	err := http.ListenAndServe(fmt.Sprintf(":%d", port), nil)
	if err != nil {
		fmt.Printf("Server failed to start: %v\n", err)
	}
}