package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;


public class SelectClearPanelOptionListener extends Observable implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("SelectClearPanelOptionListener actionPerformed");
        setChanged();
        notifyObservers();
    }
}
