package model;

public class Users {
	private String username;
	private String pasword;
	private int age;
	private CategoryUser category;
	
	/**
	 * @param username
	 * @param pasword
	 * @param age
	 * @param category
	 */
	public Users(String username, String pasword, int age, CategoryUser category) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.age = age;
		this.category = category;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the pasword
	 */
	public String getPasword() {
		return pasword;
	}

	/**
	 * @param pasword the pasword to set
	 */
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the category
	 */
	public CategoryUser getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryUser category) {
		this.category = category;
	}

	/**
	*show the List Users
	*@param 
	*@return a String, .
	*/
	public String showUser() {
		
		
		String contents = "";
		contents +="*************  User **************\n";
		contents +="**  UserName: "+getUsername()+" ***\n";
		contents +="**  Age: "+getAge()+" ***\n";
		contents +="**  Category: "+getCategory()+" ***\n";
		contents +="***********************************\n";
		
		return contents;
	}
}
