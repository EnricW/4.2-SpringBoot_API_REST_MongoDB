package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    void deleteFruit(String id);
    Fruit updateFruit(Fruit fruit);
    Fruit getFruit(String id);
    List<Fruit> getFruits();
}