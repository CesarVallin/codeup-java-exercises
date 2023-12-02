package codeWars;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {

        List<String> response = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).matches("[a-z]+")) {
                response.add(i + 1 + ": " + lines.get(i) );
            } else {
                response.add(i + 1 + ": " + lines.get(i));
            }
        }

        return response;


    }

}
