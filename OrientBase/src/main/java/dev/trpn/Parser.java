package dev.trpn;

import java.util.List;

public class Parser {
    public static void parse(List<Tokenize> tokens) {
        if (!tokens.get(0).getValue().equals("program")) {
            throw new RuntimeException("Expected 'program' keyword");
        }
        if (!tokens.get(1).getType().equals("WORD")) {
            throw new RuntimeException("Program name must be a word");
        }
        if (!tokens.get(2).getValue().equals("{")) {
            throw new RuntimeException("Expected '{'");
        }
        if (!tokens.get(3).getValue().equals("function")) {
            throw new RuntimeException("Expected 'function' keyword");
        }
    }
}