package edu.iis.powp.events.predefine;

import edu.iis.powp.app.Application;
import edu.kis.powp.drawer.panel.DrawPanelController;

import java.util.Observable;
import java.util.Observer;

public class DrawPanelCleaner implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("DrawPanelCleaner update");

        DrawPanelController controller = Application.getComponent(DrawPanelController.class);
        controller.clearPanel();
    }
}