package some_classes.arrays.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Stream API — это новый способ работать со структурами данных в функциональном стиле. Stream (поток) API
// (описание способов, которыми одна компьютерная программа может взаимодействовать с другой программой) —
// это по своей сути поток данных.
//C чего, собственно, начать? С создания экземпляра Stream, который опирается на нужную нам коллекцию, массив
// или метод их и откуда соответственно будут браться данные:
//List<String> list = new ArrayList<String>();
//       list.add("One");
//       list.add("Two");
//       list.add("Three");
//       list.add("Four");
//       list.add("Five");
//       list.add("Six");
//       list.add("Seven");
//       list.add("Eight");
//       list.add("Nine");
//       list.add("Ten");
//       Stream stream = list.stream();   sozdanie stream. K stati Stream eto interface...
//  Возможные способы создания Stream:
//       Пустой стрим:                 Stream.empty()
//       Стрим из List:                list.stream()
//       Стрим из Map:                 map.entrySet().stream()
//       Стрим из массива:             Arrays.stream(array)
//       Стрим из указанных элементов: Stream.of("1", "2", "3")
//
//  deistviia, ili operatori:
//Промежуточные (“intermediate”, ещё называют “lazy”) — обрабатывают поступающие элементы и возвращают стрим. Промежуточных операторов в цепочке обработки элементов может быть много.
//Терминальные (“terminal”, ещё называют “eager”) — обрабатывают элементы и завершают работу стрима, так что терминальный оператор в цепочке может быть только один.
//
//
//
//
//
//
//
//
//
//
public class Pervoe_Znakomstvo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
               list.add("One");
               list.add("Two");
               list.add("Three");
               list.add("Four");
               list.add("Five");
               list.add("Six");
               list.add("Seven");
               list.add("Eight");
               list.add("Nine");
               list.add("Ten");
               Stream <String> stream = list.stream();

        stream.filter(x-> x.length() == 3).forEach(System.out::println);
//метод filter (фильтр) — промежуточный оператор (deistvie), x приравнивается к одному элементу коллекции (iteracionnaia peremennaia - po
// Shildy) для перебора (как при for each)
// и после -> мы указываем как фильтруется наша коллекция (v dannom primere bydyt otobrani elementi dlinna kotorix == 3, pomnim chto
// nashi elementi v List iavliaytsia String i y kazzdoi string est metod .length())и так как это промежуточный оператор,
// отфильтрованная коллекция идёт дальше в метод forEach который в свою очередь является терминальным (конечным) аналогом перебора for each
// (Выражение System.out::println сокращенно от: x-> System.out.println(x)), которое в свою очередь проходит по всем элементам
// переданной ему коллекции и выводит её)

// stream nelzia ispolzovat bolshe 1-go raza
//
// KAK COZDAT STRIM:
//  Пустой стрим: Stream.empty()
//  Стрим из List: list.stream()
//  Стрим из Map: map.entrySet().stream()
//  Стрим из массива: Arrays.stream(array)
//  Стрим из указанных элементов: Stream.of("1", "2", "3")-------создать поток с кучей ссылок на объекты
//
//      Кроме регулярных объектов stream v Java 8, еще предоставляются особые виды потоков для работы с примитивными типами данных int, long и double
//      это IntStream , LongStream и DoubleStream
//Иногда это полезно преобразовать поток объекта к примитивному потоку или наоборот. Для этой цели потоки объектов поддерживают специальные операций:
//  mapToInt(),            mapToLong()              `   mapToDouble() :
//           Примитивные потоки могут быть преобразованы в объектные потоки с помощью метода mapToObj()

//Вот комбинированный пример: поток с double сначала преобразуется в int’овый поток и затем в объектный поток строк:
//Stream.of(1.0, 2.0, 3.0)
//    .mapToInt(Double::intValue)
//    .mapToObj(i -> "с" + i)          a pochemy "c" ???
//    .forEach(System.out::println);
//
//
//
//
//
//
//
//
//
//
//
//
// /
    }
}
