package com.example.maruf.e_pharma.First_Aid;

public class NameIterator implements Iterator {

    int index;
    NameRepository n;
    public NameIterator(NameRepository n) {
        this.n=n;
    }

    @Override
    public boolean hasNext() {
        if(index<n.dots.length)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()){
            return n.dots[index++];
        }
        return null;
    }
}
