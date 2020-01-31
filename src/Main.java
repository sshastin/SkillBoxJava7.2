import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Worker> list1 = new ArrayList<>();
        List<Worker> list2 = new ArrayList<>();

        list1.add(new Worker(1800, "DDD", 10));
        list1.add(new Worker(1800, "DDD", 20));
        list1.add(new Worker(1800, "DDD", 30));
        list1.add(new Worker(1700, "DDD", 10));
        list1.add(new Worker(1300, "AAA", 20));
        list1.add(new Worker(1400, "AAA", 20));
        list1.add(new Worker(1550, "AAA", 20));
        list1.add(new Worker(1650, "AAA", 20));
        list1.add(new Worker(1300, "BBB", 5));
        list1.add(new Worker(1700, "CCC", 40));
        list1.add(new Worker(1650, "FFF", 65));
        list1.add(new Worker(1900, "GGG", 25));
        list1.add(new Worker(2000, "HYT", 15));

        list2.addAll(list1);

        CertainWorker certainWorker = new CertainWorker(1000, "ADF", 12);
        System.out.println(certainWorker.getSalary());

        for (int i = 0; i < list1.size(); i++) {
            System.out.print("List 1: " + list1.get(i).getSalary() + " " + list1.get(i).getName() + " " + list1.get(i).getAge());
            System.out.println(" List 2: " + list2.get(i).getSalary() + " " + list2.get(i).getName() + " " + list2.get(i).getAge());
        }

        //сортируем по ЗП, потом по имени, потом по возрасту

        Collections.sort(list1, Comparator.comparing(Worker::getSalary).thenComparing(Worker::getName).thenComparing(Worker::getAge));

        list2.sort((o1, o2) -> {
            if ((o1.getSalary() == o2.getSalary()) && (o1.getName().equals(o2.getName()))) {
                return o1.getAge().compareTo(o2.getAge());
            } else if (o1.getSalary().equals(o2.getSalary())) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            System.out.print("List 1: " + list1.get(i).getSalary() + " " + list1.get(i).getName() + " " + list1.get(i).getAge());
            System.out.println(" List 2: " + list2.get(i).getSalary() + " " + list2.get(i).getName() + " " + list2.get(i).getAge());
        }
    }
}
