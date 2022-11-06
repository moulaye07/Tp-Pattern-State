package com;

import java.awt.*;

public class BlueState extends State {
    // Next state for the Black state:
    // On a push(), go to "green"
    // On a pull(), go to "red"
    public void handlePush (Context c) {
        c.setState(new GreenState());
    }
    public void handlePull (Context c) {
        c.setState(new BlackState());
    }
    @SuppressWarnings ("exports")
    public Color getColor() {return (Color.blue); }
}
