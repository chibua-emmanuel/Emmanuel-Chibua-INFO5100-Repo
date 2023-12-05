/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author emmanuelchibua
 */
public class MusicPlayer {
     private static final Object lock = new Object();

    public void playDoMiSolSiDoOctave() {
        synchronized (lock) {
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/do.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/mi.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/sol.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/si.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/do-octave.wav");
        }
    }

    public void playReFaLaDoOctave() {
        synchronized (lock) {
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/re.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/fa.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/la.wav");
            play("/Users/emmanuelchibua/Downloads/Multithreading  Resources/Sounds/do-octave.wav");
        }
    }

    private void play(String tone) {
        // Simulating playing the tone
        System.out.print(tone + " ");
        try {
            TimeUnit.MILLISECONDS.sleep(500); // Simulate tone duration
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    
