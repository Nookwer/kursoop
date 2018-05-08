package src;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by ASUS on 01.06.2016.
 */
public class MouseHandler extends MouseAdapter
{
    private Game game;
    private Player player;

    public MouseHandler(Game game, Player player)
    {
        this.game = game;
        this.player = player;
    }
    public void mouseClicked(MouseEvent event)
    {
        game.setRect(game.find(event.getPoint())) ;
        if (game.getRect() != -1 && !game.getUsedX().contains(game.getRect()) && !game.getUsedO().contains(game.getRect()) && game.isComputer() == false) {
            player.draw();
        }
    }
}