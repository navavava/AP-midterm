package Spotify;

import java.util.ArrayList;

public class User {
    public String username;
    private String password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    protected UserBehavior behavior = new RegularBehavior();
    protected ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> allUsers = new ArrayList<>();

    public User(String username, String password) {
        if (username.isEmpty() || (username == null) || (password == null) || password.isEmpty())
            throw new InvalidOperationException("Your information cannot be blank!");
        if (password.length() < 8)
            throw new InvalidOperationException("Your password must be 8 characters or longer!");
        for (User u : allUsers) {
            if (u.username.equals(username))
                throw new InvalidOperationException("This username is taken!");
        }
        this.username = username;
        this.password = password;
        allUsers.add(this);
    }

    void follow(User user) {
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

    public String getPassword() {
        return password;
    }
}
