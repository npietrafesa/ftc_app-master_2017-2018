package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.RelicRecoveryVuMark;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

/**
 * Created by thepi on 1/28/2018.
 */
@Autonomous (name = "Pictograph Test Program")
public class pictoTest extends LinearOpMode {
    VuforiaLocalizer vuforia;

    DcMotor l1;
    DcMotor l2;
    DcMotor r1;
    DcMotor r2;
    Servo servoGlyph1;
    Servo servoGlyph2;
    Servo jewel;
    ColorSensor color_sensor;

    public void goForward() {
        r1.setPower(.5);
        r2.setPower(.5);
        l1.setPower(.5);
        l2.setPower(.5);
    }

    //stops robot
    public void stopRobot() {
        r1.setPower(0);
        r2.setPower(0);
        l1.setPower(0);
        l2.setPower(0);
    }

    //going backwards
    public void goBackwards() {
        r1.setPower(-.5);
        r2.setPower(-.5);
        l1.setPower(-.5);
        l2.setPower(-.5);
    }

    // turns left
    public void turnLeft() {
        r1.setPower(.5);
        r2.setPower(.5);
        l1.setPower(-.5);
        l2.setPower(-.5);
    }

    //turns right
    public void turnRight() {
        r1.setPower(-.5);
        r2.setPower(-.5);
        l1.setPower(.5);
        l2.setPower(.5);
    }

    //strafe left
    public void goLeft() {
        r1.setPower(-.5);
        r2.setPower(.5);
        l1.setPower(.5);
        l2.setPower(-5);
    }

    //strafe right
    public void goRight() {
        r1.setPower(-.5);
        r2.setPower(.5);
        l1.setPower(.5);
        l2.setPower(-.5);
    }


    @Override
    public void runOpMode() {
        l1 = hardwareMap.dcMotor.get("Left 1");
        l2 = hardwareMap.dcMotor.get("Left 2");
        r1 = hardwareMap.dcMotor.get("Right 1");
        r2 = hardwareMap.dcMotor.get("Right 2");

        servoGlyph1 = hardwareMap.servo.get("Glyph 1");
        servoGlyph2 = hardwareMap.servo.get("Glyph 2");
        jewel = hardwareMap.servo.get("Jewel");

        servoGlyph1.setPosition(.5);
        servoGlyph2.setPosition(.5);
        jewel.setPosition(.15);
        color_sensor = hardwareMap.colorSensor.get("color_sensor");

        VuforiaLocalizer.Parameters parameters = new VuforiaLocalizer.Parameters();
        parameters.vuforiaLicenseKey = "AXijc37/////AAAAGR8Zcpk0OkqfpylpmW5pYTAUkEXgtaFwGrLNLr0pw2tXVyNQrJxgegKHKQkDqhX4BfvI/i8II0jj9TXN1WPENa4GY/VYLsafTjuTTSJHctF5OCHh/XH13hEAsGDzW6tFE6SOf8hMHJpKWcv9neasODelhb5jedgNmgYgg9PCOpKPtn66pjIIZoK4XGvj8gH1+sx9WO5Bl3zwDx6IJPDPilKCQ8hhoWyN6g4yck1/ty7dxwx7DDWQ307lSlcg6DINlMaYsR4CIptbTzNE6SSahJPIAL6isd5pYK8iNI2jYyNLRARlTMo1Ps1+KAVUuDo1GI+vvsg/iGCdkjLfZ2qEf415rfqMWgsEAv3dsZs3sdbp";
        parameters.cameraDirection = VuforiaLocalizer.CameraDirection.FRONT;
        this.vuforia = ClassFactory.createVuforiaLocalizer(parameters);
        VuforiaTrackables relicTrackables = this.vuforia.loadTrackablesFromAsset("RelicVuMark");
        VuforiaTrackable relicTemplate = relicTrackables.get(0);
        relicTemplate.setName("relicVuMarkTemplate"); // can help in debugging, otherwise not necessary

        telemetry.addData(">", "Press Play to start");
        telemetry.update();

        waitForStart(); //marks end of init

        relicTrackables.activate();
        while (opModeIsActive()) {
            RelicRecoveryVuMark vuMark = RelicRecoveryVuMark.from(relicTemplate);
            if (vuMark != RelicRecoveryVuMark.UNKNOWN) {
                telemetry.addData("VuMark", "%s visible", vuMark);
            } else {
                telemetry.addData("VuMark", "not visible");
            }

            goBackwards();
            sleep(100);

            switch (vuMark) {
                case LEFT:

                    goBackwards();
                    sleep(2000);

                    turnRight();
                    sleep(1000);

                    goLeft();
                    sleep(500);

                    servoGlyph1.setPosition(0);
                    servoGlyph2.setPosition(1);

                    goForward();
                    sleep(1000);
                    break;

                case RIGHT:

                    goBackwards();
                    sleep(2000);

                    turnRight();
                    sleep(1000);

                    goRight();
                    sleep(500);

                    servoGlyph1.setPosition(0);
                    servoGlyph2.setPosition(1);

                    goForward();
                    sleep(1000);
                    break;

                case CENTER:

                    goBackwards();
                    sleep(2000);

                    turnRight();
                    sleep(1000);

                    servoGlyph1.setPosition(0);
                    servoGlyph2.setPosition(1);

                    goForward();
                    sleep(1000);
                    break;

                default:
                    //it does nothing, in case cipher cannot be seen, it will break out of the switch.
                    break;
            }

            stop();

        }
    }
}
