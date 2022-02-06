// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;

// @TeleOp(name="Omni Wheel Drive Only", group="Tests")

// public class FourWheelDrive extends OpMode{
//     private DcMotor leftMotor = null;
//     private DcMotor rightMotor = null;
//     private DcMotor leftMotor2 = null;
//     private DcMotor rightMotor2 = null;
    
//     @Override
//     public void init() {
//         leftMotor  = hardwareMap.get(DcMotor.class, "leftMotor");
//         rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
//         leftMotor2  = hardwareMap.get(DcMotor.class, "leftMotor2");
//         rightMotor2 = hardwareMap.get(DcMotor.class, "rightMotor2");
//         telemetry.addLine("Drive Motors Initialized");
        
//         leftMotor.setDirection(DcMotor.Direction.FORWARD);
//         rightMotor.setDirection(DcMotor.Direction.REVERSE);
//         leftMotor2.setDirection(DcMotor.Direction.REVERSE);
//         rightMotor2.setDirection(DcMotor.Direction.FORWARD);
//         telemetry.addLine("Drive Motors Direction Set");

        
//         telemetry.addData("Status", "Initialized");
//     }
    
    
//     @Override
//     public void loop() {
//         telemetry.clear();
        
//         //motors
//         double rightMotorBackPower = gamepad1.right_stick_y;
//         double rightMotorFrontPower = gamepad1.right_stick_y;
//         double leftMotorFrontPower = gamepad1.left_stick_y;
//         double leftMotorBackPower = gamepad1.left_stick_y;
        
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


//     // todo: write your code here
// }