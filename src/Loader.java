
public class Loader
{
    public static void main(String[] args) {
        /*
         * Урок 1. Понятие класса и объекта
         * Создать 5-7 кошек и повызывать у них различные методы:
         * посмотреть, какой у них вес
         * попробовать их покормить и посмотреть, что будет с весом
         * попробовать перекормить кошку, чтобы она взорвалась
         * "замяукать" кошку до смерти
         *
         * Здесь лучше использовать массив. Но так как он выходит за рамки урока
         *  создается просто 6 кошек и проверяюься их методы.
         * Чтобы избежать дублирования кода создается метод для демонстрации веса котов.
         * */
        Cat vasyka = new Cat();
        Cat matroskin = new Cat();
        Cat murzik = new Cat();
        Cat chernish = new Cat();
        Cat murka = new Cat();
        Cat gav = new Cat();

        //Кол-во котов до несчастного случая (их будет 6)
        System.out.println(Cat.getCount());

        showWeightChange(vasyka);

        showWeightChange(matroskin);

        showWeightChange(murzik);

        showWeightChange(chernish);

        showWeightChange(murka);

        showWeightChange(gav);

        //Взорвали матроскина
        System.out.println(matroskin.getStatus());
        matroskin.feed(matroskin.getWeight() * 1000);
        System.out.println(matroskin.getStatus());
        System.out.println("");

        //Взорвали мурку
        System.out.println(murka.getStatus());
        murka.drink(murka.getWeight() * 1000);
        System.out.println(murka.getStatus());
        System.out.println("");

        //Замяукали гава
        System.out.println(gav.getStatus());
        while (gav.getWeight() > 1000) {
            gav.meow();
        }
        System.out.println(gav.getStatus());
        System.out.println();

        //Узнаем сколько съел черныш. Убираем его грязное дело. Смотрим сколько он весит
        System.out.println(chernish.getEatenFoodWeight());
        chernish.poop();
        System.out.println(chernish.getWeight());
        System.out.println();

        //Выжившие коты (3)
        System.out.println(Cat.getCount());

        Cat testCat = createCat(3000.0);
        System.out.println(testCat.getWeight());

    }



    /*
     * Так как метод main статический он не может вызывать только статические методы.
     * Соответственно созданный метод showWeightChange - статический
     * */
    private static void showWeightChange(Cat cat) {

        System.out.println(cat.getWeight());
        cat.feed(cat.getWeight() / 100);
        System.out.println(cat.getWeight());
        System.out.println("");

    }

    /*
    * Метод генерации кошек с весом.
    * */
    private static Cat createCat(double weight) {
        return new Cat(weight);
    }
}