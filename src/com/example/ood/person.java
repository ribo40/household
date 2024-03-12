package com.example.ood;

public class person {

// object fields
    private String name;
    private int age;

    public person (String s, int a)
    {
        name = s;
        age = a;
    }

    public String getName()
{
    return name;
}

    public String getAsString()
    {
        String s ="\n  " + name + " aged: " + age ;
        return s;

}

public void addYear()
{
    age = age + 1;
}
}
