package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by thepi on 11/10/2017.
 */
//for the mecanum config
public class noerOpMode extends OpMode{
    DcMotor l1;
    DcMotor l2;
    DcMotor r1;
    DcMotor r2;
    Servo servo1;
    @Override
    public void init() {
        l1=hardwareMap.dcMotor.get("Left1");
        l2=hardwareMap.dcMotor.get("Left2");
        r1=hardwareMap.dcMotor.get("Right1");
        r2=hardwareMap.dcMotor.get("Right1");
        servo1=hardwareMap.servo.get("Servo1");
    }
    @Override
    public void loop() {
        if (gamepad1.right_bumper) {
            //horizontal
            l1.setPower(gamepad1.left_stick_x);
            l2.setPower(-1 * (gamepad1.left_stick_x));
            r1.setPower(gamepad1.left_stick_x);
            r2.setPower(-1 * (gamepad1.left_stick_x));

        } else if (gamepad1.left_bumper) {
            //turn
            l1.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            l2.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            r1.setPower(gamepad1.left_trigger - gamepad1.right_trigger);
            r2.setPower(gamepad1.left_trigger - gamepad1.right_trigger);

        } else {
            //vertical
            l1.setPower(-1 * (gamepad1.right_stick_y));
            l2.setPower(-1 * (gamepad1.right_stick_y));
            r2.setPower(gamepad1.right_stick_y);
            r1.setPower(gamepad1.right_stick_y);
        }

    }
}
