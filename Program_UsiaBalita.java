package binus.forum;

import java.util.Scanner;
public class Program_UsiaBalita {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Tulis usia anda:");
        int usia = input.nextInt();

        String kategori;


        if (usia <=5)
            kategori = "Balita";

        else if (usia <=12)
            kategori = "Anak";

        else if (usia <=17)
            kategori = "Remaja";

        else if (usia <=60)
            kategori = "Dewasa";

        else
            kategori = "Lansia";

        System.out.println("Usia: " + usia + " tahun merupakan kategori usia " + kategori);


    }
}
