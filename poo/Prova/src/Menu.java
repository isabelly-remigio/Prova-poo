
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList <Evento> eventos = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void Iniciar() {
		int op;
		
			do {
				exibir();
				op = scanner.nextInt();
				scanner.nextLine();
				
				switch(op) {
					case 1:
						adicionarEvento();
						break;
					case 2:
						excluirEvento();
						break;

					case 3:
						listarEvento();
						break;
						
					case 0:
						System.out.println("SISTEMA FINALIZADO");
						break;	
						
						default:
							System.out.println("Invalido");
			
				}		
					
			}while (op != 0);
	}
			private void exibir() {
				System.out.println("Menu -  Escolha um numero");
				System.out.println("1 - Adicionar evento");
				System.out.println("2 - Excluir evento");
				System.out.println("3 - Listar evento ");
				System.out.println("0 - sair do sistema");
				
			}
			
			private void adicionarEvento() {
				System.out.println("Nome do evento: ");
				String nome = scanner.nextLine();
				System.out.println("Data: ");
				String data = scanner.nextLine();
				System.out.println("Preço : (ex:.00,00)");
				double preco = scanner.nextDouble();
				System.out.println("Status - Remoto / Presencial (True or False) ");
				boolean remoto  = scanner.nextBoolean();
				scanner.nextLine();
				
				Evento evento = new Evento(nome,  data, preco, remoto);
				eventos.add(evento);
				System.out.println("-----------------");
				System.out.println("EVENTO CADASTRADO");
				
			}
			
			public void excluirEvento() {
				
			}
			
			public void listarEvento() {
				if (eventos.isEmpty()){
					System.out.println("-----------------");
					System.out.println("Sem eventos");
					System.out.println("-----------------");

					
				} else  {
					System.out.println("-----------------");
					System.out.println("Lista de eventos");
					System.out.println("-----------------");
					for(Evento e: eventos) {
						System.out.println(e);
						System.out.println("-----------------");

					}
				}
				
			}
	
}
