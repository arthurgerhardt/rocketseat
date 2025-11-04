package main
import "fmt"

func main() {
    x := 10
    change(&x)
    fmt.Println(x)
}

func change(i *int) {
    *i = 20
}