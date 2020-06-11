package View;

import java.util.Scanner;
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Seja bem-vindo(a)!");
        
        boolean logado = false;
        boolean cadastrado = false;
        byte tInicial;
        do{
            System.out.println("1 - Fazer Login            \n2 - Cadastrar \n3 - Aula            \n4 - Gabarito        \n0 - Sair");
            tInicial = in.nextByte();
            
            switch(tInicial){
                case 1:
                    if(cadastrado){
                        if(logado){
                            System.out.println("Você já está logado!");
                        }else{
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
                                    } else{
                                        System.out.println("Você foi logado com sucesso!");
                                        break;
                                    }
                                }
                            }while(voltar == false);
                            logado = true;
                        }
                    } else{
                        System.out.println("Cadastre-se primeiro!");
                    }
                    break;

                    
                case 2:
                    if(cadastrado){
                        System.out.println("Você já está cadastrado!");
                    } else{
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

                        cadastrado = true;
                    }
                    break;
                    
                case 3:
                    int contAcertos = 0;
                    int contErros = 0;
                    if(logado){
                        //Primeira Pergunta --------
                        int resp1;
                        do{
                        System.out.println("Iniciando a Prova!"
                                + "\n\nPrimeira Pergunta:"
                                + "\nO que caracteriza um método sem retorno?"
                                + "\n\nAlternativas"
                                + "\n1 - Possui um Return"
                                + "\n2 - Possui um metodo interno"
                                + "\n3 - Possui um retorno void"
                                + "\n4 - Nenhuma das alternativas acima");
                                resp1 = in.nextInt();
                                if(resp1 < 0 || resp1 > 4){
                                    System.out.println("Entre um número de resposta válido!");
                                }else if(resp1 == 3){
                                    contAcertos++;
                                }else{
                                    contErros++;
                                }
                        }while(resp1 <0 || resp1 >4);
                        //Segunda Pergunta ---------
                        int resp2;
                        do{
                            System.out.println("\nSegunda Pergunta:"
                                    + "\nQuais os nomes dos métodos acessores?"
                                    + "\n\nAlternativas"
                                    + "\n1 - public static void main(String [] args)"
                                    + "\n2 - acessarMetodos()"
                                    + "\n3 - Getters e Setters"
                                    + "\n4 - private");
                            resp2 = in.nextInt();
                            if(resp2 < 0 || resp2 > 4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp2 == 3){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp2 < 0 || resp2 > 4);
                        //Terceira Pergunta ----------
                        int resp3;
                        do{
                            System.out.println("\nTerceira Pergunta:"
                                    + "\nComo se chama do tipo de dado que é encapsulado?"
                                    + "\n\nAlternativas"
                                    + "\n1 - public"
                                    + "\n2 - protected"
                                    + "\n3 - default"
                                    + "\n4 - private");
                            resp3 = in.nextInt();
                            if(resp3 < 0 || resp3 > 4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp3 == 4){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp3 < 0 || resp3 > 4);
                        //Quarta Pergunta ---------
                        int resp4;
                        do{
                            System.out.println("\nQuarta Pergunta:"
                                    + "\nQuais são os operadores relacionais?"
                                    + "\n\nAlternativas"
                                    + "\n1 - if, switch, else"
                                    + "\n2 - < > <= >= == !="
                                    + "\n3 - do while, while, for"
                                    + "\n4 - public static void main");
                            resp4 = in.nextInt();
                            if(resp4 < 0 || resp4 > 4){
                                System.out.println("Entre um número de resposta válido");
                            }else if(resp4 == 2){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp4 <0 || resp4 > 4);
                        //Quinta Pergunta ---------
                        int resp5;
                        do{
                            System.out.println("\nQuinta Pergunta:"
                                    + "\nO que caracteriza uma variável do tipo String?"
                                    + "\n\nAlternativas"
                                    + "\n1 - Poder conter apenas números"
                                    + "\n2 - Poder conter apenas letras"
                                    + "\n3 - Poder conter apenas atributos do tipo private"
                                    + "\n4 - Poder conter letras e números e demais caracteres");
                            resp5 = in.nextInt();
                            if(resp5 < 0 || resp5 >4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp5 == 4){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp5 <0 || resp5 > 4);
                        //Sexta Pergunta ---------
                        int resp6;
                        do{
                            System.out.println("\nSexta Pergunta:"
                                    + "\nAnalise o codigo abaixo:"
                                    + "\npublic int calcularValores(int valor1, int valor2){"
                                    + "\n   return valor1 + valor2;"
                                    + "\n}"
                                    + "\nAs palavras da primeira linha, public, int, calcularValores, int valor1 e valor2, são, respectivamente:"
                                    + "\n\nAlternativas"
                                    + "\n1 - Encapsulamento público, tipo de dado, metodo, argumentos"
                                    + "\n2 - Encapsulamento privado, tipo de dado, operador lógico, variáveis"
                                    + "\n3 - Método, String, tipo de encapsulamento, argumentos"
                                    + "\n4 - Nenhuma das alternativas acima");
                            resp6 = in.nextInt();
                            if(resp6 < 0 || resp6 > 4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp6 == 1){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp6 <0 || resp6 >4);
                        //Sétima Pergunta ----------
                        int resp7;
                        do{
                            System.out.println("\nSétima Pergunta:"
                                    + "\nQuais são os operadores lógicos?"
                                    + "\n\nAlternativas"
                                    + "\n1 - + - * /"
                                    + "\n2 - public private static default"
                                    + "\n3 - && || !"
                                    + "\n4 - E OU NAO");
                            resp7 = in.nextInt();
                            if(resp7 <0 || resp7 >4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp7 == 3){
                                contAcertos++;
                            }else{
                            contErros++;
                            }
                        }while(resp7 <0 || resp7 >4);
                        //Oitava Pergunta
                        int resp8;
                        do{
                            System.out.println("Oitava Pergunta:"
                                    + "\nObserve o método de cálculo abaixo:"
                                    + "\npublic double calcularMatematica(){"
                                    + "\n   return 2 * (30 + 50 + [3 * 2 / (2)];"
                                    + "\n}"
                                    + "\n Qual a ordem de cálculo, segundo as regras matemáticas?"
                                    + "\n\nAlternativas"
                                    + "\n1 - Multiplicação, Divisão, Soma, Parenteses, Conchetes"
                                    + "\n2 - Divisão, Multiplicação, Parenteses, Soma, Conchetes"
                                    + "\n3 - Conchetes, Parenteses, Multiplicação e Divisão, Soma"
                                    + "\n4 - Nenhuma das alternativas");
                            resp8 = in.nextInt();
                            if(resp8 <0 || resp8 >4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp8 == 3){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp8 <0 || resp8 >4);
                        //Nona Pergunta
                        int resp9;
                        do{
                            System.out.println("\nNona Pergunta:"
                                    + "\nObserve o código abaixo:"
                                    + "\npublic double calcularMedia(){" 
                                    + "\n        double acum = 0;" 
                                    + "\n        for(int i = 0; i < this.idades.length; i++){\n" 
                                    + "\n            acum += this.idades[i];\n" 
                                    + "\n        }\n" 
                                    + "\n        return acum;\n" 
                                    + "\n    }"
                                    + "\nO código acima representa:"
                                    + "\n\nAlternativas"
                                    + "\n1 - Uma condição"
                                    + "\n2 - Laço de Repetição"
                                    + "\n3 - Um menu"
                                    + "\n4 - Uma sequência de cálculos");
                            resp9 = in.nextInt();
                            if(resp9 <0 || resp9 <4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp9 == 2){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp9<0 || resp9 >4);
                        //Décima Pergunta ----------
                        int resp10;
                        do{
                            System.out.println("\nDécima pergunta:"
                                    + "\nPara se calcular uma raiz quadrada, uma raiz cubica, e fazer uma potencia, e o valor do PI, usamos, respectivamente:"
                                    + "\n\nAlternativas"
                                    + "\n1 - Math.Pow(x,y) Math.sqrt(x) Math.cbrt(x) Math.PI"
                                    + "\n2 - Math.sqrt(x) Math.cbrt(x) Math.pow(x, y) Math.PI"
                                    + "\n3 - Math.PI Math.cbrt(x) Math.pow(x, y) Math.sqrt(x)"
                                    + "\n4 - Math.pow(x, y) Math.PI Math.sqrt(x) Math.cbrt(x)");
                            resp10 = in.nextInt();
                            if(resp10 <0 || resp10 >4){
                                System.out.println("Entre um número de resposta válido!");
                            }else if(resp10 == 2){
                                contAcertos++;
                            }else{
                                contErros++;
                            }
                        }while(resp10 <0 || resp10 >10);
                    } else{
                        System.out.println("Faça login primeiro!");
                    }
                    System.out.println("\nAluno: "+a1.getNome());
                    System.out.println("RA do Aluno: "+a1.getRa()+"\n");
                    break;
                case 4:
                    
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
