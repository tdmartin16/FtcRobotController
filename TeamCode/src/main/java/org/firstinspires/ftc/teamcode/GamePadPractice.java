package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2;
        double  diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Left Y", speedForward);
        telemetry.addData("A", gamepad1.a);
        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", gamepad1.right_stick_y);
        telemetry.addData("B",gamepad1.b);
        telemetry.addData("X Diff", diffXJoysticks);
        telemetry.addData("Sum Triggers", sumTriggers);
    }
}
