package com.baeldung.fileparser;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferedReaderExample {

    protected static ArrayList<String> generateArrayListFromFile(String filename) throws IOException {

        ArrayList<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while (br.ready()) {
                result.add(BoundedLineReader.readLine(br, 5_000_000));
            }
            return result;
        }

    }

}
