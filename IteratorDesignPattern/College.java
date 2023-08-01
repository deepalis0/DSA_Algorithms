package IteratorDesignPattern;

import java.util.ArrayList;


public class College implements ICollection{

    ArrayList<Subjects> subjectsList;
    public void setSubjectList(ArrayList<Subjects> list)
    {
        this.subjectsList = list;
    }

    public ArrayList<Subjects> getSubjectList()
    {
        return this.subjectsList;
    }

    @Override
    public Iterator createSubjectNameIterator() {
        return new SubjectNameIterator(this);
    }

}
