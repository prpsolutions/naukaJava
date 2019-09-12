package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.person.People;


public class StreamMain {
    public static void main(String[] args) {

            System.out.println("Welcome to module 7 - Stream");

            SaySomething saySomething = new SaySomething();
            saySomething.say();




            People.getList().stream()
                    .forEach(System.out::println);








        }
    }
