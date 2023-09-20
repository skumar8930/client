package model;

import com.sandeep.StudentResponse;
import net.badata.protobuf.converter.annotation.ProtoClass;
import net.badata.protobuf.converter.annotation.ProtoField;

@ProtoClass(StudentResponse.class)
public class Student {
    @ProtoField
    private String name;
    @ProtoField
    private Integer age;
    @ProtoField
    private String branch;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
