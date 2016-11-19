package edu.iis.powp.line;

import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.line.BasicLine;
import edu.kis.powp.drawer.shape.line.DottedLine;
import edu.kis.powp.drawer.shape.line.SpecialLine;

public enum LineSingletonFactory {
    INSTANCE;
    final BasicLine basicLine = new BasicLine();
    final DottedLine dottedLine = new DottedLine();
    final SpecialLine specialLine = new SpecialLine();

    public ILine getBasicLine() {
        return basicLine;
    }

    public ILine getDottedLine() {
        return dottedLine;
    }

    public ILine getSpecialLine() {

        return specialLine;
    }
}
