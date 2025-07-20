import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum yılı alınır
        System.out.print("Doğum yılınızı giriniz: ");
        int year = input.nextInt();

        // Çin Zodyağı indeksi hesaplanır
        int zodiacIndex = year % 12;

        // Switch-case ile burç belirlenir
        String zodiac;

        switch (zodiacIndex) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                zodiac = "Geçersiz yıl";
        }

        // Sonuç yazdırılır
        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
    }
}
