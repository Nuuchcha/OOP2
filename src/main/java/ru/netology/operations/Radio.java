package ru.netology.operations;

public class Radio {
    private int numberStation;
    private int currentVolume;
    private int currentStation;

    public Radio() {
        this.numberStation = 9;
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // Переключение на следующую станцию
    public void nextStationNumber() {
        if (currentStation == numberStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Переключение на предыдущую станцию
    public void prevStationNumber() {
        if (currentStation == 0) {
            currentStation = numberStation;
        } else {
            currentStation--;
        }
    }

    // Установка cтанции по номеру
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > numberStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    // Увеличение текущей громкости на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Уменьшение текущей громкости на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }
}
