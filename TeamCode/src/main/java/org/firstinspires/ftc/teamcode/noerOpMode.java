package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Noah Pietrafesa on 11/10/2017.
 */
//for the mecanum config
@TeleOp(name = "TeleOp")
public class noerOpMode extends OpMode {

    DcMotor l1;
    DcMotor l2;
    DcMotor r1;
    DcMotor r2;
    DcMotor lift;
    DcMotor idolExt;
    Servo servoGlyph1;
    Servo servoGlyph2;
    Servo idolPivot;
    Servo jewel;
    Servo idolClaw;


    @Override
    public void init() {
        l1 = hardwareMap.dcMotor.get("Left 1");
        l2 = hardwareMap.dcMotor.get("Left 2");
        r1 = hardwareMap.dcMotor.get("Right 1");
        r2 = hardwareMap.dcMotor.get("Right 2");
        lift = hardwareMap.dcMotor.get("Lift");
        idolExt = hardwareMap.dcMotor.get("Idol Ext");

        servoGlyph1 = hardwareMap.servo.get("Glyph 1");
        servoGlyph2 = hardwareMap.servo.get("Glyph 2");
        idolClaw = hardwareMap.servo.get("Idol 1");
        idolPivot = hardwareMap.servo.get("Idol 2");
        jewel = hardwareMap.servo.get("Jewel");

        servoGlyph1.setPosition(0);
        servoGlyph2.setPosition(1);
        idolPivot.setPosition(1);
        idolClaw.setPosition(.5);
        jewel.setPosition(.15);

        l1.setDirection(DcMotor.Direction.REVERSE);
        l2.setDirection(DcMotor.Direction.REVERSE);
        r1.setDirection(DcMotor.Direction.REVERSE);
        r2.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        if (gamepad1.right_bumper) {
            //horizontal
            l1.setPower(-.8 * (gamepad1.left_stick_x));
            l2.setPower(.8 * (gamepad1.left_stick_x));
            r1.setPower(.8 * (gamepad1.left_stick_x));
            r2.setPower(-.8 *(gamepad1.left_stick_x));

        } else if (gamepad1.left_bumper) {
            //turn
            l1.setPower(.8 *(gamepad1.left_trigger - gamepad1.right_trigger));
            l2.setPower(.8 *(gamepad1.left_trigger - gamepad1.right_trigger));
            r1.setPower(-.8 *(gamepad1.left_trigger - gamepad1.right_trigger));
            r2.setPower(-.8 *(gamepad1.left_trigger - gamepad1.right_trigger));

        } else {
            //vertical
            l1.setPower(.8 *(gamepad1.right_stick_y));
            l2.setPower(.8 *(gamepad1.right_stick_y));
            r2.setPower(.8 *(gamepad1.right_stick_y));
            r1.setPower(.8 *(gamepad1.right_stick_y));
        }
        if (gamepad2.a) {
            servoGlyph1.setPosition(.5);
            servoGlyph2.setPosition(.5);
        } else {
            servoGlyph1.setPosition(0);
            servoGlyph2.setPosition(1);
        }
        if (gamepad2.b) {
            idolPivot.setPosition(-1);
        } else {
            idolPivot.setPosition(1);
        }
        if (gamepad2.y) {
            idolClaw.setPosition(1);
        }
        else {
            idolClaw.setPosition(.5);
        }
        lift.setPower(.75* (gamepad2.left_stick_y));

        idolExt.setPower(.75* (gamepad2.right_stick_y));

        jewel.setPosition(.15);

        telemetry.addData("Left 1", l1.getPower());
        telemetry.addData("Left 2", l2.getPower());
        telemetry.addData("Right 1", r1.getPower());
        telemetry.addData("Right 2", r2.getPower());
        telemetry.addData("Glyph Servo 1", servoGlyph1.getPosition());
        telemetry.addData("Glyph Servo 2", servoGlyph2.getPosition());
        telemetry.addData("Idol Pivot", idolPivot.getPosition());
        telemetry.addData("Idol Claw", idolClaw.getPosition());


    }
}
