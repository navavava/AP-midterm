package Spotify;

import java.util.ArrayList;

public class User {
    public String username, password;
    public ArrayList<User> followerList = new ArrayList<>();
    public ArrayList<User> followingList = new ArrayList<>();
    public UserBehavior behavior;
    public ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();

    public User(String name, String password){

    }

    void follow (User user){
    followerList.add(user);
    }

    void createPlaylist (String Title, User Owner){
        this.behavior.createPlaylist(title, owner);
    }

    void playMusic (Music music){
        this.behavior.playMusic(title, owner);
    }

    void buyPremium (User user, int month){
        this.behavior = new PremiumBehavior();
    }

}
