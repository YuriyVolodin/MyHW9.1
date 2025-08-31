package ru.netology.iqa116;

public class Radio {
    private int countStation = 10;
    private int minStation = 0;
    private int maxStation = countStation - 1;
    private int currentFMStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int countStation) {
        this.countStation = countStation;
        maxStation = countStation - 1;

    }

    public int getCurrentFMStation() {
        return currentFMStation;
    }

    public int setCurrentFMStation(int currentFMStation) {
        if (currentFMStation < minStation) {
            this.currentFMStation = minStation;
            return this.currentFMStation;
        }
        if (currentFMStation > maxStation) {
            this.currentFMStation = maxStation;
            return this.currentFMStation;
        }
        this.currentFMStation = currentFMStation;
        return currentFMStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return this.currentVolume;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return this.currentVolume;
        }
        this.currentVolume = currentVolume;
        return this.currentVolume;
    }

    public void nextStation() {
        if (currentFMStation != maxStation) {
            currentFMStation++;
        } else {
            currentFMStation = minStation;
        }
    }

    public void prevStation() {
        if (currentFMStation != minStation) {
            currentFMStation--;
        } else {
            currentFMStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}
