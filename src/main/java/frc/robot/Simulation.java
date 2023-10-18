package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.FieldObject2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Simulation {
    
    private final Field2d field_ = new Field2d();
    private final FieldObject2d front_left_ = field_.getObject("front_left");
    private final FieldObject2d front_right_ = field_.getObject("front_right");
    private final FieldObject2d back_left_ = field_.getObject("back_left");
    private final FieldObject2d back_right_ = field_.getObject("back_right");


    public Simulation() {
        SmartDashboard.putData("Field", field_);

    }

    public void update() {
        field_.setRobotPose(5, 2, Rotation2d.fromDegrees(90));
        front_left_.setPose(5, 2, Rotation2d.fromDegrees(90));
    }

    public static class Constants {

    }
}
