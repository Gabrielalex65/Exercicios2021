package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome do cliente");
		String nomeCliente = sc.nextLine();

		System.out.println("digite o email do cliente");
		String emailCliente = sc.nextLine();
		
		System.out.println("Digite a data de nascimento do cleinte");
		Date nascimento =  sdf.parse(sc.nextLine());

		StatusPedido statusPedido = StatusPedido.valueOf("PAGAMENTO_PENDENTE");
		sc.nextLine();
		System.out.println("Digite a quantidade de pedidos");
		int quantidadeItens = sc.nextInt();
		Pedido pedido = new Pedido(new Date(),statusPedido , new Cliente(nomeCliente, emailCliente,nascimento));
		
		for(int index = 0; index < quantidadeItens; index++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto");
			String nomeProduto = sc.nextLine();
			
			System.out.println("Digite o valor do produto");
			Double valorProduto = sc.nextDouble();
			
			System.out.println("Digite a quantidade do produto");
			Integer quantidadeProduto = sc.nextInt();
			
			
			pedido.adicionaItem(new ItemPedido(quantidadeProduto, valorProduto, new Produto(nomeProduto, valorProduto)));
			
		}
		System.out.println(pedido.toString());

		sc.close();
	}

}
