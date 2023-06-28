package Exercise1;

import java.util.Date;

public class main {
public static void main(String[] args) {
	Department department1 = new Department("sale") ;
	System.out.println("quesstion1 c");
    System.out.println(department1.getDepartmentName());
    System.out.println("question2");
    Account account1 = new Account ();
    		account1.setId(1);
    		account1.setEmail("hieukakit99@gmail.com");
    		account1.setUserName("hieukakit99");
    		account1.setLastName("Mai");
    		account1.setFirstName("Xuan Hieu");
    		System.out.println(account1.getId()+"\n"+account1.getEmail());
   System.out.println("question 3");
   String groupName = "Group B";
   String creator = "Hieu Kakit";
   Account[] account ={};
   Date createDate = new Date();

   Group group3 = new Group(groupName, creator, account, createDate);
System.out.println(group3.getGroupName()+"\n"+group3.getCreator());
}
}
