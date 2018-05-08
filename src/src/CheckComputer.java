package src;

import javax.swing.*;

/**
 * Created by ASUS on 01.06.2016.
 */
public class CheckComputer implements Observer {
    private Computer comp;
    private DrawFrame frame;
    public CheckComputer(Computer comp){
        this.comp = comp;
        comp.registerObserver(this);
    }
    public void update(boolean computer){
        if(computer) {
            JOptionPane.showMessageDialog(null, "Ur turn");
        }
    }
}
