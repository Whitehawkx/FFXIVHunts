package com.jonathansteadman.griffithwhitehawkx.ffxivhunts;

import java.util.Date;

public class Hunts {

    private int image;

    private String name;

    private String zone;

    private int respawn;

    private Date timeKilled = null;

    public Hunts(int image, String name, String zone, int respawn) {
        this.image = image;
        this.name = name;
        this.zone = zone;
        this.respawn = respawn;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getZone() {
        return zone;
    }

    public int getRespawn() {
        return respawn;
    }

    @Override
    public String toString() {
        return name;
    }
    /*
    public Date getTimeUntilRespawn() {
        return respawn - Date.;
    }*/

}
