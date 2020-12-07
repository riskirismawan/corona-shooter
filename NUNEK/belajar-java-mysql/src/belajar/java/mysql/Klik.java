/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.mysql;

/**
 *
 * @author ACER-PC
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Klik {
    static Klik player = new Klik();
    static Clip clip;

    static String filepath = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\corona-shooter\\NUNEK\\belajar-java-mysql\\src\\belajar\\java\\effect1.wav";
    
    static String explosion = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\corona-shooter\\NUNEK\\belajar-java-mysql\\src\\belajar\\java\\Explosion7.wav";

    static String shooting = "E:\\OneDrive - visualize B2C applications\\RISKI RISMAWAN F1D018053\\SEMESTER 5\\PBO\\Project\\corona-shooter\\NUNEK\\belajar-java-mysql\\src\\belajar\\java\\Laser_Shoot11.wav";

    public Klik() {

    }

    public static Klik getInstance() {
        return player;
    }

    public void loadMusic(String filepath) {
        try {
            File musicPath = new File(filepath);
//            System.out.println(musicPath.getAbsolutePath());

            if (musicPath.exists()) {
//                System.out.println("Initialized");
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
