package com.progressoft;

import java.util.*;

public class InsertionOrderSorter {
    private final Map<String, Set<String>> tables;
    public InsertionOrderSorter(Map<String, Set<String>> tables) {
        this.tables = tables;
    }
    public List<String> calculateInsertionOrder() {
        //TODO implement this function to make unit tests pass
        Set<String> orderedSet = new LinkedHashSet<>();
        Set<String> keys = new LinkedHashSet<>();
        Set<String> values = new LinkedHashSet<>();
        for(Map.Entry<String, Set<String>> entry : tables.entrySet()){
            if(entry.getValue().isEmpty()){
                orderedSet.add(entry.getKey());
            }else if(!entry.getValue().isEmpty()){
                keys.add(entry.getKey());
                values.addAll(entry.getValue());
            }
        }
        orderedSet.addAll(values);
        orderedSet.addAll(keys);
        return new ArrayList<>(orderedSet);
    }
}