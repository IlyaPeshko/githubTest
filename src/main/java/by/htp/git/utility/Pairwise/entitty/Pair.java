package by.htp.git.utility.Pairwise.entitty;

public class Pair {
    private Node pair_1;
    private Node pair_2;
    private Node pair_3;

    public Pair() {}

    public Node getPair_1() {
        return pair_1;
    }

    public void setPair_1(Node pair_1) {
        this.pair_1 = pair_1;
    }

    public Node getPair_2() {
        return pair_2;
    }

    public void setPair_2(Node pair_2) {
        this.pair_2 = pair_2;
    }

    public Node getPair_3() {
        return pair_3;
    }

    public void setPair_3(Node pair_3) {
        this.pair_3 = pair_3;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "pair_1=" + pair_1 +
                ", pair_2=" + pair_2 +
                ", pair_3=" + pair_3 +
                '}';
    }
}
