package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }

    public void loop() {

    }
}
