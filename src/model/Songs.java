package model;

public class Songs {
	private String title;
	private String artist;
	private String date;
	private int duration;
	private String gender;
	
	
	
	public Songs(String title, String artist, String date, int duration, String gender) {
		super();
		this.title = title;
		this.artist = artist;
		this.date = date;
		duration = 0;
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String showSong() {
		String contents = "SONG \n";
		contents +="*************  SONG **************";
		contents +="**  Title: "+getTitle()+ " ***\n";
		contents +="**  Artist: "+getArtist()+" ***\n";
		contents +="**  Genre: "+getGender()+" ***\n";
		contents +="***********************************";
		
		return contents;
		
	}

}
