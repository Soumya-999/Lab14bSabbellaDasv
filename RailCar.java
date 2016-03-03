


import java.awt.*;


public class RailCar
{
	private Color carColor;
	protected int xPos;                 //changed to protected so that modified xPos will be used in subclass-makes doors/windowns appear on the right car
	private int yPos;

	public RailCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
 //following set and get methods are created to reassign the xPos-allows us to translate the train over one space(100pt)
 public void setxPosition(int newxPos)    
 {
 	xPos =newxPos;
 }
 
 public int getxPosition()
 {
 	return xPos;
 }
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(xPos,yPos,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(xPos-25,yPos+80,25,5);
   } 
}

