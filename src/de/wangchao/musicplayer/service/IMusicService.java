
package de.wangchao.musicplayer.service;

import de.wangchao.musicplayer.type.Music;

import java.util.ArrayList;

public interface IMusicService {
    void openFile(Music Music);

    void setOnlinePlayList(ArrayList<Music> list);

    ArrayList<Music> getOnlinePlayList();

    void open(ArrayList<Music> list, int position);

    Music getTrackToPlay();

    // int getQueuePosition();
    boolean isInitialized();
    boolean isPlaying();

    boolean isPrepared();

    boolean isCacheDone();

    void stop();

    void pause();

    void play();

    void prev(boolean prev);

    void next();

    // void cycleRepeat();
    // void toggleShuffle();
    long duration();

    long position();

    long seek(long pos);

    String getTrackName();

    String getAlbumName();

    // long getAlbumId();
    String getArtistName();

    String getLrcUrl();

    String getLrcName();

    // long getArtistId();
    // String getAlbumartistName();
    // long getAlbumartistId();
    // void enqueue(ArrayList<Music> list, int action);
    // long [] getQueue();
    // void moveQueueItem(int from, int to);
    // void setQueuePosition(int index);
    String getPath();

    // long getAudioId();
    void setShuffleMode(int shufflemode);

    int getShuffleMode();

    // int removeMusics(int first, int last);
    int removeTrack(long id);
    // void setRepeatMode(int repeatmode);
    // int getRepeatMode();
    // int getMediaMountedCount();
    // int getAudioSessionId();

	void setRepeatMode(int mode);

	int getRepeatMode();

	
}
