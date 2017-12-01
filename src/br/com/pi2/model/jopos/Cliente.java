package br.com.pi2.model.jopos;

/*Importação do Date, para usar o mesmo*/
import java.util.Date;

public class Cliente {

    private String nome;
    private int id;
    private String sobrenome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String email;
    private String telefone;
    private String endereco;
    private String enderecoNum;
    private String enderecoUF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoNum() {
        return enderecoNum;
    }

    public void setEnderecoNum(String enderecoNum) {
        this.enderecoNum = enderecoNum;
    }

    public String getEnderecoUF() {
        return enderecoUF;
    }

    public void setEnderecoUF(String enderecoUF) {
        this.enderecoUF = enderecoUF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
