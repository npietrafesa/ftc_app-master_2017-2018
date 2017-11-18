package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by thepi on 11/18/2017.
 */

public class logicClass extends OpMode {
    DcMotor r1;
    DcMotor r2;
    DcMotor l1;
    DcMotor l2;
    Servo servo1;

    @Override
    public void init() {
        l1 = hardwareMap.dcMotor.get("Left 1");
        l2 = hardwareMap.dcMotor.get("Left 2");
        r1 = hardwareMap.dcMotor.get("Right 1");
        r2 = hardwareMap.dcMotor.get("Right 2");
        servo1 = hardwareMap.servo.get("Servo 1");
    }
        public void goForward() {
            r1.setPower(-1);
            r2.setPower(-1);
            l1.setPower(1);
            l2.setPower(1);
        }

        public void stopRobot() {
            r1.setPower(0);
            r2.setPower(0);
            l1.setPower(0);
            l2.setPower(0);
        }

        public void goBackwards() {
            r1.setPower(1);
            r2.setPower(1);
            l1.setPower(-1);
            l2.setPower(-1);
        }

        public void turnLeft() {
            r1.setPower(1);
            r2.setPower(1);
            l1.setPower(1);
            l2.setPower(1);
        }
        public void turnRight() {
        r1.setPower(-1);
        r2.setPower(-1);
        l1.setPower(-1);
        l2.setPower(-1);
        }

    @Override
    public void loop() {

    }
}
