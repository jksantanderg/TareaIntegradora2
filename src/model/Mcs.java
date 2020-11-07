package model;

public class Mcs {
	private final static int USERS = 10;
	private final static int PLAYLIST = 20;
	private final static int SONGS = 30;
	
	Users [] users;
	Playlist [] playlist;
	Songs [] songs ;
	
	
	public Mcs(Users[] users, Playlist[] playlist, Songs[] songs) {
		super();
		users = new Users[USERS];
		playlist = new Playlist[PLAYLIST];
		songs = new Songs[SONGS];
	}
	
	public void listUsers() {
		boolean space = false;
		for (int i=0; i<10 && !space; i++){
			if (users[i]==null) {
				Users newUsers = null;
				users[i]=newUsers;
				space = true;
			}
		}
	}
	
	public void listSongs() {
		boolean space = false;
		for (int i=0; i<30 && !space; i++){
			if (songs[i]==null) {
				Songs newSongs = null;
				songs[i]=newSongs;
				space = true;
			}
		}
	}
	
	public void listPlaylist() {
		boolean space = false;
		for (int i=0; i<20 && !space; i++){
			if (playlist[i]==null) {
				Playlist newPlaylist = null;
				playlist[i]=newPlaylist;
				space = true;
			}
		}
	}

}
