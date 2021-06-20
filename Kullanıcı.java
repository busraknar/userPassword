import java.util.Scanner;

public class Kullanıcı {
    public static void main(String[] args) {
        String kullanici, sifre;
        int secim;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        kullanici = input.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre = input.nextLine();
        if (kullanici.equals("User") && sifre.equals("1234"))
            System.out.println("Giriş başarılı");
        else if (!kullanici.equals("User")) {
            System.out.println("Şifreyi sıfırlamak ister misiniz?\n 1:Evet 2:Hayır");
            secim = input.nextInt();
            switch(secim) {
                case 1:
                    System.out.println(sifre.equals("1234") ? "Şifre oluşturulamadı, lütfen başka şifre giriniz." : "Şifre oluşturuldu.");
                    break;
                case 2:
                    System.out.println("Şifreyi yenilemediniz.");
                    break;
            }
        }
    }
}
