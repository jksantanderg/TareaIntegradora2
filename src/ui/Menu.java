package ui;

import model.*;
import java.util.Scanner;

public class Menu {
	private final static int ADD_USERS = 1;
	private final static int SHOW_USERS = 2;
	private final static int ADD_SONG = 3;
	//Actualizar la categoría de un usuario, a medida que agrege canciones
	private final static int SHOW_SONG = 5;
	private final static int ADD_PLAYLIST = 7;
	private final static int UPDATE_PLAYLIST = 8;
	//añadir canciones al playlist
	//9
	//La duración y el género de un playlist, se actualizan
	//un playlist privado, agregar el único usuario que tiene acceso a las canciones del playlist.
	//un playlist restringido, la aplicación permite agregar máximo cinco usuarios que tienen acceso a las canciones del playlist.
	//un playlist público, la aplicación permite a un usuario asignar una calificación y mostrar la calificación promedio.
	//private final static int SHOW_PLAYLIST = 14;
	private final static int EXIT = 15;
	
	private static Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		System.out.println("(1) Create a user");
		System.out.println("(2) List users");
		System.out.println("(3) Create a song");
		System.out.println("(5) List the songs");
		//crear tipo de playlist privado,publico,restringido
		System.out.println("(7) Create playlist");
		System.out.println("(15) EXIT");
	}
	
	public int readOption() {
		int choice = sc.nextInt();
		return choice;
	}
	
	public void doOperation(int choice) {
		switch (choice) {
		case ADD_USERS:
			createUser();
			break;
		case SHOW_USERS:
			//showUSer()
			break;
		case ADD_SONG:
			createSong();
			break;
		case SHOW_SONG:
			//showSong();
			break;
		case ADD_PLAYLIST:
			playlistvar();
			break;
		case UPDATE_PLAYLIST:
			
			break;
		case EXIT:
			break;
		default:
			System.out.println("Option invalid, repeat again");
			
		}
	}
	
	
	public void startProgram() {
		int option;
		do {
			showMenu();
			option = readOption();
			doOperation(option);
		}while(option!=15);
	}
	
	public Users createUser() {
		System.out.println("CREATE USER\n");
		System.out.println("Enter username, no space");
		String name = sc.nextLine();
		System.out.println("Enter password:");
		String pasword = sc.nextLine();
		System.out.println("Enter the user's age: ");
		int age = sc.nextInt();
		System.out.println("category");
		CategoryUser category = CategoryUser.newbie;
		
		
		Users users = new Users (name,pasword,age,category);
		return users;
	}
	
	
	public Songs createSong() {
		System.out.println("Enter a title");
		String title = sc.nextLine();
		System.out.println("Enter artist name or band name");
		String artist = sc.nextLine();
		System.out.println("Enter the release date");
		String date = sc.nextLine();
		System.out.println("Enter the duration of the song in seconds");
		int duration = sc.nextInt();
		System.out.println("Enter gende");
		String gender = sc.nextLine();
	
		Songs songs = new Songs(title,artist,date,duration,gender);
		return songs;

	}
	
	public void playlistvar() {
		System.out.println("Enter what type of playlist you want to create ");
		System.out.println(" (1)Private, (2)Restricted, (3)Public ");
		int var = sc.nextInt();
		
		if(var==1) {
			CreatePlaylistPriv();
		}
		if(var==2) {
			CreatePlaylistRes();
		}
		if(var==3) {
			CreatePlaylistPub();
		}
	}
	
	public PlaylistPrivate CreatePlaylistPriv() {
		
		System.out.println("Enter a name");
		String namep = sc.nextLine();
		int duration = 0;
		String[] gender = new String[20];
			
		
		System.out.println("Enter the user");
		String users = sc.nextLine();
		
		PlaylistPrivate playlistprivate = new PlaylistPrivate(namep,duration,gender,users); 
		
		return playlistprivate;
	}
	
	
	public PlaylistRestricted CreatePlaylistRes() {	
		System.out.println("Enter a name");
		String namep = sc.nextLine();
		int duration = 0;
		String[] genders = new String[20];
		
		String[] usersp = new String[5];
		for (int i=0; i<5;i++) {
			System.out.println("Enter the user");
			usersp[i] = sc.nextLine(); 
		}
		PlaylistRestricted playlistrestricted = new PlaylistRestricted(namep,duration,genders,usersp); 
		
		return playlistrestricted;
		
	}
	
	public PlaylistPublic CreatePlaylistPub() {	
		System.out.println("Enter a name");
		String namep = sc.nextLine();
		int duration = 0;
		String[] genders = new String[20];
		
		System.out.println("Enter the qualification ");
		int qualification = sc.nextInt();
		
		
		PlaylistPublic playlistpublic = new PlaylistPublic(namep,duration,genders,qualification); 
		
		return playlistpublic;
		
	}
	
	//añadir canciones al playlist
	
	//actualizar La duración y el género de un playlist,
	
	public void updatePlaylist() {
		
	}
}
