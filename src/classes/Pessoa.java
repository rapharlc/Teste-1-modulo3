package classes;

import java.util.InputMismatchException;

public class Pessoa {
    //#region Atributos
    private String nome;
    private String cpf;
    private char sexo;
    private Aeronave aviao;
    //#endregion

    //#region Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && cpf.matches("\\d{11}")){
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("O CPF deve ter 11 dígitos");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if("MmFf".indexOf(sexo) > -1) {
            this.sexo = sexo;
        } else {
            throw new InputMismatchException("Sexo só pode ser M ou F");
        }
        
    }
    //#endregion
    
    public Aeronave getAviao() {
        return aviao;
    }

    public void setAviao(Aeronave aviao) {
        this.aviao = aviao;
    }

    public Pessoa(String nome, String cpf, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    

    //#region Métodos públicos
    public String cumprimentar() {
        return "Olá, desconhecido. Meu nome é " + nome;
    }

    public String cumprimentar(String nomeOutraPessoa) {
        return "Olá, " + nomeOutraPessoa + ". Meu nome é " + nome;
    }
    //#endregion

    public void acelerar(){
        aviao.acelerar();
    }
    public void acelerar(int limite){
        aviao.acelerar(limite);
    }

}

