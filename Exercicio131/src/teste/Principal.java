package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String nome;
		Double preco;
		char tipo;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de produtos");
		int quantidade = sc.nextInt();
		
		
		for(int index = 0; index < quantidade; index++ ) {
			sc.nextLine();
			System.out.println("Digite o nome do produto");
			nome = sc.nextLine();
			
			System.out.println("Digite o preco do produto");
			preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Comum/Usado/Importado (c/u/i) ?");
			tipo = sc.nextLine().charAt(0);
			if(tipo == 'c') {
				
				Produto produtoComum = new Produto(nome, preco);
				list.add(produtoComum);
				
			} else if(tipo == 'u') {
				
				Date dataFabricacao;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Digite a data de fabricação");
				String dataFabricacaoString = sc.nextLine();
				dataFabricacao = sdf.parse(dataFabricacaoString);
				
				Produto produtoUsado = new ProdutoUsado(nome, preco,dataFabricacao);
				list.add(produtoUsado);
				
			} else if(tipo == 'i') {
				
				double taxa = 0.05;
				Produto produtoImportado = new ProdutoImportado(nome, preco,taxa);
				list.add(produtoImportado);
			}
			
		}
		for(Produto produto : list) {
			System.out.println(produto.etiqueta());
		}
		sc.close();
	}

}
