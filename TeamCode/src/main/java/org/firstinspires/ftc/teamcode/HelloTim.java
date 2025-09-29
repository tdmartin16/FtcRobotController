package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloTim extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Tim M");
    }

    @Override
    public void loop() {

    }
}
