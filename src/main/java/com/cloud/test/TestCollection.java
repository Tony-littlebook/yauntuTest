package com.cloud.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollection {
    public static void main(String[] args) {
        List<Entity> EntityList = new ArrayList<Entity>();
        for(int i = 0; i < 10; ++i){
            EntityList.add(new Entity(""+i, ""+i));
        }
        List<String> EntityListAttributes = EntityList.stream().map(Entity::getAttribute).collect(Collectors.toList());
        System.out.println(EntityListAttributes);

        Map<String, List<Entity>> entityMap = Entity.getEntityList().stream().collect(Collectors.groupingBy(Entity::getId));
        System.out.println(entityMap);

    }

}
