
package belajar.java.mysql;

import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    static Music player = new Music();
    static Clip clip;

    static String filepath = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\corona-shooter\\NUNEK\\belajar-java-mysql\\src\\belajar\\java\\disk.wav";
    
    static String gameplay = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\corona-shooter\\NUNEK\\belajar-java-mysql\\src\\belajar\\java\\gameplay.wav";

    public Music() {

    }

    public static Music getInstance() {
        return player;
    }

    public void loadMusic(String filepath) {
        try {
            File musicPath = new File(filepath);
            System.out.println(musicPath.getAbsolutePath());

            if (musicPath.exists()) {
                System.out.println("Initialized");
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
            }
        }

        catch (Exception e) {
            System.out.println("Yes");
        }
    }
}