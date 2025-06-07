package br.com.matheussantos.util;

import java.util.Scanner;

public class InputReader {
    Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public Double readOptionalDouble() {
        this.scanner.nextLine();
        String input = this.scanner.nextLine();

        if (input.isEmpty()) {
            return null;
        }

        return Double.parseDouble(input);
    }
}
