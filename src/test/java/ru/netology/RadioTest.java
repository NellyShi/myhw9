package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(20);
        radio.decreaseVolume();
        int expected = 19;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseChannelTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(5);
        radio.nextChannel();
        int expected = 6;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseChannelTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(5);
        radio.prevChannel();
        int expected = 4;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseChannelOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseChannelOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioChannelTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(6);
        int expected = 6;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioChannelOutOfRangeRightTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(10);
        int expected = 9;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setRadioChannelOutOfRangeLeftTest() {
        Radio radio = new Radio();
        radio.setRadioСhannel(-1);
        int expected = 0;
        int actual = radio.getRadioСhannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(6);
        int expected = 6;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSoundVolumeOutOfRangeRightTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setSoundVolumeOutOfRangeLeftTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
