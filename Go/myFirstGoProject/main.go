package main

import (
	"bufio"
	"fmt"
	"math/rand/v2"
	"os"
	"strconv"
	"strings"
)

func main() {
	fmt.Println("Jogo da adivinhação")
	fmt.Println("Um número aleatório será sorteado. Tente acertar. O número é inteiro entre 0 a 100")

	x := rand.Int64N(101)
	scanner := bufio.NewScanner(os.Stdin)
	chutes := [10]int64{}
	for i := range chutes {
		fmt.Print("Qual é o seu chute? ")
		scanner.Scan()
		chute := scanner.Text()
		chute = strings.TrimSpace(chute)
		chuteInt, err := strconv.ParseInt(chute,  10, 64)
		if err != nil {
			fmt.Println("O valor que você digitou não é um número. Tente novamente.")
			return
		}
		switch {
			case chuteInt < x:
				fmt.Println("Você errou. O número sorteado é maior que", chuteInt)
			case chuteInt > x: 
				fmt.Println("Você errou. O número sorteado é menor que", chuteInt)
			case chuteInt == x:
				fmt.Println("Parabens, acertou o número!")
				return
		}
		chutes[i] = chuteInt
	}
	fmt.Printf("Infelizmente você não acertou o número, que era: %d\n" +
	"Você teve 10 tentativas. \n " +
	"Essas foram as suas tentativas: %v\n", x, chutes)
	fmt.Printf("O número sorteado foi: %v\n", x)
}
