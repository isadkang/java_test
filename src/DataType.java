public class DataType {
    public static void main(String[] args) {
        // tipe data integer normal
        // tipe data integer memiliki banyak macam, diantaranya ada int, byte, short, long, float, double.
        int age = 17;
        System.out.println("Tipe data integer " + age);
        // tipe data integer byte ( ini menyimpan memori lebih hemat daripada int biasa -> mengambil nilai -128 s.d 127)
        byte ram = 34;
        System.out.println("Tipe data integer(byte) " + ram);
        // tipe data boolean ( true or false )
        boolean isLife = true;
        boolean isDead = false;
        System.out.println("Masih hidup " + isLife + " Udah mati " + isDead );
        // tipe data char
        char letter = 'a';
        System.out.println("Tipe data char " + letter);
        // tipe data string
        String description = "Muhammad Irsyad Nataprawira akan nikah dengan Alya Nursyifa";
        System.out.println(description);
    }
}
