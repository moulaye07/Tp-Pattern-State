package com;

import java.awt.*;

public class RedState extends State {
    // Next state for the Black state:
    // On a push(), go to "blue"
    // On a pull(), go to "green"
    public void handlePush (Context c) {
        c.setState(new BlueState());
    }
    public void handlePull(Context c) {
        c.setState (new GreenState());
    }
    @SuppressWarnings ("exports")
    public Color getColor() {return (Color.red); }
}
