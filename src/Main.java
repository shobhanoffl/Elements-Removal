import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,1};
        Arrays.sort(array);
        int c = 1;
        int sum = 0;
        for(int i= array.length-1; i>=0;i--){
            sum+=array[i]*c;
            c++;
        }
        System.out.println(sum);
    }
}