package org.example.model.enums;

public enum LampType {
    NORMAL(true),
    NEON(false),
    LAVA(false);

    private boolean isOn;
    LampType(boolean isOn) {
        this.isOn=isOn;
    }

    public boolean isOn() {
        return isOn;
    }
    }
