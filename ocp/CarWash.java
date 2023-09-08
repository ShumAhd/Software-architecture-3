package ru.geekbrains.lesson3.ocp;

import ru.geekbrains.lesson3.Wiping;

public class CarWash {
  public void wash(Wiping vehicle) {
    System.out.println("Мойка автомобиля...");
    vehicle.wipMirrors();
    vehicle.wipWindshield();
    vehicle.wipHeadlights();
  }

}
