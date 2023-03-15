package ru.yandex.practicum.catsgram.exception;

public class IncorrectParameterException extends RuntimeException {
    public String getParameter() {
        return parameter;
    }

    public IncorrectParameterException(String parameter) {
        this.parameter = parameter;
    }

    private final String parameter;
}
