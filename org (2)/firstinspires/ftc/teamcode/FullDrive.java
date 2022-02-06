
// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import org.firstinspires.ftc.robotcore.external.Telemetry;
// import com.qualcomm.robotcore.hardware.CRServo;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.Disabled;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.util.ElapsedTime;

// import org.firstinspires.ftc.teamcode.DrivingMotors;

// @TeleOp(name="Full Drive", group="competition")

// public class FullDrive extends OpMode {
//     DrivingMotors drivingMotors = null;
//     @Override
//     public void init() {
//         drivingMotors =  new DrivingMotors(hardwareMap, telemetry, true);
//         initializeServos();
//     }
    
//     @Override
//     public void loop() {
//         drivingMotors.driveOmniWheel(gamepad1);
//         /* code */
//     }
    
//     public void initializeServos(){
//         // servo1 = hardwareMap.get(CRServo.class, "servo1");
//         // servo2 = hardwareMap.get(CRServo.class, "servo2");
//         // servo1.setDirection(DcMotorSimple.Direction.FORWARD);
//         // servo2.setDirection(DcMotorSimple.Direction.REVERSE);
//         telemetry.addLine("Servos Initialized");
//     }
    

// }
