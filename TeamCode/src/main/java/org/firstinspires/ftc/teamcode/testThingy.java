package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by thepi on 1/14/2018.
 */
//@Disabled
@Autonomous
public class testThingy extends LinearOpMode {

    DcMotor l1;
    DcMotor l2;
    DcMotor r1;
    DcMotor r2;

    public void goForward() {
        r1.setPower(.5);
        r2.setPower(.5);
        l1.setPower(.5);
        l2.setPower(.5);
    }
    @Override
    public void runOpMode() {
        l1 = hardwareMap.dcMotor.get("Left 1");
        l2 = hardwareMap.dcMotor.get("Left 2");
        r1 = hardwareMap.dcMotor.get("Right 1");
        r2 = hardwareMap.dcMotor.get("Right 2");

        waitForStart();

        while (opModeIsActive()) {
            goForward();
            sleep(100);
            stop();
            telemetry.addData("Time", time);
        }
    }
}
