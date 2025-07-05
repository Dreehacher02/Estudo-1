import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception { 
        System.out.println("vamos criar sua conta.");
        var scanner = new Scanner(System.in);
         System.out.println("Por favor, informe o número da conta?"); 
        int account = scanner.nextInt(); 
         System.out.println("Por favor, informe o número da agência");
        String agency = scanner.next();  
         System.out.println("Por favor, informe seu primeiro nome e segundo nome");
        var name = scanner.next(); 
        var name2 = scanner.next();
         System.out.println("Agora informe o saldo a ser depositado na conta");
        var saldo = scanner.nextFloat(); 
        
           System.out.printf("Ola %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponivel para saque \n", name, name2, agency, account, saldo);
    }
}
