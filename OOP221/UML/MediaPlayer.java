package com.mycompany.oop221;
/**
 *
 * @author supan
 */
interface Player {
    void play();
    void stop();
    void pause();
    void reverse();
}

class CDPlayer implements Player {
    public void play() {
        System.out.println("CD Plays");
    }

    public void stop() {
        System.out.println("CD Stopped");
    }

    public void pause() {
        System.out.println("CD Paused.");
    }

    public void reverse() {
        System.out.println("CD Reversing");
    }

    public void audio() {
        System.out.println("Audio plays from CDPlayer");
    }
}

class DVDPlayer implements Player {
    public void play() {
        System.out.println("DVD Plays");
    }

    public void stop() {
        System.out.println("DVD Stopped");
    }

    public void pause() {
        System.out.println("DVD Paused");
    }

    public void reverse() {
        System.out.println("DVD Reversing");
    }

    public void video() {
        System.out.println("Video plays from DVDPlayer");
    }
}

public class MediaPlayer {
    public static void main(String[] args) {
        CDPlayer cd1 = new CDPlayer();
        DVDPlayer dvd1 = new DVDPlayer();

        cd1.play();
        cd1.audio();

        dvd1.play();
        dvd1.video();
    }
}
