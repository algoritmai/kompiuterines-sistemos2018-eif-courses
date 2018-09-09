package com.airhacks.entity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyVisibilityStrategy;

/**
 *
 * @author Marius
 */
public class Classroom {
    private int number;
    private String area;

    public Classroom(int number, String area) {
        this.number = number;
        this.area = area;
    }
    public String toJson(){
        JsonbConfig config = new JsonbConfig()
                .withPropertyVisibilityStrategy(new PropertyVisibilityStrategy() {
            @Override
            public boolean isVisible(Field field) {
                return true;          
            }

            @Override
            public boolean isVisible(Method method) {
                return false;
           }
        });
        
        List<Classroom> classrooms = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            classrooms.add(new Classroom(104 * i / 2, "https://picsum.photos/"+200+"/"+i));
        }
      
        return JsonbBuilder.
                newBuilder().
                withConfig(config).
                build().
                toJson(classrooms);
    }
    
    
}
