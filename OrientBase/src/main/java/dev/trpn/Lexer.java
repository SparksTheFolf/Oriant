package dev.trpn;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    public static List<Tokenize> tokenize(String program) {
        List<Tokenize> tokens = new ArrayList<>();
        String[] parts = program.split("\\s+");
        for (String part : parts) {
            tokens.add(new Tokenize("WORD", part));
        }
        return tokens;
    }
}
