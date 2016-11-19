package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.line.LineSingletonFactory;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class SimulatedPlotterAdapter implements IPlotter
{
    final private DrawPanelController drawPanelController;
	private int startX = 0, startY = 0;

    public SimulatedPlotterAdapter(DrawPanelController drawPanelController) {
		super();
        this.drawPanelController = drawPanelController;
	}

	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
        ILine line = LineSingletonFactory.INSTANCE.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x,y);


		drawPanelController.drawLine(line);
    }

    @Override
    public String toString()
    {
        return "Plotter adapter";
    }
}
