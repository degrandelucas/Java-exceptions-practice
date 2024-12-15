package exceptions.practice.application;

import exceptions.practice.exceptions.ExceptionLoginInvalido;
import exceptions.practice.model.Cadastro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //1 - try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
        /*System.out.println("Digite o numerador e depois o denominador (Exemplo 4 e depois 2 para 4/2: )");
        int numerador = leitura.nextInt();
        int denominador = leitura.nextInt();
        try {
            double resultadoDivisao = numerador / denominador;
            System.out.println("Resultado da divisao: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Nao existe divisao por zero " + e.getMessage());
        }*/

        //2 - bloco try/catch para capturar a exceção SenhaInvalidaException
        /*Cadastro usuario1 = new Cadastro("Lucas", "123@43");

        System.out.println("Por favor, digite o usuario para login: ");
        String usarioLogin = leitura.nextLine();

        System.out.println("Por favor, digite a senha para login: ");
        String senhaLogin = leitura.nextLine();

        try {
            usuario1.login(usarioLogin, senhaLogin);
            System.out.println("Login realizado com sucesso!");
        } catch (ExceptionLoginInvalido e) {
            System.out.println(e.getMessage());
        } */

        // 3 - Utilize a API pública do GitHub para obter os dados do perfil dos usuarios
        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = leitura.nextLine();

    }
}