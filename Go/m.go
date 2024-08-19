package main

import "fmt"

func main() {
	x := 10
	create(x)
	fmt.Println(x)
}

func create() *int {
	x := 10
	return &x
}

// p = 0x123
//p --> 0x123 = ?