/*
Jogo ACERTE O CÁLCULO v. 0.1 Alpha
Autores: Isaac Rodrigues e Rogério Oliveira
*/
import java.util.Scanner;
import java.util.ArrayList;

public class MainAcerteCalculo
{

    static void menu()
	{//Menu do jogo
        System.out.println("Escolha uma opção.");
        System.out.println("1. Novo Jogo");
        System.out.println("2. Instruções");
		System.out.println("3. Sair");
        System.out.println("Opcao:");//Espera a entrada do usiário
    }

    static void novojogo()
	{
        System.out.println("Você iniciou um novo jogo.");
    }

    static void instrucoes()
	{
        System.out.println("Instruções:");
		System.out.println("\nApós escolher o nível de difi"
						   + "culdade, você inicializará\no jogo, então será mostra"
						   + "do seu primeiro desafio.\nVocê terá um tempo para res"
						   + "olver o cálculo,\nentão responderá com uma alternativ"
						   + "a e será mostrado\nse está certo ou errado. Estando c"
						   + "erto vc ganhará pontos.\nVale lembrar que enquanto ma"
						   + "is rápido você responder,\nmais pontos ganhará.\n");
    }

    public static void main(String[] args)
	{
//Declarações.____________________________________________________________________________________________
        Scanner ler = new Scanner(System.in);

        int errosf = 0;//Contador de erros nível fácil.
        int errosm = 0;//Contador de erros nível médio.
        int errosd = 0;//Contador de erros nível difícil.

        int op1 = 0;
        int op2 = 0;

        ArrayList<String> pergfac = new ArrayList<String>();//Expressões nível fácil.
		ArrayList<String> altfac = new ArrayList<String>();//Alternatuvas nível médio.
        ArrayList<String> respfac = new ArrayList<String>();//Resposta nível médio.
        ArrayList<String> pergmed = new ArrayList<String>();//Expressões nível médio.
        ArrayList<String> altmed = new ArrayList<String>();//Alternativas nível médio.
        ArrayList<String> respmed = new ArrayList<String>();//Resposta nível médio.
        ArrayList<String> pergdif = new ArrayList<String>();//Expressões nível difícil.
		ArrayList<String> altdif = new ArrayList<String>();//Alternativas nível médio.
        ArrayList<String> respdif = new ArrayList<String>();//Resposta nível médio.

        System.out.println("####################################################"
						   + "\n#     SEJA BEM VINDO AO JOGO ACERTE O CÁLCULO      #"
						   + "\n# v. 0.1 Alpha/13.03.2018                          #"
						   + "\n#  Este jogo contém cálculos de diferentes níveis  #"
						   + "\n#de dificuldade. Enquanto mais acertos, mais pontos#"
						   + "\n#             você fará. BOA SORTE!                #"
						   + "\n####################################################");

        do {
            menu();
            op1 = ler.nextInt();
            switch (op1)
			{
                case 1:
                    novojogo();
                    System.out.println("\nEscolha um nível de dificuldade:\n"
									   + "1- Fácil\n2- Médio\n3- Difícil");

                    op2 = ler.nextInt();
//Começo do nível fácil_______________________________________________________________________________
                    if (op2 == 1)
					{
                        System.out.println("Você escolheu o nível fácil, prepare-se.");
                        for (int i = 0; i <= 3; i++)
						{
                            try
							{
                                Thread.sleep(1000);
                            }
							catch (InterruptedException e)
							{
                            }
                            System.out.print(i + "… ");
                            if (i == 4)
							{
                                System.out.println();
                            }
                        }
//Expressões nível fácil______________________________________________________________________________

                        pergfac.add(0, "24-8+9");altfac.add(0, "A)23\nB)25\nC)22\nD)24");respfac.add(0, "b");
                        pergfac.add(1, "36-7-8");altfac.add(1, "A)23\nB)22\nC)25\nD)21");respfac.add(1, "d");
                        pergfac.add(2, "65-34");altfac.add(2, "A)31\nB)33\nC)35\nD)32");respfac.add(2, "a");
                        pergfac.add(3, "80-32");altfac.add(3, "A)45\nB)43\nC)48\nD)49");respfac.add(3, "c");
                        pergfac.add(4, "8+21-5");altfac.add(4, "A)23\nB)25\nC)26\nD)24");respfac.add(4, "d");
                        pergfac.add(5, "7+5+32");altfac.add(5, "A)44\nB)45\nC)46\nD)43");respfac.add(5, "a");
                        pergfac.add(6, "25+8-12");altfac.add(6, "A)22\nB)23\nC)25\nD)21");respfac.add(6, "d");
                        pergfac.add(7, "34-21");altfac.add(7, "A)11\nB)13\nC)15\nD)12");respfac.add(7, "b");
                        pergfac.add(8, "56+8-12");altfac.add(8, "A)54\nB)52\nC)56\nD)53");respfac.add(8, "b");
                        pergfac.add(9, "76-36");altfac.add(9, "A)36\nB)30\nC)40\nD)43");respfac.add(9, "c");

								

//Primeira expressão__________________________________________________________________________________
                        System.out.println("\n" + pergfac.get(0));
                        int f1 = 24 - 8 + 9;

                        System.out.println(altfac.get(0));
                        System.out.println("Digite a alternativa");

                        String alt1f = ler.next();
                        if (alt1f.equalsIgnoreCase(respfac.get(0)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f1 + ".\nPróxima expressão.");
                            errosf += 1;
                        }

//Segunda expressão___________________________________________________________________________________
                        System.out.println(pergfac.get(1));
                        int f2 = 36 - 7 - 8;
                        System.out.println(altfac.get(1));
                        System.out.println("Digite a alternativa");
                        String alt2f = ler.next();

                        if (alt2f.equalsIgnoreCase(respfac.get(1)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f2 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Terceira expressão__________________________________________________________________________________
                        System.out.println(pergfac.get(2));
                        int f3 = 65 - 34;
                        System.out.println(altfac.get(2));
                        System.out.println("Digite a alternativa");
                        String alt3f = ler.next();

                        if (alt3f.equalsIgnoreCase(respfac.get(2)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f3 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Quarta expressão____________________________________________________________________________________
                        System.out.println(pergfac.get(3));
                        int f4 = 80 - 32;
                        System.out.println(altfac.get(3));
                        System.out.println("Digite a alternativa");
                        String alt4f = ler.next();

                        if (alt4f.equalsIgnoreCase(respfac.get(3)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f4 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Quinta expressão____________________________________________________________________________________
                        System.out.println(pergfac.get(4));
                        int f5 = 8 + 21 - 5;
                        System.out.println(altfac.get(4));
                        System.out.println("Digite a alternativa");
                        String alt5f = ler.next();

                        if (alt5f.equalsIgnoreCase(respfac.get(4)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f5 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Sexta expressão_____________________________________________________________________________________
                        System.out.println(pergfac.get(5));
                        int f6 = 7 + 5 + 32;
                        System.out.println(altfac.get(5));
                        System.out.println("Digite a alternativa");
                        String alt6f = ler.next();

                        if (alt6f.equalsIgnoreCase(respfac.get(5)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f6 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Sétima expressão____________________________________________________________________________________
                        System.out.println(pergfac.get(6));
                        int f7 = 25 + 8 - 12;
                        System.out.println(altfac.get(6));
                        System.out.println("Digite a alternativa");
                        String alt7f = ler.next();

                        if (alt7f.equalsIgnoreCase(respfac.get(6)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f7 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Oitava expressão____________________________________________________________________________________
                        System.out.println(pergfac.get(7));
                        int f8 = 34 - 21;
                        System.out.println(altfac.get(7));
                        System.out.println("Digite a alternativa");
                        String alt8f = ler.next();

                        if (alt8f.equalsIgnoreCase(respfac.get(7)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f8 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Nona expressão______________________________________________________________________________________
                        System.out.println(pergfac.get(8));
                        int f9 = 56 + 8 - 12;
                        System.out.println(altfac.get(8));
                        System.out.println("Digite a alternativa");
                        String alt9f = ler.next();

                        if (alt9f.equalsIgnoreCase(respfac.get(8)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f9 + ".\nPróxima expressão.");
                            errosf += 1;
                        }
//Décima expressão____________________________________________________________________________________
                        System.out.println(pergfac.get(9));
                        int f10 = 76 - 36;
                        System.out.println(altfac.get(8));
                        System.out.println("Digite a alternativa");
                        String alt10f = ler.next();

                        if (alt10f.equalsIgnoreCase(respfac.get(9)))
						{
                            System.out.println("Você acertou, Parabéns!");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + f10 + ".");
                            errosf += 1;
                        }
//Exibição da pontuação final_________________________________________________________________________
                        int pontf = (10 - errosf) * 10;
						if (pontf>30){
                        System.out.println("Parabéns, sua pontuação final foi : " + pontf);
                        System.out.println("Você errou " + errosf + " questões.");
						}
						else {
							System.out.println("Infelizmente vc teve um mal desempenho, sua pontuação final foi: "+pontf);
						}
						System.out.println("OBRIGADO POR JOGAR");
                    }//fim da op2 = 1.
//____________________________________FIM DO NÍVEL FÁCIL______________________________________________
                    if (op2 == 2)
					{
//Começo do nível médio_______________________________________________________________________________
                        System.out.println("Você escolheu o nível médio, prepare-se");
                        for (int i = 0; i <= 3; i++)
						{
                            try
							{
                                Thread.sleep(1000);
                            }
							catch (InterruptedException e)
							{
                            }
                            System.out.print(i + "…");
                            if (i == 4)
							{
                                System.out.println();
                            }
                        }
//Expressões nível médio______________________________________________________________________________

                        pergmed.add(0, "3*12+4");altmed.add(0, "A)36\nB)30\nC)40\nD)43");respmed.add(0, "c");
                        pergmed.add(1, "5+5*4");altmed.add(1, "A)40\nB)45\nC)20\nD)25");respmed.add(1, "d");
                        pergmed.add(2, "2*6/4");altmed.add(2, "A)3\nB)12\nC)1\nD)4");respmed.add(2, "a");
                        pergmed.add(3, "4/4+8");altmed.add(3, "A)3\nB)9\nC)12\nD)4");respmed.add(3, "b");
                        pergmed.add(4, "9+0*5");altmed.add(4, "A)45\nB)5\nC)9\nD)10");respmed.add(4, "c");
                        pergmed.add(5, "8*4-6");altmed.add(5, "A)16\nB)18\nC)38\nD)26");respmed.add(5, "d");
                        pergmed.add(6, "3+8/4");altmed.add(6, "A)3\nB)5\nC)7\nD)4");respmed.add(6, "b");
                        pergmed.add(7, "9*4-5");altmed.add(7, "A)9\nB)41\nC)31\nD)32");respmed.add(7, "c");
                        pergmed.add(8, "7+5*9");altmed.add(8, "A)52\nB)108\nC)110\nD)53");respmed.add(8, "a");
                        pergmed.add(9, "40/5+8");altmed.add(9, "A)6\nB)5\nC)15\nD)16");respmed.add(9, "d");

//Primeira expressão__________________________________________________________________________________
                        System.out.println("\n" + pergmed.get(0));
                        int m1 = 3 * 12 + 4;
                        System.out.println(altmed.get(0));
                        System.out.println("Digite a alternativa");
                        String alt1m = ler.next();

                        if (alt1m.equalsIgnoreCase(respmed.get(0)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m1 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Segunda expressão___________________________________________________________________________________
                        System.out.println(pergmed.get(1));
                        int m2 = 5 + 5 * 4;
                        System.out.println(altmed.get(1));
                        System.out.println("Digite a alternativa");
                        String alt2m = ler.next();

                        if (alt2m.equalsIgnoreCase(respmed.get(1)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m2 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Terceira expressão__________________________________________________________________________________
                        System.out.println(pergmed.get(2));
                        int m3 = 2 * 6 / 4;
                        System.out.println(altmed.get(2));
                        System.out.println("Digite a alternativa");
                        String alt3m = ler.next();

                        if (alt3m.equalsIgnoreCase(respmed.get(2)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m3 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Quarta expressão____________________________________________________________________________________
                        System.out.println(pergmed.get(3));
                        int m4 = 4 / 4 + 8;
                        System.out.println(altmed.get(3));
                        System.out.println("Digite a alternativa");
                        String alt4m = ler.next();

                        if (alt4m.equalsIgnoreCase(respmed.get(3)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m4 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Quinta expressão____________________________________________________________________________________
                        System.out.println(pergmed.get(4));
                        int m5 = 9 + 0 * 5;
                        System.out.println(altmed.get(4));
                        System.out.println("Digite a alternativa");
                        String alt5m = ler.next();

                        if (alt5m.equalsIgnoreCase(respmed.get(4)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m5 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Sexta expressão_____________________________________________________________________________________
                        System.out.println(pergmed.get(5));
                        int m6 = 8 * 4 - 6;
                        System.out.println(altmed.get(5));
                        System.out.println("Digite a alternativa");
                        String alt6m = ler.next();

                        if (alt6m.equalsIgnoreCase(respmed.get(5)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m6 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Sétima expressão____________________________________________________________________________________
                        System.out.println(pergmed.get(6));
                        int m7 = 3 + 8 / 4;
                        System.out.println(altmed.get(6));
                        System.out.println("Digite a alternativa");
                        String alt7m = ler.next();

                        if (alt7m.equalsIgnoreCase(respmed.get(6)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m7 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Oitava expressão____________________________________________________________________________________
                        System.out.println(pergmed.get(7));
                        int m8 = 9 * 4 - 5;
                        System.out.println(altmed.get(7));
                        System.out.println("Digite a alternativa");
                        String alt8m = ler.next();

                        if (alt8m.equalsIgnoreCase(respmed.get(7)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m8 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Nona expressão______________________________________________________________________________________
                        System.out.println(pergmed.get(8));
                        int m9 = 7 + 5 * 9;
                        System.out.println(altmed.get(8));
                        System.out.println("Digite a alternativa");
                        String alt9m = ler.next();

                        if (alt9m.equalsIgnoreCase(respmed.get(8)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m9 + ".\nPróxima expressão.");
                            errosm += 1;
                        }
//Décima expressão____________________________________________________________________________________
                        System.out.println(pergmed.get(9));
                        int m10 = 40 / 5 + 8;
                        System.out.println(altmed.get(9));
                        System.out.println("Digite a alternativa");
                        String alt10m = ler.next();

                        if (alt10m.equalsIgnoreCase(respmed.get(9)))
						{
                            System.out.println("Você acertou, Parabéns!");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + m10 + ".");
                            errosm += 1;
                        }
//Exibição da pontuação final_________________________________________________________________________
                        int pontm = (10 - errosf) * 10;
						if (pontm>30){
							System.out.println("Parabéns, sua pontuação final foi : " + pontm);
							System.out.println("Você errou " + errosm + " questões.");
						}
						else {
							System.out.println("Infelizmente vc teve um mal desempenho, sua pontuação final foi: "+pontm);
						}
						System.out.println("OBRIGADO POR JOGAR"); 
                    }//fim da op2 = 2.
//____________________________________FIM DO NÍVEL MÉDIO______________________________________________
                    if (op2 == 3)
					{
//Começo do nível difícil_____________________________________________________________________________
                        System.out.println("Você escolheu o nível difícil, prepare-se");
                        for (int i = 0; i <= 3; i++)
						{
                            try
							{
                                Thread.sleep(1000);
                            }
							catch (InterruptedException e)
							{
                            }
                            System.out.print(i + "…");
                            if (i == 4)
							{
                                System.out.println();
                            }
                        }
//Expressões nível difícil____________________________________________________________________________

                        pergdif.add(0, "3*(8+7)-5");altdif.add(0, "A)35\nB)42\nC)30\nD)40");respdif.add(0, "d");
                        pergdif.add(1, "5+8*(3+4)");altdif.add(1, "A)87\nB)85\nC)91\nD)90");respdif.add(1, "c");
                        pergdif.add(2, "9/3+(5-3)");altdif.add(2, "A)5\nB)1\nC)6\nD)2");respdif.add(2, "a");
                        pergdif.add(3, "40/4+(9*2)");altdif.add(3, "A)26\nB)28\nC)36\nD)22");respdif.add(3, "b");
                        pergdif.add(4, "5*3-36/9");altdif.add(4, "A)14\nB)5\nC)12\nD)11");respdif.add(4, "d");
                        pergdif.add(5, "8+(81/9)");altdif.add(5, "A)17\nB)19\nC)12\nD)11");respdif.add(5, "a");
                        pergdif.add(6, "15-9+(25-6)");altdif.add(6, "A)22\nB)33\nC)32\nD)14");respdif.add(6, "b");
                        pergdif.add(7, "9*4+36/9");altdif.add(7, "A)36\nB)42\nC)40\nD)46");respdif.add(7, "c");
                        pergdif.add(8, "8+6*7-5");altdif.add(8, "A)45\nB)44\nC)47\nD)46");respdif.add(8, "a");
                        pergdif.add(9, "40/8-3");altdif.add(9, "A)8\nB)3\nC)2\nD)7");respdif.add(9, "c");

//Primeira expressão__________________________________________________________________________________
                        System.out.println("\n" + pergdif.get(0));
                        int d1 = 3 * (8 + 7) - 5;
                        System.out.println(altdif.get(0));
                        System.out.println("Digite a alternativa");
                        String alt1d = ler.next();

                        if (alt1d.equalsIgnoreCase(respdif.get(0)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d1 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Segunda expressão___________________________________________________________________________________
                        System.out.println(pergdif.get(1));
                        int d2 = 5 + 8 * (3 + 4);
                        System.out.println(altdif.get(1));
                        System.out.println("Digite a alternativa");
                        String alt2d = ler.next();

                        if (alt2d.equalsIgnoreCase(respdif.get(1)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d2 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Terceira expressão__________________________________________________________________________________
                        System.out.println(pergdif.get(2));
                        int d3 = 9 / 3 + (5 - 3);
                        System.out.println(altdif.get(2));
                        System.out.println("Digite a alternativa");
                        String alt3d = ler.next();

                        if (alt3d.equalsIgnoreCase(respdif.get(2)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d3 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Quarta expressão____________________________________________________________________________________
                        System.out.println(pergdif.get(3));
                        int d4 = 40 / 4 + (9 * 2);
                        System.out.println(altdif.get(3));
                        System.out.println("Digite a alternativa");
                        String alt4d = ler.next();

                        if (alt4d.equalsIgnoreCase(respdif.get(3)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d4 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Quinta expressão____________________________________________________________________________________
                        System.out.println(pergdif.get(4));
                        int d5 = 5 * 3 - 36 / 9;
                        System.out.println(altdif.get(4));
                        System.out.println("Digite a alternativa");
                        String alt5d = ler.next();

                        if (alt5d.equalsIgnoreCase(respdif.get(4)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d5 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Sexta expressão_____________________________________________________________________________________
                        System.out.println(pergdif.get(5));
                        int d6 = 8 + (81 / 9);
                        System.out.println(altdif.get(5));
                        System.out.println("Digite a alternativa");
                        String alt6d = ler.next();

                        if (alt6d.equalsIgnoreCase(respdif.get(5)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d6 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Sétima expressão____________________________________________________________________________________
                        System.out.println(pergdif.get(6));
                        int d7 = 15 - 9 + (25 - 6);
                        System.out.println(altdif.get(6));
                        System.out.println("Digite a alternativa");
                        String alt7d = ler.next();

                        if (alt7d.equalsIgnoreCase(altdif.get(6)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d7 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Oitava expressão____________________________________________________________________________________
                        System.out.println(pergdif.get(7));
                        int d8 = 9 * 4 + 36 / 9;
                        System.out.println(altdif.get(7));
                        System.out.println("Digite a alternativa");
                        String alt8d = ler.next();

                        if (alt8d.equalsIgnoreCase(respdif.get(7)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d8 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Nona expressão______________________________________________________________________________________
                        System.out.println(pergdif.get(8));
                        int d9 = 8 + 6 * 7 - 5;
                        System.out.println(altdif.get(8));
                        System.out.println("Digite a alternativa");
                        String alt9d = ler.next();

                        if (alt9d.equalsIgnoreCase(respdif.get(8)))
						{
                            System.out.println("Você acertou, Parabéns!\nPrepare-se para a próxima expressão");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d9 + ".\nPróxima expressão.");
                            errosd += 1;
                        }
//Décima expressão____________________________________________________________________________________
                        System.out.println(pergdif.get(9));
                        int d10 = 40 / 8 - 3;
                        System.out.println(altdif.get(9));
                        System.out.println("Digite a alternativa");
                        String alt10d = ler.next();

                        if (alt10d.equalsIgnoreCase(respdif.get(9)))
						{
                            System.out.println("Você acertou, Parabéns!");

                        }
						else
						{
                            System.out.println("Você errou! O resultado era " + d10 + ".");
                            errosd += 1;
                        }
//Exibição da pontuação final_________________________________________________________________________
                        int pontd = (10 - errosd) * 10;
                        if (pontd>30){
							System.out.println("Parabéns, sua pontuação final foi : " + pontd);
							System.out.println("Você errou " + errosd + " questões.");
						}
						else {
							System.out.println("Infelizmente vc teve um mal desempenho, sua pontuação foi: "+pontd);
						}
						System.out.println("OBRIGADO POR JOGAR");
                    }//fim da op2= 3.
					if (op2>3)
						System.out.println("Opção inválida");
                    break;
//___________________________________FIM DO NÍVEL DIFÍCIL_____________________________________________
//Fim do corpo do jogo________________________________________________________________________________

//****************************************************************************************************
//Instruções do jogo se o usuário escolher opção 2.___________________________________________________
                case 2:
                    instrucoes();
                    
                    break;
				case 3:
					System.exit(0);
//*****************************************************************************************************
                default:
                    System.out.println("Opção inválida");
//Retorna para o menu de opções inicial, e pede para o usuário inserir uma opção válida.
            }
        } while (op1 != 0);
    }
}
