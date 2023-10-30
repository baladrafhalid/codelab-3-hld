import java.util.Scanner;

/** berfungsi untuk menghitung vollume limas
 *
 */
class Limas {
    // Atribut
    private double alasLuas;
    private double tinggi;
    private double volume;

    /** konstruktor limas
     * 
     * @param alasLuas
     * @param tinggi
     */
    public Limas(double alasLuas, double tinggi) {
            this.alasLuas = alasLuas;
            this.tinggi = tinggi;
        }

    // Metode untuk menghitung volume
    public void hitungVolume() {
        this.volume = (1.0/3.0) * this.alasLuas * this.tinggi;
    }

    /**
     * method untuk getvolume
     * @return
     */
    public double getVolume() {
        return this.volume;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan luas alas limas: ");
        double alasLuas = scanner.nextDouble();

        System.out.print("Masukkan tinggi limas: ");
        double tinggi = scanner.nextDouble();

        Limas limas = new Limas(alasLuas, tinggi);

        limas.hitungVolume();

        System.out.println("Volume limas adalah: " + limas.getVolume());
    }
}