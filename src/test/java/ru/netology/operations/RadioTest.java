package ru.netology.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberStation() {
        Radio station = new Radio();

        station.setCurrentStation(7);
        int expected = 7;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void switchMaxStationOnZero() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStationNumber();
        int expected = 0;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void switchZeroStationOnMax() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.prevStationNumber();
        int expected = 9;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetAboveMaxNumberStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void shouldNotSetBelowMinNumberStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void shouldNextNumberStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.nextStationNumber();
        int expected = 6;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void shouldPrevNumberStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.prevStationNumber();
        int expected = 4;
        Assertions.assertEquals(expected, station.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(20);

        station.increaseVolume();
        int expected = 21;
        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(20);

        station.decreaseVolume();
        int expected = 19;
        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(0);

        station.decreaseVolume();
        int expected = 0;
        Assertions.assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(100);

        station.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, station.getCurrentVolume());
    }
}
