package com.example.ood;

public class runner {
    public static void main(String[] args)
    {
        family smiths;
        smiths = new family("mary","fred");
        person child1;
        child1 = new person("anne",12);
        person child2 = new person("joe",16); // shortcut
        person child3 = new person("anil",14);

        dog d1 = new dog("Rex", "alsatian");

        // add the children to the array
        smiths.addChild(child1);
        smiths.addChild(child2);
        // child3 ??
        smiths.addChild (new person("0lek", 7)); //shortcut using an anonymous object
        smiths.addChild("ivan",6);  // alternative way to add a child - see Family code

        // display calling the mutator
        System.out.println("***** Using showAllChildren()");
        smiths.showAllChildren();

        // display calling the accessor
        System.out.println("***** Using getAllChildren()");
        String xx = smiths.getAllChildren();
        // client has control of what to do with the data
        System.out.println(xx);
        //OR shortcut :  System.out.println(smiths.getAllChildren());

        // different ways of adding a dog
        smiths.addDog(d1);
        smiths.addDog(new dog("Loopy","Collie"));  // shortcut
        smiths.addDog("Fido", "Terrier");  // alternative way to add a dog in Family

        // how to display dog data ??

    }
}
