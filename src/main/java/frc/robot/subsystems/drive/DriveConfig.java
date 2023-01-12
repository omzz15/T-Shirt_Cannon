package frc.robot.subsystems.drive;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class DriveConfig {
    private MotorController leftDriveController;
    private MotorController rightDriveController;

    private boolean invertLeft = true;
    private boolean invertRight = false;

    private double rampX = 0.04;
    private double rampR = 0.04;

    private Supplier<Double> xPowerSupplier;
    private Supplier<Double> rPowerSupplier;

    public DriveConfig(){}

    public DriveConfig(MotorController leftDriveController, MotorController rightDriveController, Supplier<Double> xPowerSupplier,
                       Supplier<Double> rPowerSupplier) {
        this.leftDriveController = leftDriveController;
        this.rightDriveController = rightDriveController;
        this.xPowerSupplier = xPowerSupplier;
        this.rPowerSupplier = rPowerSupplier;
    }

    public DriveConfig(boolean invertLeft, boolean invertRight, double rampX, double rampR) {
        this.invertLeft = invertLeft;
        this.invertRight = invertRight;
        this.rampX = rampX;
        this.rampR = rampR;
    }

    public DriveConfig(MotorController leftDriveController, MotorController rightDriveController, boolean invertLeft, boolean invertRight,
                       double rampX, double rampR, Supplier<Double> xPowerSupplier, Supplier<Double> rPowerSupplier) {
        this.leftDriveController = leftDriveController;
        this.rightDriveController = rightDriveController;
        this.invertLeft = invertLeft;
        this.invertRight = invertRight;
        this.rampX = rampX;
        this.rampR = rampR;
        this.xPowerSupplier = xPowerSupplier;
        this.rPowerSupplier = rPowerSupplier;
    }

    public MotorController getLeftDriveController() {
        return leftDriveController;
    }

    public void setLeftDriveController(MotorController leftDriveController) {
        this.leftDriveController = leftDriveController;
    }

    public MotorController getRightDriveController() {
        return rightDriveController;
    }

    public void setRightDriveController(MotorController rightDriveController) {
        this.rightDriveController = rightDriveController;
    }

    public void setDriveControllers(MotorController leftDriveController, MotorController rightDriveController){
        this.leftDriveController = leftDriveController;
        this.rightDriveController = rightDriveController;
    }

    public boolean isInvertLeft() {
        return invertLeft;
    }

    public void setInvertLeft(boolean invertLeft) {
        this.invertLeft = invertLeft;
    }

    public boolean isInvertRight() {
        return invertRight;
    }

    public void setInvertRight(boolean invertRight) {
        this.invertRight = invertRight;
    }

    public void setInvert(boolean invertLeft, boolean invertRight){
        this.invertLeft = invertLeft;
        this.invertRight = invertRight;
    }

    public double getRampX() {
        return rampX;
    }

    public void setRampX(double rampX) {
        this.rampX = rampX;
    }

    public double getRampR() {
        return rampR;
    }

    public void setRampR(double rampR) {
        this.rampR = rampR;
    }

    public Supplier<Double> getXPowerSupplier() {
        return xPowerSupplier;
    }

    public void setXPowerSupplier(Supplier<Double> xPowerSupplier) {
        this.xPowerSupplier = xPowerSupplier;
    }

    public Supplier<Double> getRPowerSupplier() {
        return rPowerSupplier;
    }

    public void setRPowerSupplier(Supplier<Double> rPowerSupplier) {
        this.rPowerSupplier = rPowerSupplier;
    }
}
