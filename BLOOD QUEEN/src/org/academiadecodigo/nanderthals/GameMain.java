package org.academiadecodigo.nanderthals;
import org.academiadecodigo.nanderthals.Music.MusicStart;
import org.academiadecodigo.nanderthals.Music.Sound;
public class GameMain {

    public static void main(String[] args) {

        MenuStart menuStart = new MenuStart();
        menuStart.show();
        menuStart.waitForEnterKey();
        if(menuStart.startGame()) {
            Game g = new Game(100, 50, 200);
            MusicStart music = new MusicStart();
            Sound sound1 = new Sound();

            // Play music
            music.setMusic();
            music.play();
            music.loop();

            // Play Sounds
            sound1.setSound1();
            sound1.playSound1();
        }
    }

}
