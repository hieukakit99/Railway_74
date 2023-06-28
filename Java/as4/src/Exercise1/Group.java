package Exercise1;

import java.util.Date;

public class Group {
private int id;
private String groupName;
private String creator;
private Account[] account;
private Date createDate;
// a không có parameters
public Group () {};
// b b) Có các parameter là GroupName, Creator, array Account[]
//accounts, CreateDate
public Group (String groupName,String creator,Account [] account, Date createDate) {
this.groupName = groupName;
this.creator = creator;
this.account = account;
this.createDate = createDate;
// c
//public Group(String groupName, String creator, String[] usernames, Date createDate) {
//    this.groupName = groupName;
//    this.creator = creator;
//    this.account = new Account[usernames.length];
//    this.createDate = createDate;
//
//    for (int i = 0; i < usernames.length; i++) {
//        this.account[i] = new Account(usernames[i]);
//    }

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGroupName() {
	return groupName;
}
public void setGroupName(String groupName) {
	this.groupName = groupName;
}
public String getCreator() {
	return creator;
}
public void setCreator(String creator) {
	this.creator = creator;
}
public Account[] getAccount() {
	return account;
}
public void setAccount(Account[] account) {
	this.account = account;
}
public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
}
//

