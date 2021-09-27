package practice;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ReferenceNumber {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for(int i = 1; i<100;i++){
            values.add(i);
        }
        values.stream().forEach(i -> {
            System.out.println("hi");
        });
    }
}
