public class Simpson implements Comparable<Simpson> {

    String name;
    @Override
    public int compareTo(Simpson o) {
        return this.name.compareTo(o.name);
    }
}
