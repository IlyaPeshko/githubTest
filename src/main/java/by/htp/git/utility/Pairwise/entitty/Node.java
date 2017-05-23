package by.htp.git.utility.Pairwise.entitty;

import org.openqa.selenium.By;

public class Node {
    private By by;
    private String name;

    public Node () {}

    public Node(String name) {
        this.name = name;
    }

    public By getBy() {
        return by;
    }

    public void setBy(By by) {
        this.by = by;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "by=" + by +
                ", name='" + name + '\'' +
                '}';
    }
}
