package frc.robot.subsystems.elevator;

import edu.wpi.first.math.util.Units;

public class ElevatorConstants {
  public static final int spark = 10;
  public static final int followerSpark = 11;

  public static final double AP = 0.05;
  public static final double L1 = 0.33;
  public static final double A2 = 0.48;
  public static final double L2 = 0.63;
  public static final double A3 = 0.81;
  public static final double L3 = 1.05;
  public static final double L4 = 1.75;
  public static final double AN = 1.76;

  public static final double travel = Units.inchesToMeters(69.0);
  public static final double mass = Units.lbsToKilograms(25.1);

  public static final double stageOneTravel = Units.inchesToMeters(24);
  public static final double stageTwoTravel = Units.inchesToMeters(24);
  public static final double carriageTravel = Units.inchesToMeters(21);

  public static final double drumRadius = 5.0 / 1000.0 * 36 / (2.0 * Math.PI);
  public static final double gearing = (9.0 / 1.0);
  public static final double positionConversionFactor = drumRadius * 2 * Math.PI / gearing;
  public static final double tolerance = .005;

  public static final int current = 60;

  public static class Gains {
    public static final double[] kS = {0.6, 0.6, 0.9};
    public static final double[] kG = {0.5, 0.5, 0.5};
    public static final double kV = 6;
    public static final double[] kA = {0.0, 0.0, 0.0};

    public static final double kP = 40.0;
    public static final double kI = 0.0;
    public static final double kD = 0.0;
  }

  public static final double maxVelocity = // 0.3;
      1.8;
  public static final double maxAcceleration = // 0.3;
      25.5;

  public static final double homingVolts = -4.0;
  public static final double homingTimeSecs = 0.2;
  public static final double homingVelocityThresh = 0.2;

  public static final double staticCharacterizationVelocityThresh = 0.1;

  public static final double visualizerOffset = 0.0;
}
