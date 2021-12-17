import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Etkinlik Önerme Programı :");
        System.out.println("---------------------------------------------------");
        String etkinlikler = "1) Hava 5 dereceden küçükse kayak yapılabilir...\n"
                + "2) Hava 5-15 derece arasındaysa sinemaya gidilebilir...\n"
                + "3) Hava 15-25 derece arasındaysa pikniğe gidilebilir...\n"
                + "4) Hava 25 dereceden büyükse yüzmeye gidilebilinir...";
        System.out.println(etkinlikler);
        System.out.println("---------------------------------------------------");
        System.out.print("Lütfen Hava Sıcaklığını Giriniz : ");
        double heat = scanner.nextDouble();
        System.out.println("---------------------------------------------------");
        if (heat < 5) {
            System.out.println("Bugün kayak yapmak için uygun Bir gün...");
        }
        else if (heat >= 5 && heat < 15) {
            System.out.println("Bugün sinemaya gitmek için uygun bir gün...");
        }
        else if (heat >= 15 && heat < 25) {
            System.out.println("Bugün piknik yapmak için uygun bir gün...");
        }
        else if(heat >= 25 && heat < 50){
            System.out.println("Bugün yüzmeye gitmek için uygun bir gün...");
        }
        else{
            System.out.println("Sıcaklık değeri yanlış girildi...");
        }
        System.out.println("***************************************************");
    }
}
