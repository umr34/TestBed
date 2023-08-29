package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase{
    private final VictorSP leftFront, rightFront, leftRear, rightRear;

    public DriveTrain(VictorSP leftFront, VictorSP rightFront, VictorSP leftRear, VictorSP rightRear){
        this.leftFront = leftFront;
        this.rightFront = rightFront;
        this.leftRear = leftRear;
        this.rightRear = rightRear;
    }

    public void set(double leftFront, double rightFront, double leftRear, double rightRear){
        this.leftFront.set(leftFront);
        this.rightFront.set(rightFront);
        this.leftRear.set(leftRear);
        this.rightRear.set(rightRear);
    }

    public void set(double left, double right){
        this.leftFront.set(left);
        this.rightFront.set(right);
        this.leftRear.set(left);
        this.rightRear.set(right);
    }

    public void stop(){
        this.leftFront.set(0);
        this.rightFront.set(0);
        this.leftRear.set(0);        
        this.rightRear.set(0);
    }

    
    public void setReversed(boolean leftFront, boolean leftRear, boolean rightFront, boolean rightRear){}

    public VictorSP getLeftFront(){
        return leftFront;
    }

    public VictorSP getLeftRear(){
        return leftRear;
    }

    public VictorSP getRightFront(){
        return rightFront;
    }

    public VictorSP getRightRear(){
        return rightRear;
    }
    

}