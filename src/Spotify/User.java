package Spotify;

import java.util.ArrayList;

public class User {
    public String username, password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    protected UserBehavior behavior;
    protected ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void follow(User user) {
        if (!(allUsers.contains(user)))
            throw new InvalidOperationException("The user you're trying to follow does not exist!");
        followingList.add(user);
        user.followerList.add(this);
    }

    void createPlaylist(String title, User owner) {
        this.behavior.createPlaylist(title, owner);
    }

    void playMusic(Music music) {
        this.behavior.playMusic(music);
    }

    void buyPremium(User user, int month) {
        this.behavior.buyPremium(user, month);
    }

}
