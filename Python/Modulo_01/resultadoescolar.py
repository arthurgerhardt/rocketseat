# Função para verificar a nota e determinar a situação do aluno
def verificar_nota(nota):
    if nota >= 7:
        return "Aprovado"
    elif 5 <= nota < 7:
        return "Em recuperação"
    else:
        return "Reprovado"

# Exemplo de uso da função
nota = float(input("Digite a nota do aluno: "))
resultado = verificar_nota(nota)
print(resultado)
