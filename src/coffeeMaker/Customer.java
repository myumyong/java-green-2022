package coffeeMaker;

public abstract class Customer {
    abstract void order(String menuName, Menu menu, Barista barista);
}

class 홍길동 extends Customer {

    @Override
    void order(String menuName, Menu menu, Barista barista) {
        // TODO Auto-generated method stub
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println("홍길동이 " + menuItem.getPrice() + "원 " +
                menuItem.getName() + "를 받았습니다.");
    }

}
