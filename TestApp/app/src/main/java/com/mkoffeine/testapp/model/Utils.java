package com.mkoffeine.testapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mKoffeine on 04.08.2016.
 */
public class Utils {
    public static List<String> getInfoFromPersonList(List<Person> personList) {
        List<String> list = new ArrayList<>(personList.size());
        for (Person person : personList) {
            String info = person.getName();
            list.add(info);
        }
        return list;
    }
}
