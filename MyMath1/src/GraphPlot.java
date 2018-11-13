
import java.awt.BorderLayout;
import java.awt.Color;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

import de.erichseifert.gral.data.DataSource;
import de.erichseifert.gral.data.DataTable;
//import de.erichseifert.gral.data.comparators.Ascending;
import de.erichseifert.gral.data.filters.Convolution;
import de.erichseifert.gral.data.filters.Filter.Mode;
//import de.erichseifert.gral.data.filters.Kernel;
//import de.erichseifert.gral.graphics.Insets2D;
//import de.erichseifert.gral.io.data.DataReader;
//import de.erichseifert.gral.io.data.DataReaderFactory;
//import de.erichseifert.gral.io.data.DataWriter;
//import de.erichseifert.gral.io.data.DataWriterFactory;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.ui.InteractivePanel;

public class GraphPlot extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GraphPlot() throws IOException {

        Polynom p =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
    	//Polynom p =new Polynom("x^3+3-x");
        System.out.println(p.AreaBelow(-2, 6));
        Polynom p1=(Polynom) p.derivative();
        DataTable data = new DataTable(Double.class, Double.class);
        DataTable MaxMin = new DataTable(Double.class, Double.class);
        double start=-2;
        double end=6;
        for (double x = start; x <= end; x+=0.001) {
            double y = p.f(x);
            data.add(x, y);
            //FINDING THE MAX MIN POINTs >> ON ENTHER DATA
            //the derivative value
            double y1=p1.f(x);
            double y2=p1.f(x+0.001);
            boolean Positive1=(y1>=0);
            boolean Positive2=(y2>=0);
            if(Positive1!=Positive2) {
            	double m1=x;	
            	double m2=p.f(m1);
            	MaxMin.add(m1,m2);
            }
        }
         
        //
        DataSource filtered = new Convolution(data, null, Mode.REPEAT, 1);
        // adding XYPlot with both data table 
        XYPlot plot = new XYPlot(filtered,MaxMin);
        // Cutting the point from the graph
        plot.setPointRenderers(filtered, null);
        
        DefaultLineRenderer2D lineRenderer = new DefaultLineRenderer2D();
        // painting the graph in blue
        lineRenderer.setColor(Color.BLUE);
        //adding the blue line
        plot.setLineRenderers(filtered, lineRenderer);
        getContentPane().add(new InteractivePanel(plot), BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(getContentPane().getMinimumSize());
        setSize(800, 400);
    }

    public static void main(String[] args) throws IOException {
    	GraphPlot df = new GraphPlot();
        df.setVisible(true);
        Polynom p =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");   
        System.out.println("the area below x: "+p.AreaBelow(-2, 6));
    }
}