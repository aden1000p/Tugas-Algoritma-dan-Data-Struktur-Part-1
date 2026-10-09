
// sistem penilaian mahasiswa 
// memberikan masukan nilai, kehadiran, dan presentase tugas selesai. 
// jika nilai lebih dari 60 tapi kehadirannya 75% dan tugas selesai 80%
// maka nilai anda sudah kami terima 
// kenapa alasannya

import java.util.Scanner;

public class index {
    public static void main(String[] args){
        System.out.println("=============");
        System.out.println("Sistem Penilaian Mahasiswa");
        System.out.println("=============");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai mahasiswa: ");
        int NilaiMahasiswa = input.nextInt();

        System.out.println("Masukan jumlah kehadiran: ");
        int JumlahMahasiswa = input.nextInt();

        System.out.println("Masukan tugas selesai: ");
        int jumlahTugas = input.nextInt();

        if (NilaiMahasiswa >= 60){
            if (JumlahMahasiswa >= 75 && jumlahTugas >= 80){
                System.out.println("Anda lulus");
            }else{ 
                Scanner inputan = new Scanner(System.in);
                System.out.println("alasan anda tidak lulus: ");
                String alasan = inputan.nextLine();
            }
        }else{ 
            Scanner inputan = new Scanner(System.in);
            System.out.println("alasan anda tidak lulus: ");
            String alasan = inputan.nextLine();
        }
    }
}

