/**
 * Created by Ludde on 2015-11-10.
 */
public class Calculator {

    public Calculator() {
    }

    public int sum(int[] arr) {

        if(arr != null && arr.length != 0) {
            return 4;
        } else {
            throw new IllegalArgumentException("Illegal argument for this method.");
        }
    }
}
