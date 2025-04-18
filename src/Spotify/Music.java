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
    }

    public void play() {
        System.out.println(this.title + " from " + this.singer.username + " is playing.");
        numberOfStream++;
    }

    public void search(String title) {
        for (Music m : allMusics) {
            if (m.title.equalsIgnoreCase(title.trim()))
                System.out.println(m.title + " - " + m.singer.username);
        }
    }

    public void search(String title, String singer) {
        for (Music m : allMusics) {
            if (m.title.equalsIgnoreCase(title.trim()) && m.singer.username.equalsIgnoreCase(singer.trim())) {
                System.out.println(m.title + " - " + m.singer.username);
                break;
            }
        }
    }


}
