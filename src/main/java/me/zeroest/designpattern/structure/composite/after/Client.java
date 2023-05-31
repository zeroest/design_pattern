package me.zeroest.designpattern.structure.composite.after;

public class Client {
    public static void main(String[] args) {
        Item pencil = new Item("연필", 150);
        Item eraser = new Item("지우개", 50);

        Bag bag = new Bag();
        bag.add(pencil);
        bag.add(eraser);

        Client client = new Client();
        System.out.println("Item pencil:");
        client.printPrice(pencil);
        System.out.println("Item eraser:");
        client.printPrice(eraser);

        System.out.println("Bag:");
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
