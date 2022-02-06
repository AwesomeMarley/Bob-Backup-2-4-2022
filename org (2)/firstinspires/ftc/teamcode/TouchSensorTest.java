package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp(name="TestTouchSensor", group="Tests")
public class TouchSensorTest extends OpMode{
    private TouchSensor frontTouch = null;
    
    public void init() {
        frontTouch = hardwareMap.get(RevTouchSensor.class, "frontTouch");
    }
    
    @Override
    public void loop() {
        telemetry.clearAll();
        if(frontTouch.isPressed()) {
            telemetry.addLine("Down");
        } else {
            telemetry.addLine("Up");
        }
    }
}