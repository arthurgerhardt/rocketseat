package main

import (
	"fmt"
)

func main() {
	fmt.Println("Hello, World!")
	res, rem := dividir(10, 3)
	fmt.Println(res, rem)
}

func dividir(a int, b int) (res int, rem int) {
	res = a / b
	rem = a % b
	return res, rem
}