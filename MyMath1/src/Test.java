
import java.io.IOException;


import java.util.Iterator;
import java.util.Arrays;
/** 
 * This class Demonstrates and tests the functionality of the monom and polynom classes
**/
// testgit
public class Test {

	public static void main(String[] args) {
//		XYChart chart1 = new XYChartBuilder().width(800).height(600).theme(ChartTheme.Matlab).build();
		//Polynom p1 =new Polynom("4x^5+4");
		//Monom m12= new Monom("0x^4");
		//System.out.println(p1);
		///testing***
////		p1.add(m11);
////		p1.add(m12);
////		System.out.println(p1);
//		//Polynom m1 =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
//		Polynom m1 =new Polynom("x^2");
//		//System.out.println(m1.areaBelow(-2, 6));
//		//System.out.println(m1);
//		double start=-2;
//		double end=2;
//		double lengh=end-start;
//		double eps=0.1;
//		double[] xData = new double[(int) (lengh/eps)];
//		double[] yData = new double[(int) (lengh/eps)];
//		double x =start;
//		for (int i = 0; i < yData.length; i++) {
//			
//			xData[i]=x;
//			yData[i]=m1.f(x);
//			x=x+0.1;
//		}
////		double[] xData = new double[] { -5.0, 6.0, 20.0 };
////		double[] yData = new double[] { 2.0, 1.0, 0.0 };
//
//		// Create Chart
//		XYChart chart = QuickChart.getChart("the graph of the polynom :"+m1.toString(), "X", "Y", "y(x)", xData, yData);
//		//chart.getStyler().setYAxisGroupPosition(yAxisGroup, yAxisPosition);
//		//chart.getStyler().setYAxisGroupPosition(axisGroup, Styler.YAxisPosition.Right);
//		//chart.getStyler().setYAxisGroupPosition(10, Styler.YAxisPosition.Right);
//		// Show it
//		new SwingWrapper(chart).displayChart();
//
//		// Save it
//		try {
//			BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapFormat.PNG);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		// or save it in high-res
//		try {
//			BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 300);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String s=m1.toString();
//		System.out.println(s);
		//System.out.println("test");
		//System.out.println("test1");
		
		//String newS ="x^4+x^2-3"; 
		//String[] parts1 = newS.split("(?=\\+|\\-)");
		//System.out.println(Arrays.toString(parts1));;
		//System.out.println(newS);
		
/*	
		//////////////////////////////the monom class/////////////////////////
		Monom m2 = new Monom("-6x^4");
		//Checking the function toString+constructor
		System.out.println(m2.toString());
		//assert use
		//assert(m2.toString()=="-6x^4") : "dhd";
		Monom m4= new Monom(-7,1);
		Monom m5= new Monom(m4);
		Monom m6= new Monom(0,0);
		Monom m7= new Monom(9,1);
		Monom m8= new Monom(m7.get_coefficient(),m5.get_power());
		Monom m9= new Monom(-7,4);
		Monom m10= new Monom(5,2);
		System.out.println(m10);//Checking the function  constructor
		System.out.println(m8);//Checking the functions getters
		System.out.println(m6.isZero());//Checking the function isZero
		System.out.println(m7.equals(m6));//Checking the function equals
		System.out.println(m5);//Checking the function copy constructor
		m9.sub(m2);
		System.out.println(m7.f(5));//Checking the function f(x)
		System.out.println(m9);//Checking the function sub
		m8.multiply(m7);
		System.out.println(m8);//Checking the function multiply
		m4.add(m7);
		System.out.println(m4);//Checking the function add
		m10.nigzeret();
		System.out.println(m10);//Checking the function nigzeret
		System.out.println(m10.derivative_Monom());//Checking the function derivative_Monom

		//////////////////////////////So far, the Monom class///////////////////////////////////


              //////////////////////////////the polynom class/////////////////////////
		String s="4x^4+23x^7+7";
		Polynom m0=new Polynom("x^3-x^2-7x");
		Polynom m1=new Polynom(s);
		System.out.println(m0+" start the polynom");//Checking the function constructor
		System.out.println(m0.root(3.19, 5, 0.01)+"-root");//Checking the function root
		System.out.println(m1);//Checking the function constructor
		Polynom m3=new Polynom(s);
		Polynom m11=new Polynom();
		Polynom_able m31=new Polynom();
		Polynom m21=new Polynom();
		Monom m12 = new Monom("-6x^4");
		Monom m13= new Monom("8x");
		Monom m14= new Monom(-7,1);
		Monom m15= new Monom(-1,1);
		Monom m16= new Monom(1,2);
		System.out.println(m3);
		m11.multiply(m3);
		System.out.println(m11);//Checking the function multiply polynom
		m1.add(m12);
		System.out.println(m11.isZero());//Checking the function isZero
		m11.add(m13);
		m1.add(m4);
		m21.add(m14);
		m21.add(m15);
		m21.add(m16);
		m7.add(m15);
		System.out.println(m21);//Checking the functions consractor+function add Monom+sortbypower+compare
		//compare+sortbypower :is inside in function add
		m21.add(m11);
		System.out.println(m21);//Checking the function add polynom
		System.out.println((m1.area(-2, 3,100)));//Checking the function area
		System.out.println(m0.equals(m1));//Checking the function equals
		m0.substract(m1);
		System.out.println(m0.toString());//Checking the functions toString+subtract polynom
		Iterator <Monom> ok = m1.iteretor();//Checking the function Iterator
		while(ok.hasNext()) {
			Monom m= ok.next();
			System.out.println(m);
		}

		System.out.println(m21.f(1));//Checking the function f(x)
		m11.substract(m15);
		System.out.println(m11);//Checking the function subtract Monom
		m31=m11.copy();
		System.out.println(m31);//Checking the function copy
		m31=m11.derivative();
		System.out.println(m31);//Checking the function derivative

*/
	}
	private static String newString(String s) {

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='+') {
				s=s.substring(0, i)+"@"+s.substring( i);

				i++;
			}
		}	
		return s;

	}



}
