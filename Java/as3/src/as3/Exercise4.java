package as3;

import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {
// question 1	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("nhap xau ki tu:" );
//	String a = scanner.nextLine();
//	String [] b = a.split(" ");
//	int question1Count = b.length;
//	System.out.println("question 4");
//	System.out.println("so luong cac xau trong ki tu nay la : " + question1Count);
// question 2
//Scanner scanner = new Scanner(System.in);
//System.out.println("Nhap xau ki tu s1 :" ) ;
//String s1 = scanner.nextLine();
//System.out.println(" nhap xau ki tu s2: " );
//String s2 = scanner.nextLine();
//String s3 = s1 +s2;
//System.out.println("ket qua sau khi cong chuoi la : " + s3);
// quesiton 3
//Scanner scanner = new Scanner(System.in);
//	System.out.println(" nhap ten: " );
//	String a = scanner.nextLine();
//	String firstLetter = a.substring(0, 1);
//	String remainingLetters = a.substring(1);
//	String vietHoa = firstLetter.toUpperCase() + remainingLetters ;
//System.out.println("ten sau khi dc viet hoa chu cai dau la : " + vietHoa);
// question 4
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Nhập tên: ");
//    String name = scanner.nextLine();
//    name = name.toUpperCase();
//    for (int i = 0; i < name.length(); i++) {
//        char character = name.charAt(i);
//        System.out.println("Ky tu thu " + (i + 1) + " là: " + character);
//    }
   // question 5
  Scanner scanner = new Scanner(System.in);
  System.out.println("Nhap Ho:" ) ;
  String lastName = scanner.nextLine();
  System.out.println(" Nhap Ten: " );
  String firstName  = scanner.nextLine();
  String fullName = lastName + " " + firstName;
  fullName = fullName.toUpperCase();
  System.out.println("ket qua sau khi cong chuoi la : " + fullName);
}

	}

