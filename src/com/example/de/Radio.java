package com.example.de;

class Radio {
    private boolean radioState;
    private int volume;

    void volumeUp() {
        if (volume <= 99) {
            volume += 1;
        } else {
            System.out.println("Bereits auf höchster Stufe");
        }
    }

    void volumeDown() {
        if (volume >= 1) {
            volume -= 1;
        } else {
            System.out.println("Bereits auf niedrigster Stufe");
        }
    }

    void on() {
        radioState = true;
        getState();
    }

    void off() {
        radioState = false;
        getState();
    }

    private String getState() {
        String state;
        if (radioState) {
            state = "an";
        } else {
            state = "aus";
        }
        return state;
    }

    public String toString() {

        return ("Radio " + getState() + ": " + "volume: " + volume);

    }
}
