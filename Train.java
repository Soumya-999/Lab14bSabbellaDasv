import java.util.*;
import java.awt.*;
import java.applet.*;

public class Train 
{
	private int t;
	private int y;
   ArrayList<RailCar> cars;

   public Train (int t, int y)
   {
      this.t = t;
      this.y = y;
      cars = new ArrayList<RailCar>();
   }
   
  public void addCar(String s, Color m)        //80 pt
  {
   int a = cars.size();
   int x = (175 * a) + t;        //calculates where new car has to start based on length of existing train
  
   if(s == "Locomotive")
   {
   RailCar lilly = new Locomotive (m,x,y);
   cars.add(lilly);
   }
   if(s == "PassengerCar")
   {
   RailCar patty = new PassengerCar (m,x,y);
   cars.add(patty);
   }
   if(s == "FreightCar")
   {
   RailCar fiona = new FreightCar (m,x,y);
   cars.add(fiona);
   }
   if(s == "Caboose")
   {
   RailCar clara = new Caboose (m,x,y);
   cars.add(clara);
   }
  }
  
  public void showCars(Graphics g)
  {
     for (RailCar car : cars)  
         car.drawCar (g);                      
    
  }
  
  public void addCar(int pos, String carType, Color carColor)  //100 pt
  {
      int x = (175 * pos) + t;                    //calculates x coordinate at position of new inserted car-where it needs to start
     
      RailCar newCar = null;                      
      
      switch (carType){                            //changed previous code to switch control structure for more neatness
      
         case "Locomotive" :
         
            newCar = new Locomotive (carColor,x,y);
            break;
            
         case "PassengerCar":
         
            newCar = new PassengerCar (carColor,x,y);
            break;
            
         case "FreightCar":
            
            newCar = new FreightCar (carColor,x,y);
            break;
           
         case "Caboose":
            
            newCar = new Caboose (carColor,x,y);
            break;         
      
      }
      cars.add(pos,newCar);                           //puts inserted car in given place in the array

       RailCar car = null;                            //this object represents every car that needs to be redraw after the inserted car
       for (int i=pos+1; i < cars.size(); i++)        //for loop re-draws the train after the inserted car
       {
          car = cars.get(i);
          car.setXPosition(car.getXPosition()+ 175);   //translates each car by 175
       }
    
    }

  

}
    
 
}
