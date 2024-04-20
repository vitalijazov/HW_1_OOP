// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public interface Vendingmachine {
ГорячийНапиток getProduct(String name);
ГорячийНапиток getProduct(String name, int volume);
ГорячийНапиток getProduct(String name, int volume, int temperature);
}

public class ГорячийНапиток {
private String name;
private int volume;

public ГорячийНапиток(String name, int volume) {
this.​name name;
this.​v.olume volume;
}

// Геттеры и сеттеры для полей name и volume

@Override
public String toString {
return ″Напиток⁚ ″ name ″, объем⁚ ″ volume;

}
}

public class ГорячиеНапиткиАвтомат implements Vendingmachine {
@Override
public ГорячийНапиток getProduct(String name) {
return new ГорячийНапиток(name);
}

@Override
public ГорячийНапиток getProduct(String name, int volume) {
return new ГорячийНапиток(name, volume);
}
@Override
public ГорячийНапиток getProduct(String name, int volume, int temperature) {
    HotBeverage hotBeverage new HotBeverage (name, volume);
HotBeverage.​s hemperature(temperature);
return HotBeve he;
}

}
public class Main {
public static void main(String[] args) {
ГорячиеНапиткиАвтомат автомат new ГорячиеНапиткиАвтомат;

HotBeverage чай автомат.​getProduct(″Чай″, 200, 80);
HotBeverage кофе автомат.​getProduct(″Кофе″, 150٫ 70);
System.out.​println(чай);
System.​out.​println(кофе);
}
}