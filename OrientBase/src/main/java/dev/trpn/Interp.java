package dev.trpn;

import java.util.List;

public class Interp {
    public static void main(String[] args) {
        String orientlangCode = "program HelloWorld { function main() { console.print(\"Hello, World!\"); } }";
        List<Tokenize> tokens = Lexer.tokenize(orientlangCode);
        Parser.parse(tokens);
        interpret(tokens);
    }

    public static void interpret(List<Tokenize> tokens) {
        for (Tokenize token : tokens) {
            if (token.getType().equals("WORD") && token.getValue().startsWith("console.print")) {
                System.out.println(token.getValue().substring(14));
            }
        }
    }
}
