/**
 * Created by nazmul on 11/12/2017.
 */
public class LongWrapper {

    private Object key = new Object();
    private long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        synchronized (key){
            l = l + 1;
        }

    }
}
