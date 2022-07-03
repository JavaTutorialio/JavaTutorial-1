import java.util.Scanner;
public class Sifre {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String username="edkucuk",pasword="123456";
	
	String kullanici_adi, sifre;
	System.out.println("Kullanıcı adını giriniz:");
	kullanici_adi=input.next();
	System.out.println("Şifrenizi giriniz:");
	sifre=input.next();
	
	if (username.equals(kullanici_adi) && pasword.equals(sifre))
	{
		System.out.println ("Sisteme başarıyla girildi!");
	}
	else 
	{
		System.out.println ("Kullanıcı adı veya şifre yanlış!\nKontrol ederek tekarar deneyiniz.");
	}
	}
}