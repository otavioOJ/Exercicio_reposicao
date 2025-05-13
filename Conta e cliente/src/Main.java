import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        Cliente cliente1 = new Cliente("Otavio", 145696);
        Cliente cliente2 = new Cliente("Amanda", 123456);
        Cliente cliente3 = null;

        Conta conta1 = new Conta(1, 2000, 500);
        Conta conta2 = new Conta(2, 1500, 500);
        Conta conta3 = new Conta(3, 1000, 500);

        conta1.addCliente(cliente1);
        conta2.addCliente(cliente2);
        conta3.addCliente(cliente3);

        conta1.mostraInfo();
        conta2.mostraInfo();
        conta3.mostraInfo();

        System.out.println(conta1.getSaldo());

        conta1.deposita(700);

        System.out.println(conta1.getSaldo());

        conta1.sacar(300);

        System.out.println(conta1.getSaldo());

        System.out.println("Fim da main");
    }
}