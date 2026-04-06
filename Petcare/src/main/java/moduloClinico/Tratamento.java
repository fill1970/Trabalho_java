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
public class Tratamento extends RegistroClinico {

    private String descricao, medicamento;
    private int duracaoDias;

    public Tratamento() {
    }

    public Tratamento(int id, String data, String descricao,
        Veterinario veterinario, String medicamento, int duracaoDias) {

        super(id, data, descricao, veterinario);

        this.descricao = descricao;
        this.medicamento = medicamento;
        this.duracaoDias = duracaoDias;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public void setDuracaoDias(int duracaoDias) {
        if (duracaoDias > 0) {
            this.duracaoDias = duracaoDias;
        } else {
            System.out.println("Duração inválida");
        }
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Descrição do tratamento: " + descricao);
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Duração (dias): " + duracaoDias);
    }
}