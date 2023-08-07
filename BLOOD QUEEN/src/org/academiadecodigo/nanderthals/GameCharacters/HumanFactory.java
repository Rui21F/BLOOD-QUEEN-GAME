package org.academiadecodigo.nanderthals.GameCharacters;


import org.academiadecodigo.nanderthals.Music.Music;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HumanFactory {

    public Picture[] humanPic;
    public HumanFactory() {

        humanPic = new Picture[18];
    }


    public void newHuman() {
        humanPic[0] = new Picture(100, 450, "/human.png");
        humanPic[0].draw();
        humanPic[1] = new Picture(510, 90, "/guga.png");
        humanPic[1].draw();
        humanPic[2] = new Picture(780, 210, "/human.png");
        humanPic[2].draw();
        humanPic[3] = new Picture(1200, 210, "/nozk.png");
        humanPic[3].draw();
        humanPic[4] = new Picture(1280, 450, "/human.png");
        humanPic[4].draw();
        humanPic[5] = new Picture(1000, 570, "/human.png");
        humanPic[5].draw();
        humanPic[6] = new Picture(300, 570, "/guga.png");
        humanPic[6].draw();
        humanPic[7] = new Picture(150, 210, "/human.png");
        humanPic[7].draw();
        humanPic[8] = new Picture(1050, 690, "/nozk.png");
        humanPic[8].draw();
    }

    Music music = new Music();

    public int getCoordX(int i) {
        if (i >= 0 && i < humanPic.length) {
            return humanPic[i].getX();
        }
        return 0;
    }

    public int getCoordY(int i) {
        if (i >= 0 && i < humanPic.length) {
            return humanPic[i].getY();
        }
        return 0;
    }

    public void delete(int i) {
        if (i >= 0 && i < humanPic.length) {
            System.out.println(humanPic[0]);
            humanPic[i].translate(-10000, 0);
            music.setMusic();
            music.play();
            music.setMusic1();
            music.play1();
        }
    }
}


