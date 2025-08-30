package ru.netology.iqa116;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test //#1 - Проверка граничного значения -1
    public void shouldSetStationToMinus1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(-1);

        int expected = 0;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#2 - Проверка граничного значения 0
    public void shouldSetStationToZero() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);

        int expected = 0;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#3 - Проверка граничного значения 1
    public void shouldSetStationToOne() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);

        int expected = 1;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#4 - Проверка граничного значения 8
    public void shouldSetStationToEight() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(8);

        int expected = 8;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#5 - Проверка граничного значения 9
    public void shouldSetStationToNine() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);

        int expected = 9;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#6 - Проверка граничного значения 10
    public void shouldSetStationToTen() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(10);

        int expected = 9;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#7 - Проверка граничного значения -1
    public void shouldSetVolumeToMinus1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#8 - Проверка граничного значения 0
    public void shouldSetVolumeToZero() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#9 - Проверка граничного значения 1
    public void shouldSetVolumeToOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#10 - Проверка граничного значения 99
    public void shouldSetVolumeToNintyNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#11 - Проверка граничного значения 100
    public void shouldSetVolumeToHundred() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#12 - Проверка граничного значения 101
    public void shouldSetVolumeToHundredOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //#13 - Проверка перехода с 0 на 1, при нажатии кнопки next
    public void shouldChangeStationOn0To1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#14 - Проверка перехода с 1 на 2, при нажатии кнопки next
    public void shouldChangeStationOn1To2() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);
        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#15 - Проверка перехода с 8 на 9, при нажатии кнопки next
    public void shouldChangeStationOn8To9() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#16 - Проверка перехода с 9 на 0, при нажатии кнопки next
    public void shouldChangeStationOn9To0() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#17 - Проверка перехода с 0 на 9, при нажатии кнопки prev
    public void shouldChangeStationOn0To9() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#18 - Проверка перехода с 9 на 8, при нажатии кнопки prev
    public void shouldChangeStationOn9To8() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);
        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#19 - Проверка перехода с 2 на 1, при нажатии кнопки prev
    public void shouldChangeStationOn2To1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(2);
        rad.prevStation();

        int expected = 1;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#20 - Проверка перехода с 1 на 0, при нажатии кнопки prev
    public void shouldChangeStationOn1To0() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentFMStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#21 - Проверка добавления громкости кнопкой next с 0 на 1
    public void shouldIncreaseVolumeOn0To1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#22 - Проверка добавления громкости кнопкой next с 1 на 2
    public void shouldIncreaseVolumeOn1To2() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#23 - Проверка добавления громкости кнопкой next с 98 на 99
    public void shouldIncreaseVolumeOn98To99() {

        Radio rad = new Radio();

        rad.setCurrentVolume(98);
        rad.increaseVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#24 - Проверка добавления громкости кнопкой next с 99 на 100
    public void shouldIncreaseVolumeOn99To100() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#25 - Проверка добавления громкости кнопкой next с 100 на 101
    public void shouldIncreaseVolumeOn100To101() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test //#26 - Проверка убавления громкости кнопкой prev с 100 на 99
    public void shouldDecreaseVolumeOn100To99() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#27 - Проверка убавления громкости кнопкой prev с 99 на 98
    public void shouldDecreaseVolumeOn99To98() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.decreaseVolume();

        int expected = 98;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#28 - Проверка убавления громкости кнопкой prev с 2 на 1
    public void shouldDecreaseVolumeOn2To1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.decreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#29 - Проверка убавления громкости кнопкой prev с 1 на 0
    public void shouldDecreaseVolumeOn1To0() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test //#30 - Проверка убавления громкости кнопкой prev с 0 на -1
    public void shouldDecreaseVolumeOn0() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}