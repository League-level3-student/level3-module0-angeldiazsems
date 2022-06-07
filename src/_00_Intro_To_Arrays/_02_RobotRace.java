package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	Robot[] robo = new Robot[10];

for(int i = 0; i < robo.length; i++) {
	robo[i] = new Robot();
	robo[i].setY(460);
	robo[i].setSpeed(10);
}
robo[0].setX(100);
robo[1].setX(200);
robo[2].setX(300);
robo[3].setX(400);
robo[4].setX(500);
robo[5].setX(600);
robo[6].setX(650);
robo[7].setX(700);
robo[8].setX(750);
robo[9].setX(800);

int i = 0;
Random E = new Random();
while(robo[i].getY()>30) {
	robo[0].move(E.nextInt(50));
	robo[1].move(E.nextInt(50));
	robo[2].move(E.nextInt(50));
	robo[3].move(E.nextInt(50));
	robo[4].move(E.nextInt(50));
	robo[5].move(E.nextInt(50));
	robo[6].move(E.nextInt(50));
	robo[7].move(E.nextInt(50));
	robo[8].move(E.nextInt(50));
	robo[9].move(E.nextInt(50));
}
for(int e = 0; e < robo.length;e++) {
	int f = robo[e].getY();
	if(f < 30) {
		System.out.println(f+" is the winner");
	}
}

     
// 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
}
}
