package br.com.bullsblood.modelo;

public class ModelLogin {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ModelLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public ModelLogin() {
    }

    private String email;
    private String senha;
}
