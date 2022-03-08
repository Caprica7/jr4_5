package pack1;

//import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    /*
     Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.
    */
    public static class Cat {
        public static int catsCount;
        private String name;

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }

    }

    /*
    Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
    */
    public class Cat1 {
        private static int catsCount = 0;

        public static void addNewCat() {
            //напишите тут ваш код
            Cat1.catsCount++;
        }

    }

    //Реализовать setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
    private static int catsCount1 = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat cat = new Cat();

        Cat.catsCount = catsCount;
    }

    /*
   Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName равное значению локальной переменной String fullName.
   */
    public class Cat2 {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;

            this.fullName = fullName;
        }

    }


    public static void main(String[] args) throws Exception {

        //Написать код, который бы подсчитывал количество созданных котов (count) и на экран выдавалось правильно их количество.
        Cat cat1 = new Cat();
        //напишите тут ваш код
        catsCount1++;
        Cat cat2 = new Cat();
        //напишите тут ваш код
        catsCount1++;
        System.out.println("Cats count is " + catsCount1);

        //Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        int a, b;
        String c, d;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader r = new BufferedReader(inputStreamReader);
        c = r.readLine();
        d = r.readLine();
        a = Integer.parseInt(c);
        b = Integer.parseInt(d);
        if (a < b) System.out.println(a);
        else System.out.println(b);

        //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader1.readLine());
        int b1 = Integer.parseInt(reader1.readLine());
        int c1 = Integer.parseInt(reader1.readLine());
        int d1 = Integer.parseInt(reader1.readLine());
        if (a1 >= b && a1 >= c1 && a1 > d1) {
            System.out.println(a);
        } else if (b1 >= a1 && b >= c1 && b1 >= d1) {
            System.out.println(b);
        } else if (c1 >= a1 && c1 >= b1 && c1 >= d1) {
            System.out.println(c);
        } else if (d1 >= a1 && d1 >= b1 && d1 >= c1) {
            System.out.println(d1);
        }

        //Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader2.readLine());
        int y = Integer.parseInt(reader2.readLine());
        int z = Integer.parseInt(reader2.readLine());
        if (x >= y && x >= z && y > z) {
            System.out.println(x + " " + y + " " + z);
        } else if (x >= y && z >= y && x >= z) {
            System.out.println(x + " " + z + " " + y);
        } else if (y >= x && y >= z && x >= z) {
            System.out.println(y + " " + x + " " + z);
        } else if (y >= x && y >= z && z >= x) {
            System.out.println(y + " " + z + " " + x);
        } else if (z >= x && z >= y && x >= y) {
            System.out.println(z + " " + x + " " + y);
        } else if (z >= x && z >= y && y >= x) {
            System.out.println(z + " " + y + " " + x);
        }

        //Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
        //Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String n0 = reader3.readLine();
        String n2 = reader3.readLine();
        if (n0.equals(n2)) {
            System.out.println("Имена идентичны");
        }
        else if (n0.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }

        //Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader4.readLine();
        String m = reader4.readLine();
        int m1 = Integer.parseInt(m);
        if (m1 < 18) System.out.println("Подрасти еще");

        //Ввести с клавиатуры имя и возраст.
        //Если возраст больше 20 вывести надпись «И 18-ти достаточно»
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        String name = reader5.readLine();
        String age = reader5.readLine();
        int nage =Integer.parseInt(age);
        if (nage>20)
        {
            System.out.println("И 18-ти достаточно");
        }

        //Вывести на экран числа от 1 до 10, используя цикл while.
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }

        //Вывести на экран числа от 10 до 1, используя цикл while.
        i = 10;
        while (i >= 1)
        {
            System.out.println(i);
            i--;
        }

        //Ввести с клавиатуры строку и число N.
        //Вывести на экран строку N раз, используя цикл while.
        BufferedReader read6 = new BufferedReader(new InputStreamReader(System.in));           String s = read6.readLine();
        String n3 = read6.readLine();
        int n = Integer.parseInt(n3);
        i = 0;

        while (i < n)
        {
            System.out.println(s);
            i++;
        }

        //Вывести на экран квадрат из 10х10 букв S используя цикл while.
        //Буквы в каждой строке не разделять.
        x = 1;
        y = 1;
        while (y <= 10)
        {
            while (x < 10)
            {
                System.out.print("S"); x++;
            }
            System.out.println("S"); y++; x=1;
        }

        //Вывести на экран таблицу умножения 10х10 используя цикл while.
        //Числа разделить пробелом.
        i=1;
        n=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            while(n<=9)
            {
                n++;
                System.out.print(i*n+" ");
            }
            i++;
            n=1;
            System.out.println("");
        }

        //Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
        for (i = 2; i <= 100; i += 2 );
        {
            System.out.println(i);//Напишите тут ваш код
        }

        //Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        BufferedReader reader7 = new BufferedReader(new InputStreamReader(System.in));
        int m3 = Integer.parseInt(reader7.readLine());
        int n4 = Integer.parseInt(reader7.readLine());
        for (int j = 0; j < m3; j++)
        {
            for (i = 0; i < n4; i++)
            {
                System.out.print ("8");
            }
            System.out.print (""+"\n");
        }

        //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        s = "8";
        for (int count = 0; count < 10; count++){
            System.out.println(s);
            s = s + 8;
        }

        //Используя цикл for вывести на экран:
        //- горизонтальную линию из 10 восьмёрок
        //- вертикальную линию из 10 восьмёрок.
        for(i=0;i<=10;i++)
        {
            for(int k=0;k<10;k++)
            {       if(i==0 || k==0 )
                System.out.print("8");
            }
            System.out.println();
        }

        //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        BufferedReader reader8 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader8.readLine();
        for (i=1; i <= 10; i++)
            System.out.println(name1 + " любит меня.");

        //Используя цикл вывести на экран сто раз надпись:
        //«Я никогда не буду работать за копейки. Амиго»
        s = "Я никогда не буду работать за копейки. Амиго";
        for (i = 0; i < 100; i ++)
            System.out.println(s);

        //Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n10 = Integer.parseInt(reader.readLine());
        int n20 = Integer.parseInt(reader.readLine());
        int n30 = Integer.parseInt(reader.readLine());
        int avr = n10;
        if ((avr - n20) * (avr - n30) > 0) {
            avr = n20;
            if ((avr - n10) * (avr - n30) > 0)
                avr = n30;
        }
        System.out.println(avr);

        //Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
        int sum = 0;
        BufferedReader reader9 = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            i = Integer.parseInt(reader9.readLine());
            sum += i;
            if (i == -1)
            {
                break;
            }
        }
        System.out.println(sum);

        //Ввести с клавиатуры строку name.
        //Ввести с клавиатуры дату рождения (три числа): y, m, d.
        //Вывести на экран текст:
        //«Меня зовут name
        //Я родился d.m.y
        String name5 = reader.readLine();
        int bYear = Integer.parseInt(reader.readLine());
        int bMonth = Integer.parseInt(reader.readLine());
        int bDay = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут " + name5);
        System.out.println("Я родился " + bDay + "." + bMonth + "." + bYear);

        /*Уровень 5*/

        //Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
        class Cat30
        {
            //напишите тут ваш код
            public String name;
            public int age;
            public int weight;
            public int strength;
            Cat30(String name1, int age1, int weight1, int strength1){
                this.age = age1;
                this.weight = weight1;
                this.strength = strength1;
                this.name = name1;

            }
        }


        //Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы.
        // Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
        class Cat5
        {
            //напишите тут ваш код
            public String name;
            public int age;
            public int weight;
            public int strength;
            Cat5(String name1, int age1, int weight1, int strength1){
                this.age = age1;
                this.weight = weight1;
                this.strength = strength1;
                this.name = name1;

            }

            public boolean fight (Cat5 protivnik)
            {
                if (protivnik.strength > this.strength) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        //Создать class Dog. У собаки должна быть кличка String name и возраст int age.
        //Создайте геттеры и сеттеры для всех переменных класса Dog.
        class Dog {
            public String name;
            public int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        Cat5 cat = new Cat5("Кот1", 3, 6, 8);
        Cat5 cat6 = new Cat5("Кот6", 3, 6, 9);
        Cat5 cat7 = new Cat5("Кот7", 3, 6, 2);

        //Создать три кота используя класс Cat.
        //Провести три боя попарно между котами.
        //Класс Cat создавать не надо. Для боя использовать метод boolean fight
        if(cat.fight(cat6)){
            System.out.println(cat.name + " Убил " + cat6.name);
        }else{
            System.out.println(cat6.name + " Убил " + cat.name);
        }
        if(cat6.fight(cat7)){
            System.out.println(cat6.name + " Убил " + cat7.name);
        }else{
            System.out.println(cat7.name + " Убил " + cat6.name);
        }
        if(cat.fight(cat7)){
            System.out.println(cat.name + " Убил " + cat7.name);
        }else{
            System.out.println(cat7.name + " Убил " + cat.name);
        }

        //Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
        //- Имя
        //- Имя, возраст
        //- Имя, возраст, пол
        class Friend
        {
            //напишите тут ваш код
            private String name;
            private int age;
            private char sex;

            public void initialize(String name)
            {
                this.name = name;
            }

            public void initialize(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
            public void initialize(String name, int age, char sex)
            {
                this.name = name;
                this.age = age;
                this.sex = sex;
            }
        }

        //Создать класс Cat (кот) с пятью инициализаторами:
        //- Имя
        //- Имя, вес, возраст
        //- Имя, возраст (вес стандартный)
        //- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
        //- вес, цвет, адрес (чужой домашний кот)
        class Cat
        {
            //напишите тут ваш код
            String name;
            int weight = 5;
            int age = 5;
            String color;
            String adress;

            public void initialize(String name)
            {
                this.name = name;
            }
            public void initialize(String name,int weight,int age)
            {
                this.name = name;
                this.weight = weight;
                this.age = age;
            }
            public void initialize(String name,int age)
            {
                this.name = name;
                this.age = age;
            }
            public void initialize(int weight, String color)
            {
                this.weight = weight;
                this.color = color;
            }
            public void initialize(int age,String color,String adress)
            {
                this.age = age;
                this.color = color;
                this.adress = adress;
            }
        }

        //Создать класс Dog (собака) с тремя инициализаторами:
        //- Имя
        //- Имя, рост
        //- Имя, рост, цвет
        class Dog2
        {
            //напишите тут ваш код
            private String name;
            private int rost;
            private String color;
            public void initialize(String name)
            {
                this.name = name;

            }
            public void initialize(String name,int rost)
            {
                this.name = name;
                this.rost = rost;

            }
            public void initialize(String name,int rost,String color)
            {
                this.name = name;
                this.rost = rost;
                this.color = color;
            }
        }

        //Создать класс (Circle) круг, с тремя инициализаторами:
        //- centerX, centerY, radius
        //- centerX, centerY, radius, width
        //- centerX, centerY, radius, width, color
        class Circle
        {
            int centerX;
            int centerY;
            int radius;
            int width;
            String color;

            public void initialize(int centerX, int centerY, int radius){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }

            public void initialize(int centerX, int centerY, int radius, int width){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
            }

            public void initialize(int centerX, int centerY, int radius, int width, String color){
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
                this.color = color;
            }
        }

        class Rectangle
        {
            private int top;
            private int left;
            private int width;
            private int height;

            Rectangle(int left, int top, int width, int height){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = height;
            }

            Rectangle(int left, int top){
                this.left = left;
                this.top = top;
                this.width = 0;
                this.height = 0;
            }
            Rectangle(int left, int top, int width){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = width;
            }
            public Rectangle(Rectangle rectangle) {// делаем копию другого прямоугольника
                this.left = rectangle.left;
                this.top = rectangle.top;
                this.width = rectangle.width;
                this.height = rectangle.height;
            }

        }

        //Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
        class Rectangle3
        {
            private int left;
            private int top;
            private int vidth;
            private int height;

            public void initialize (int left, int top, int vidth, int height){
                this.left = left;
                this.top = top;
                this.vidth = vidth;
                this.height = height;
            }

            public void initialize (int left, int top){
                this.left = left;
                this.top = top;
                this.vidth = 0;
                this.height = 0;
            }

            public void initialize (int left, int top, int vidth){
                this.left = left;
                this.top = top;
                this.vidth = vidth;
                this.height = vidth;
            }

            public void initialize (Rectangle anotherRect){
                this.left = anotherRect.left;
                this.top = anotherRect.top;
                this.height = anotherRect.height;
            }
        }

        //Создать класс Friend (друг) с тремя конструкторами:
        //- Имя
        //- Имя, возраст
        //- Имя, возраст, пол
        class Friend2
        {
            private String name;
            private int age;
            private String sex;

            public Friend2(String name) {
                this.name = name;
            }

            public Friend2(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Friend2(String name, int age, String sex) {
                this.name = name;
                this.age = age;
                this.sex = sex;
            }

        }

        //Создать класс Cat (кот) с пятью конструкторами:
        //- Имя,
        //- Имя, вес, возраст
        //- Имя, возраст (вес стандартный)
        //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
        //- вес, цвет, адрес ( чужой домашний кот)
        class Cat11
        {
            //напишите тут ваш код
            String name;
            int weight = 5;
            int age = 5;
            String color;
            String adress;

            public Cat11(String name)
            {
                this.name = name;
            }
            public Cat11(String name,int weight,int age)
            {
                this.name = name;
                this.weight = weight;
                this.age = age;
            }
            public Cat11(String name,int age)
            {
                this.name = name;
                this.age = age;
            }
            public Cat11(int weight, String color)
            {
                this.weight = weight;
                this.color = color;
            }
            public Cat11(int age,String color,String adress)
            {
                this.age = age;
                this.color = color;
                this.adress = adress;
            }
        }

        // Создать класс Dog (собака) с тремя конструкторами:
        //- Имя
        //- Имя, рост
        //- Имя, рост, цвет
        class Dog5
        {
            public String name;
            public int height;
            public String color;

            public Dog5(String name){
                this.name = name;
            }
            public Dog5(String name,int height){
                this.name = name;
                this.height=height;
            }

            public Dog5(String name,int height,String color){
                this.name = name;
                this.height=height;
                this.color=color;
            }

        }

        //Создать класс (Circle) круг, с тремя конструкторами:
        //- centerX, centerY, radius
        //- centerX, centerY, radius, width
        //- centerX, centerY, radius, width, color
        class Circle6 {
            private final int centerX;
            private final int centerY;
            private final int radius;
            private int width;
            @SuppressWarnings("FieldCanBeLocal")
            private String color;

            public Circle6(int centerX, int centerY, int radius, int width, String color) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
                this.color = color;
            }

            public Circle6(int centerX, int centerY, int radius, int width) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
                this.width = width;
            }

            public Circle6(int centerX, int centerY, int radius) {
                this.centerX = centerX;
                this.centerY = centerY;
                this.radius = radius;
            }
        }

        //Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
        class Rectangle6
        {
            private int top;
            private int left;
            private int width;
            private int height;

            Rectangle6(int left, int top, int width, int height){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = height;
            }

            Rectangle6(int left, int top){
                this.left = left;
                this.top = top;
                this.width = 0;
                this.height = 0;
            }
            Rectangle6(int left, int top, int width){
                this.left = left;
                this.top = top;
                this.width = width;
                this.height = width;
            }
            public Rectangle6(Rectangle rectangle) {// делаем копию другого прямоугольника
                this.left = rectangle.left;
                this.top = rectangle.top;
                this.width = rectangle.width;
                this.height = rectangle.height;
            }

        }

        //По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
        //Подумай, что должен возвращать метод toString в классах Cat и Dog?
        //В методе main создай по два объекта каждого класса и выведи их на экран.
        class Duck
        {
            public String toString() {
                return "Duck";
            }
        }

        class Dog8
        {
            public String toString() {
                return "Dog";
            }
        }

        class Cat8
        {
            public String toString() {
                return "Cat";
            }
        }

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Dog8 dog1 = new Dog8();
        Dog8 dog2 = new Dog8();
        System.out.println(dog1);
        System.out.println(dog2);

        Cat8 cat10 = new Cat8();
        Cat8 cat21 = new Cat8();
        System.out.println(cat10);
        System.out.println(cat21);

        //Вывести на экран текущую дату в аналогичном виде «21 06 2015».
        SimpleDateFormat data = new SimpleDateFormat("dd MM yyyy");
        System.out.println(data.format(new Date()));

        int s1 = 0;
        //Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
        while (true) {
            String i1 = reader.readLine();
            if (i1.equals("сумма")) {

            }
            else {
                i = Integer.parseInt(i1);
                s1 += i;}
            if (i1.equals("сумма")) {
                System.out.println(s1);
                break;
            }
        }

        //Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
        String a14 = reader.readLine();
        a = Integer.parseInt(a14);

        String b2 = reader.readLine();
        b = Integer.parseInt(b2);

        sum = a + b;
        System.out.println("Sum = " + sum);

        //Задача: Написать программу, которая:
        //1. вводит с консоли число N > 0
        //2. потом вводит N чисел с консоли
        //3. выводит на экран максимальное из введенных N чисел.
        n = Integer.parseInt(reader.readLine()); //считываем n
        int max = 0;
        for (i = 0; i<n; i++){
            int temp = Integer.parseInt(reader.readLine());
            if (i==0) max=temp;
            else if (temp>max) max=temp;
        }
        System.out.println(max);

    }


}


