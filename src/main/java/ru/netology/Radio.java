package ru.netology;

public class Radio {
    private int soundVolume = 0;
    private int radioСhannel = 0;

    public int getRadioСhannel() {
        return radioСhannel;
    }

    public void setRadioСhannel(int channel) {
        if (channel < 0) {
            radioСhannel = 0;
        } else if (channel > 9) {
            radioСhannel = 9;
        } else {
            radioСhannel = channel;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int volume) {
        if (volume < 0) {
            soundVolume = 0;
        } else if (volume > 100) {
            soundVolume = 100;
        } else {
            soundVolume = volume;
        }
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void nextChannel() {
        if (radioСhannel < 9) {
            radioСhannel = radioСhannel + 1;
        } else {
            radioСhannel = 0;
        }
    }

    public void prevChannel() {
        if (radioСhannel > 0) {
            radioСhannel = radioСhannel - 1;
        } else {
            radioСhannel = 9;
        }
    }
}
