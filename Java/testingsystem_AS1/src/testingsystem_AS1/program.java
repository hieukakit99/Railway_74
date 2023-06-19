package testingsystem_AS1;


import java.time.LocalDate;



public class program {
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
         position1.positionId  = 1;
         position1.positionName = "Dev";
        
    Position position2 = new Position();
         position2.positionId  = 2;
         position2.positionName = "Test";
              
    Position position3 = new Position();
         position3.positionId  = 3;
         position3.positionName = "PM";
             
 // thêm dữ liệu Account
         
    Account account1 = new Account();
         account1.accountId = 1;
         account1.email = "Email1@gmail.com";
         account1.userName = "Username1";
         account1.fullName = "Fullname1";
         account1.departmentId= department1 ;
         account1.positionId = position1;
         account1.createDate = LocalDate.now();
    Account account2 = new Account();
         account2.accountId = 2;
         account2.email = "Email2@gmail.com";
         account2.userName = "Username2";
         account2.fullName = "Fullname2";
         account2.departmentId= department2 ;
         account2.positionId = position2;
         account2.createDate = LocalDate.now();      
    Account account3 = new Account();
         account3.accountId = 3;
         account3.email = "Email3@gmail.com";
         account3.userName = "Username3";
         account3.fullName = "Fullname3";
         account3.departmentId= department3 ;
         account3.positionId = position3;
         account3.createDate = LocalDate.now();      
  // thêm dư liệu vào  Group
         
    Group group1 = new Group();
         group1.groupId = 1;
         group1.groupName = "Testing System";
         group1.creatorId = 1;
         group1.createDate = LocalDate.now();
    Group group2 = new Group();
         group2.groupId = 2;
         group2.groupName = "Development";
         group2.creatorId = 2;
         group2.createDate = LocalDate.now();     
    Group group3 = new Group();
         group3.groupId = 3;
         group3.groupName = "VTI Sale 01";
         group3.creatorId = 3;
         group3.createDate = LocalDate.now();              
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
         
    // thêm dữ liệu vào   TypeQuestion
    TypeQuestion typequestion1 = new TypeQuestion();
         typequestion1.typeID = 1;
         typequestion1.typeName = "essay";
    TypeQuestion typequestion2 = new TypeQuestion();
         typequestion2.typeID = 2;
         typequestion2.typeName = "Multiple-Choice";
    // thêm dữ liệu vào CategoryQuestion
    CategoryQuestion categoryquestion1 = new CategoryQuestion();
          categoryquestion1.categoryId = 1;
          categoryquestion1.categoryName = "C Sharp";
    CategoryQuestion categoryquestion2 = new CategoryQuestion();
          categoryquestion2.categoryId = 2;
          categoryquestion2.categoryName = "Java";  
    CategoryQuestion categoryquestion3 = new CategoryQuestion();
          categoryquestion3.categoryId = 3;
          categoryquestion3.categoryName = "ASP.NET";  
     // thêm dữ liệu vào Question
    Question question1= new Question();
           question1.categoryId= categoryquestion1;
           question1.conten = "Câu hỏi về Java";
           question1.questionId = 1;
           question1.typeId = typequestion1;
           question1.creatorId = account1;
           question1.createDate = LocalDate.now();
   Question question2= new Question();
           question2.categoryId= categoryquestion2;
           question2.conten = "Câu Hỏi về PHP";
           question2.questionId = 2;
           question2.typeId = typequestion2;
           question2.creatorId = account2;
           question2.createDate = LocalDate.now();  		 
   Question question3= new Question();
           question3.categoryId= categoryquestion3;
           question3.conten = "Hỏi về C#";
           question3.questionId = 3;
           question3.typeId = typequestion2;
           question3.creatorId = account3;
           question3.createDate = LocalDate.now();  	      
  // them du lieu vao  Answer
   Answer answer1 = new Answer();
           answer1.answerId = 1;
           answer1.conten = "Trả lời 01";
           answer1.questionId = question1;
           answer1.isCorrect = true;
   Answer answer2 = new Answer();
           answer2.answerId = 2;
           answer2.conten = "Trả lời 02";
           answer2.questionId = question2;
           answer2.isCorrect = false;
   Answer answer3 = new Answer();
           answer3.answerId = 3;
           answer3.conten = "Trả lời 03";
           answer3.questionId = question3;
           answer3.isCorrect = true;
   // them du lieu vao Exam
   Exam exam1 = new Exam();
           exam1.examId = 1;
           exam1.code = "VTIQ001";
           exam1.title = "Đề thi C#";
           exam1.categoryID = categoryquestion1;
           exam1.duration = 60;
           exam1.creatorId = account1;
           exam1.createDate = LocalDate.now();
           
   Exam exam2 = new Exam();
           exam2.examId = 2;
           exam2.code = "VTIQ002";
           exam2.title = "Đề thi php";
           exam2.categoryID = categoryquestion2;
           exam2.duration = 120;
           exam2.creatorId = account2;
           exam2.createDate = LocalDate.now();
 
   Exam exam3 = new Exam();
           exam3.examId = 3;
           exam3.code = "VTIQ003";
           exam3.title = "Đề thi Java";
           exam3.categoryID = categoryquestion3;
           exam3.duration = 60;
           exam3.creatorId = account3;
           exam3.createDate = LocalDate.now();
    // them du lieu vao ExamQuestion
   ExamQuestion eq1 = new ExamQuestion();
           eq1.examId = exam1;
           eq1.questionId= question1;
   ExamQuestion eq2= new ExamQuestion();
           eq2.examId = exam2;
           eq2.questionId= question2;        
   ExamQuestion eq3 = new ExamQuestion();
           eq3.examId = exam3;
           eq3.questionId= question3;        
   // Question 3:Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra        
 System.out.println("cac group");
 System.out.println("group 1 Id:" + group1.groupId + "name:" + group1.groupName 
		 + "creatorId:" + group1.creatorId + "Ngay tao:" + group1.createDate);
 System.out.println("group 2 Id:" + group2.groupId + "name: " + group2.groupName
		 +"creatorid:" + group2.creatorId + "Ngay Tao :" + group2.createDate);
 System.out.println("group 3 ID:" + group3.groupId + "name:" + group3.groupName
		 + "creatorId:" + group3.creatorId + "Ngay Tao:" + group3.createDate);
           
        		 
   
       
}

}
