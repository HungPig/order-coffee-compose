package Order.Modal.component.Chart.utils;

import Order.Modal.component.Chart.Themes.ChartDrawingSupplier;
import org.jfree.chart.plot.Crosshair;

import javax.swing.*;
import java.awt.*;

public class CustomCrosshairToolTip extends Crosshair {

    public CustomCrosshairToolTip() {
        init();
    }

    private void init() {
        installStyle();
    }

    public void installStyle() {
        Color background = UIManager.getColor("Panel.background");
        Color foreground = UIManager.getColor("Label.foreground");
        Color border = UIManager.getColor("Component.borderColor");
        Font font = UIManager.getFont("Label.font");
        setLabelBackgroundPaint(ChartDrawingSupplier.alpha(background, 0.7f));
        setLabelPaint(foreground);
        setLabelOutlinePaint(border);
        setLabelFont(font);
        setPaint(ChartDrawingSupplier.alpha(foreground, 0.5f));
        setStroke(ChartDrawingSupplier.getDefaultGridlineStroke());
    }
}
