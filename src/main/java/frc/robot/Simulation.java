package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.FieldObject2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import java.util.Vector;

public class Simulation {
    
    private final Field2d field_ = new Field2d();

    private final FieldObject2d front_left_ = field_.getObject("front_left");
    private final FieldObject2d front_right_ = field_.getObject("front_right");
    private final FieldObject2d back_left_ = field_.getObject("back_left");
    private final FieldObject2d back_right_ = field_.getObject("back_right");

    // Array for the sim wheels
    private final FieldObject2d[] modules_ = {front_left_, front_right_, back_left_, back_right_};



    // IO
    private final IO io_ = new IO();


    public Simulation() {
        SmartDashboard.putData("Field", field_);

    }

    // Add odometry to the sim
    public void update() {
        field_.setRobotPose(5, 2, Rotation2d.fromDegrees(90));
        front_left_.setPose(5, 2, Rotation2d.fromDegrees(90));
    }

    public static class IO {
        // Input 

        // Output
        Pose2d pose_;
    }
}
