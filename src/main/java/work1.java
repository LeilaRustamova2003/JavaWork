import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {

        // Tapşırıq 1: İstifadəçidən ad, soyad və doğum ilini alın. Yaşı hesablayıb printf ilə
        // belə çap edin: “Ali Məmmədov, 25 yaş”.

        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String name = input.nextLine();

        System.out.print("Soyadinizi daxil edin: ");
        String lastname = input.nextLine();

        System.out.print("Dogum ilinizi daxil edin: ");
        int birthDay = input.nextInt();

        int age = 2026 - birthDay;

        System.out.printf("%s %s, %d yas", name, lastname, age);
        System.out.println("\nName:" + name + "\n" + "Lastname: " + lastname + "\n" + "Age: " + age + "\n");


        // Tapşırıq 2: İki tam ədəd alın və onların cəmini, fərqini, hasilini, tam bölməsini, kəsrli
        // bölməsini (2 rəqəm dəqiqliklə) və qalığını çap edin.

        System.out.print("Birinci ededi daxil edin: ");
        int firstNumber = input.nextInt();

        System.out.print("Ikinci ededi daxil edin: ");
        int secondNumber = input.nextInt();

        System.out.println("Cem: " + (firstNumber + secondNumber));
        System.out.println("Ferq: " + (firstNumber - secondNumber));
        System.out.println("Hasil: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Tam bolme: " + (firstNumber / secondNumber));
            System.out.printf("Kesrli bolme: %.2f%n", (double) firstNumber / secondNumber);
            System.out.println("Qaliq: " + (firstNumber % secondNumber) + "\n");
        } else {
            System.out.println("Sifira bolmek olmaz!\n");
        }


        // Tapşırıq 3: Celsius ilə temperatur alın, Fahrenheit-ə çevirin: F = C * 9 / 5 + 32.
        // Nəticəni double kimi çap edin.

        System.out.print("Celsius temperaturunu daxil edin: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Fahrenheut: " + fahrenheit + "\n");
        //System.out.printf("Fahrenheit: %.2f", fahrenheit);


        // Tapşırıq 4: İmtahan balını alın və ternar operatorla “Keçdi” (51 və yuxarı) və ya
        // “Kəsildi” çap edin.

        System.out.print("Imtahan balini daxil edin: ");
        int score = input.nextInt();

        String result = (score >= 51) ? "Kecdi" : "Kesildi";

        System.out.println(result + "\n");


        // Tapşırıq 5: 3 fənnin balını int kimi alın, ortalamanı double kimi düzgün hesablayın
        // (tam bölmə xətasına diqqət!)

        System.out.println("Birinci fenin balini daxil edin: ");
        int firstScore = input.nextInt();

        System.out.println("Ikinci fenin balini daxil edin: ");
        int secondScore = input.nextInt();

        System.out.println("Ucuncu fenin balini daxil edin: ");
        int thirdScore = input.nextInt();

        double average = (double) (firstScore + secondScore + thirdScore) / 3;

        System.out.println("Average is " + average + "\n");


        // Tapşırıq 6: İstifadəçidən qiyməti String kimi alın (nextLine()),
        // Double.parseDouble() ilə çevirin, 18% ƏDV əlavə edib çap edin.

        input.nextLine(); // nextInt() və ya nextDouble()-dan sonra nextLine() gələndə araya bir boş nextLine() yazırıq. Evvelki Enter-i temizleyir

        System.out.println("Qiymeti daxil edin: ");
        String melumat = input.nextLine();

        double price = Double.parseDouble(melumat);

        double edv = price * 0.18;

        double totalPrice = price + edv;

        System.out.println("Edv: " + edv);
        System.out.println("Umumi qiymet: " + totalPrice);

        input.close();
    }
}
