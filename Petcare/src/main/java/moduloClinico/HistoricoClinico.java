/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClinico;
/**
 *
 * @author felipe
 */
import java.util.ArrayList;
import java.util.List;

public class HistoricoClinico {

    private int idanimal;
    private List<Consulta> consultas;
    private List<Vacina> vacinas;
    private List<Cirurgia> cirurgias;
    private List<Exame> exames;
    private List<Tratamento> tratamentos;
    private boolean finalizado;

    public HistoricoClinico() {
        this.consultas = new ArrayList<>();
        this.vacinas = new ArrayList<>();
        this.cirurgias = new ArrayList<>();
        this.exames = new ArrayList<>();
        this.tratamentos = new ArrayList<>();
        this.finalizado = false;
    }

    public HistoricoClinico(int idanimal) {
        this();
        this.idanimal = idanimal;
    }

    public void adicionarConsulta(Consulta c) {
        if (!finalizado) {
            consultas.add(c);
            System.out.println("Consulta adicionada");
        }
    }

    public void adicionarVacina(Vacina v) {
        if (!finalizado) {
            vacinas.add(v);
            System.out.println("Vacina adicionada");
        }
    }

    public void adicionarCirurgia(Cirurgia c) {
        if (!finalizado) {
            cirurgias.add(c);
            System.out.println("Cirurgia adicionada");
        }
    }

    public void adicionarExame(Exame e) {
        if (!finalizado) {
            exames.add(e);
            System.out.println("Exame adicionado");
        }
    }

    public void adicionarTratamento(Tratamento t) {
        if (!finalizado) {
            tratamentos.add(t);
            System.out.println("Tratamento adicionado");
        }
    }

    public void finalizar() {
        this.finalizado = true;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void exibir() {
        System.out.println("ID Animal: " + idanimal);
        System.out.println("Consultas: " + consultas.size());
        System.out.println("Vacinas: " + vacinas.size());
        System.out.println("Cirurgias: " + cirurgias.size());
        System.out.println("Exames: " + exames.size());
        System.out.println("Tratamentos: " + tratamentos.size());
        System.out.println("Finalizado: " + finalizado);
    }
}
