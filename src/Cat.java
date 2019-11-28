/*
* Урок 2. Метод, параметры, return
* Создать в классе Cat метод, который будет возвращать массу съеденной еды
* Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
*
* Урок 3. Статические методы и переменные
* Создать у класса Cat статическую переменную count, которая будет увеличиваться, если кошку создали, и убывать,
* если кошка взорвалась или умерла, и статический метод getCount(), который будет возвращать количество кошек
*
* Урок 5. Создание объектов и конструктор
* Создать в классе Cat ещё один конструктор так, чтобы массу кошки можно было задавать при создании кошки, и
* создать в главном классе метод генерации кошки, как описано в видеоуроке.
* */
public class Cat
{
    private double originWeight;
    private double weight;

    /**Можно перевести константы в static. Оставил обычными, чтобы не менять конструктор.
     * Также static лишит код гибкости
     * Для каждого кота значения могут отличаться.
     * **/
    private final double MIN_WEIGHT;
    private final double MAX_WEIGHT;
    private final int EYES_COUNT;

    private double eatenFoodWeight;

    private static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        MIN_WEIGHT = 1000.0;
        MAX_WEIGHT = 9000.0;
        EYES_COUNT = 2;
        count++;
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
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

    public static int getCount() {
        return count;
    }

    public void poop() {
        weight = weight - weight / 100;
        System.out.println("Hey human, put it away!");
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count--;
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