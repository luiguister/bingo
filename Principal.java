import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Principal {
	public static void main(String []args) {
	      Random randNum = new Random();
	      Balotera b = new Balotera();
		int MAX = 75;
		Set<String>set = new LinkedHashSet<String>();
			int x = 0;
		    while (set.size() < MAX) {
		    	x = randNum.nextInt(MAX)+1;
		    	if (x > 0 && x < 16) {
		    		set.add("B"+x);
		    	  }
				  else if(x > 15 && x <31) {
					set.add("I"+x);
				  }
				  else if(x > 30 && x < 46) {
					set.add("N"+x);
				  }
				  else if(x > 45 && x < 61) {
					set.add("G"+x);
				  }
				  else if(x > 60 && x <= 75) {
					set.add("O"+x);
				  }
			  }
		      b.balotera(set);
		      
		      
		      
		     
		  // }
		//}
	}
}
