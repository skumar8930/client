package model;

import com.sandeep.StudentRequest;
import net.badata.protobuf.converter.annotation.ProtoClass;
import net.badata.protobuf.converter.annotation.ProtoField;

@ProtoClass(StudentRequest.class)// define proto class here

public class StudentReq {
    @ProtoField
    Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
