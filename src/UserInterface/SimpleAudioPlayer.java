package UserInterface;
//Java program to play an Audio
//file using Clip Object
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SimpleAudioPlayer 
{

 // to store current position
 Long currentFrame;
 Clip clip;
   
 // current status of clip
 String status;
   
 AudioInputStream audioInputStream;
 static String filePath;

 // constructor to initialize streams and clip
 public SimpleAudioPlayer(String file)
     throws UnsupportedAudioFileException,
     IOException, LineUnavailableException 
 {
     // create AudioInputStream object
     audioInputStream = 
             AudioSystem.getAudioInputStream(new File(file).getAbsoluteFile());
       
     // create clip reference
     clip = AudioSystem.getClip();
       
     // open audioInputStream to the clip
     clip.open(audioInputStream);
       
     clip.loop(Clip.LOOP_CONTINUOUSLY);
 }
 public void play() 
 {
     //start the clip
     clip.start();
       
     status = "play";
 }
}