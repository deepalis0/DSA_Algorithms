package IteratorDesignPattern;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        College rgit = new College();

        Subjects s1 = new Subjects("DSA");
        Subjects s2 = new Subjects("OS");
        Subjects s3 = new Subjects("CN");

        ArrayList<Subjects> subjectsArrayList = new ArrayList<>();
        subjectsArrayList.add(s1);
        subjectsArrayList.add(s2);
        subjectsArrayList.add(s3);
        rgit.setSubjectList(subjectsArrayList);

        Iterator iterator= rgit.createSubjectNameIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
