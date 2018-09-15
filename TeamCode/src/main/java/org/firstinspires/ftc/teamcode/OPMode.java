package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by thepi on 10/28/2017.
 */
//TEST PROGRAM
@TeleOp
@Disabled
public class OPMode extends OpMode {
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
        servo1 = hardwareMap.servo.get("Servo 1");}

    public void servo_90() {
        servo1.setPosition(.5);
    }

    public void servo_180() {
        servo1.setPosition(1);
    }

    public void servo_n() {
        servo1.setPosition(0);
    }

        @Override
    public void loop(){
            l1.setPower(gamepad1.left_stick_y);
            l2.setPower(gamepad1.left_stick_y);
            r2.setPower(-1*(gamepad1.right_stick_y));
            r1.setPower(-1*(gamepad1.right_stick_y));
            if (gamepad1.a){
                servo_90();
            }
            else if (gamepad1.b){
                servo_180();
            }
            else if (gamepad1.y){
                servo_n();
            }
            telemetry.addData("Servo Position", servo1.getPosition());
            telemetry.addData("Left 1", l1.getPower());
            telemetry.addData("Left 2", l2.getPower());
            telemetry.addData("Right 1", r1.getPower());
            telemetry.addData("Right 2", r2.getPower());
            telemetry.addData("Status", "Running");
            telemetry.update();
        }
}

