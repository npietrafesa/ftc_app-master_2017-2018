package org.firstinspires.ftc.teamcode;

/**
 * Created by nikki on 12/9/2017.
 */
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
@Disabled
@TeleOp(name = "Servos", group = "Linear Opmode")
public class WillMode extends OpMode{


    /**
     * Created by wgtra on 11/10/2017.
     */

    Servo servo1;
    Servo servo2;
    Servo servo3;
    Servo servo4;
    DcMotor FrontLeftWheel;
    DcMotor FrontRightWheel;
    DcMotor BackLeftWheel;
    DcMotor BackRightWheel;
    DcMotor Slider;
    DcMotor LinearSlider;
    double FrontLeftWheelPower;
    double FrontRightWheelPower;
    double BackLeftWheelPower;
    double BackRightWheelPower;
    double LinearSliderPower;
    double SliderPower;
    double ServoPosition1 = 0.0;
    double ServoPosition2 = 1.0;
    double ServoPosition3 = 0.0;
    double ServoPosition4 = 0.0;
    @Override

    public void init() {
        servo1 = hardwareMap.servo.get("servo1");
        servo2 = hardwareMap.servo.get("servo2");
        //  servo3 = hardwareMap.servo.get("servo3");
        //  servo4 = hardwareMap.servo.get("servo4");
        FrontLeftWheel = hardwareMap.dcMotor.get("front left");
        FrontRightWheel = hardwareMap.dcMotor.get("front right");
        BackLeftWheel = hardwareMap.dcMotor.get("back left");
        BackRightWheel = hardwareMap.dcMotor.get("back right");
        LinearSlider = hardwareMap.dcMotor.get("linear slide");
        // Slider = hardwareMap.dcMotor.get("Slider");
        FrontRightWheel.setDirection(DcMotor.Direction.FORWARD);
        FrontLeftWheel.setDirection(DcMotor.Direction.FORWARD);
        BackLeftWheel.setDirection(DcMotor.Direction.REVERSE);
        BackRightWheel.setDirection(DcMotor.Direction.REVERSE);


    }

    public void start() {


    }

    public void loop() {

        FrontLeftWheelPower = gamepad1.left_stick_y;
        BackLeftWheelPower = gamepad1.left_stick_y;

        FrontRightWheelPower = gamepad1.right_stick_y;
        BackRightWheelPower = gamepad1.right_stick_y;

        LinearSliderPower = gamepad2.right_stick_y;

//        if (gamepad1.left_stick_x > 0){
//            FrontLeftWheelPower = -1;
//            BackLeftWheelPower = 1;
//            FrontRightWheelPower = 1;
//            BackRightWheelPower = -1;
//        } else if(gamepad1.left_stick_x < 0){
//            FrontRightWheelPower = -1;
//            BackRightWheelPower = 1;
//            FrontLeftWheelPower = 1;
//            BackLeftWheelPower = -1;
//        }



        FrontLeftWheel.setPower(FrontLeftWheelPower);
        FrontRightWheel.setPower(FrontRightWheelPower);
        BackLeftWheel.setPower(BackLeftWheelPower);
        BackRightWheel.setPower(BackRightWheelPower);
        LinearSlider.setPower(LinearSliderPower);
    /*  if (gamepad1.dpad_left){
          SliderPower = 1;
      } else{
          SliderPower = 0;}
      if (gamepad2.dpad_right) {
          SliderPower = -1;
      } else{
              SliderPower = 0;
          } */


        if (gamepad2.left_stick_y > 0){
            servo1.setPosition(1);
            servo2.setPosition(0);
        } else if(gamepad2.left_stick_y < 0){
            servo1.setPosition(.5);
            servo2.setPosition(.5);
        }
        if (gamepad2.a) {
            servo1.setPosition(0);
            servo2.setPosition(1);
        }
        if (gamepad2.b) {
            servo1.setPosition(1);
            servo2.setPosition(0);
        }

      /*if (gamepad2.b) {
          servo3.setPosition(.6);
          servo4.setPosition(.4);
      } else {
              servo3.setPosition(0.0);
              servo4.setPosition(0.0);
          } */
        telemetry.addData("Servo 1 Position", servo1.getPosition());
        telemetry.addData("Servo 2 Position", servo2.getPosition());
        // telemetry.addData("Servo 3 Position", servo3.getPosition());
        // telemetry.addData("Servo 4 Position", servo4.getPosition());
        telemetry.addData("Front Left Motor", FrontLeftWheel.getPower());
        telemetry.addData("Back Left Motor", BackLeftWheel.getPower());
        telemetry.addData("Front Right Motor", FrontRightWheel.getPower());
        telemetry.addData("Back Left Motor", BackRightWheel.getPower());
        telemetry.addData("Linear Slider", LinearSlider.getPower());
    }
}


