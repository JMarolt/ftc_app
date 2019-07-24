/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode.section2;


//Follow the instructions found here: http://bit.ly/FTC_RoboMove


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic: CJ", group="Iterative Opmode")
    public class TeleopMoveMode extends OpMode {
        private DcMotor leftFront = null;
        private DcMotor rightRear = null;
        private DcMotor rightFront = null;
        private DcMotor leftRear = null;




    @Override
        public void init() {

            telemetry.addData("Status", "Initializing");
            leftFront = hardwareMap.get(DcMotor.class, "leftFront");
            rightRear = hardwareMap.get(DcMotor.class, "rightRear");
            leftFront.setDirection(DcMotor.Direction.REVERSE);
            rightRear.setDirection(DcMotor.Direction.FORWARD);
            // while the power of the wheels is 0, brake
            leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            rightRear.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            telemetry.addData("Status", "Initialized");


        }

        public void loop(){

            double drive;
            double driveRL;
            // This driving mode uses up on the d-pad to go forward, and down on the d-pad to go backward. The ‘drive’ variable is set based on the corresponding inputs on the d-pad.


            if (gamepad1.dpad_up) {
                drive = 1.0;
            } else if (gamepad1.dpad_down) {
                drive = -1.0;
            } else {
                drive = 0.0;
            }

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



        }

        public void stop(){
            // stop all motion
            leftFront.setPower(0);
            rightRear.setPower(0);
            rightFront.setPower(0);
            leftRear.setPower(0);

        }

}
