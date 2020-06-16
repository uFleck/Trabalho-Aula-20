package Model;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private String ra;
    private String login;
    private String senha;
    private int[] respostas;
    
    public Aluno(){
        this.respostas = new int[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
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

    public int[] getRespostas() {
        return respostas;
    }

    public void setRespostas(int[] respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRegistro do Aluno: " + ra + "\nLogin: " + login + "\nSenha: " + senha;
    }
    
    public void cadastrar(int i, int respostas){
        this.respostas[i] = respostas;
    }
    
    int contErros;
    int contAcertos;
    int[] respostasCorretas = {3, 3, 4, 2, 4, 1, 3, 3, 2, 2};
    
    public String verResultado(){
        contErros = 0;
        contAcertos = 0;
        for(byte i = 0; i < respostas.length; i++){
            if(respostas[i] != respostasCorretas[i]){
                contErros++;
            }else{
                contAcertos++;
            }
        }
        
        if(contAcertos <= 1){
             return "Você acertou " + contAcertos + ", portanto, você foi Reprovado.";
        }else if(contAcertos <= 5 ){
             return "Você acertou " + contAcertos + ", portanto, você está em Recuperação.";
        }else if(contAcertos <= 9 ){
             return "Você acertou " + contAcertos + ", portanto, você foi Aprovado.";
        }else {
             return "Você acertou " + contAcertos + ", portanto, você foi Aprovado com Laurea Acadêmica.";
        }
    }
    

        
    public String calcularAcertosEErros(){
        contErros = 0;
        contAcertos = 0;
        for(byte i = 0; i < respostas.length; i++){
            if(respostas[i] != respostasCorretas[i]){
                contErros++;
            }else{
                contAcertos++;
            }
        }
        return "\nVocê acertou " + contAcertos + " e errou " + contErros;
        
    }
    
    public String verGabarito(){
        return "\nQuestão 1  = Alternativa 3"+
               "\nQuestão 2  = Alternativa 3"+
               "\nQuestão 3  = Alternativa 4"+
               "\nQuestão 4  = Alternativa 2"+
               "\nQuestão 5  = Alternativa 4"+
               "\nQuestão 6  = Alternativa 1"+
               "\nQuestão 7  = Alternativa 3"+
               "\nQuestão 8  = Alternativa 3"+
               "\nQuestão 9  = Alternativa 2"+
               "\nQuestão 10 = Alternativa 2"+
               "\n----------------------------\n";
    }
}
