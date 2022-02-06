// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.util.ElapsedTime;
// import com.qualcomm.robotcore.util.Range;



// @TeleOp(name="Test Intake #2", group="Tests")
// public class IntakeTestOpMode extends OpMode{
//     private DcMotor leftMotor = null;
//     private DcMotor rightMotor = null;
    
//     public void init() {
//         leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");
//         rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
        
//         leftMotor.setDirection(DcMotor.Direction.FORWARD);
//         rightMotor.setDirection(DcMotor.Direction.FORWARD);
//         telemetry.addLine("INITIALIZED");
//     }
    
//     public void loop() {
//         telemetry.addLine("LOOPING");
//         leftMotor.setPower(gamepad1.left_stick_y);
//         rightMotor.setPower(gamepad1.left_stick_y);
        
//     }
//     // todo: write your code here
// }