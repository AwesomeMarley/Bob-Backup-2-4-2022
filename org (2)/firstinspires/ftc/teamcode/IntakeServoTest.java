// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.hardware.CRServo;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.util.ElapsedTime;
// import com.qualcomm.robotcore.util.Range;



// @TeleOp(name="Test Servo Intake #1", group="Tests")
// public class IntakeServoTest extends OpMode{
//     private CRServo servo1 = null;
//     private CRServo servo2 = null;
    
//     public void init(){
//         initializeServos();
//     }
    
//     public void loop() {
//         telemetry.addLine("LOOPING");
//         servo1.setPower(gamepad1.left_stick_y);
//         servo2.setPower(gamepad1.left_stick_y);
//     }
    
//     public void initializeServos(){
//         servo1 = hardwareMap.get(CRServo.class, "servo1");
//         servo2 = hardwareMap.get(CRServo.class, "servo2");
//         servo1.resetDeviceConfigurationForOpMode();
//         servo2.resetDeviceConfigurationForOpMode();
//         servo1.setDirection(DcMotorSimple.Direction.FORWARD);
//         servo2.setDirection(DcMotorSimple.Direction.REVERSE);
//         telemetry.addLine("Servos Initialized");
//     }
// }