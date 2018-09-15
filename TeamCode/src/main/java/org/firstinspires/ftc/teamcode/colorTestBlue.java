package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by thepi on 11/4/2017.
 */
//TEST PROGRAM
@TeleOp
//@Disabled
public class colorTestBlue extends OpMode {
    ColorSensor color_sensor;
    Servo jewel;

    @Override

    public void init() {
        color_sensor = hardwareMap.colorSensor.get("color_sensor");
        jewel = hardwareMap.servo.get("Jewel");
    }

    @Override
    public void loop() {
//        color_sensor.blue();
//        if (color_sensor.blue() >= 20 && color_sensor.blue() <= 35) {
//            servo1.setPosition(.5);
//        } else {
//            servo1.setPosition(0);
//        }
//        if (gamepad1.a) {
//            color_sensor.enableLed(true);
//        } else if (gamepad1.b) {
//            color_sensor.enableLed(false);
//        }
        telemetry.addData("Blue Int", color_sensor.blue());
        telemetry.addData("Red Int", color_sensor.red());
        telemetry.addData("Alpha", color_sensor.alpha());
        telemetry.addData("Servo Position", jewel.getPosition());

    }
}
