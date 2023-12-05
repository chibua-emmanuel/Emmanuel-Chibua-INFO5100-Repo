/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author emmanuelchibua
 */
 class MusicThread extends Thread {
    private MusicPlayer musicPlayer;

    public MusicThread(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void run() {
        musicPlayer.playDoMiSolSiDoOctave();
    }
}

class MusicThread2 extends Thread {
    private MusicPlayer musicPlayer;

    public MusicThread2(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void run() {
        musicPlayer.playReFaLaDoOctave();
    }
}
     public class Main {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        
        MusicThread thread1 = new MusicThread(musicPlayer);
        MusicThread2 thread2 = new MusicThread2(musicPlayer);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nBonus: Twinkle Twinkle Little Star\n");

        // Add code for Twinkle Twinkle Little Star bonus here
        
        
     }
     }
