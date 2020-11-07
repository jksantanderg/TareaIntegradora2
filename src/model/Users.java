package model;

public class Users {
	private String username;
	private String pasword;
	private int age;
	private CategoryUser category;
	
	
	public Users(String username, String pasword, int age, CategoryUser category) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.age = age;
		category = CategoryUser.newbie;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public CategoryUser getCategory() {
		return category;
	}
	public void setCategory(CategoryUser category) {
		this.category = category;
	}
	
	public String showUSer() {
		
		String contents = "";
		contents +="*************  User **************";
		contents +="**  UserName: "+getUsername()+" ***\n";
		contents +="**  Age: "+getAge()+" ***\n";
		contents +="**  Category: "+getCategory()+" ***\n";
		contents +="***********************************";
		
		return contents;
	}

}
