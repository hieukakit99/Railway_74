package Exercise1;

import java.time.LocalDateTime;
import java.util.Date;

public class Account {
 private int id;
 private String email;
 private String userName;
 private String firstName;
 private String lastName;
 private String fullName;
 private String position;
 private LocalDateTime createDate;
//a Không có parameters
 public Account () {};
//b b) Có các parameter là id, Email, Username, FirstName, 
 //LastName (với FullName = FirstName + LastName)
 public Account (int id, String email, String userName,String firstName,String lastName) {
	 this.id = id;
     this.email = email;
     this.userName = userName;
     this.firstName = firstName;
     this.lastName= lastName;
     this.fullName = firstName + " " + lastName;
 };
// c) Có các parameter là id, Email, Username, FirstName,
// LastName (với FullName = FirstName + LastName) và
// Position của User, default createDate = now
 public Account (int id, String email, String username, String firstName, String lastName, String position, Date createDate) {
	 this.id = id;
     this.email = email;
     this.userName = userName;
     this.firstName = firstName;
     this.lastName= lastName;
     this.fullName = firstName + " " + lastName;
     this.position = position;
     this.createDate = LocalDateTime.now();
 }
 //d) Có các parameter là id, Email, Username, FirstName,
//LastName (với FullName = FirstName + LastName) và
 //Position của User, createDate
 public Account ( String email,int id, String username, String firstName, String lastName, String position, Date createDate) {
	 this.id = id;
     this.email = email;
     this.userName = userName;
     this.firstName = firstName;
     this.lastName= lastName;
     this.fullName = firstName + " " + lastName;
     this.position = position;
//     this.createDate = createDate;
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
	
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public LocalDateTime getCreateDate() {
	return createDate;
}
public void setCreateDate(LocalDateTime createDate) {
	this.createDate = createDate;
}
}

