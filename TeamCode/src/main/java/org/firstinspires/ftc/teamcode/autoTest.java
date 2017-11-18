package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by thepi on 11/11/2017.
 */
@Autonomous
public class autoTest extends logicClass {
    DcMotor l1;
    DcMotor l2;
    DcMotor r1;
    DcMotor r2;
    Servo servo1;


@Override
    public void init() {
    l1 = hardwareMap.dcMotor.get("Left 1");
    l2 = hardwareMap.dcMotor.get("Left 2");
    r1 = hardwareMap.dcMotor.get("Right 1");
    r2 = hardwareMap.dcMotor.get("Right 2");
    servo1 = hardwareMap.servo.get("Servo 1");
}
    @Override
    public void loop() {
    }
}



