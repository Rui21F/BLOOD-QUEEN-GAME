package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver {
    Picture gameOverPic;

    public GameOver() {
        gameOverPic = new Picture(10, 10, "/GAME OVER.png");
    }

    public void gameOverScreen() {
        gameOverPic.draw();
    }
}
