package ru.netology.iqa116;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldRadio() {

        Radio rad = new Radio(10);

        rad.setCurrentFMStation(10);

        Assertions.assertEquals(9, rad.getCurrentFMStation());
    }

    @Test //#1 - Проверка граничного значения -1
    public void shouldSetStationToMinus1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(-1);

        Assertions.assertEquals(0, rad.getCurrentFMStation());
    }

    @Test //#2 - Проверка граничного значения 0
    public void shouldSetStationToZero() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);

        Assertions.assertEquals(0, rad.getCurrentFMStation());
    }

    @Test //#3 - Проверка граничного значения 1
    public void shouldSetStationToOne() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);

        Assertions.assertEquals(1, rad.getCurrentFMStation());
    }

    @Test //#4 - Проверка граничного значения 8
    public void shouldSetStationToEight() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(8);

        Assertions.assertEquals(8, rad.getCurrentFMStation());
    }

    @Test //#5 - Проверка граничного значения 9
    public void shouldSetStationToNine() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);

        Assertions.assertEquals(9, rad.getCurrentFMStation());
    }

    @Test //#6 - Проверка граничного значения 10
    public void shouldSetStationToTen() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(10);

        Assertions.assertEquals(9, rad.getCurrentFMStation());
    }

    @Test //#7 - Проверка граничного значения -1
    public void shouldSetVolumeToMinus1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test //#8 - Проверка граничного значения 0
    public void shouldSetVolumeToZero() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test //#9 - Проверка граничного значения 1
    public void shouldSetVolumeToOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        Assertions.assertEquals(1, rad.getCurrentVolume());
    }

    @Test //#10 - Проверка граничного значения 99
    public void shouldSetVolumeToNintyNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        Assertions.assertEquals(99, rad.getCurrentVolume());
    }

    @Test //#11 - Проверка граничного значения 100
    public void shouldSetVolumeToHundred() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test //#12 - Проверка граничного значения 101
    public void shouldSetVolumeToHundredOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test //#13 - Проверка перехода с 0 на 1, при нажатии кнопки next
    public void shouldChangeStationOn0To1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);
        rad.nextStation();

        Assertions.assertEquals(1, rad.getCurrentFMStation());

    }

    @Test //#14 - Проверка перехода с 1 на 2, при нажатии кнопки next
    public void shouldChangeStationOn1To2() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);
        rad.nextStation();

        Assertions.assertEquals(2, rad.getCurrentFMStation());

    }

    @Test //#15 - Проверка перехода с 8 на 9, при нажатии кнопки next
    public void shouldChangeStationOn8To9() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(8);
        rad.nextStation();

        Assertions.assertEquals(9, rad.getCurrentFMStation());

    }

    @Test //#16 - Проверка перехода с 9 на 0, при нажатии кнопки next
    public void shouldChangeStationOn9To0() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);
        rad.nextStation();

        Assertions.assertEquals(0, rad.getCurrentFMStation());

    }

    @Test //#17 - Проверка перехода с 0 на 9, при нажатии кнопки prev
    public void shouldChangeStationOn0To9() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(0);
        rad.prevStation();

        Assertions.assertEquals(9, rad.getCurrentFMStation());

    }

    @Test //#18 - Проверка перехода с 9 на 8, при нажатии кнопки prev
    public void shouldChangeStationOn9To8() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(9);
        rad.prevStation();

        Assertions.assertEquals(8, rad.getCurrentFMStation());

    }

    @Test //#19 - Проверка перехода с 2 на 1, при нажатии кнопки prev
    public void shouldChangeStationOn2To1() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(2);
        rad.prevStation();

        Assertions.assertEquals(1, rad.getCurrentFMStation());

    }

    @Test //#20 - Проверка перехода с 1 на 0, при нажатии кнопки prev
    public void shouldChangeStationOn1To0() {

        Radio rad = new Radio();

        rad.setCurrentFMStation(1);
        rad.prevStation();

        Assertions.assertEquals(0, rad.getCurrentFMStation());

    }

    @Test //#21 - Проверка добавления громкости кнопкой next с 0 на 1
    public void shouldIncreaseVolumeOn0To1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        Assertions.assertEquals(1, rad.getCurrentVolume());

    }

    @Test //#22 - Проверка добавления громкости кнопкой next с 1 на 2
    public void shouldIncreaseVolumeOn1To2() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.increaseVolume();

        Assertions.assertEquals(2, rad.getCurrentVolume());

    }

    @Test //#23 - Проверка добавления громкости кнопкой next с 98 на 99
    public void shouldIncreaseVolumeOn98To99() {

        Radio rad = new Radio();

        rad.setCurrentVolume(98);
        rad.increaseVolume();

        Assertions.assertEquals(99, rad.getCurrentVolume());

    }

    @Test //#24 - Проверка добавления громкости кнопкой next с 99 на 100
    public void shouldIncreaseVolumeOn99To100() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());

    }

    @Test //#25 - Проверка добавления громкости кнопкой next с 100 на 101
    public void shouldIncreaseVolumeOn100To101() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());

    }


    @Test //#26 - Проверка убавления громкости кнопкой prev с 100 на 99
    public void shouldDecreaseVolumeOn100To99() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        Assertions.assertEquals(99, rad.getCurrentVolume());

    }

    @Test //#27 - Проверка убавления громкости кнопкой prev с 99 на 98
    public void shouldDecreaseVolumeOn99To98() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.decreaseVolume();

        Assertions.assertEquals(98, rad.getCurrentVolume());

    }

    @Test //#28 - Проверка убавления громкости кнопкой prev с 2 на 1
    public void shouldDecreaseVolumeOn2To1() {

        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.decreaseVolume();

        Assertions.assertEquals(1, rad.getCurrentVolume());

    }

    @Test //#29 - Проверка убавления громкости кнопкой prev с 1 на 0
    public void shouldDecreaseVolumeOn1To0() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());

    }

    @Test //#30 - Проверка убавления громкости кнопкой prev с 0 на -1
    public void shouldDecreaseVolumeOn0() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());

    }

}