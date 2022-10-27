package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> integerList = new ArrayList<>();
            for (int i : x) {
                integerList.add(i / divider);
            }
            return integerList;
        };
    }
}
