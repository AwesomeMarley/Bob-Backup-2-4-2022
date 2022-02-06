// package org.firstinspires.ftc.teamcode;
// import com.qualcomm.robotcore.hardware.HardwareMap;
// import com.qualcomm.robotcore.hardware.Gamepad;
// import org.firstinspires.ftc.robotcore.external.Telemetry;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// public class DrivingMotors {
//     private HardwareMap hardwareMap = null;
//     private Telemetry telemetry = null;
//     private DcMotor leftMotor = null;
//     private DcMotor rightMotor = null;
//     private DcMotor leftMotor2 = null;
//     private DcMotor rightMotor2 = null;
    
//     private double leftMotorPower = 0;
//     private double leftMotor2Power = 0;
//     private double rightMotorPower = 0;
//     private double rightMotor2Power = 0;

//     public DrivingMotors(HardwareMap hardwareMap, Telemetry telemetry, boolean isOmni){
//         this.hardwareMap = hardwareMap;
//         this.telemetry = telemetry;
//         initializeMotors(isOmni);
//     }
//     public void stopAll(){
//         leftMotorPower = 0;
//         leftMotor2Power = 0;
//         rightMotorPower = 0;
//         rightMotor2Power = 0;
        
//         leftMotor.setPower(leftMotorPower);
//         leftMotor2.setPower(leftMotor2Power);
//         rightMotor.setPower(rightMotorPower);
//         rightMotor2.setPower(rightMotor2Power);
        
//         showMotorTelemetry();
//     }
//     public void drive4Wheel(Gamepad gamepad1){
//         leftMotorPower = gamepad1.left_stick_y;
//         leftMotor2Power = gamepad1.left_stick_y;
//         rightMotorPower = gamepad1.right_stick_y;
//         rightMotor2Power = gamepad1.right_stick_y;
        
//         leftMotor.setPower(leftMotorPower);
//         leftMotor2.setPower(leftMotor2Power);
//         rightMotor.setPower(rightMotorPower);
//         rightMotor2.setPower(rightMotor2Power);
        
//         showMotorTelemetry();
//     }
//     public void driveOmniWheel(Gamepad gamepad1){
        
//         rightMotor2Power = gamepad1.right_stick_y - gamepad1.right_stick_x;
//         rightMotorPower = gamepad1.right_stick_y + gamepad1.right_stick_x;
//         leftMotorPower = gamepad1.left_stick_y - gamepad1.left_stick_x;
//         leftMotor2Power = gamepad1.left_stick_y + gamepad1.left_stick_x;
        
//         leftMotor.setPower(leftMotorPower);
//         leftMotor2.setPower(leftMotor2Power);
//         rightMotor.setPower(rightMotorPower);
//         rightMotor2.setPower(rightMotor2Power);
        
//         showMotorTelemetry();
//     }
//     public void showMotorTelemetry(){
//         telemetry.addData("Right Front Motor Power", Double.toString(rightMotorPower));
//         telemetry.addData("Left Front Motor Power", Double.toString(leftMotorPower));
//         telemetry.addData("Right Back Motor Power", Double.toString(rightMotor2Power));
//         telemetry.addData("Left Back Motor Power", Double.toString(leftMotor2Power));
//     }
    
//     public void initializeMotors(boolean omni){
//         if(omni){
//             leftMotor  = hardwareMap.get(DcMotor.class, "leftMotor");
//             rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
//             leftMotor2  = hardwareMap.get(DcMotor.class, "leftMotor2");
//             rightMotor2 = hardwareMap.get(DcMotor.class, "rightMotor2");
            
//             leftMotor.setDirection(DcMotor.Direction.FORWARD);
//             rightMotor.setDirection(DcMotor.Direction.REVERSE);
//             leftMotor2.setDirection(DcMotor.Direction.FORWARD);
//             rightMotor2.setDirection(DcMotor.Direction.REVERSE);
//             telemetry.addLine("Drive Motors Direction Set");
//         }else{
//             leftMotor  = hardwareMap.get(DcMotor.class, "leftMotor");
//             rightMotor = hardwareMap.get(DcMotor.class, "rightMotor");
//             leftMotor2  = hardwareMap.get(DcMotor.class, "leftMotor2");
//             rightMotor2 = hardwareMap.get(DcMotor.class, "rightMotor2");
//             telemetry.addLine("Drive Motors Initialized");
            
//             leftMotor.setDirection(DcMotor.Direction.FORWARD);
//             rightMotor.setDirection(DcMotor.Direction.REVERSE);
//             leftMotor2.setDirection(DcMotor.Direction.REVERSE);
//             rightMotor2.setDirection(DcMotor.Direction.FORWARD);
//             telemetry.addLine("Drive Motors Direction Set");
//         }
//     }
    
// }