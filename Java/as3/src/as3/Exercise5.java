package as3;
public class Exercise5{ 

	    public static void main(String[] args) {
	        // Tạo đối tượng phòng ban
	    	Department[] departments = new Department[5];
	        Department departname1 = new Department(1, " Nguyen Van A"," ha noi");
	        Department department2 = new Department(2, "Nguyen Van B","hai phong");
	        Department department3 = new Department(3, "Nguyen Van c","hung yen");
	        Department department4 = new Department(4, "Nguyen Van d","hai duong");
	        Department department5 = new Department(5, "Nguyen Van e","bac giang");
	        departments[0] = departname1;
	        departments[1] = department2;
	        departments[2] = department3;
	        departments[3] = department4;
	        departments[4] = department5;

	        // Question 1:
	        System.out.println("question 1");
	        System.out.println(departname1.toString());
	        // question 2
	        System.out.println("question 2");
	        	for (Department department : departments) {
	        	System.out.println(department);
	        	}
	        // question 3
	        	  System.out.println("Địa chỉ phòng ban 1: " + departname1.getDiaChi());
	        	
	        	

}
}