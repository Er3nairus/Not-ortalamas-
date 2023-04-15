import java.util.Scanner;

public class makine {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , tarih , muzik, toplam;
        double ortalama;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Notunuzu giriniz : ");

        mat = not.nextInt();

        System.out.print("\nFizik Notunuzu Giriniz : ");

        fizik = not.nextInt();

        System.out.print("\nKimya Notunuzu Giriniz : ");

        kimya = not.nextInt();

        System.out.print("\nTürkçe Notunuzu Giriniz : ");

        turkce = not.nextInt();

        System.out.print("\nTarih Notunuzu Giriniz : ");

        tarih = not.nextInt();

        System.out.print("\nMüzik Notunuzu Giriniz : ");

        muzik = not.nextInt();

        toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        
        ortalama = (toplam / 6);

        System.out.print("Ortalamaniz : "+ ortalama);

        System.out.print(ortalama >= 60 ? " Sınıfı Geçtiniz" : " Sınıfta Kaldınız");
       
  
    }  
}
