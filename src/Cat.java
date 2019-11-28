/*
* Урок 2. Метод, параметры, return
* Создать в классе Cat метод, который будет возвращать массу съеденной еды
* Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
* */
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double eatenFoodWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eatenFoodWeight = eatenFoodWeight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public double getEatenFoodWeight() {
        return eatenFoodWeight;
    }

    public void poop() {
        weight = weight - weight / 100;
        System.out.println("Hey human, put it away!");
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}