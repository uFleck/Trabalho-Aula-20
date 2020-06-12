package Model;

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
        return "\nNome: " + nome + "\nRegistro do Aluno: " + ra + "\nLogin: " + login + "\nSenha: " + senha;
    }
    
    public void cadastrar(int i, int respostas){
        this.respostas[i] = respostas;
    }
    
    int nota;
    public void calcularNota(int contAcertos, int contErros){
        nota = (contAcertos - contErros) / 10;
    }
    
    public String verResultado(){
        if(nota <= 1){
             return "\nVocê foi Reprovado";
        }else if(nota <= 5 ){
             return "\nVocê está em Recuperação";
        }else if(nota <= 9 ){
             return "\nVocê foi Aprovado";
        }else {
             return "\nVocê foi Aprovado com Laurea Acadêmica";
        }
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
               "\nQuestão 10 = Alternativa 2\n";
    }
}
