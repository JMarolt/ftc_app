package org.firstinspires.ftc.teamcode.section4;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

@TeleOp (name= "JoystickTest", group="Iterative Opmode")
public class AutonomousOpmode extends LinearOpMode {


    private DcMotor leftFront = null;
    private DcMotor rightRear = null;
    private DcMotor rightFront = null;
    private DcMotor leftRear = null;

    double drive = .25;




    @Override
    public void runOpMode() throws InterruptedException {

        float jX = gamepad1.left_stick_x;
        float jY = -(gamepad1.left_stick_y);

        leftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftRear.setDirection(DcMotor.Direction.REVERSE);
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        rightRear.setDirection(DcMotor.Direction.FORWARD);

        rightRear.setPower(jY/4);
        rightFront.setPower(jY/4);
        leftFront.setPower(jY/4);
        leftRear.setPower(jY/4);


/*
        if(gamepad1.left_stick_x < 0){
            rightRear.setPower((-jX)/4);
            rightFront.setPower(jX/4);
            leftFront.setPower(-(jX)/4);
            leftRear.setPower(jX/4);
        }
        if(gamepad1.left_stick_x > 0){
            rightRear.setPower(jX/4);
            rightFront.setPower(-(jX)/4);
            leftFront.setPower(jX/4);
            leftRear.setPower(-(jX)/4);
        }
        if(gamepad1.left_stick_y < 0){
            rightRear.setPower(-(jY)/4);
            rightFront.setPower(-(jY)/4);
            leftFront.setPower(-(jY)/4);
            leftRear.setPower(-(jY)/4);
        }
        if(gamepad1.left_stick_y > 0){
            rightRear.setPower(jY/4);
            rightFront.setPower(jY/4);
            leftFront.setPower(jY/4);
            leftRear.setPower(jY/4);
        }
*/


    }
}
