package br.com.bullsblood.modelo;

public class ModelUser {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

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

    public String getCodigoDeVerificacao() {
        return codigoDeVerificacao;
    }

    public void setCodigoDeVerificacao(String codigoDeVerificacao) {
        this.codigoDeVerificacao = codigoDeVerificacao;
    }

    public ModelUser(int userID, String nomeDeUsuario, String email, String senha, String codigoDeVerificacao) {
        this.userID = userID;
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.senha = senha;
        this.codigoDeVerificacao = codigoDeVerificacao;
    }

    public ModelUser(int userID, String nomeDeUsuario, String email, String senha) {
        this.userID = userID;
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.senha = senha;
    }
    
     public ModelUser(String nomeDeUsuario, String email, String senha) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.email = email;
        this.senha = senha;
    }

    public ModelUser() {
    }

    private int userID;
    private String nomeDeUsuario;
    private String email;
    private String senha;
    private String codigoDeVerificacao;
}
