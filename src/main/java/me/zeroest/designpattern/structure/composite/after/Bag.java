package me.zeroest.designpattern.structure.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private final List<Component> components;

    public Bag() {
        components = new ArrayList<>();
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream()
            .mapToInt(Component::getPrice)
            .sum();
    }
}
