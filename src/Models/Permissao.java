package models;

public class Permissao {
    private int idPermissao;
    private String nomePermissao;


    public Permissao() {
        idPermissao = 0;
        nomePermissao = "Nenhuma";

    }
    
    public int getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(int idPermissao) {
        this.idPermissao = idPermissao;
    }

    public String getNomePermissao() {
        return nomePermissao;
    }

    public void setNomePermissao(String nomePermissao) {
        this.nomePermissao = nomePermissao;
    }

    
}
