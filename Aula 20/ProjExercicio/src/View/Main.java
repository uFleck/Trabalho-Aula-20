package View;

import java.util.Scanner;
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var a1 = new Aluno();
        
        System.out.println("Seja bem-vindo(a)!");
        
        boolean logado = false;
        byte tInicial;
        do{
            System.out.println("1 - Fazer Login             2 - Cadastrar \n3 - Aula                    0 - Sair");
            tInicial = in.nextByte();
            
            switch(tInicial){
                case 1:
                    boolean voltar = false;
                    do{
                        System.out.println("Login:");
                        System.out.println("Digite seu Login:");
                        String login = in.next();
                        if(!login.equals(a1.getLogin()) && voltar == false){
                            do{
                                System.out.println("Login incorreto!");
                                System.out.println("1 - Tentar novamente        2 - Voltar");
                                byte opL = in.nextByte();
                                switch (opL){
                                    case 1:
                                        do{
                                            System.out.println("Digite seu Login novamente:");
                                            login = in.next();
                                            if(!login.equals(a1.getLogin())){
                                                System.out.println("Login incorreto!");
                                                System.out.println("1 - Tentar novamente        2 - Voltar");
                                                byte lVoltar =in.nextByte();
                                                if(lVoltar == 2){
                                                    System.out.println("Voltando...");
                                                    voltar = true;
                                                    break;
                                                }
                                            } else{
                                                System.out.println("Senha confirmada!");
                                                voltar = true;
                                            }
                                        } while(!login.equals(a1.getLogin()) || voltar == false);
                                        break;
                                    case 2:
                                        System.out.println("Voltando...");
                                        voltar = true;
                                        break;
                                }
                            } while(!login.equals(a1.getLogin()) && voltar == false);
                        }
                        
                        if(login.equals(a1.getLogin())){
                            System.out.println("Digite sua Senha:");
                            String senha = in.next();

                            if(!senha.equals(a1.getSenha())){
                                do{
                                    System.out.println("Senha incorreta!");
                                    System.out.println("1 - Tentar novamente        2 - Voltar");
                                    byte opS = in.nextByte();

                                    switch(opS){
                                        case 1:
                                            do{
                                                System.out.println("Digite sua Senha novamente:");
                                                senha = in.next();
                                                if(!senha.equals(a1.getSenha())){
                                                    System.out.println("Senha incorreta!");
                                                    System.out.println("1 - Tentar novamente        2 - Voltar");
                                                    byte sVoltar = in.nextByte();
                                                    
                                                    if(sVoltar == 2){
                                                        System.out.println("Voltando...");
                                                        voltar = true;
                                                        break;
                                                    }
                                                } else{
                                                    System.out.println("Senha confirmada!");
                                                }
                                            } while(!senha.equals(a1.getSenha()) && voltar == false);
                                            break;

                                        case 2:
                                            System.out.println("Voltando...");
                                            voltar = true;
                                    }
                                } while(!senha.equals(a1.getSenha()) && voltar == false);
                            }
                        }
                    }while(voltar == false);
                    logado = true;
                    break;

                    
                case 2:
                    System.out.println("Cadastro:");
                    
                    System.out.println("Digite seu nome:");
                    in.nextLine();
                    a1.setNome(in.nextLine());
                    
                    System.out.println("Digite seu RA:");
                    a1.setRa(in.next());
                    
                    System.out.println("Digite seu Login:");
                    a1.setLogin(in.next());
                    
                    System.out.println("Digite a sua senha:");
                    a1.setSenha(in.next());
                    
                    System.out.println("Você foi cadastrado com sucesso!");
                    break;
                    
                case 3:
                    if(logado){
                        //chama os métodos aqui, as prova e tal
                    } else{
                        System.out.println("Faça login primeiro!");
                    }
                    break;
                    
                case 0:
                    System.out.println("Bye-Bye!");
                    tInicial = 0;
                    break;
                    
                default:
                    System.out.println("Número inválido!");
            }
            
        }while(tInicial != 0);
    }
}
