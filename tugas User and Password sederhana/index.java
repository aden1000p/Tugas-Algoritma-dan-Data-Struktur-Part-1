// login sederhana 
// terdapat dua input yaitu username dan password 
// dimana salah satu ataupun keduannya username maupun password adalah salah 
// jadi yang benar itu ada keduanya 

// langkah
// masukan username dan passwordnya 
// jika username dan password sama username benar maka login berhasil 
// jika salah satunya salah baik itu username dan password maka jawabannya salah. 
// jika keduanya salah maka username dan password itu salah 

import java.util.Scanner;

public class index{
    public static void main(String[] args){
        System.out.println("=============");
        System.out.println("user dan password");
        System.out.println("=============");

        // inputannya dari username 
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan username anda: ");
        String user = input.nextLine();

        // inputan dari password
        System.out.println("Masukan password anda: ");
        String pass = input.nextLine();

        // Pecabangan dari if else
        String Login = UsernameAndPassword(user, pass);
        System.out.println(Login);
    }

    public static String UsernameAndPassword(String user, String pass){
        // Sebagai label/jawaban dari suatu username dan password
        String Username = "admin";
        String Password = "12345";

        if (user.equals(Username) && pass.equals(Password)){
            return "login anda berhasil";
        } else if (!user.equals(Username) && !pass.equals(Password)){
            return "Username dan password salah silahkan coba lagi"; // tampilkan salah jika keduanya salah
        } else if (!user.equals(Username)){
            return "Username salah silahkan coba lagi"; // tampilkan salah jika username salah
        } else { 
            return "Password salah silahkan coba lagi"; // tampilkan salah jika password salah
        }
    }
}