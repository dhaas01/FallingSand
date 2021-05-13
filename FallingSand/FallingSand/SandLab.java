import java.awt.*;
import java.util.*;

public class SandLab
{
  public static void main(String[] args)
  {
    SandLab lab = new SandLab(120, 80);
    lab.run();
  }
  
  //add constants for particle types here
  public static final int EMPTY = 0;
  public static final int METAL = 1;
  
  // task 4 -- Add a SAND particle type
  // task 6 -- Add a WATER particle type

  
  //do not add any more fields
  private int[][] grid;
  private SandDisplay display;
  
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    names = new String[2];    // will need to modify this for tasks 4, 6
    names[EMPTY] = "Empty";
    names[METAL] = "Metal";
    // task 4 -- Add a SAND particle type
    // task 6 -- Add a WATER particle type
    display = new SandDisplay("Falling Sand", numRows, numCols, names);
    
    // task 1
    // Insert code to initialize the grid field to refer to a 
    // 2-dimensional array of the same dimensions. 
  }
  
  //called when the user clicks on a location using the given tool
  private void locationClicked(int row, int col, int tool)
  {
    // task 2
    // Write code to store this value representing the given tool 
    // in the corresponding position of the grid array
  }

  //copies each element of grid into the display
  public void updateDisplay()
  {
    // task 3
    // Complete this method so that empty locations are shown in one 
    // color (probably black) and metal locations are shown in 
    // another color (probably gray).
    
  }

  //called repeatedly.
  //causes one random particle to maybe do something.
  public void step()
  {
    // task 5
    // This method should choose a single random valid location. 
    // (Do not use a loop.) If that location contains a sand particle 
    // and the location below it is empty, the particle should move 
    // down one row. (Metal particles will never move.)
    
    
    // task 6
    // Modify your program so that you can also paint with water particles, 
    // which move in one of three randomly chosen directions: down, left, or right.
    
  }
  
  //do not modify
  public void run()
  {
    while (true)
    {
      for (int i = 0; i < display.getSpeed(); i++)
        step();
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  //test if mouse clicked
        locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
    }
  }
}
