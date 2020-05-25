package com.example.jokelib;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Random;

public class MyClass {
    //https://www.boredpanda.com/funny-dad-jokes-puns/?utm_source=google&utm_medium=organic&utm_campaign=organic
    List<String> list = asList(
            "Today, my son asked \"Can I have a book mark?\" and I burst into tears. 11 years old and he still doesn't know my name is Brian.",
            "My wife is really mad at the fact that I have no sense of direction. So I packed up my stuff and right.",
            "How do you make holy water? You boil the hell out of it.",
            "Did you know the first French fries weren't actually cooked in France? They were cooked in Greece.",
            "I'm reading a book about anti-gravity. It's impossible to put down!",
            "What do you call someone with no body and no nose? Nobody knows.",
            "I ordered a chicken and an egg from Amazon. I’ll let you know"
    );

    public String getJoke(){
        Random random = new Random();
        String randomJoke = list.get(random.nextInt(list.size()));
        return  randomJoke;
    }

}