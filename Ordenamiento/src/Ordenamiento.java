



public class Ordenamiento  {
	
	/*
	 * Para calcular el tiempo obtuvimos informacion de 
	 * http://www.iteramos.com/pregunta/14634/medir-el-tiempo-de-ejecucion-de-un-metodo-java
	 * */
	
	private int[] lista;
	private long tiempoTranscurrido;
	

	public Ordenamiento() {
	}
	
	public Ordenamiento(int[] lista) {
		super();
		this.lista = lista;
	}
	

	protected int[] getLista() {
		return lista;
	}
	
	protected long getTiempoTranscurrido(){
		return tiempoTranscurrido;
	}

	protected void setLista(int[] lista) {
		this.lista = new int[lista.length];
		this.lista = lista;
	}

	public void shell(){
		
		long startTime = System.currentTimeMillis();
		
		int salto, aux, i,size;
		size= this.lista.length;
		boolean cambios;
		for(salto=size/2; salto!=0; salto/=2){
			cambios=true;
			while(cambios){ // Mientras se intercambie algún elemento
				cambios=false;
				for(i=salto; i< size; i++) // se da una pasada
					if(this.lista[i-salto]>this.lista[i]){ // y si están desordenados
						aux=this.lista[i]; // se reordenan
						this.lista[i]=this.lista[i-salto];
						this.lista[i-salto]=aux;
						cambios=true; // y se marca como cambio.
					}
			}
		}
		
		this.tiempoTranscurrido = System.currentTimeMillis() - startTime;
	}

	
	public  void insercionDirecta(){
		
		long startTime = System.currentTimeMillis();
		int p, j;
		int aux;
		
		for (p = 1; p < this.lista.length; p++){ // desde el segundo elemento hasta
			
			aux = this.lista[p]; // el final, guardamos el elemento y
			
			j = p - 1; // empezamos a comprobar con el anterior
			
			while ((j >= 0) && (aux < this.lista[j])){ // mientras queden posiciones y el
				
				// valor de aux sea menor que los
				this.lista[j + 1] = this.lista[j];       // de la izquierda, se desplaza a
				
				j--;                   // la derecha
			}
			
			this.lista[j + 1] = aux; // colocamos aux en su sitio
		}
		this.tiempoTranscurrido = System.currentTimeMillis() - startTime;
	}

}
