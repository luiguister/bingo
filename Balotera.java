import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Balotera {
	private int letra;
	private int numero;
	
	public int getLetra() {
		return letra;
	}
	public void setLetra(int letra) {
		this.letra = letra;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void balotera(Set<String> vector) {
		
		 int z = vector.size();
	        List<String> aList = new ArrayList<String>(z);
	        for (String x : vector) {
	        	aList.add(x);
	        }
	        int b=0, i=0, n=0, g=0, o=0, cont=1;
	        for (String x : aList) {
	        	
	        	if(x.startsWith("B") && b < 5) {
	        		System.out.println(cont+" - "+x);
	        		b++;cont++;
	        	}
	        	if(x.startsWith("I") && i<5) {
	        		System.out.println(cont+" - "+x);
	        		i++;cont++;
	        	}
	        	if(x.startsWith("N") && n<4) {
	        		System.out.println(cont+" - "+x);
	        		n++;cont++;
	        	}
	        	if(x.startsWith("G") && g<5) {
	        		System.out.println(cont+" - "+x);
	        		g++;cont++;
	        	}
	        	if(x.startsWith("O") && o<5) {
	        		System.out.println(cont+" - "+x);
	        		o++;cont++;
	        	}
	        	
	}
}
}
