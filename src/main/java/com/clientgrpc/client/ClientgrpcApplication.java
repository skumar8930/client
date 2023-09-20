package com.clientgrpc.client;

import com.sandeep.StudentRequest;
import com.sandeep.StudentResponse;
import com.sandeep.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import model.Student;
import model.StudentReq;
import net.badata.protobuf.converter.Converter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientgrpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientgrpcApplication.class, args);
		sendRequestToServer();
	}


	public static void sendRequestToServer() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
				.usePlaintext()
				.build();
		StudentServiceGrpc.StudentServiceBlockingStub blockingStub  = StudentServiceGrpc.newBlockingStub(managedChannel);
		StudentRequest studentRequest = StudentRequest.newBuilder().setId(1).build();
		StudentReq req= new StudentReq();req.setId(1);

	StudentResponse respons =blockingStub.getStudent(Converter.create().toProtobuf(StudentRequest.class,req));
	Student student= Converter.create().toDomain(Student.class,respons);
	System.out.println("Response received "+respons.getName());


	}
}