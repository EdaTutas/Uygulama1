import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Yapmak istediginiz hesaplamayi seciniz !  \n1 : En buyuk sayi  " + " \n2 : En kucuk sayi  " + " \n3 : Topla  " + " \n4 : Cikart   " + " \n5 : Carp  " + " \n6 : Bol   " + " \n7 : 1.Sayinin Kare Koku  " + " \n8 : 2.Sayinin Kare Koku " + " \n9 : Cikis ");


        while (true) {
            System.out.print("\n\nIslemi seciniz : ");
            int secim = scanner.nextInt();


            if (secim == 9) {
                System.out.println("Islem bitti");
                break;
            }

            else {

                System.out.print("1. Sayiyi giriniz: ");
                int sayi1 = scanner.nextInt();

                System.out.print("2. Sayiyi giriniz: ");
                int sayi2 = scanner.nextInt();


                switch (secim) {
                    case 1:
                        System.out.println("Buyuk sayi: " + Math.max(sayi1, sayi2));
                        break;
                    case 2:
                        System.out.println("Kucuk sayi: " + Math.min(sayi1, sayi2));
                        break;
                    case 3:
                        System.out.println("Sayilarin Toplami: " + (sayi1 + sayi2));
                        break;
                    case 4:
                        System.out.println("Sayilarin Farki : " + (sayi1 - sayi2));
                        break;
                    case 5:
                        System.out.println("Sayilarin Carpimi " + (sayi1 * sayi2));
                        break;
                    case 6:
                        System.out.println("Sayilarin Carpimi " + (double) (sayi1 / sayi2));
                        break;
                    case 7:
                        System.out.println("1. Sayinin Kare Koku: " + Math.sqrt(sayi1));
                        break;
                    case 8:
                        System.out.println("2. Sayinin Kare Koku: " + Math.sqrt(sayi2));
                        break;
                    default:
                        System.out.println("Hatali secim yaptiniz.");
                        break;
                }
            }
        }
    }
}


