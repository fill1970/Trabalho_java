/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;
import moduloClinico.Animal;
import moduloClinico.Consulta;
/**
 *
 * @author felipe
 */

public class Recepcionista extends Usuario {

    private String ramal;
    private String turno;

    public Recepcionista() {
    }

    public Recepcionista(int id, String nome, String email, String ramal) {
        super(id, nome, email, null, "RECP");
        this.ramal = ramal;
    }

    public void cadastrarTutor(Tutor t) {
        System.out.println("Tutor " + t.getNome() + " cadastrado");
    }

    public void cadastrarAnimal(Animal a) {
        System.out.println("Animal " + a.getNome() + " cadastrado");
    }

    public boolean agendarConsulta(Consulta ag) {
        System.out.println("Consulta agendada");
        return true;
    }

    public void cancelarConsulta(int id) {
        System.out.println("Consulta " + id + " cancelada");
    }

    public Tutor buscarTutor(String termo) {
        System.out.println("Buscando tutor: " + termo);
        return null;
    }

    public Animal buscarAnimal(String termo) {
        System.out.println("Buscando animal: " + termo);
        return null;
    }

    public String getRamal() {
        return ramal;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Ramal: " + ramal);
        System.out.println("Turno: " + turno);
    }
}