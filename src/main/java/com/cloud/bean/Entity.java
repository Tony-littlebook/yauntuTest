package com.cloud.bean;

import java.util.List;
import com.google.common.collect.Lists;

public class Entity {
    public String id;
    public String attribute;
    public Entity(String id, String attribute){
        this.id = id;
        this.attribute = attribute;
    }

    public String getId(){
        return this.id;
    }
    public String getAttribute(){
        return attribute;
    }

    public static List<Entity> getEntityList(){
        Entity entity1 = new Entity("food","qingcai");
        Entity entity2 = new Entity("food", "shuiguo");
        Entity entity3 = new Entity("food", "mitao");
        Entity entity4 = new Entity("water", "baikaishui");
        Entity entity5 = new Entity("water", "kele");
        List<Entity> entityList = Lists.newArrayList(entity1, entity2, entity3, entity4, entity5);
        return entityList;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id='" + id + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
