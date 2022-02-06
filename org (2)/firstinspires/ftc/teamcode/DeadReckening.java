// 2020-2021 FTC Freight Frenzy
//
// Code to run a repeated test of dead reckening.  Will conpare the internal IMU, to drive time, to encoders
// Code to drive forward 1 foot, turn left 90 degrees, then drive 2 feet.
//
// Current Version: 2021-10-10 - Cameron Rodriguez
//
// Insert short description of what the code does here
//
// Code Inputs: N/A
// Code Outputs: N/A
//
// Non-standard dependancies: N/A
//
// Version History
// Current Version: 2021-10-10 - Initial Build
//
// Written By: Cameron Rodriguez, 2021-10-10
// Based off 3 Feet Forward - 2019-2020 Teams Code
// For Jams RoboVikings Team 9987
// 2020-2021 Freight Frenzy
//
// License / Use Terms - GPL
//

package org.firstinspires.ftc.teamcode;

// Import Libraries https://ftctechnh.github.io/ftc_app/doc/javadoc/com/qualcomm/robotcore/hardware/package-summary.html
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

// Declare if Autonomous Mode or Driver Mode
@Autonomous(name="DeadReckening", group="Autonomous")

// Main Code
public class DeadReckening extends LinearOpMode {

    // Set Up Objects
    DcMotor motor1; // Side 1 Wheel 1
    DcMotor motor2; // Side 1 Wheel 2
    DcMotor motor3; // Side 2 Wheel 1
    DcMotor motor4; // Side 2 Wheel 2
    DcMotor motor5; // Intake Wheel 1
    DcMotor motor6; // Intake Wheel 2
    DcMotor motor7; // Crane Motor
    Servo   servo1;
    Servo   servo2;
    Servo   servo3;
    Servo   servo4;

    @Override
    public void runOpMode() throws InterruptedException  { // throws InterruptedException -> run only one loop of the code

        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");
        motor5 = hardwareMap.get(DcMotor.class, "motor5");
        motor6 = hardwareMap.get(DcMotor.class, "motor6");
        motor7 = hardwareMap.get(DcMotor.class, "motor7");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        servo2 = hardwareMap.get(Servo.class, "servo2");
        servo3 = hardwareMap.get(Servo.class, "servo3");
        servo4 = hardwareMap.get(Servo.class, "servo4");
        //servo5 = hardwareMap.get(Servo.class, "servo5");

        // Set the Default Driving Motor Direction
        motor1.setDirection(DcMotorSimple.Direction.FORWARD);
        motor2.setDirection(DcMotorSimple.Direction.FORWARD);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);
        motor4.setDirection(DcMotorSimple.Direction.REVERSE);


        // Wait for the User to start user to start the program
        waitForStart();

        // Run the Motors at 30% Power Forward for 1.8 seconds (1800 milliseconds)
        motor1.setPower(0.3);

        motor2.setPower(0.3);
        motor3.setPower(.3);
        motor4.setPower(.3);
        sleep(1000); // do nothing for 1.0 sec

    } // runOpMode()
} // ThreeFeetForward
