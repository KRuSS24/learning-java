package Pesochnica;

import java.util.List;

public class ClassMain {

    public static void main(String[] args) {
        List<ErrorCode> ec;
        ErrorCollector errorCollector = new ErrorCollector();
        ec=errorCollector.codesCollector(null);
        System.out.println(ec.size());
    }
}
