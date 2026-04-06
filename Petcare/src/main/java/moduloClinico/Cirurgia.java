/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClinico;
import java.util.ArrayList;
import java.util.List;
import Usuarios.Veterinario;

/**
 *
 * @author felipe
 */
public class Cirurgia extends RegistroClinico {

    private int duracao;
    private String sala;
    private String anestesia;
    private List<String> equipe;
    private List<String> medicamentos;

    public Cirurgia() {
       
    }

    public Cirurgia(int id, String data, String descricao,
        Veterinario veterinario, String sala) {

        super(id, data, descricao, veterinario);

        this.sala = sala;
        this.equipe = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
    }

    public String getSala() {
        return sala;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setEquipe(String e) {
        this.equipe.add(e);
    }

    public void adicionarMedicamento(String m) {
        this.medicamentos.add(m);
    }

    public boolean validarRecursos() {
        return !equipe.isEmpty() && !medicamentos.isEmpty() && duracao >= 120;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Sala: " + sala);
        System.out.println("Duração: " + duracao);
        System.out.println("Anestesia: " + anestesia);
        System.out.println("Equipe: " + equipe.size());
        System.out.println("Medicamentos: " + medicamentos.size());
    }
}