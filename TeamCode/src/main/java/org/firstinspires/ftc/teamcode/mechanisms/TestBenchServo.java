package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware. Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBenchServo {
    private Servo servoPos;

    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class, "servo_pos");
        //servoPos.scaleRange(0.5, 1.0);
        //servoPos.setDirection(Servo.Direction.REVERSE);
    }

    public void setServoPos(double position) {
        servoPos.setPosition(position);
    }
}
