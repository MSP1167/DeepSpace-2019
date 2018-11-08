/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;
import frc.robot.Commands.ManualCommandTurn;
import frc.robot.Util.JoystickController;

/**
 * Add your docs here.
 */
public class SubsystemTurret extends Subsystem {

  TalonSRX turret;

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ManualCommandTurn());
  }

  public SubsystemTurret() {
    turret = new TalonSRX(Constants.TurretID);
  }

  public void spin(Joystick joy) {
    turret.set(ControlMode.PercentOutput, JoystickController.X_AXIS(joy));
  }

  
}
