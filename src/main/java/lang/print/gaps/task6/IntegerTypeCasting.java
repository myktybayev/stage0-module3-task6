package lang.print.gaps.task6;

import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerTypeCasting {
    public static void main(String[] args) {

        long first = 1000L;
        int second = (int)first;

        System.out.println(first);
        System.out.println(second);

    }
}
