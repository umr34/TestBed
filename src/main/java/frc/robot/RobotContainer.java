// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.DriveTeleop;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  //Motor controllers
  public VictorSP leftFront, leftRear, rightFront, rightRear;

  //OI
  public OI oi; 
  
  

  // Subsystems
  public DriveTrain drive;
  
  // Commands
  public DriveTeleop driveTeleop;



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer(){
    leftFront = new VictorSP(RobotMap.leftFront);
    leftRear = new VictorSP(RobotMap.leftRear);
    rightFront = new VictorSP(RobotMap.rightFront);
    rightRear = new VictorSP(RobotMap.rightRear);
  
  

    drive = new DriveTrain(leftFront, rightFront, leftRear, rightRear);

    oi = new OI();

    driveTeleop = new DriveTeleop(drive, oi::getXboxLeftTrigger, oi::getXboxRightTrigger, oi::getXboxLeftX);


  }

  public Command getAutonomousCommand(){
    return null;
  }
}
