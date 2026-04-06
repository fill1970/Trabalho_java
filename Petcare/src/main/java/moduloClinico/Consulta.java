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
public class Consulta extends RegistroClinico {
    private String motivo, prescricao, dataRetorno;
    
    public Consulta(){
        
    }
    
    public Consulta(int id, String data, String descricao, Veterinario veterinario,
        String motivo) {
        super(id, data, descricao, veterinario);

        this.motivo = motivo;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setPrescricao(String pescricao) {
        this.prescricao = pescricao;
    }
    
    public String getPescricao() {
        return prescricao;
    }
    
    public void setDataRetorno(String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    
    public String getDataRetorno() {
        return dataRetorno;
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Motivo daconsulta: " + motivo);
        System.out.println("Prescrição médica: " + prescricao);
        System.out.println("Data de retorno: " + dataRetorno); 
    }
        
}
