package IteratorDesignPattern;

import java.util.ArrayList;

public class SubjectNameIterator implements Iterator{

    int curPosition = 0;

    ArrayList<Subjects> list;
    SubjectNameIterator(College object)
    {
        this.list = object.getSubjectList();
    }
    @Override
    public boolean hasNext() {
        return curPosition < list.size();
    }

    @Override
    public Object next() {
        return list.get(curPosition++).getName();
    }
}
