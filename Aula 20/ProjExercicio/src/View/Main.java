package View;

import java.util.Scanner;
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("------------------");
        System.out.println("Seja bem-vindo(a)!");
        System.out.println("------------------");
        
        boolean fezProva = false;         
        boolean logado = false;
        boolean cadastrado = false;
        byte tInicial;
        do{
            System.out.println("1 - Fazer Login"
                                + "\n2 - Cadastrar "
                                + "\n3 - Prova"
                                + "\n4 - Gabarito"
                                + "\n5 - Quantidade de erros e acertos"
                                + "\n6 - Informações do usuário"
                                + "\n7 - Resultado da prova"
                                + "\n0 - Sair");
            tInicial = in.nextByte();
            
            switch(tInicial){
                case 1:
                    byte voltar1 = 1;
                    if(cadastrado){
                        if(logado){
                            System.out.println("####################");
                            System.out.println("Você já está logado!");
                            System.out.println("####################");
                            do{
                                if(voltar1 != 1){
                                    System.out.println("################");
                                    System.out.println("Número inválido!");
                                    System.out.println("################");
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar1 = in.nextByte();
                                }else{
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar1 = in.nextByte();
                                }
                            }while(voltar1 != 1);
                        }else{
                            boolean voltar = false;
                            do{
                                System.out.println("-----");
                                System.out.println("Login");
                                System.out.println("-----");
                                System.out.println("Digite seu Login:");
                                String login = in.next();
                                if(!login.equals(a1.getLogin()) && voltar == false){
                                    do{
                                        System.out.println("################");
                                        System.out.println("Login incorreto!");
                                        System.out.println("################");
                                        System.out.println("1 - Tentar novamente        2 - Voltar");
                                        byte opL = in.nextByte();
                                        switch (opL){
                                            case 1:
                                                do{
                                                    System.out.println("Digite seu Login novamente:");
                                                    login = in.next();
                                                    if(!login.equals(a1.getLogin())){
                                                        System.out.println("################");
                                                        System.out.println("Login incorreto!");
                                                        System.out.println("1 - Tentar novamente        2 - Voltar");
                                                        byte lVoltar = in.nextByte();
                                                        if(lVoltar == 2){
                                                            System.out.println("Voltando...");
                                                            voltar = true;
                                                            break;
                                                        }
                                                    } else{
                                                        System.out.println("-----------------");
                                                        System.out.println("Login confirmado!");
                                                        System.out.println("-----------------");
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
                                            System.out.println("################");
                                            System.out.println("Senha incorreta!");
                                            System.out.println("################");
                                            System.out.println("1 - Tentar novamente        2 - Voltar");
                                            byte opS = in.nextByte();

                                            switch (opS){
                                                case 1:
                                                    do{
                                                        System.out.println("Digite sua Senha novamente:");
                                                        senha = in.next();
                                                        if(!senha.equals(a1.getSenha())){
                                                            System.out.println("################");
                                                            System.out.println("Senha incorreta!");
                                                            System.out.println("1 - Tentar novamente        2 - Voltar");
                                                            byte sVoltar = in.nextByte();
                                                            if(sVoltar == 2){
                                                                System.out.println("Voltando...");
                                                                voltar = true;
                                                                break;
                                                            }
                                                        } else{
                                                            System.out.println("-----------------");
                                                            System.out.println("Senha confirmada!");
                                                            System.out.println("-----------------");
                                                            voltar = true;
                                                            break;
                                                        }
                                                    } while(!senha.equals(a1.getSenha()) || voltar == false);

                                                case 2:
                                                    System.out.println("Voltando...");
                                                    voltar = true;
                                                    break;
                                            }
                                        } while(!senha.equals(a1.getSenha()) && voltar == false);
                                    } else{
                                        System.out.println("----------------------------");
                                        System.out.println("Você foi logado com sucesso!");
                                        System.out.println("----------------------------");
                                        logado = true;
                                        do{
                                            if(voltar1 != 1){
                                                System.out.println("################");
                                                System.out.println("Número inválido!");
                                                System.out.println("################");
                                                System.out.println("Voltar? \n1 - Sim");
                                                voltar1 = in.nextByte();
                                            }else{
                                                System.out.println("Voltar? \n1 - Sim");
                                                voltar1 = in.nextByte();
                                            }
                                        }while(voltar1 != 1);
                                        break;
                                    }
                                    if(senha.equals(a1.getSenha()) && login.equals(a1.getLogin())){
                                        System.out.println("----------------------------");
                                        System.out.println("Você foi logado com sucesso!");
                                        System.out.println("----------------------------");
                                        logado = true;
                                    }
                                }
                            }while(voltar == false);
                        }
                    } else{
                        System.out.println("#####################");
                        System.out.println("Cadastre-se primeiro!");
                        System.out.println("#####################");
                        do{
                            if(voltar1 != 1){
                                System.out.println("################");
                                System.out.println("Número inválido!");
                                System.out.println("################");
                                System.out.println("Voltar? \n1 - Sim");
                                voltar1 = in.nextByte();
                            }else{
                                System.out.println("Voltar? \n1 - Sim");
                                voltar1 = in.nextByte();
                            }
                        }while(voltar1 != 1);
                    }
                    break;

                    
                case 2: 
                    byte voltar2 = 1;
                    if(cadastrado){
                        System.out.println("########################");
                        System.out.println("Você já está cadastrado!");
                        System.out.println("########################");
                        do{
                            if(voltar2 != 1){
                                System.out.println("################");
                                System.out.println("Número inválido!");
                                System.out.println("################");
                                System.out.println("Voltar? \n1 - Sim");
                                voltar2 = in.nextByte();
                            }else{
                                System.out.println("Voltar? \n1 - Sim");
                                voltar2 = in.nextByte();
                            }
                        }while(voltar2 != 1);
                    } else{
                        System.out.println("--------");
                        System.out.println("Cadastro");
                        System.out.println("--------");

                        System.out.println("Digite seu nome:");
                        in.nextLine();
                        a1.setNome(in.nextLine());

                        System.out.println("Digite seu RA:");
                        a1.setRa(in.next());

                        System.out.println("Digite seu Login:");
                        a1.setLogin(in.next());

                        System.out.println("Digite a sua senha:");
                        a1.setSenha(in.next());
                        
                        System.out.println("--------------------------------");
                        System.out.println("Você foi cadastrado com sucesso!");
                        System.out.println("--------------------------------");
                        do{
                            if(voltar2 != 1){
                                System.out.println("################");
                                System.out.println("Número inválido!");
                                System.out.println("################");
                                System.out.println("Voltar? \n1 - Sim");
                                voltar2 = in.nextByte();
                            }else{
                                System.out.println("Voltar? \n1 - Sim");
                                voltar2 = in.nextByte();
                            }
                        }while(voltar2 != 1);
                        cadastrado = true;
                    }
                    break;
                
                case 3:
                    byte voltar3 = 1;
                    if(fezProva){
                        System.out.println("####################");
                        System.out.println("Você já fez a prova!");
                        System.out.println("####################");
                    }else{
                        if(logado){
                            //Primeira Pergunta --------
                            int resposta;
                            do{
                                System.out.println("Iniciando a Prova!"
                                        + "\n"
                                        + "\n-----------------"
                                        + "\nPrimeira Pergunta"
                                        + "\n-----------------"
                                        + "\nO que caracteriza um método sem retorno?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Possui um Return"
                                        + "\n2 - Possui um metodo interno"
                                        + "\n3 - Possui um retorno void"
                                        + "\n4 - Nenhuma das alternativas acima");
                                resposta = in.nextInt();
                                a1.cadastrar(0, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("Entre um número de resposta válido!");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Segunda Pergunta ---------
                            do{
                                System.out.println(
                                          "\n----------------"
                                        + "\nSegunda Pergunta"
                                        + "\n----------------"
                                        + "\nQuais os nomes dos métodos acessores?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - public static void main(String [] args)"
                                        + "\n2 - acessarMetodos()"
                                        + "\n3 - Getters e Setters"
                                        + "\n4 - private");
                                resposta = in.nextInt();
                                a1.cadastrar(1, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Terceira Pergunta ----------
                            do{
                                System.out.println(
                                          "\n-----------------"
                                        + "\nTerceira Pergunta"
                                        + "\n-----------------"
                                        + "\nComo se chama do tipo de dado que é encapsulado?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - public"
                                        + "\n2 - protected"
                                        + "\n3 - default"
                                        + "\n4 - private");
                                resposta = in.nextInt();
                                a1.cadastrar(2, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Quarta Pergunta ---------
                            do{
                                System.out.println(
                                          "\n---------------"
                                        + "\nQuarta Pergunta"
                                        + "\n---------------"
                                        + "\nQuais são os operadores relacionais?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - if, switch, else"
                                        + "\n2 - < > <= >= == !="
                                        + "\n3 - do while, while, for"
                                        + "\n4 - public static void main");
                                resposta = in.nextInt();
                                a1.cadastrar(3, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Quinta Pergunta ---------
                            do{
                                System.out.println(
                                          "\n---------------"
                                        + "\nQuinta Pergunta"
                                        + "\n---------------"
                                        + "\nO que caracteriza uma variável do tipo String?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Poder conter apenas números"
                                        + "\n2 - Poder conter apenas letras"
                                        + "\n3 - Poder conter apenas atributos do tipo private"
                                        + "\n4 - Poder conter letras e números e demais caracteres");
                                resposta = in.nextInt();
                                a1.cadastrar(4, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Sexta Pergunta ---------
                            do{
                                System.out.println(
                                          "\n--------------"
                                        + "\nSexta Pergunta"
                                        + "\n--------------"
                                        + "\nAnalise o codigo abaixo:"
                                        + "\npublic int calcularValores(int valor1, int valor2){"
                                        + "\n   return valor1 + valor2;"
                                        + "\n}"
                                        + "\nAs palavras da primeira linha, public, int, calcularValores, int valor1 e valor2, são, respectivamente:"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Encapsulamento público, tipo de dado, metodo, argumentos"
                                        + "\n2 - Encapsulamento privado, tipo de dado, operador lógico, variáveis"
                                        + "\n3 - Método, String, tipo de encapsulamento, argumentos"
                                        + "\n4 - Nenhuma das alternativas acima");
                                resposta = in.nextInt();
                                a1.cadastrar(5, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Sétima Pergunta ----------
                            do{
                                System.out.println(
                                          "\n---------------"
                                        + "\nSétima Pergunta"
                                        + "\n---------------"
                                        + "\nQuais são os operadores lógicos?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - + - * /"
                                        + "\n2 - public private static default"
                                        + "\n3 - && || !"
                                        + "\n4 - E OU NAO");
                                resposta = in.nextInt();
                                a1.cadastrar(6, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                            }while(resposta < 0 || resposta > 4);
                            //Oitava Pergunta ----------
                            do{
                                System.out.println(
                                          "\n---------------"
                                        + "\nOitava Pergunta"
                                        + "\n---------------"
                                        + "\nObserve o método de cálculo abaixo:"
                                        + "\npublic double calcularMatematica(){"
                                        + "\n   return 2 * (30 + 50 + [3 * 2 / (2)];"
                                        + "\n}"
                                        + "\n Qual a ordem de cálculo, segundo as regras matemáticas?"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Multiplicação, Divisão, Soma, Parenteses, Conchetes"
                                        + "\n2 - Divisão, Multiplicação, Parenteses, Soma, Conchetes"
                                        + "\n3 - Conchetes, Parenteses, Multiplicação e Divisão, Soma"
                                        + "\n4 - Nenhuma das alternativas");
                                resposta = in.nextInt();
                                a1.cadastrar(7, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Nona Pergunta ----------
                            do{
                                System.out.println(
                                          "\n-------------"
                                        + "\nNona Pergunta"
                                        + "\n-------------"
                                        + "\nObserve o código abaixo:"
                                        + "\npublic double calcularMedia(){"
                                        + "\n        double acum = 0;"
                                        + "\n        for(int i = 0; i < this.idades.length; i++){\n"
                                        + "\n            acum += this.idades[i];\n"
                                        + "\n        }\n"
                                        + "\n        return acum;\n" 
                                        + "\n    }"
                                        + "\nO código acima representa:"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Uma condição"
                                        + "\n2 - Laço de Repetição"
                                        + "\n3 - Um menu"
                                        + "\n4 - Uma sequência de cálculos");
                                resposta = in.nextInt();
                                a1.cadastrar(8, resposta);
                                if(resposta < 0 || resposta < 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            //Décima Pergunta ----------
                            do{
                                System.out.println(
                                          "\n---------------"
                                        + "\nDécima pergunta"
                                        + "\n---------------"
                                        + "\nPara se calcular uma raiz quadrada, uma raiz cubica, e fazer uma potencia, e o valor do PI, usamos, respectivamente:"
                                        + "\n------------"
                                        + "\nAlternativas"
                                        + "\n------------"
                                        + "\n1 - Math.Pow(x,y) Math.sqrt(x) Math.cbrt(x) Math.PI"
                                        + "\n2 - Math.sqrt(x) Math.cbrt(x) Math.pow(x, y) Math.PI"
                                        + "\n3 - Math.PI Math.cbrt(x) Math.pow(x, y) Math.sqrt(x)"
                                        + "\n4 - Math.pow(x, y) Math.PI Math.sqrt(x) Math.cbrt(x)");
                                resposta = in.nextInt();
                                a1.cadastrar(9, resposta);
                                if(resposta < 0 || resposta > 4){
                                    System.out.println("###################################");
                                    System.out.println("Entre um número de resposta válido!");
                                    System.out.println("###################################");
                                }
                                
                            }while(resposta < 0 || resposta > 4);
                            System.out.println("----------------------------");
                            System.out.println("Prova concluída com sucesso!");
                            System.out.println("----------------------------");
                            fezProva = true;
                            
                            do{
                                if(voltar3 != 1){
                                    System.out.println("################");
                                    System.out.println("Número inválido!");
                                    System.out.println("################");
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar3 = in.nextByte();
                                }else{
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar3 = in.nextByte();
                                }
                            }while(voltar3 != 1);
                        } else{
                            do{
                                if(voltar3 != 1){
                                    System.out.println("################");
                                    System.out.println("Número inválido!");
                                    System.out.println("################");
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar3 = in.nextByte();
                                }else{
                                    System.out.println("####################");
                                    System.out.println("Faça login primeiro!");
                                    System.out.println("####################");
                                    System.out.println("Voltar? \n1 - Sim");
                                    voltar3 = in.nextByte();
                                }
                            }while(voltar3 != 1);
                        }
                    }
                    break;
                    
                case 4:
                    byte voltar4 = 1;
                    do{
                        if(voltar4 != 1){
                            System.out.println("################");
                            System.out.println("Número inválido!");
                            System.out.println("################");
                            System.out.println("Voltar? \n1 - Sim");
                            voltar4 = in.nextByte();
                        }else{
                            if(logado){
                                if(fezProva){
                                    System.out.println("------------------");
                                    System.out.println("Gabarito da prova:\n"+a1.verGabarito());
                                }else{
                                    System.out.println("###########################");
                                    System.out.println("Você ainda não fez a prova!");
                                    System.out.println("###########################");
                                }
                            }else{
                                System.out.println("##########################################");
                                System.out.println("Você precisa estar logado para ter acesso!");
                                System.out.println("##########################################");
                            }
                            System.out.println("Voltar? \n1 - Sim");
                            voltar4 = in.nextByte();
                        }
                    }while(voltar4 != 1);
                    break;
                    
                case 5:
                    byte voltar5 = 1;
                    do{
                        if(voltar5 != 1){
                            System.out.println("################");
                            System.out.println("Número inválido!");
                            System.out.println("################");
                            System.out.println("Voltar? \n1 - Sim");
                            voltar5 = in.nextByte();
                        }else{
                            if(logado){
                                if(fezProva){
                                    System.out.println("---------------------------------");
                                    System.out.println(a1.calcularAcertosEErros());
                                    System.out.println("---------------------------------");
                                }else{
                                    System.out.println("######################");
                                    System.out.println("Faça a prova primeiro!");
                                    System.out.println("######################");
                                }
                            }else{
                                System.out.println("##########################################");
                                System.out.println("Você precisa estar logado para ter acesso!");
                                System.out.println("##########################################");
                            }
                            System.out.println("Voltar? \n1 - Sim");
                            voltar5 = in.nextByte();
                        }
                    }while(voltar5 != 1);
                    break;
                    
                case 6:
                    byte voltar6 = 1;
                    do{
                        if(voltar6 != 1){
                            System.out.println("################");
                            System.out.println("Número inválido!");
                            System.out.println("################");
                            System.out.println("Voltar? \n1 - Sim");
                            voltar6 = in.nextByte();
                        }else{
                            if(logado){
                                System.out.println("-----------------");
                                System.out.println(a1);
                                System.out.println("-----------------");
                            }else{
                                System.out.println("####################");
                                System.out.println("Faça login primeiro!");
                                System.out.println("####################");
                            }
                            System.out.println("Voltar? \n1 - Sim");
                            voltar6 = in.nextByte();
                        }
                    }while(voltar6 != 1);
                    break;
                
                    
                case 7:
                    byte voltar7 = 1;
                    do{
                        if(voltar7 != 1){
                            System.out.println("################");
                            System.out.println("Número inválido!");
                            System.out.println("################");
                            System.out.println("Voltar? \n1 - Sim");
                            voltar7 = in.nextByte();
                        }else{
                            if(logado){
                                if(fezProva){
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.println(a1.verResultado());
                                    System.out.println("-----------------------------------------------------------------");
                                }else{
                                    System.out.println("Faça a prova primeiro!");
                                }
                            }else{
                                System.out.println("####################");
                                System.out.println("Faça login primeiro!");
                                System.out.println("####################");
                            }
                            System.out.println("Voltar? \n1 - Sim");
                            voltar7 = in.nextByte();
                        }
                    }while(voltar7 != 1);
                    break;

                    
                case 0:
                    System.out.println("--------");
                    System.out.println("Bye-Bye!");
                    System.out.println("--------");
                    tInicial = 0;
                    break;
                
                    
                default:
                    System.out.println("################");
                    System.out.println("Número inválido!");
                    System.out.println("################");
                    break;
            }
            
        }while(tInicial != 0);
    }
}
