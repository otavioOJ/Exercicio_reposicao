package br.inatel.cdg;

import javax.xml.transform.Source;
import java.util.HashSet;
import java.util.Set;

public class Conta{
    private int numero;
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(int numero, float saldo, float limite){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    //Comportamento de Conta
    public void sacar(float quantia){
        if(saldo >= quantia){
            this.saldo -= quantia;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposita(float quantia){
        this.saldo += quantia;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void mostraInfo(){
        for(Cliente cliente: clientes){
            try{
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("cpf: " + cliente.getCpf());
                System.out.println("Saldo do Cliente: " + this.saldo);
                System.out.println("Limite do Cliente: " + this.limite);
            }
            catch(NullPointerException e){
                System.out.println("Cliente inexistente nessa posição");
            }
        }
    }

    public float getSaldo(){
        return this.saldo;
    }

}
