package com.example.ood;

import java.util.ArrayList;

public class family {
    private String mother;
    private String father;
    private person[] children;
    private int childCount;
    private ArrayList<dog> myDogs;

    public family(String ma, String pa)
    {
        mother = ma;
        father=  pa;
        myDogs = new ArrayList<dog>();
        children = new person[5];
    }
    public void addChild( person ch)
    {
        children[childCount]=ch;
        childCount = childCount + 1;

    }
    public void showAllChildren()
    {
        for(int index=0; index<childCount; index++)
        {
            person xx = children[index];
            System.out.println(xx.getAsString());
        }
    }
    public String getAllChildren()
    {
        String s = "";
        for(int index=0; index<childCount; index++)
        {
            person xx = children[index];
            s = s + xx.getAsString() +"\n";
        }
        return s;
    }
    public int noOfChildren()
    {
        return childCount;
    }
    public void removeAChild(int position)
    {
        //????
    }
    public void showAChild(int position)
    {
        if (position >=0 && position<childCount)
        {
            person ppp  = children[position];
            System.out.println(ppp.getAsString());
        }
    }
    public person getAChild(int position)
    {
        if (position >=0 && position < childCount)
        {
            return children[position];
        }
        return null;
    }
    public void addChild(String nnn, int ag)
    {
        person temp;
        temp = new person(nnn,ag); //create child object from parameter data
        children[childCount] = temp; // add child object
        childCount++;
    }
    public void removeAChild(String name )
    {
        //????
    }
    public void addDog(dog gg)
    {
        myDogs.add(gg);
    }
    public int noOfDogs()
    {
        return myDogs.size();
    }
    public void removeDog(int position)
    {
        if (position >=0 && position<myDogs.size()) // this makes sure that position is in the right range
        {
            myDogs.remove(position);
        }
    }
    public void showADog(int position) // print to Terminal window
    {
        if (position >=0 && position<myDogs.size())
        {
            dog ddd;
            ddd = myDogs.get(position);
            System.out.println(ddd.getAsString());
        }
    }
    public dog getADog(int position)
    {
        if (position >=0 && position<myDogs.size())
        {
            dog ddd;
            ddd = myDogs.get(position);
            return ddd;
        }
        return null;
    }
    public void addDog(String nnn, String bbb)
    {
        dog temp;
        temp = new dog(nnn,bbb);
        myDogs.add(temp);
    }
    public void showAllDogs()
    {
        int index = 0;
        while (index < myDogs.size())
        {
            dog temp = myDogs.get(index);
            System.out.println(temp.getAsString());
            index++;
        }
    }
}
