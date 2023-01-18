package pkg_banco;

import java.util.*;

public class ContaCorrente {
    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner entrada = new Scanner(System.in);

    public ContaCorrente(String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt(1000);
    }

    public void VerSaldo(){
        System.out.println("O número da conta do cliente é: " + numero_conta);
        System.out.println("O nome do titular é: " + titular_conta);
        System.out.println("O saldo da conta do cliente: " + saldo);
        System.out.println("=======================================");
    }

    public void Saque(double valor_saque){
        if(saldo >= valor_saque){
            saldo = saldo - valor_saque;
            System.out.println(" Seu saldo atual é de: " + saldo);
        }else{
            System.out.println(" Seu saldo é insulficiente! ");
        }
    }
    
    public void Deposito(    double valor_deposito){
        if(valor_deposito <= 0){
            System.out.println(" Seu saldo é insulficiente para deposito! ");
        }else{
            saldo += valor_deposito;
            System.out.println(" Você possui: " + saldo);
        }
    }

    public void Iniciar(){
        int opcao;
        do{
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        }while (opcao != 4);
    }

    public void Exibir_menu(){
        System.out.println(" Bem vindo ao banco Zin");
        System.out.println(" Escolha sua opção");
        System.out.println(" 1 - Ver Saldo");
        System.out.println(" 2 - Sacar");
        System.out.println(" 3 - Depositar");
        System.out.println(" 4 - Sair");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;

        switch (opcao){
            case 1:
                VerSaldo();
                break;
                
            case 2:
                System.out.println("2 - Digite o valor que deseja sacar: ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;
                
            case 3:
                System.out.println("3 - Digite o valor que deseja depositar: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;
                
            case 4:
                System.out.println("4 - Operação finalizada! ");
                break;
            default:
                System.out.println(" Opção inválida! ");
        }
    }
}
