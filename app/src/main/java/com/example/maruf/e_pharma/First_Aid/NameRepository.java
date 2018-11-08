package com.example.maruf.e_pharma.First_Aid;

import android.widget.TextView;

class NameRepository implements Container{

    TextView[] dots=null;

    public NameRepository(TextView[] dots) {
        this.dots = dots;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(this);

    }
}
