package ru.gb.interview.task_1;

public class CreatePerson {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .lastName("afe")
                .firstName("ajfhe")
                .age(16)
                .build();
    }
}
