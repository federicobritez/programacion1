import java.util.Arrays;
import java.util.Random;


public class Main {

	
	
	

	public static void main(String[] args) {

		Ordenamiento ordenador = new Ordenamiento();
		long startTime;
		long demora;

		int[] lista,lista2 ;


		for(int i = 0 ; i< 1 ; i++){

			System.out.println("Prueba "+i +":=======================");

			lista = Main.llenarArrayAleatorio(0,300,10);
			lista2 = lista;
			
			System.out.println(Arrays.toString(lista));
			ordenador.setLista(lista);
			ordenador.shell();

			System.out.println("	Shell sort demoró :  " + ordenador.getTiempoTranscurrido()+ " milisegundos");
			
			System.out.println(Arrays.toString(lista2));
			ordenador.setLista(lista2);
			ordenador.insercionDirecta();
			
			System.out.println("	Insercion Directa demoró :  " + ordenador.getTiempoTranscurrido()+ " milisegundos");

			/* Comparamos contra el método sort de Java */

			startTime = System.currentTimeMillis();
			Arrays.sort(lista);
			demora = System.currentTimeMillis() - startTime;
			System.out.println("	Array sort demoró :  "+ demora + " milisegundos");

		}
	}
	
	
	public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
	        int[] numeros = new int[tam];
	        Random rnd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
	        }
	        return numeros;
	}
	
	
	
	
}
