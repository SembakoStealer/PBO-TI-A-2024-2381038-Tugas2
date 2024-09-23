import java.util.Scanner;

public class Soal1 {
    //Method buat persegi
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    //Method buat persegi panjang
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    //Method buat lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar bangun datar : :");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran\n");

        System.out.print("Masukin Pilihan mu : ");

        int pilihanBentuk = input.nextInt();

        switch (pilihanBentuk) {
            case 1:
                System.out.print("Masukin panjang sisinya : ");
                double sisiPersegi = input.nextDouble();

                //output Luas persegiiiii
                double luasPersegi = hitungLuasPersegi(sisiPersegi);
                System.out.println("Luas persegi = " + luasPersegi);

                //output Keliling Persegi
                double kelilingPersegi = hitungKelilingPersegi(sisiPersegi);
                System.out.println("Keliling persegi = " + kelilingPersegi);

                break;
            case 2:
                System.out.print("Masukin panjang persegi panjang : ");
                double panjangPersegiPanjang = input.nextDouble();

                System.out.print("Masukin lebar persegi panjang : ");
                double lebarPersegiPanjang = input.nextDouble();

                //output persegi panjang
                double luasPersegiPanjang = hitungLuasPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas Persegi panjang adalah = " + luasPersegiPanjang);

                //output keliling persegi panjang
                double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Keliling persegi panjang adalah = " + kelilingPersegiPanjang);

                break;
            case 3:
                System.out.print("Masukin panjang jari jari lingkaran : ");
                double jariJariLingkaran = input.nextDouble();

                double luasLingkaran = hitungLuasLingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran mu adalah = " + luasLingkaran);

                double kelilingLingkaran = hitungKelilingLingkaran(jariJariLingkaran);
                System.out.println("Keliling lingkaran mu adalah = " + kelilingLingkaran);
                break;

        }

    }
}
