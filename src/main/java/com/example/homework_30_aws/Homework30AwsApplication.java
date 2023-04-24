package com.example.homework_30_aws;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@RequiredArgsConstructor
public class Homework30AwsApplication implements CommandLineRunner {
    private final AmazonS3 s3;

    public static void main(String[] args) {
        SpringApplication.run(Homework30AwsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //s3.createBucket("java-bucket-hillel");
        //s3.putObject("java-bucket-hillel","test",new File("test.txt"));
        s3.listBuckets().forEach(System.out::println);

    }
}
