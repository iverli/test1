package com.iverli.test.pojo;

import com.iverli.test.ServerConstant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
@Document(collection = ServerConstant.MONGO_COLLECTION_USER_PO)
public class Users implements Serializable {
    @Id
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Users(){

    }
}
