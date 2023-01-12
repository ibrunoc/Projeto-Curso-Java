package pkg_banco;

public class Banco_teste {
    public static void main(String[] args) {
        
        ContaCorrente Status = new ContaCorrente("Bruno", 2000.00);

        Status.VerSaldo();
        Status.Iniciar();
    }
}
