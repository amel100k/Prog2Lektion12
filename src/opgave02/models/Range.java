package opgave02.models;

import java.util.Iterator;

public class Range implements Iterable<Integer>{
    private int from;
    private int to;
    private int current;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
        this.current = from;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(from,to);
    }
}
