package ui;

import model.*;
import java.util.Scanner;

public class Menu {
	private final static int ADD_USERS = 1;
	private final static int SHOW_USERS = 2;
	private final static int ADD_SONG = 3;
	private final static int SHOW_SONG = 4;
	private final static int ADD_PLAYLIST = 5;
	private final static int SHOW_PLAYLIST = 6;
	private final static int EXIT = 7;

	
	private static Scanner sc = new Scanner(System.in);
	
	private Users users;
	private Songs songs;
	private Playlist playlist;
	private PlaylistPrivate playlistprivate;
	private PlaylistPublic playlistpublic;
	private PlaylistRestricted playlistrestricted;

	

	/**
	 * 
	 */
	public Menu() {
		super();
	}
	
	/**
	*show menu options
	*@param 
	*@return
	*/
	public void showMenu() {
		System.out.println("(" +ADD_USERS+ ") Create a user");
		System.out.println("(" +SHOW_USERS+ ") List users");
		System.out.println("(" +ADD_SONG+ ") Create a song");
		System.out.println("(" +SHOW_SONG+ ") List the songs");
		System.out.println("(" +ADD_PLAYLIST+ ") Create playlist");
		System.out.println("(" +SHOW_PLAYLIST+ ") List Playlist");
		System.out.println("(" +EXIT+ ") EXIT");
	}
	
	
	/**
	*read the option that the user chooses from the menu
	*@param 
	*@return enter choice
	*/
	public int readOption() {
		int choice = sc.nextInt();
		return choice;
	}
	
	/**
	*the menu 
	*@param int choice, 
	*@return
	*/
	public void doOperation(int choice) {
		switch (choice) {
		case ADD_USERS:
			this.users = createUser();
			break;
		case SHOW_USERS:
			System.out.println(users.showUser());
			break;
		case ADD_SONG:
			this.songs =createSong();
			break;
		case SHOW_SONG:
			System.out.println(songs.showSong());
			break;
		case ADD_PLAYLIST:
			playlistvar();
			break;
		case SHOW_PLAYLIST:
			System.out.println(playlist.showPlaylist());
			break;
		case EXIT:
			break;
		default:
			System.out.println("Option invalid, repeat again");
			
		}
	}
	
	/**
	*invoke several methods, to make the menu work.
	*@param 
	*@return 
	*/
	public void startProgram() {
		int option;
		do {
			showMenu();
			option = readOption();
			doOperation(option);
		}while(option!=15);
	}
	
	/**
	*create a user object with its respective characteristics.
	*@param 
	*@return a object Users
	*/
	public Users createUser() {
		System.out.println("CREATE USER\n");
		System.out.println("Enter username, no space");
		String name = sc.next();
		System.out.println("Enter password:");
		String pasword = sc.next();
		System.out.println("Enter the user's age: ");
		int age = sc.nextInt();
		CategoryUser category = CategoryUser.newbie;
		
		Users users = new Users (name,pasword,age,category);
		return users;
		
	}
	
	/**
	*create a song object with its respective characteristics.
	*@param 
	*@return a object Songs
	*/
	public Songs createSong() {
		System.out.println("Enter a title");
		String title = sc.next();
		System.out.println("Enter artist name or band name");
		String artist = sc.next();
		System.out.println("Enter the release date");
		String date = sc.next();
		System.out.println("Enter the duration of the song in seconds");
		int duration = sc.nextInt();
		System.out.println("Enter gende");
		String gender = sc.nextLine();
	
		Songs songs = new Songs(title,artist,date,duration,gender);
		return songs;
	}
	
	/**
	*invoke various methods to create a play list according to its characteristics.
	*@param 
	*@return 
	*/
	public void playlistvar() {
		System.out.println("Enter what type of playlist you want to create ");
		System.out.println(" (1)Private, (2)Restricted, (3)Public ");
		int var = sc.nextInt();
		
		if(var==1) {
			this.playlistprivate = CreatePlaylistPriv();
		}
		if(var==2) {
			this.playlistrestricted = CreatePlaylistRes();
		}
		if(var==3) {
			this.playlistpublic = CreatePlaylistPub();
		}
	}
	
	/**
	*create a play list with the private feature.
	*@param 
	*@return a object PlaylistPrivate
	*/
	public PlaylistPrivate CreatePlaylistPriv() {
		
		System.out.println("Enter a name");
		String namep = sc.next();
		int duration = 0;
		String[] gender = new String[20];
			
		
		System.out.println("Enter the user");
		String users = sc.next();
		
		PlaylistPrivate playlistprivate = new PlaylistPrivate(namep,duration,gender,users); 
		
		return playlistprivate;
	}
	
	/**
	*create a play list with the restricted feature.
	*@param 
	*@return a object PlaylistRestricted
	*/
	public PlaylistRestricted CreatePlaylistRes() {	
		System.out.println("Enter a name");
		String namep = sc.next();
		int duration = 0;
		String[] genders = new String[20];
		
		String[] usersp = new String[5];
		for (int i=0; i<5;i++) {
			System.out.println("Enter the user");
			usersp[i] = sc.next(); 
		}
		PlaylistRestricted playlistrestricted = new PlaylistRestricted(namep,duration,genders,usersp); 
		
		return playlistrestricted;
		
	}
	
	/**
	*create a play list with the public feature.
	*@param 
	*@return a object PlaylistPublic
	*/
	public PlaylistPublic CreatePlaylistPub() {	
		System.out.println("Enter a name");
		String namep = sc.next();
		int duration = 0;
		String[] genders = new String[20];
		
		System.out.println("Enter the qualification From 1 to 5");
		int qualification = sc.nextInt();
		qualification = (qualification+qualification)/2;
		
		
		PlaylistPublic playlistpublic = new PlaylistPublic(namep,duration,genders,qualification); 
		
		return playlistpublic;
		
	}
	
	//añadir canciones al playlist
	
	//actualizar La duración y el género de un playlist,
	

	/**
	 * @return the play list private
	 */
	public PlaylistPrivate getPlaylistprivate() {
		return playlistprivate;
	}

	/**
	 * @param playlistprivate the play list private to set
	 */
	public void setPlaylistprivate(PlaylistPrivate playlistprivate) {
		this.playlistprivate = playlistprivate;
	}

	/**
	 * @return the play list public
	 */
	public PlaylistPublic getPlaylistpublic() {
		return playlistpublic;
	}

	/**
	 * @param playlistpublic the play list public to set
	 */
	public void setPlaylistpublic(PlaylistPublic playlistpublic) {
		this.playlistpublic = playlistpublic;
	}

	/**
	 * @return the play list restricted
	 */
	public PlaylistRestricted getPlaylistrestricted() {
		return playlistrestricted;
	}

	/**
	 * @param playlistrestricted the play list restricted to set
	 */
	public void setPlaylistrestricted(PlaylistRestricted playlistrestricted) {
		this.playlistrestricted = playlistrestricted;
	}
	
}
