package main

import (
	"fmt"
)

func main() {
	do(1)
	do(2)
	do(3)
}

func do(x int) {
	switch x {
	case 1:
		fmt.Println("x is 1")
	case 2:
		fmt.Println("x is 2")
	default:
		fmt.Println("x is neither 1 nor 2")
	}
}