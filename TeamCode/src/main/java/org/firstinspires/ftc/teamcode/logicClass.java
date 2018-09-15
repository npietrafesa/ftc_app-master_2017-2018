package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Noah Pietrafesa on 11/18/2017.
 */
//OBSOLETE, IS NO LONGER IN USE
//This program is used to contain all of the autonomous methods, instead of constantly having to recall the same methods over and over again.
public class logicClass /*extends LinearOpMode */ {
//    //Motors
//    DcMotor r1;
//    DcMotor r2;
//    DcMotor l1;
//    DcMotor l2;
//    //Servos/crservos
//    Servo servoJewel;
//    Servo servoGlyph1;
//    Servo servoGlyph2;
//    Servo servoIdol;
//    Servo linearSlide;
//    //Sensors/misc
//    ColorSensor color_sensor;
//    @Override
//    public void runOpMode() {
////    @Override
////    public void init() {
//        //mapping device names for the phone to read
//        //Motors
//        l1 = hardwareMap.dcMotor.get("Left 1");
//        l2 = hardwareMap.dcMotor.get("Left 2");
//        r1 = hardwareMap.dcMotor.get("Right 1");
//        r2 = hardwareMap.dcMotor.get("Right 2");
//        //Servos/crservos
//        servoGlyph1 = hardwareMap.servo.get("Glyph 1");
//        servoGlyph2 = hardwareMap.servo.get("Glyph 2");
//        linearSlide = hardwareMap.servo.get("Slide");
//        servoIdol = hardwareMap.servo.get("Idol");
//        servoJewel = hardwareMap.servo.get("Jewel");
//        //sensors/misc
//        color_sensor = hardwareMap.colorSensor.get("color_sensor");
//
//        l1.setDirection(DcMotor.Direction.REVERSE);
//        l2.setDirection(DcMotor.Direction.REVERSE);
//        r1.setDirection(DcMotor.Direction.REVERSE);
//        r2.setDirection(DcMotor.Direction.REVERSE);
//        //serves as kind of an init, after waitforstart is like loop
//        waitForStart();
//
//    }
////methods
//    //going forward
//    public void goForward() {
//        r1.setPower(1);
//        r2.setPower(1);
//        l1.setPower(1);
//        l2.setPower(1);
//    }
////stops robot
//    public void stopRobot() {
//        r1.setPower(0);
//        r2.setPower(0);
//        l1.setPower(0);
//        l2.setPower(0);
//    }
////going backwards
//    public void goBackwards() {
//        r1.setPower(-1);
//        r2.setPower(-1);
//        l1.setPower(-1);
//        l2.setPower(-1);
//    }
//// turns left
//    public void turnLeft() {
//        r1.setPower(1);
//        r2.setPower(1);
//        l1.setPower(-1);
//        l2.setPower(-1);
//    }
////turns right
//    public void turnRight() {
//        r1.setPower(-1);
//        r2.setPower(-1);
//        l1.setPower(1);
//        l2.setPower(1);
//    }
////strafe left
//    public void goLeft() {
//        r1.setPower(-1);
//        r2.setPower(1);
//        l1.setPower(1);
//        l2.setPower(-1);
//    }
////strafe right
//    public void goRight() {
//        r1.setPower(1);
//        r2.setPower(-1);
//        l1.setPower(-1);
//        l2.setPower(1);
//    }
////look for blue jewel
//    public void lookForBlue() {
//        if (color_sensor.blue() >= 20 && color_sensor.blue() <= 35) {
//        goForward();
//        }
//    }
////look for red jewel
//    public void lookForRed() {
//        if (color_sensor.red() >= 40 && color_sensor.red() <= 60) {
//
//        }
//    }
////look for brown glyph
//    public void findBrownGlyph() {
//        if (color_sensor.alpha() >= 40 && color_sensor.alpha() <= 60) {
//
//        }
//    }
////look for gray glyph
//    public void findGrayGlyph() {
//        if (color_sensor.alpha() >= 80 && color_sensor.alpha() <= 100) {
//
//        }
//    }
}

