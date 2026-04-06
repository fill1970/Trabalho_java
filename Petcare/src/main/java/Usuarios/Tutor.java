/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Usuarios;
import moduloClinico.Animal;
/**
 *
 * @author felipe
 */

import java.util.ArrayList;
import java.util.List;
/*o codigo ainda nao compila porque não existe a classe fatura,
para as outras classes que eu fiz é a mesma coisa*/

public class Tutor extends Usuario {

    private String cpf, telefone, endereco;
    private List<Animal> animais;

    public Tutor() {
    }

    public Tutor(int id, String nome, String email,
                 String cpf, String telefone) {

        super(id, nome, email, null, "TUTOR");

        this.cpf = cpf;
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal a) {
        animais.add(a);
        System.out.println(a.getNome() + " foi adicionado pelo tutor: " + getNome());
    }

    public void verHistoricoAnimal(int id) {
        System.out.println("Exibindo histórico do animal ID: " + id);
    }

    //onde esta dando erro
    public List<Fatura> verFaturas() {
        System.out.println("Listando faturas...");
        return new ArrayList<>();
    }

    
    public Animal buscarAnimal(String nome) {
        for (int i = 0; i < animais.size(); i++) {
            Animal a = animais.get(i);

            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Quantidade de animais: " + animais.size());
    }
}
