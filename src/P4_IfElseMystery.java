/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1. Blank-> Correct
 2. Blank-> Correct
 3. 3 4-> Correct
 4. 29 30-> Correct
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		ifElseMystery(10, 30);

	}
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        } else if (a > b){
            b = b + 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
            System.out.println(a + " " + b);
        }
    }

}
