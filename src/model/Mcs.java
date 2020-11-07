package model;

import ui.Menu;

public class Mcs {
	
	private final static int USERS = 10;
	private final static int PLAYLIST = 20;
	private final static int SONGS = 30;
	
	Users [] users;
	Playlist [] playlist;
	Songs [] songs;

	
	/**
	 * @param menu
	 * @param users
	 * @param playlist
	 * @param songs
	 */
	public Mcs(Menu menu, Users[] users, Playlist[] playlist, Songs[] songs) {
		super();
		users = new Users[USERS];
		playlist = new Playlist[PLAYLIST];
		songs = new Songs[SONGS];
	}
	
}
