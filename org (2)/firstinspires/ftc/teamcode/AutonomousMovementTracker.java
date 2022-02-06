package org.firstinspires.ftc.teamcode;


public class AutonomousMovementTracker {
    
    double ticksToInchesRatio = .025; //ticks to inches for driving motors
    double ticksToRadians = .1; //ticks to rotate radians for driving motors
    double botX, botY, botHeading;
    
    public AutonomousMovementTracker(double initalX, double initalY, double initalHeading){
        
        botX = initalX;
        botY = initalY;
        botHeading = initalHeading;
    }
    
    public void moveBotTo(double toX, double toY){
        double turn = Math.atan2(toX, toY) - botHeading;
        while(Math.abs(turn) > Math.PI){
            if(turn > 0){
                turn-=Math.PI*2;
            } else {
                turn+=Math.PI*2;
            }
            
        }
        
    }
    
    public void turnBot(double turn){
        
        
    }
    
}