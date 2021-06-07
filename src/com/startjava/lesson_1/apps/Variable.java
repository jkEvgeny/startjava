package com.startjava.lesson_1.apps;
public class Variable {
    public static void main(String[] args) {
        byte cpuCount = 2;
        short cpuType = 5;
        int ram = 8;
        long totalDiskSpace = 208;
        float freeDiskSpace = 14.2;
        double cpuFrequency = 2.11;
        char intelCore = 'i';
        boolean isClear = false;

        System.out.println("Values: " + cpuCount + " " +
                cpuType + " " +
                ram + " " +
                totalDiskSpace + " " +
                freeDiskSpace + " " +
                cpuFrequency + " " +
                intelCore + " " +
                isClear);
    }
}