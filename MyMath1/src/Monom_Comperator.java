

import java.util.Comparator;
/**
 * this Comparator compare by the size of the power of the Monom
 * if the first is bigger return negative 
 * if the first is bigger return positive
 * if they are equals  return zero
 * @author Eliahu satat -204395644, Nahashon satat -315823880
 */

public class Monom_Comperator implements Comparator<Monom> {
    
	
	// ******** add your code below *********
	
	/**
	 * @param Monom o1, Monom o2
	 * @return int
	 */
	@Override
	public int compare(Monom o1, Monom o2) {
		
		return o2.get_power()-o1.get_power();
	}

	

}
