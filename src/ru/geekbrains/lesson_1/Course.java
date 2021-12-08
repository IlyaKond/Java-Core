package ru.geekbrains.lesson_1;

public class Course {
    private int distance;
    static final int distance_FAIL = 0;
    static final int distance_OK = 1;
    static final int distance_NONE = -1;

    public Course(int distance) {
        this.distance = distance;
    }

}
