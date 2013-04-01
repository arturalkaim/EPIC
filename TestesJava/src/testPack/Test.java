/**
 * 
 */
package testPack;

/**
 * @author Artur
 * <p>Cenas da vida</p>
 */
public class Test {

	public static void main(String[] args) {
		float n = Float.POSITIVE_INFINITY/Float.NEGATIVE_INFINITY;
		if(n==0)
			System.out.println("é zero!!");
		else
			if(n<0)
				System.out.println("é negativo!!");
			else
				if(n>0)
			System.out.println("é positivo!!!");
				else
					System.out.println("FODA-SE!!!!! "+n);
	}
}