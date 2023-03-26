package BKosulluIfadeler;
import java.util.Scanner;
public class Odev9KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secim;
        String KullaniciAdi,Sifre,Yenisifre;
        System.out.println("Kullanıcı Adı:");
        KullaniciAdi=input.nextLine();
        System.out.println("Şifre:");
        Sifre=input.nextLine();
        if(KullaniciAdi.equals("eren")&&Sifre.equals("123")){
            System.out.println("Giriş yapıldı.");
        }
        else {
            System.out.println("Bilgileriniz hatalı.");
            System.out.println("Şifrenizi sıfırlamak için 1'e basınız.\nProgramı kapatmak için 2'ye basınız");
            secim=input.nextInt();
            if (secim==1){
                System.out.println("Yeni şifrenizi giriniz:");
                Yenisifre=input.next();
                if (Yenisifre.equals("123")){
                    System.out.println("Yeni şifreniz eski şifrenizden farklı olmalıdır.Tekrar deneyiniz.");
                }
                else {
                    System.out.println("Şifreniz oluşturuldu.Yeni şifreniz:"+Yenisifre);
                }
            }
            else {
                System.out.println("Programdan Çıkıldı.");
            }
        }
    }
}
