/**
 * Created by Ludde on 2015-11-10.
 */
public class Calculator {

    public Calculator() {
    }

    public int sum(int[] arr) {

        if(arr != null && arr.length != 0) {
            if(arr.length > 10) {
                throw new IllegalArgumentException();
            }
            return sumHelper(arr);
        } else {
            throw new IllegalArgumentException("Illegal argument for this method.");
        }
    }

    private int sumHelper(int[] arr) {
        int total = 0;
        for(int i = 0; i<arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
