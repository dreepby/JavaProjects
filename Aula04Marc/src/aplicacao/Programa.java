package aplicacao;

import java.util.Scanner;

import entidades.Hotel;

public class Programa {

	public static void main(String[]args) {
		Scanner Teclado = new Scanner(System.in);
		Hotel[] oQuartos = new Hotel[10];
		int iContadorQuartos = 0;
		
        while (true){
        	System.out.println("Escolha uma opção: 1 - Consultar alocação quarto, 2 - Alocar quarto.");
        	int iOpcao = Teclado.nextInt();
            
        	switch (iOpcao) {
			case 1: {				
	            int iQuarto = GetQuarto(Teclado);
	            if (iQuarto == -1)
	            	continue;
	            
				Teclado.nextLine();
				Hotel oQuartoReservado = GetQuartoReservado(oQuartos, iQuarto);
				if (oQuartoReservado == null)
					System.out.println("Quarto não reservado");
				else
	            	System.out.println("Quarto reservado para " + oQuartoReservado.Nome);				
				break;
			}
			case 2:{
				 int iQuarto = GetQuarto(Teclado);
		         if (iQuarto == -1)
		        	 continue;
				
				Hotel oQuartoReservado = GetQuartoReservado(oQuartos, iQuarto);
				
				if (oQuartoReservado != null)
	            	System.out.println("Quarto " + iQuarto + " já reservado!");
	            else {
	            	oQuartos[iContadorQuartos] = new Hotel();
	            	oQuartos[iContadorQuartos].Quarto = iQuarto;
	            	
	            	Teclado.nextLine();
	            	System.out.println("Informe o nome do cliente: ");
	            	oQuartos[iContadorQuartos].Nome = Teclado.nextLine();
	            	
	            	System.out.println("Informe o Email do cliente: ");
	            	oQuartos[iContadorQuartos].Email = Teclado.nextLine();
	            	            	
	            	iContadorQuartos++;
	            }
	            
	            break;
			}
			default:
				System.out.println("Opção inválida.");
				continue;
			}
        	
        	if (iContadorQuartos == 10)
            	break;
           
            System.out.println("Deseja continuar a realizar reserva?");
        	String sResp = new String();
    		sResp = Teclado.nextLine();
    	    		
    	    if (sResp.equalsIgnoreCase("Não"))
    	    	break;
        }
        
        for(Hotel oQuarto: oQuartos) {
  		  if (oQuarto != null)
  		  	System.out.println(oQuarto.toString());
  	    }
	
		Teclado.close();
	}
	
	public static Hotel GetQuartoReservado(Hotel[] AQuartos, int ANumeroQuarto) {
	  for(Hotel oQuarto: AQuartos) {
		  if ((oQuarto != null) && (oQuarto.Quarto == ANumeroQuarto)) 
		  	return oQuarto;			  
	  }
	  return null;
	}
	
	public static int GetQuarto(Scanner ATec) {
		System.out.println("Informe o quarto: ");
        int iQuarto = ATec.nextInt();
        
        if ((iQuarto < 0) || (iQuarto > 9)) {
        	System.out.println("Quarto inválido.");
           return -1;
        }
        return iQuarto;
	}
	
}
