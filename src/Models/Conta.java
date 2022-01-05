package models;

public class Conta {

    private int idConta;
    private int idPermissao;
    private String login;
    private String senha;
    private String nomeCompleto;
    private int statusConta;
    private final String senhaAcesso;
    private boolean logado;

    public Conta() {
        senhaAcesso = "admin";
        logado = false;
        idConta = 0;
        idPermissao = 0;
        login = "";
        senha = "";
        nomeCompleto = "";
        statusConta = 0;
        
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(int idPermissao) {
        this.idPermissao = idPermissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(int statusConta) {
        this.statusConta = statusConta;
    }

}
