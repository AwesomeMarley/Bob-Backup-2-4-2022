package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Autonomous(name="First Move Foundation", group="Tests")
public class AutonomousFirstMovingFoundation extends OpMode {
    private double speed = 0.5;
    
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;
    private DcMotor leftMotor2 = null;
    private DcMotor rightMotor2 = null;
    
    private TouchSensor frontTouch = null;
    private TouchSensor backTouch = null;
    
    private Servo servo = null;

    private int step = 1;
    
    public void init() {
        leftMotor  = hardwareMap.get(DcMotor.class, "leftFront");
        rightMotor = hardwareMap.get(DcMotor.class, "rightFront");
        leftMotor2  = hardwareMap.get(DcMotor.class, "leftBack");
        rightMotor2 = hardwareMap.get(DcMotor.class, "rightBack");
        frontTouch = hardwareMap.get(RevTouchSensor.class, "frontTouch");
        backTouch = hardwareMap.get(RevTouchSensor.class, "backTouch");
        
        servo = hardwareMap.get(Servo.class, "trayGrabber");

        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor2.setDirection(DcMotor.Direction.REVERSE);
        rightMotor2.setDirection(DcMotor.Direction.FORWARD);
    }
    
    @Override
    public void loop() {
        telemetry.clearAll();
        
        switch (step) {
            case 1:
                if(frontTouch.isPressed()) {
                    step = 2;
                }
                rightMotor2.setPower(speed);
                rightMotor.setPower(speed);
                leftMotor.setPower(speed);
                leftMotor2.setPower(speed);
                servo.setPosition(0);
                break;
            case 2:
                servo.setPosition(.4);
                step = 3;
                break;
            case 3:
                if(backTouch.isPressed()) {
                    step = 4;
                }
                rightMotor2.setPower(-speed);
                rightMotor.setPower(-speed);
                leftMotor.setPower(-speed);
                leftMotor2.setPower(-speed);
                servo.setPosition(.4);
                break;
            case 4:
                rightMotor2.setPower(0);
                rightMotor.setPower(0);
                leftMotor.setPower(0);
                leftMotor2.setPower(0);
                servo.setPosition(0);
                break;
        }
        telemetry.addLine("Step : " + step);
        telemetry.addLine("Servo : " + servo.getPosition());
    }
}