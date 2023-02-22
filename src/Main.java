import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int [] arr, int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int temp;

        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0; i < n; i++){
                System.out.println(i + ". eleman :");
                array[i] = scanner.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++){
                if(array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

       /* Methodlarla çözüm
       Arrays.sort(array);
       System.out.println("Sıralama : " + Arrays.toString(array));
          */
    }
}