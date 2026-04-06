/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author felipe
 */
public class Administrador extends Usuario {

    private int nivelAcesso;
    private String departamento;

    public Administrador() {
    }

    public Administrador(int id, String nome, String email, String senha) {
        super(id, nome, email, senha, "ADMIN");
    }

    public boolean excluirRegistro(int id, String tipo) {
        System.out.println("Usuário ID: " + id + " excluiu registro do tipo " + tipo);
        return true;
    }

    public void ajustarEstoque(String item, int qtd) {
        System.out.println("Quantidade do item " + item + " atualizada para " + qtd);
    }

    public void gerarRelatorio(int mes, int ano) {
        System.out.println("Relatório do mês " + mes + "/" + ano);
    }

    public void gerenciarUsuario(Usuario u) {
        System.out.println("Gerenciando usuário:");
        System.out.println("Nome: " + u.getNome());
        System.out.println("Email: " + u.getEmail());
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Nível de acesso: " + nivelAcesso);
        System.out.println("Departamento: " + departamento);
    }
}
