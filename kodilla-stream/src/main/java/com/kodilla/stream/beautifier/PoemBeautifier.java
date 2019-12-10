package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String x , PoemDecorator poemDecorator){
        String result = poemDecorator.decorate("aaa");
        System.out.println(result + "Tekst to upiekszenia ");

    }
}
