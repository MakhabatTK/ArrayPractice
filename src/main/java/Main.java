import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String space = "_________";

        // TASK 1 and 2  Cars
        List<Car> cars = Arrays.asList(Car.values());
        // 2.1 search by index
        System.out.println(cars.get(5).getBrand());
        // 2.2  search by keyword
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase("Subaru"))
                System.out.println(car.getBrand());
        }
        System.out.println(space);


        int[] numbers = {23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2};
        ArrayList<Integer> listIntegers = new ArrayList<>();
        for (int i : numbers) {
            listIntegers.add(i);
        }
        // TASK 3 and 4
        System.out.println(getCountBiggerThan(listIntegers));
        System.out.println(getCountSmallerThan(listIntegers));
        System.out.println(space);

        // TASK 5
        String[] citiesArray = {"LA", "NEW YORK", "SAN FRANCISCO", "PARIS",
                "MOSCOW", "TOKYO", "PHILADELPHIA"};
        List<String> cities = new ArrayList<>(Arrays.asList(citiesArray));

        for (String city : cities) {
            System.out.printf("In position %d is %s\n", cities.indexOf(city), city);
        }
        System.out.println(space);


        // TASK 6

        // First and easiest way using Collections
        System.out.println(Collections.max(listIntegers));

        // sorting using bubble sort with array

        int[] numbers1 = {23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2};

        bubbleSortingArray(numbers1);
        System.out.println(numbers1[numbers1.length - 1]);
        System.out.println(space);


        // TASK 7
        int[] num2 = {3, 9, 2, 12, 4, 5, 11, 13};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : num2) {
            list.add(i);
        }

        System.out.println(getSumInArray(num2));
        System.out.println(getSumInArrayList(list));
        System.out.println(space);


        // TASK 8
        // first 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println( "First 3 Elements in array: " + numbers[i]);
            System.out.println( "First 3 Elements in list: " + listIntegers.get(i));
        }
        System.out.println(space);

        // last 4 elements
        for (int i = numbers.length - 1; i > numbers.length - 5; i--) {
            System.out.println("Last 4 Elements in array: " + numbers[i]);
            System.out.println("Last 4 Elements in list: " + listIntegers.get(i));
        }
        System.out.println(space);


        // TASK 9
        Collections.sort(listIntegers);
        System.out.println(listIntegers);
        System.out.println(space);


        //TASK 10
        List<Person> people = Arrays.asList(new Person("Yada", 15),
                new Person("Jenya", 21),
                new Person("Anya", 35),
                new Person("Alex", 55),
                new Person("Steve", 27),
                new Person("Max", 18),
                new Person("Aselya", 17),
                new Person("Saly", 69),
                new Person("Jazya", 12),
                new Person("Boris", 45));

        List<Person> adults = new ArrayList<>();

        for (Person person : people) {
            if (person.getAge() >= 18)
                adults.add(person);
        }

        for (Person adult : adults) {
            System.out.printf("Name: %s age %d\n", adult.getName(), adult.getAge());
        }

    }

    private static int getSumInArray(int[] num2) {
        int sum = 0;
        for (int numb : num2) {
            sum += (numb + 3);
        }
        return sum;
    }

    private static int getSumInArrayList(ArrayList<Integer> num2) {
        int sum = 0;
        for (int numb : num2) {
            sum += (numb + 3);
        }
        return sum;
    }


    // Task 2
    private static int getCountBiggerThan(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num > 45)
                count++;
        }
        return count;
    }

    // Task 3
    private static int getCountSmallerThan(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num < 45)
                count++;
        }
        return count;
    }


    public static void bubbleSortingArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

}
