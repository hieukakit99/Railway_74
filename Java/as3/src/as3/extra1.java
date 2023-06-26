package as3;


import java.util.Random;
import java.util.Scanner;
public class extra1 {
	   
public static void main(String[] args) {
	//-- question 1
	System.out.println("question 1");
	float f1 = 5.1f ;
	float f2 = 10.5f;
	float luongAccount1 = 5240.5f;
	float luongAccount2 = 10970.055f;
	int luongAccount1Int = Math.round(luongAccount1);
	int luongAccount2Int = Math.round(luongAccount2);
	System.out.println(luongAccount1Int);
	System.out.println(luongAccount2Int);
	//..question 2
//	 for (int i=0; i<5; i++) {
	Random random = new Random();
	int a = random.nextInt(99999) + 1;
	System.out.println("so ngau nhien co 5 chu so: " + a);
 			
 		
      if(a/10 == 0) {
		System.out.println("0000"+ a); 
	} else if (a/100 == 0) {
		System.out.println("000"+ a); 
    }  else if (a/1000 == 0) {
		System.out.println("00"+ a); 
    } else if (a/10000 == 0) {
		System.out.println("0"+ a); 
    } {System.out.println("so ngau nhien co 5 chu so: " + a);}
     
// question 3
    String b = String.valueOf(a);
    System.out.println("Hai so cuoi: " + b.substring(3));
    // question 4
    

//  public class Main {
//        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("nhap so nguyen c: ");
            int c = scanner.nextInt();

            System.out.print("Nhap so nguyen d: ");
            int d = scanner.nextInt();

            double thuong = tinhThuong(c, d);
            System.out.println("thuong cua " + c + " và " + d + " là: " + thuong);
        }

        public static double tinhThuong(int c, int d) {
            return (double) c / d;
        }
    
}
