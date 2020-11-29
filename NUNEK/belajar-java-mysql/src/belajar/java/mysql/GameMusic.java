/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;

import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author ASUS
 */
public class GameMusic {
    static GameMusic player = new GameMusic();
    static Clip clip;
    
    static String gameplay = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\NUNEK\\belajar-java-mysql\\gameplay.wav";

    public GameMusic() {

    }

    public static GameMusic getInstance() {
        return player;
    }

    public void loadMusic(String filepath) {
        try {
            File musicPathhh = new File(filepath);
            System.out.println(musicPathhh.getAbsolutePath());

            if (musicPathhh.exists()) {
                System.out.println("Initialized");
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPathhh);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
            }
        }

        catch (Exception e) {
            System.out.println("Yes");
        }
    }
}
