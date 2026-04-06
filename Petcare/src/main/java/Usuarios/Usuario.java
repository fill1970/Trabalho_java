/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author felipe
 */
import java.time.LocalDateTime;

public class Usuario {

    private int id;
    private String nome, email, senha, perfil;
    private String dataCadastro;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;

        this.dataCadastro = LocalDateTime.now().toString();
        this.ativo = true;
    }

    public boolean login(String email, String senha) {
        if (this.email == null || this.senha == null) return false;
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void logout() {
        System.out.println("Usuário deslogado");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else 
            System.out.println("O nome não pode ser nulo");
        
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else 
            System.out.println("O email deve conter @");
        
    }

    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 4) {
            this.senha = senha;
        } else 
            System.out.println("Senha inválida");
        
    }

    public void setPerfil(String perfil) {
        if (perfil != null &&
            (perfil.equals("ADMIN") ||
             perfil.equals("VET") ||
             perfil.equals("RECP") ||
             perfil.equals("TUTOR"))) {

            this.perfil = perfil;
        } else 
            System.out.println("Perfil inválido");
        
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        ativo = false;
    }

    public void exibir() {
        System.out.println("Perfil: " + perfil);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Ativo: " + ativo);
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}
