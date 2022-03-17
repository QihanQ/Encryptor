import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"a","b","c"},
                {"d","e","f"},
                {"g","h","i"}
        };
        Encryption e = new Encryption(arr,2,3);
        e.encrypt();
        for(String[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
        e.decrypt();
        for(String[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
