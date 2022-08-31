import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        long sayi1,sayi2,sonuc=0;
        String islem;
        System.out.println("Sadece 4 islem yapabilen basit hesap makinesi");
        System.out.println("Lutfen hesaplanacak sayilarin aralarina 4 islem\nsembolerinden birisini girerek ayri ayri giriniz");
        System.out.println("Ltfen 1. sayiyi giriniz");
        sayi1=girdi.nextLong();

        System.out.println("Lutfen yapacaginiz islemi giriniz\n+ Topla\n- cikart\n* carp\n/ Bol");
        islem=girdi.next();

        System.out.println("Lutfen 2. sayiyi giriniz");
        sayi2=girdi.nextLong();

        switch(islem) {
            case "+":sonuc=sayi1+sayi2;
                break;
            case "-":sonuc=sayi1-sayi2;
                break;
            case "*":sonuc=sayi1*sayi2;
                break;
            case "/":sonuc=sayi1/sayi2;
                break;
            default: System.out.println("yanl giri yaptnz");
        }

        if(sonuc!=0)System.out.println("girdiiniz ilem= "+sayi1+islem+sayi2+" = "+sonuc);
    }

}

