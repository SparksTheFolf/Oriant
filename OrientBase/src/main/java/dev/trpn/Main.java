package dev.trpn;

import java.util.List;
import static dev.trpn.Interp.interpret;
public class Main {

public static void main(String[] args) {


    String orientlangCode = "program HelloWorld { function main() { console.print(TESTIBG@!@); } }";
    List<Tokenize> tokens = Lexer.tokenize(orientlangCode);
    Parser.parse(tokens);
    interpret(tokens);

}

    }