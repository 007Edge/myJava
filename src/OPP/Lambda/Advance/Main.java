package OPP.Lambda.Advance;
interface Even {
    boolean isEven(int n);
}

class EvenSum {
    int cal(int[] arr, Even obj) {
        int sum = 0;
        for (int j=0; j<6; j++) {

            if (obj.isEven(arr[j])) {
                sum += arr[j];
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        EvenSum c = new EvenSum();
        int sum = c.cal(arr, (a) -> a % 2 == 0 );
        System.out.println(sum);
    }
}
