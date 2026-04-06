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
public class Vacina extends RegistroClinico {

    private String nomeVacina, dataAplicacao, dataReforco;
    private String fabricante, lote;

    public Vacina() {
        
    }

    public Vacina(int id, String data, String descricao,
                  Veterinario veterinario, String nomeVacina) {

        super(id, data, descricao, veterinario);

        this.nomeVacina = nomeVacina;
        this.dataAplicacao = data;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public String getDataReforco() {
        return dataReforco;
    }

    public void setDataReforco(String dt) {
        this.dataReforco = dt;
    }

    public String getLote() {
        return lote;
    }

    public boolean precisaReforco() {
        return dataReforco != null;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Vacina: " + nomeVacina);
        System.out.println("Data aplicação: " + dataAplicacao);
        System.out.println("Reforço: " + dataReforco);
        System.out.println("Lote: " + lote);
        System.out.println("Fabricante: " + fabricante);
    }
}