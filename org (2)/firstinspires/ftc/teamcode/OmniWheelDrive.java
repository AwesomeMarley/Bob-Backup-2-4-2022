// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.Disabled;

// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.util.ElapsedTime;

// import java.text.SimpleDateFormat;
// import java.util.Date;

// /**
//  * This file contains an example of an iterative (Non-Linear) "OpMode".
//  * An OpMode is a 'program' that runs in either the autonomous or the teleop period of an FTC match.
//  * The names of OpModes appear on the menu of the FTC Driver Station.
//  * When an selection is made from the menu, the corresponding OpMode
//  * class is instantiated on the Robot Controller and executed.
//  *
//  * Remove a @Disabled the on the next line or two (if present) to add this opmode to the Driver Station OpMode list,
//  * or add a @Disabled annotation to prevent this OpMode from being added to the Driver Station
//  */
// @TeleOp(name="Omni Wheel Drive Only #2", group="Tests")

// public class OmniWheelDrive extends OpMode {
//     private DcMotor leftMotor = null;
//     private DcMotor rightMotor = null;
//     private DcMotor leftMotor2 = null;
//     private DcMotor rightMotor2 = null;
    
//     @Override
//     public void init() {
//         initializeMotors();
//         telemetry.addData("Status", "Initialized");
//     }
    
    
//     @Override
//     public void loop() {
//         telemetry.clear();
        
//         //motors
//         double rightMotorBackPower = gamepad1.right_stick_y - gamepad1.right_stick_x;
//         double rightMotorFrontPower = gamepad1.right_stick_y + gamepad1.right_stick_x;
//         double leftMotorFrontPower = gamepad1.left_stick_y - gamepad1.left_stick_x;
//         double leftMotorBackPower = gamepad1.left_stick_y + gamepad1.left_stick_x;
        
//         rightMotor2.setPower(rightMotorBackPower);
//         rightMotor.setPower(rightMotorFrontPower);
//         leftMotor.setPower(leftMotorFrontPower);
//         leftMotor2.setPower(leftMotorBackPower);
    
//         //end motors
        
//         telemetry.addData("Right Front Motor Power", Double.toString(rightMotorFrontPower));
//         telemetry.addData("Left Front Motor Power", Double.toString(leftMotorFrontPower));
//         telemetry.addData("Right Back Motor Power", Double.toString(rightMotorBackPower));
//         telemetry.addData("Left Back Motor Power", Double.toString(leftMotorBackPower));
        
//         telemetry.addLine("Right Front Motor Power " + rightMotorFrontPower);

//     }
    
    
//     public void initializeMotors(){
//         leftMotor  = hardwareMap.get(DcMotor.class, "leftMotor");
//         rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
//         leftMotor2  = hardwareMap.get(DcMotor.class, "leftMotor2");
//         rightMotor2 = hardwareMap.get(DcMotor.class, "rightMotor2");
        
//         leftMotor.setDirection(DcMotor.Direction.FORWARD);
//         rightMotor.setDirection(DcMotor.Direction.REVERSE);
//         leftMotor2.setDirection(DcMotor.Direction.FORWARD);
//         rightMotor2.setDirection(DcMotor.Direction.FORWARD);
//         telemetry.addLine("Drive Motors Initialized");
//     }
    

// }
