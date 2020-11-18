package ge.edu.btu.chat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("მიმდინარეობს კავშირის დამყარება ... ");
            System.out.println("დასვი კითხვა:");

            String question = scanner.nextLine();
            if (question.equals("გამარჯობა")) {
                System.out.println("პასუხი: მოგესალმებით, რით შემიძლია დაგეხმაროთ?:");
                System.out.println("დასვი კითხვა:");
                question = scanner.nextLine();

            } if (question.equals("მითხარი ეროვნული ვალუტის კურსი")) {
                System.out.println("პასუხი: ეროვნული ვალუტის კურსია 3.3");
                System.out.println("დასვი კითხვა:");
                question = scanner.nextLine();
            } if (question.equals("მაჩვენე ფილიალები")) {
                System.out.println("პასუხი: ვაჟა-ფშაველას გამზირი, ი.ჭავჭავაძის გამზირი");
                System.out.println("დასვი კითხვა:");
                question = scanner.nextLine();
            } if (question.equals("ნახვამდის")) {
                System.out.println("პასუხი: ნახვამდის");
                break;
            } else {
                System.out.println("პასუხი: სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ");
            }

        }
    }
}
