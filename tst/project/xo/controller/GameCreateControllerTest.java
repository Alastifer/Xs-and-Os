package project.xo.controller;

import org.junit.Test;
import project.xo.model.Field;
import project.xo.model.Figure;
import project.xo.model.Game;
import project.xo.model.Player;

import static org.junit.Assert.*;

public class GameCreateControllerTest {
    @Test
    public void gameCreate() throws Exception {
        GameCreateController gameCreateController = new GameCreateController();

        String nameX = "Alex";
        String nameO = "Ira";
        int expectedFieldSize = 3;
        String expectedGameName = "XO-game";

        Player expectedPlayerX = new Player(nameX, Figure.X);
        Player expectedPlayerO = new Player(nameO, Figure.O);

        Game actualGame = gameCreateController.gameCreate(expectedFieldSize, nameX, nameO);
        Game expectedGame = new Game(expectedGameName, new Field(expectedFieldSize), expectedPlayerX, expectedPlayerO);

        assertEquals(expectedGame.getGameName(), actualGame.getGameName());
        assertEquals(expectedGame.getField().getSize(), actualGame.getField().getSize());
        assertEquals(expectedGame.getPlayerX().getName(), actualGame.getPlayerX().getName());
        assertEquals(expectedGame.getPlayerX().getPlayerFigure(), actualGame.getPlayerX().getPlayerFigure());
        assertEquals(expectedGame.getPlayerO().getName(), actualGame.getPlayerO().getName());
        assertEquals(expectedGame.getPlayerO().getPlayerFigure(), actualGame.getPlayerO().getPlayerFigure());

    }

}