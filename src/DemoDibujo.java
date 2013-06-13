//nombre del paquete
//package mx.uabcs.programaciongui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

public class DemoDibujo extends JFrame{

	final static Color BG=Color.green;
	final static Color FG=Color.black;
	
	public DemoDibujo(){
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//metodo init para inicializar
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}

	//metodo paint para ael dibujado de elementos
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		
		//Dibuja una linea
		g2.setPaint(Color.MAGENTA);
		for(int i=0; i<500; i+=50){
		g2.draw(new Line2D.Double(50+i,50,50+i,450));
		g2.draw(new Line2D.Double(50,50+i,450,50+i));
		}
		//Dibujar rectangulo
		/*g2.setColor(Color.red);
		g2.fillRect(50,50,110,200);
		g2.setColor(Color.BLUE);*/
		/*g2.draw(new Rectangle2D.Double(50,50,110,200));
		g2.draw(new Rectangle2D.Double(180, 250, 110,200));
		for(int i=0; i<1; i+=500){
			g2.draw(new Line2D.Double(50+i,50,182+i,255));
			g2.draw(new Line2D.Double(158+i,50,293+i,255));
			g2.draw(new Line2D.Double(50+i,250,180+i,448));
			g2.draw(new Line2D.Double(161+i,250,288+i,447));
		}*/
		/*g2.setColor(Color.pink);
		g2.draw(new Arc2D.Double(50,90,300,150,180,180, Arc2D.OPEN));
		g2.draw(new Arc2D.Double(50,150,300,150,360,180, Arc2D.OPEN));
		g2.draw(new Ellipse2D.Double(155,150,90,90));
		g2.draw(new Ellipse2D.Double(175,170,50,50));*/
		
		//Dibujar un rectangulo con borde redondo
		//g2.draw(new RoundRectangle2D.Double(50,50,150,150,10,60));
		//Dibujar un arco
		//g2.draw(new Arc2D.Double(50,50,150,150,90,150. Arc2D.PIE));
	}

}
