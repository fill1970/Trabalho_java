/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClinico;
import Usuarios.Veterinario;
/**
 *
 * @author felipe
 */
public class RegistroClinico {

    private int id;
    private String data, descricao, laudoAnexo;
    private Veterinario veterinario;
    private boolean finalizado;

    public RegistroClinico() {
        this.finalizado = false;
    }

    public RegistroClinico(int id, String data, String descricao,
    Veterinario veterinario) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.veterinario = veterinario;
        this.finalizado = false;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void finalizar() {
        this.finalizado = true;
        System.out.println("Registro clínico finalizado");
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void anexarLaudo(String path) {
        if (!finalizado) {
            this.laudoAnexo = path;
            System.out.println("Laudo anexado");
        } 
        else 
           System.out.println("Registro já finalizado. Não é possível alterar.");
    }

    public String getLaudo() {
        return laudoAnexo;
    }
    
    public void exibir() {
      System.out.println("ID: " + id);
      System.out.println("Data: " + data);
      System.out.println("Descrição: " + descricao);
      System.out.println("Veterinário: " + veterinario);
      System.out.println("Laudo: " + laudoAnexo);
      System.out.println("Finalizado: " + finalizado);
    }
}