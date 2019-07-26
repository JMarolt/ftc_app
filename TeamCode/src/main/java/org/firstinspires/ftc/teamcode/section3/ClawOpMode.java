package org.firstinspires.ftc.teamcode.section3;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;

@TeleOp(name="Basic: CJ2", group="Iterative Opmode")
public class ClawOpMode extends OpMode {

    private Servo claw = null;
    double position = 0.0;
    double degree = 90.0;
    double add = .01;
    double temp;



    private CRServo arm = null;

    private DcMotor leftFront = null;
    private DcMotor rightRear = null;
    private DcMotor rightFront = null;
    private DcMotor leftRear = null;


    public void init(){

        telemetry.addData("Status", "Initializing");

        claw = hardwareMap.get(Servo.class, "Claw");
        arm = hardwareMap.get(CRServo.class, "arm");

        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightRear.setDirection(DcMotor.Direction.FORWARD);
        // while the power of the wheels is 0, brake
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        leftRear.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        // while the power of the wheels is 0, brake
        leftRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.addData("Status", "Initialized");


    }

    public void loop(){

        claw.setPosition(position);

        if(gamepad1.b && position < 1){
            position += add;
        }

        if(gamepad1.x && position > 0){
            position -= add;
        }

        temp = position * degree;
        degree = degree + temp;


        telemetry.addData("Claw Position: ", position);

        if(gamepad1.y){
            arm.setPower(.1);
        }else if(gamepad1.a){
            arm.setPower(-.1);
        }else{
            arm.setPower(0);
        }


/*
        double drive;
        double driveRL;

        //check for up and down DPAD
        if (gamepad1.dpad_up) {
            drive = 1.0;
        } else if (gamepad1.dpad_down) {
            drive = -1.0;
        } else {
            drive = 0.0;
        }

        //check for left and right DPAD
        if (gamepad1.dpad_right) {
            driveRL = 1.0;
        } else if (gamepad1.dpad_left) {
            driveRL = -1.0;
        } else {
            driveRL = 0.0;
        }



        // Send calculated power to wheels
        leftFront.setPower(drive);
        rightRear.setPower(drive);
        rightFront.setPower(driveRL);
        leftRear.setPower(driveRL);
*/

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

        rightRear.setPower(jX/4);
        rightFront.setPower(-(jX)/4);
        leftFront.setPower(jX/4);
        leftRear.setPower(-(jX)/4);



    }

    public void stop(){
        // stop all motion
        leftFront.setPower(0);
        rightRear.setPower(0);
        rightFront.setPower(0);
        leftRear.setPower(0);

    }


}
