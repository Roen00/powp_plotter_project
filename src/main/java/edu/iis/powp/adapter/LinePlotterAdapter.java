package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs.
 */
public class LinePlotterAdapter implements IPlotter
{
    final private DrawPanelController drawPanelController;
    final private ILine line;
    private int startX = 0, startY = 0;

    public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
        super();
        this.drawPanelController = drawPanelController;
        this.line = line;
    }
//TODO: usunąć simulatedplotter? i zastąpić to adapterem, tym adapterem
    @Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x,y);
        drawPanelController.drawLine(line);
    }

    @Override
    public String toString()
    {
        return "Line plotter adapter";
    }
}
