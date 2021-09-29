package com.mohammedatif.medium.lombok.data;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanNameTest {

    @Test
    void testDuplicate(){
        HumanName person1 = new HumanName("first", "second");
        HumanName person2 = new HumanName("first", "second");

        List<HumanName> humanNameList = Arrays.asList(
                person1,
                person2
        );
        Set<HumanName> humanNameSet = new HashSet<>(humanNameList);

        assertEquals(2, humanNameList.size());
        assertEquals(2, humanNameSet.size());
    }

}
