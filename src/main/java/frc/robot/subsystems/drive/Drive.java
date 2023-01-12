package frc.robot.subsystems.drive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase{
    private DriveConfig config;
    private double currX = 0;
    private double currR = 0;

    public Drive(){
        config = new DriveConfig();
    }

    public Drive(DriveConfig config){
        this.config = config;
    }

    public DriveConfig getConfig() {
        return config;
    }

    public void setConfig(DriveConfig config) {
        this.config = config;
    }

    public void configureMotors(){
        config.getLeftDriveController().setInverted(config.isInvertLeft());
        config.getRightDriveController().setInverted(config.isInvertRight());
    }

    public void teleopPeriodic(){
        setPower(config.getXPowerSupplier().get(), config.getRPowerSupplier().get());
    }

    public void setPower(double setX, double setR){
        if(setX != currX){
            if(setX > currX) currX = Math.min(currX + config.getRampX(), setX);
            else currX = Math.max(currX - config.getRampX(), setX);
        }
        if(setR != currR){
            if(setR > currR) currR = Math.min(currR + config.getRampR(), setR);
            else currR = Math.max(currR - config.getRampR(), setR);
        }

        config.getLeftDriveController().set(currX + currR);
        config.getRightDriveController().set(currX - currR);
    }

    public void stop(){
        currX = 0;
        currR = 0;

        config.getLeftDriveController().set(0);
        config.getRightDriveController().set(0);
    }
}
