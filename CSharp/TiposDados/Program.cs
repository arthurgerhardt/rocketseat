using System;

namespace TiposDados
{
    class Program
    {
        static void Main(string[] args)
        {
            char letra = 'a';
            char numero = '1';
            string texto = "Este curso é muito bom!";
            char primeiraLetraTexto = texto[0];
            Console.WriteLine(texto);
            Console.WriteLine(primeiraLetraTexto);
            string meuNome = "     Arthur Gerhardt    ";
            string nomeSemespaco = meuNome.Trim();
            Console.WriteLine(meuNome);
            Console.WriteLine(nomeSemespaco);
        }
    }
}
