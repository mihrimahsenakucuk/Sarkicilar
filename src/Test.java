import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri bastır");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı ekle");
        System.out.println("\t 3-Şarkıcı güncelle");
        System.out.println("\t 4-Şarkıcı sil");
        System.out.println("\t 5-Şarkıcı ara");
        System.out.println("\t 6-Uygulamadan çık");
    }

    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }

    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi: ");

        String isim= scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }


    public static void sarkici_guncelle(){
        System.out.println("Güncellemek istediğiniz pozisyon (1,2,3...)");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();

        String yeni_isim= scanner.nextLine();

        sarkicilar.sarkici_guncelle(yeni_isim,pozisyon - 1);
    }

    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcı");
        String isim= scanner.nextLine();

        sarkicilar.sarkici_ara(isim);
    }


    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3...)");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkici_sil(pozisyon - 1);
    }




    public static void main(String[] args){
        System.out.println("\t ŞArkıcı Uygulamasına Hoş Geldiniz...");
        islemleri_bastir();

        boolean cikis= false;

        int islem;

        while(!cikis){
            System.out.println("Bir işlem seçiniz");
            islem= scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis= true;
                    System.out.println("Uygulamadan çıkılıyor..");
                    break;
            }
        }
    }



}
