import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
/**
 * Este programa realiza um sorteio onde são colocados nomes ou números e randomicamente escolhe 1(um).
 * @author seumao
 * @version 17 de maio de 2023
 *
 */
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Digite o número de ítens.");
		int nItens = in.nextInt();
		r.setSeed(nItens);
		System.out.println("Digite o tipo de roleta: numero ou nome.");
		String tipo = in.next().trim();
		boolean continuar = false;
		while (continuar == false) {
			if(tipo.equalsIgnoreCase("numero")) {
				System.out.println("Digite se é inteiro ou real");
				String tipoInt = in.next().trim();
				boolean continuar2 = false;
				while(continuar2 == false) {
					if(tipoInt.equalsIgnoreCase("inteiro")) {
						int[] numerosInt = new int[nItens];
						for (int i = 0; i<nItens; i++) {
							System.out.println("Digite um número inteiro.");
							numerosInt[i] = in.nextInt();
						}
						int randomNumberInt = r.nextInt(nItens);
						System.out.printf("Seu número é: %d\n",numerosInt[randomNumberInt]);
						continuar2 = true;
					}
					else if (tipoInt.equalsIgnoreCase("real")){
						double[] numerosDouble = new double[nItens];
						for (int i = 0; i<nItens; i++) {
							System.out.println("Digite um número real.");
							numerosDouble[i] = in.nextDouble();
						}
						int randomNumberDouble = r.nextInt(nItens);
						System.out.printf("Seu número é: %.4f\n",numerosDouble[randomNumberDouble]);
						continuar2 = true;
					}
					else {
						tipoInt = in.next().trim();
						
					}
				}
				continuar = true;
			}
			else if (tipo.equalsIgnoreCase("nome")){
				String[] nome = new String[nItens];
				for (int i = 0; i<nItens; i++) {
					System.out.println("Digite um nome ou uma letra.");
					nome[i] = in.next();
				}
				int randomString = r.nextInt(nItens);
				System.out.printf("seu nome/letra é: %s\n",nome[randomString]);
				continuar = true;
			}
			else {
				tipo = in.next().trim();
			}
		}
		
	}
}
