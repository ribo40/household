package com.example.ood;

public class dog {
    private String name;
    private String breed;
    private int legs;
    private int age;
    private date dob;

    public dog(String nm, String br)
    {
        name = nm;
        breed = br;
        legs = 4;
        dob = new date(1,1,2000);
    }
    public void setAge(int aaa)
    {
        age = aaa;
    }
    public void setdob(int d, int m, int y)
    {
        dob = new date(d,m,y);
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public date getDob()
    {
        return dob;
    }
    public String getAsString()
    {
        return "Dog Name: " + name + "\nBreed: "+ breed + "\nAge: " + age + "\nDob: "+
                dob.getAsString();
    }

}
