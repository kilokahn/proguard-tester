
package com.kilo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecialServiceImpl implements SpecialService {

    @Override
    public String getSomeText() {
        return "kilo";
    }

    @Override
    public Integer getSomeInt() {
        return 7;
    }

    @Override
    public List<String> getSomeStrings() {
        List<String> strings = new ArrayList<>();
        strings.add("kilo");
        strings.add("kahn");
        return strings;
    }

    @Override
    public List<String> getSomeStringsWithInput( String data) {
        List<String> strings = new ArrayList<>();
        strings.add("kilo");
        strings.add("kahn");
        strings.add(data);
        return strings;
    }

    @Override
    public List<String> getSomeStringsWithDateInput(
             Date date) {
        List<String> strings = new ArrayList<>();
        strings.add("kilo");
        strings.add("kahn");
        strings.add(date.toString());
        return strings;
    }

    @Override
    public List<String> getSomeStringsWithStringInputs(
             List<String> ids) {
        List<String> strings = new ArrayList<>();
        strings.add("kilo");
        strings.add("kahn");
        for (String id : ids) {
            strings.add(id.toString());
        }
        return strings;
    }

    @Override
    public List<Integer> getSomeIntsWithIntInputs(
             List<Integer> ids) {
        List<Integer> ints = new ArrayList<>();
        ints.add("kilo".hashCode());
        ints.add("kahn".hashCode());
        for (Integer id : ids) {
            ints.add(id);
        }
        return ints;
    }

    @Override
    public List<SpecialObject> getSomeComplexObjectsWithIntInputs(
             List<Integer> ids) {
        List<SpecialObject> complexObjects = new ArrayList<>();
        complexObjects.add(new SpecialObject("kilo", 1, new Date()));
        complexObjects.add(new SpecialObject("kahn", 2, new Date()));
        for (Integer id : ids) {
            complexObjects
                    .add(new SpecialObject(id.toString(), id, new Date()));
        }
        return complexObjects;
    }

    @Override
    public List<SpecialObject> getSomeComplexObjectsWithMultipleInputs(
             String name,  Integer value) {
        List<SpecialObject> complexObjects = new ArrayList<>();
        complexObjects.add(new SpecialObject("kilo", 1, new Date()));
        complexObjects.add(new SpecialObject("kahn", 2, new Date()));
        complexObjects.add(new SpecialObject(name, value, new Date()));
        return complexObjects;

    }

    @Override
    public List<SpecialObject> getSomeComplexObjectsWithDateInput(
             List<Integer> ids,  Date date) {
        List<SpecialObject> complexObjects = new ArrayList<>();
        complexObjects.add(new SpecialObject("kilo", 1, date));
        complexObjects.add(new SpecialObject("kahn", 2, date));
        for (Integer id : ids) {
            complexObjects.add(new SpecialObject(id.toString(), id, date));
        }
        return complexObjects;
    }

    @Override
    public List<SpecialObject> getSomeComplexObjectsWithComplexInput(
             List<Integer> ids,
             Date date,
             SpecialObject input) {
        List<SpecialObject> complexObjects = new ArrayList<>();
        complexObjects.add(new SpecialObject("kilo", 1, date));
        complexObjects.add(new SpecialObject("kahn", 2, date));
        for (Integer id : ids) {
            complexObjects.add(new SpecialObject(id.toString(), id, date));
        }
        complexObjects.add(input);
        return complexObjects;
    }
}
