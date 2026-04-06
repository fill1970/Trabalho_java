/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClinico;
import  Usuarios.Tutor;

/**
 *
 * @author felipe
 */
public class Animal {
    private int id;
    private String nome, especie, raca,dataNascimento;
    private double peso;
    private Tutor tutor;
    private HistoricoClinico historicoClinico;
    
    public Animal(){
        
    }
    
     public Animal(int id, String nome, String especie, String raca, Tutor tutor){
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.tutor = tutor;
        this.historicoClinico = new HistoricoClinico(id);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public HistoricoClinico getHistoricoclinico() {
        return historicoClinico;
    }
     
    public void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }
        else
            System.out.println("Digite um valor válido");
    }
    
    public double getPeso() {
        return peso;
    }
    
    //terminar de fazer
    public int calcularIdade() {
        return 0;
    }
    
    public void exibir() {
      System.out.println("ID: " + id);
      System.out.println("Nome: " + nome);
      System.out.println("Espécie: " + especie);
      System.out.println("Raça: " + raca);
      System.out.println("Peso: " + peso);
      System.out.println("Tutor: " + tutor.getNome());    }
} 

