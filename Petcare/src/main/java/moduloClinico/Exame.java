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
public class Exame extends RegistroClinico {

    private String tipo, resultado, imagemAnexo, laboratorio;

    public Exame() {
    }

    public Exame(int id, String data, String descricao,
        Veterinario veterinario, String tipo) {
        super(id, data, descricao, veterinario);

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setResultado(String r) {
        this.resultado = r;
    }

    public String getResultado() {
        return resultado;
    }

    public void anexarImagem(String path) {
        this.imagemAnexo = path;
    }

    public String getImagem() {
        return imagemAnexo;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Tipo: " + tipo);
        System.out.println("Resultado: " + resultado);
        System.out.println("Imagem: " + imagemAnexo);
        System.out.println("Laboratório: " + laboratorio);
    }
}
