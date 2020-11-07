package model;

public class Songs {
	private String title;
	private String artist;
	private String date;
	private int duration;
	private String gender;
	

	/**
	 * @param title
	 * @param artist
	 * @param date
	 * @param duration
	 * @param gender
	 */
	public Songs(String title, String artist, String date, int duration, String gender) {
		super();
		this.title = title;
		this.artist = artist;
		this.date = date;
		this.duration = duration;
		this.gender = gender;
	}

	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}



	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}



	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}



	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}



	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}



	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}



	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	*show the songs 
	*@param
	*@return a String, .
	*/
	public String showSong() {
		String contents = "SONG \n";
		contents +="*************  SONG **************\n";
		contents +="**  Title: "+getTitle()+ " ***\n";
		contents +="**  Artist: "+getArtist()+" ***\n";
		contents +="**  Genre: "+getGender()+" ***\n";
		contents +="***********************************\n";
		
		return contents;
		
	}

}
