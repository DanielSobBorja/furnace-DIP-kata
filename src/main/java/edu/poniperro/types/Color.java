package edu.poniperro.types;

public enum Color {
    RESET("\u001B[0m"), RED("\u001B[31m"), BLUE("\033[0;34m"), GREEN("\u001B[32m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
