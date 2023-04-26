package org.example.composicao;

public class Endereco {
    private String cidade;
    private String bairro;
    private String address;

    public Endereco(String cidade, String bairro, String address) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.address = address;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
