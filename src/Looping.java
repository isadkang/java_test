public class Looping {
    public static void main(String[] args) {
        // basic looping
        for (int i = 0; i < 10; i++ )
            System.out.println(i);
        System.out.println("=================");
        // looping reverse string
        String name = "irsyad";
        for (int i = name.length() - 1; i >= 0; i--)
            System.out.println(name.charAt(i));
        System.out.println("=================");
        // Looping array
        String[] arr = {"Apel", "Mangga", "Pisang"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("looping array v2");
        for (String buah : arr)
            System.out.println(buah);

    }
}
