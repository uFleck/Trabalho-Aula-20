package Model;

public class Aluno {
    private String nome;
    private String ra;
    private String login;
    private String senha;
    private byte[] respostas;
    
    public Aluno(){
        this.respostas = new byte[10];
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

    public byte[] getRespostas() {
        return respostas;
    }

    public void setRespostas(byte[] respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nRegistro do Aluno: " + ra + "\nLogin: " + login + "\nSenha: " + senha;
    }
    
    public void cadastrar(byte i, byte respostas){
        this.respostas[i] = respostas;
    }
    
    public byte calcularNota(){
        return (calcularAcertos() - calcularErros()) / 10;
    }
    
    public String verResultado(){
        byte nota = calcularNota();
        if(nota <= 1){
             return "\nAluno Reprovado";
        }else if(nota <= 5 ){
             return "\nAluno em Recuperação";
        }else if(nota <= 9 ){
             return "\nAluno Aprovado";
        }else {
             return "\nAluno Aprovado com Laurea Acadêmica";
        }
    }
}
