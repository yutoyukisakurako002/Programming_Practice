package session02loopsmethods; 

public class AutonomousSequence{

  public static void moveForward(int distance) {
    System.out.println("Robot moved to " + distance + " meters.");
  }
  public static void turn360(){
    for (int i = 1; i <= 4; i++){
      System.out.println("Turning 90 degrees!!!");
    } 
    System.out.println("I turn 360 degree!!");
  }

  public static void stopRobot(){
    System.out.println("Robot stopped!!!");
  }
  public static void main(String[] args) {
    int distance = 0;

    while (distance < 6){
      distance++;
      moveForward(distance);

      if (distance == 3){
        turn360();
      } else {
        System.out.println("Continue moving!");
      }
      
    } 
    stopRobot();
  }
}
