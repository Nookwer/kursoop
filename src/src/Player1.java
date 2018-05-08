package src;

import java.awt.geom.Line2D;

/**
 * Created by ASUS on 01.06.2016.
 */
public class Player1 implements Player {
    private Game game;
    public Player1(Game game){
        this.game = game;
    }
    public void draw(){
        double x = game.getGameField()[game.getRect()].getX();
        double y = game.getGameField()[game.getRect()].getY();
        game.getXgame().add(new Line2D.Double(x + 10, y + 10, x + 90, y + 90));
        game.getXgame().add(new Line2D.Double(x + 10, y + 90, x + 90, y + 10));
        game.getUsedX().add(game.getRect());
        game.repaint();
        game.checkIfWin("Xturn");
        game.setComputer(true);
        game.getComp().notifyObservers();
        game.getComp().computerTurn();
    }
}
