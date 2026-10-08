// Kategori nilai 

// terdapat 80-100 misal A 
// dimana kita butuh dua variabel 
// angka dari rentang nilai serta 
// kelulusan dari A, B, C, D

// langkah-langkah 
// masukan angka: 
// jika angka tersebut adalha 80-100
// maka kelulusannya adalah A 
// jika angka tersebut adlaha 70-79
// maka kelulusannya adalah B 
// Jika angka tersebut 60 - 69 
// maka kelulusannya adalah C
// jika angka tersebut 50-59 
// maka kleulusannya adalah D
// jika beda misalkan pake huruf 
// maka tidak termasuk nilai silahkan coba lagi 

import java.util.Scanner;

public class index{
    public static void main(String[] args){
        System.out.println("=====================");
        System.out.println("nilai kelulusan siswa ");
        System.out.println("=====================");

        Scanner InputValue = new Scanner(System.in);
        System.out.println("Masukan nilai mahasiswa: ");
        int nilai = InputValue.nextInt();

        if (nilai >= 80 && nilai <= 100){
            System.out.println("Kamu mendapatkan nilai A");
        }else if (nilai >= 70 && nilai <= 79){
            System.out.println("Kamu mendapatkan nilai B");
        }else if (nilai >= 60 && nilai <= 69){
            System.out.println("Kamu mendapatkan nilai C");
        }else if (nilai >= 50 && nilai <= 59){
            System.out.println("Kamu mendapatkan nilai D");
        }else if (nilai <= 50){
            System.out.println("Kamu mendapatkan nilai E");
        }else{
            System.out.println("Maaf inputan salah silahkan coba lagi");
        }

    }
}