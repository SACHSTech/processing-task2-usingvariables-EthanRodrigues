import processing.core.PApplet;
   /** 
   * This program draws a house
   * Author: Ethan Rodrigues 
   */
public class Sketch extends PApplet {

  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    float flHouseWidth = (float) (width * 0.9);
    float flHouseHeight = (float) (height * 0.6);
      
    // code for the grass
      fill(0, 176, 26);
      rect(0, (float) (height * 0.95), (float) width, (float) (height * 0.05));

    // code for the house
      fill(222, 139, 75);
      rect( (float) (width * 0.05), (float) (height * 0.4), flHouseWidth, flHouseHeight);

    // code for the chimney
      rect((float) (width * 0.2), (float) (height * 0.1), (float) (width * 0.1), (float) (height * 0.3));

    // code for the roof
      fill(125, 60, 10);
      triangle((float) (width * 0.05), (float) (height * 0.4), (float) (width / 2), (float) (height * 0.05), (float) (width * 0.95), (float) (height * 0.4));

    // code for the door and the doorknob
      fill(237, 206, 183);
      rect((float) (width * 0.25 - (flHouseWidth * 0.2 / 2)), (float) (height * 0.7), (float) (flHouseWidth * 0.2), (float) (height * 0.3));
      ellipse((float) (width * 0.25 + (flHouseWidth * 0.2 / 3)), (float) (height * 0.85), (float) (width * 0.01), (float) (width * 0.01));

    // code for the garage door
      fill(133, 107, 72);
      rect((float) (width * 0.70 - (flHouseWidth * 0.4 / 2)), (float) (height * 0.7), (float) (flHouseWidth * 0.4), (float) (height * 0.3));

    // code for the window
      fill(192, 206, 207);
      ellipse((float) (width / 2), (float) (height * 0.3), (float) (width * 0.15), (float) (width * 0.15));
      }
  
}