package testingsystem_AS2;

import java.time.LocalDate;






public class CreateData {


public static void main(String[] args) {

// thêm dữ liệu department
	
		Department department1 = new Department();
	         department1.departmentId = 1;
	         department1.departmentName = "sale";
	         
	    Department department2 = new Department();
	         department2.departmentId = 2;
	         department2.departmentName = "marketing";  
	    Department department3 = new Department();
	         department3.departmentId = 1;
	         department3.departmentName = "it";
	   
// thêm dữ liệu potision 
	      
	      Position position1 = new Position();
	           position1.Id  = 1;
	           position1.positionName = "Dev";
	          
	      Position position2 = new Position();
	           position2.Id  = 2;
	           position2.positionName = "Test";
	                
	      Position position3 = new Position();
	           position3.Id  = 3;
	           position3.positionName = "PM";
	               	   
  	
 // thêm dư liệu vào  Group
	                
  Group group1 = new Group();
	                     group1.group = 1;
	                     group1.groupName = "Testing System";
	                     group1.creatorId = 1;
	                     group1.createDate = LocalDate.now();
	                   
Group group2 = new Group();
	                     group2.group = 2;
	                     group2.groupName = "Development";
	                     group2.creatorId = 2;
	                     group2.createDate = LocalDate.now(); 
 Group group3 = new Group();
	                     group3.group = 3;
	                     group3.groupName = "VTI Sale 01";
	                     group3.creatorId = 3;
	                     group3.createDate = LocalDate.now();   
 // thêm dữ liệu Account
	      	           
Account account1 = new Account();
	                     	                account1.accountId = 1;
	                     	                account1.email = "Email1@gmail.com";
	                     	                account1.userName = "Username1";
	                     	                account1.fullName = "Fullname1";
	                     	                account1.department= department1 ;
	                     	                account1.positionId = position1;
	                     	                account1.createDate = LocalDate.now();
	                     	               
	                     	               
	                     	                account1.group = group1;
	                     	         
 Account account2 = new Account();
	                     	                account2.accountId = 2;
	                     	                account2.email = "Email2@gmail.com";
	                     	                account2.userName = "Username2";
	                     	                account2.fullName = "Fullname2";
	                     	                account2.department= department2 ;
	                     	                account2.positionId = position2;
	                     	                account2.createDate = LocalDate.now(); 
	                     	                account2.group = group2;
 Account account3 = new Account();
	                     	                account3.accountId = 3;
	                     	                account3.email = "Email3@gmail.com";
	                     	                account3.userName = "Username3";
	                     	                account3.fullName = "Fullname3";
	                     	                account3.department= department3 ;
	                     	                account3.positionId = position3;
	                     	                account3.createDate = LocalDate.now();
	                     	                account3.group = group3;
// // add Group Account
//
//	                     	               group1.account = new Account[] { account1 };
//	                     	               group2.account = new Account[] { account1, account2 };
//	                     	               group3.account = new Account[] { account2 };
//	                     	                
// thêm dữ liệu vào GroupAccount
 GroupAccount groupaccount1 = new GroupAccount();      
	                          groupaccount1.group = group1;
	                          groupaccount1.account = account1;
	                          groupaccount1.joinDate = LocalDate.now();
 GroupAccount groupaccount2 = new GroupAccount();      
	                          groupaccount2.group = group2;
	                          groupaccount2.account = account2;
	                          groupaccount2.joinDate = LocalDate.now();   
 GroupAccount groupaccount3 = new GroupAccount();      
	                          groupaccount3.group = group3;
	                          groupaccount3.account = account3;
	                          groupaccount3.joinDate = LocalDate.now();    
 //quesition1	                                                
System.out.println("Question1" );
	                          if (account2.department == null) {
	                          System.out.println("Nhân viên này chưa có phòng ban.");
	                          } else if (account2 != null) {
	                          System.out.println("Phòng ban của nv này là: " +
	                          account2.department.departmentName);
	                          }	                          
  // quéstion2 
System.out.println("question2");
                       if (account2.group == null) {
                    	  System.out.println("Nhân viên chưa có group nào"); 
                       } else {int countgroup = account2.group.length;
                       if (countgroup == 0 || countgroup== 1 ) {
                    	   System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                       } else if (countgroup==2) {
                    	   System.out.println
                    	   ("Nhân viên này là người quan trọng, tham gia nhiều group");
                       } else if (countgroup >=3) {
                    	   System.out.println
                    	   ("Nhân viên này là người hóng chuyện, tham gia tất cả các group");  
                       }    
                       }      
// question 3	       
System.out.println(account2.department == null ? "Nhan Vien Chua Co Phong Ban" :
	"quessition 3 nhan vien co phong ban la:" + account2.department.departmentName);  
// quesstion 4
System.out.println(account1.positionId.positionName == "Dev" ? " quesstion 4 day la deverloper" 
		: "nguoi ngay khong phai deverloper");
// question 5
System.out.println("question5"); 
       if (group1.account == null);
       {System.out.println("nhom chua co thanh vien!");
       }  { 
    	   int countAccountInGroup = group1.account.length;
    	   switch (countAccountInGroup) {
    	   case 1 : {
    		   System.out.println("nhom co mot thanh vien");
    		   break;
    		   
    	   }
    	   case 2 : {
    		   System.out.println("nhom co hai thanh vien");
    		   break;
    	   }
    	   case 3 : {
    		   System.out.println("nhom co ba thanh vien");
    		   break;
    	   }
    	   default : {
    		   System.out.println("nhom co nhieu thanh vien");
    		   break;
    	   }
    	   } 
       }
// question 6	
  System.out.println("question6");
     if (account2.group ==  null);
     {System.out.println("nhan vien chua co group");}
      { int countGroup = account2.group.length;
    	 switch (countGroup) {
    	 case 1 : {System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
    	        break;
    	        }
    	 case 2 : {System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
    	        break;
    	 }
    	 case 3 : {System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");}
    	        break;
    	 
        default : {System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
      break;
        }
     }	 
  	 }
   // question 7   
      System.out.println("quesition 7");
      switch (account1.positionId.positionName) {
      case "Dev" : {
    	  System.out.println("day la developer");
       break;
      }
      default : {
    	  System.out.println("nguoi nay khong phai developer" );
    	  break;
    	  }
      }
   // question 8   
 System.out.println("question 8");
 Account [] allAccount = {account1, account2, account3};
  for (Account account : allAccount)
       System.out.println("id la:" + account.accountId
    		              + "email" + account.email
    		              + "full name:" + account.fullName
    		              + "department name :" + account.department.departmentName
    		             
    		   );
  // question 9
  System.out.println("question9");
  Department [] allDepartment = {department1, department2, department3};
  for (Department department : allDepartment)
	  System.out.println( "derpartment id" + department.departmentId
			            + "department name :" + department.departmentName       
			  );
 // question 10
  System.out.println("question10" );
  Account [] account12 = {account1, account2};
  for (int i = 0; i < account12.length ;i++)
  {
	  System.out.println("thong tin account so :" 
			              + (i+1) +"la:"           
			   );
	  System.out.println("email:" + account12[i].email);
	  System.out.println("full name :" + account12[i].fullName );
	  System.out.println("department name:" + account12[i].department.departmentName);
  } 
	  
	  
	  
      
}	                          
}               
