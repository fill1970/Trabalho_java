/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;

import java.util.List;
/**
 *
 * @author felipe
 */
import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Usuario {

    private String crmv, especialidade;
    private boolean disponivel;
    private List<String> agenda;

    public Veterinario() {
    }

    public Veterinario(int id, String nome, String email,
                       String crmv, String especialidade) {

        super(id, nome, email, null, "VET");

        this.crmv = crmv;
        this.especialidade = especialidade;
        this.disponivel = true;
        this.agenda = new ArrayList<>();
    }

    public String getCrmv() {
        return crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean v) {
        this.disponivel = v;
    }

    public void registrarLaudo(int id, String texto) {
        System.out.println("Laudo registrado pelo veterinário CRMV: " + crmv);
        System.out.println("ID registro: " + id);
        System.out.println("Descrição: " + texto);
    }

    public void emitirPrescricao(int id, String rx) {
        System.out.println("Prescrição emitida pelo veterinário CRMV: " + crmv);
        System.out.println("ID: " + id);
        System.out.println("Receita: " + rx);
    }

    public List<String> consultarAgenda() {
        return agenda;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Disponível: " + disponivel);
    }
}
