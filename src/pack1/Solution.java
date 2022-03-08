package pack1;

//1. Внутри класса Solution создай public static классы Man и Woman.
//2. У классов должны быть поля: name(String), age(int), address(String).
//3. Создай конструкторы, в которые передаются все возможные параметры.
//4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
//5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
public class Solution {
    public static void main(String[] args)
    {
        Man man1 = new Man("name", 20, "address");
        Man man2 = new Man("name2", 20, "address");
        Woman woman1 = new Woman("name", 20, "address");
        Woman woman2 = new Woman("name2", 20, "address");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

        //Добавь по три поля в каждый класс, на твой выбор.
        //Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
        //
        //Пример:
        //Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Dog jerryDog = new Dog("Jerry", 12 , 5);
        Cat jerryCat = new Cat("Jerry", 12 , 5);
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.address = address;
            this.age = age;
            this.name = name;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }



}
