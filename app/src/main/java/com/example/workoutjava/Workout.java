package com.example.workoutjava;

public class Workout {
    private String name;
    private String description;
    public static final Workout[] workouts = {
            new Workout("Покупка в магазине",
                    "Тетради\nБлокнот\nРучки"),
            new Workout("Стоматолог",
                    "Записаться к стоматологу\nВылечить зубы"),
            new Workout("Выставка",
                    "Приобрести билет\nПосетить выставку")

    };

    // В объекте Workout хранится имя и описание
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
