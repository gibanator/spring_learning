package org.ggibizov.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Music music = context.getBean("musicBean", Music.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean eq = musicPlayer == musicPlayer1;
//
//        System.out.println(eq);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusicList();
//
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
//        musicPlayer1.playMusicList();
//
        context.close();
    }
}
