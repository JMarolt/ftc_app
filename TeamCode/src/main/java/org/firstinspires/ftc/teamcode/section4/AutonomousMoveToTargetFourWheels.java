package org.firstinspires.ftc.teamcode.section4;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;

@Autonomous(name="Basic: Move to Target Four Wheels", group="Linear Opmode")

public class AutonomousMoveToTargetFourWheels extends LinearOpMode {

    private DcMotor leftFront = null;
    private DcMotor rightRear = null;
    private DcMotor rightFront = null;
    private DcMotor leftRear = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // Put initialization code between here and "waitforStart()"
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");

        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        leftRear.setDirection(DcMotor.Direction.REVERSE);
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        rightRear.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();


            leftFront.setTargetPosition((int) ((((36 / (4 * Math.PI)) * 573.6))/Math.sqrt(2.0)));
            leftRear.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
            rightFront.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
            rightRear.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));

        rightFront.setPower(.2);
        rightRear.setPower(.2);
        leftFront.setPower(.2);
        leftRear.setPower(.2);

        while(leftFront.isBusy() || leftRear.isBusy() || rightFront.isBusy() || rightRear.isBusy()) {
        }

        rightFront.setPower(-.2);
        rightRear.setPower(.2);
        leftFront.setPower(.2);
        leftRear.setPower(-.2);

        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        leftFront.setTargetPosition((int) ((((24 / (4 * Math.PI)) * 573.6))/Math.sqrt(2.0)));
        leftRear.setTargetPosition(-(int) (((24 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
        rightFront.setTargetPosition(-(int) (((24 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
        rightRear.setTargetPosition((int) (((24 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));

        while(leftFront.isBusy() || leftRear.isBusy() || rightFront.isBusy() || rightRear.isBusy()) {
        }

        rightFront.setPower(.2);
        rightRear.setPower(.2);
        leftFront.setPower(.2);
        leftRear.setPower(.2);

        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightRear.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        leftFront.setTargetPosition((int) ((((36 / (4 * Math.PI)) * 573.6))/Math.sqrt(2.0)));
        leftRear.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
        rightFront.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));
        rightRear.setTargetPosition((int) (((36 / (4 * Math.PI)) * 573.6)/Math.sqrt(2.0)));

        while(leftFront.isBusy() || leftRear.isBusy() || rightFront.isBusy() || rightRear.isBusy()) {
        }


    }

}
