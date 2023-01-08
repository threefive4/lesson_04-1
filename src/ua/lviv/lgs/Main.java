package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        RobotCoffee robotCoffee = new RobotCoffee();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        Robot[] allRobots = new Robot[4];

        allRobots[0] = robot;
        allRobots[1] = robotCoffee;
        allRobots[2] = robotDancer;
        allRobots[3] = robotCooker;


        for (int i = 0; i < allRobots.length; i++) {
            allRobots[i].work();

        }
    }
}

