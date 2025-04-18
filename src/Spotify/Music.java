package Spotify;

import java.util.ArrayList;

public class Music {

    public String title;
    public User singer;
    public int numberOfStream = 0;
    public static ArrayList<Music> allMusics = new ArrayList<>();

    public Music(String title, User singer) {
        this.title = title;
        this.singer = singer;
        allMusics.add(this);
    }

    public void play() {
        System.out.println(this.title + " from " + this.singer.username + " is playing.");
        numberOfStream++;
    }

    public ArrayList<Music> search(String title) {
        ArrayList<Music> results = new ArrayList<>();
        for (Music m : allMusics) {
            if (m.title.equalsIgnoreCase(title.trim()))
                results.add(m);
        }
        if (!(results.isEmpty()))
            return results;
        return null;
    }

    public Music search(String title, String singer) {
        for (Music m : allMusics) {
            if (m.title.equalsIgnoreCase(title.trim()) && m.singer.username.equalsIgnoreCase(singer.trim())) {
                return m;
            }
        }
        return null;
    }
}
