/*Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
, что все они сохранились во множество.
Создайте метод
public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, 
метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Создайте метод
public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat.
(Можно использовать Objects.hash(...))
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/

import java.util.HashSet;
import java.util.Set;

public class Cat {
  
    public static void main(String[] args) {
        Cat cat1 = new Cat("Коржик");
        cat1.invite();
        cat1.setAge(10);
        cat1.setPassport(12345);
        cat1.setDoctor(new Doctor("Карамелька"));
        System.out.println(cat1); 
    
        Cat cat2 = new Cat("Компот");
        Cat cat3 = new Cat("Компотик");
        Set <Cat> cats= new HashSet<>();
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats); 
        System.out.println(cat2.equals(cat3));
   
}
}
 
