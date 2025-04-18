package Spotify;

public class RegularBehavior implements UserBehavior{

    public int playingLimit = 5;

    @Override
    public void createPlaylist(String Title, User Owner) {
        throw new InvalidOperationException("A regular user can't make playlists!");
    }

    @Override
    public void playMusic(Music music) {
        if(playingLimit <= 0)
            throw new InvalidOperationException("Your playing limit is reached!");
        //play method
        playingLimit--;
    }

    @Override
    public void buyPremium(User owner, int month) {
        //update behavior
    }
}
