package dev.trpn;

public class Tokenize {
    private String type;
    private String value;

    public void Token(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Tokenize(String type, String value) {
        this.type = type;
        this.value = value;

    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
