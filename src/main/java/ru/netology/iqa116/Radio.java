package ru.netology.iqa116;

public class Radio {
    private int countStation = 10;
    private int minStation = 0;
    private int maxStation = countStation - 1;
    private int currentFMStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentFMStation() {
        return currentFMStation;
    }

    public int setCurrentFMStation(int currentFMStation) {
        if (currentFMStation < 0) {
            this.currentFMStation = minStation;
            return this.currentFMStation;
        }
        if (currentFMStation > 9) {
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
        if (currentVolume < 0) {
            this.currentVolume = minVolume;
            return this.currentVolume;
        }
        if (currentVolume > 100) {
            this.currentVolume = maxVolume;
            return this.currentVolume;
        }
        this.currentVolume = currentVolume;
        return this.currentVolume;
    }

    public void nextStation() {
        if (currentFMStation != 9) {
            currentFMStation++;
        } else {
            currentFMStation = 0;
        }
    }

    public void prevStation() {
        if (currentFMStation != 0) {
            currentFMStation--;
        } else {
            currentFMStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
