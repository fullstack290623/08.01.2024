package com.company;

public class Robot {

    public void buildRobot(int power, String model, boolean hasAI, float height) {
        System.out.println(String.format("Robot power %d model %s, AI %b height %f", power, model, hasAI, height));
    }

    public void buildRobot(int power, String model, boolean hasAI) {
        buildRobot(power, model, hasAI, 1.5f);
    }

    public void buildRobot(int power, String model) {
        buildRobot(power, model, false, 1.5f);
    }
    public void buildRobot(int power) {
        buildRobot(power, "ChatGPT", false, 1.5f);
    }
    public void buildRobot() {
        buildRobot(9, "ChatGPT", false, 1.5f);
    }

}
