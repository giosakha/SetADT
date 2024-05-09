package linkls;
/*Write a Java program to get all the element in a tree set which
is greater than and less than to the given element.
• Ex: 23, 44, 45, 46, 55, 100, 102,2222, 100000
• Given number: 100 (Ask from the user)
• Less than given element : 23, 44, 46, 55
• Greater than given element : 102, 2222, 100000*/
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetElements {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Add elements to the TreeSet
        treeSet.add(23);
        treeSet.add(44);
        treeSet.add(45);
        treeSet.add(46);
        treeSet.add(55);
        treeSet.add(100);
        treeSet.add(102);
        treeSet.add(2222);
        treeSet.add(100000);
        
        // Get the given number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int givenNumber = scanner.nextInt();
        scanner.close();
        
        // Get elements less than the given number
        TreeSet<Integer> lessThanSet = new TreeSet<>(treeSet.headSet(givenNumber));
        
        // Get elements greater than the given number
        TreeSet<Integer> greaterThanSet = new TreeSet<>(treeSet.tailSet(givenNumber + 1));

        // Print the elements less than the given number
        System.out.println("Less than given element: " + lessThanSet);

        // Print the elements greater than the given number
        System.out.println("Greater than given element: " + greaterThanSet);
    }
}
/*Write a Java program to test whether the elements of two hash
set are equals. Otherwise display the elements which are not
common in both hashsets
Ex: hashset1 = 3 , 5 ,6 , 7, 8, 9, 10
Hashset2 = 3,4,5,7,8,11
The answer is : 4,9,10,11*/
import java.util.HashSet;

public class HashSetComparison {

    public static void main(String[] args) {
        // Create the first hash set
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);
        hashSet1.add(10);

        // Create the second hash set
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(11);

        // Check if the hash sets are equal
        if (hashSet1.equals(hashSet2)) {
            System.out.println("The elements of both hash sets are equal.");
        } else {
            System.out.println("The elements of both hash sets are not equal.");
            
            // Find elements which are not common in both hash sets
            HashSet<Integer> notCommonElements = new HashSet<>(hashSet1);
            notCommonElements.addAll(hashSet2);
            HashSet<Integer> intersection = new HashSet<>(hashSet1);
            intersection.retainAll(hashSet2);
            notCommonElements.removeAll(intersection);
            System.out.println("The elements which are not common in both hash sets are: " + notCommonElements);
        }
    }
}
/*Write a Java program to test whether the elements of two hash
set are equals. Otherwise display the elements which are
common in both hashsets
Ex: hashset1 = 3 , 5 ,6 , 7, 8, 9, 10
Hashset2 = 3,4,5,7,8,11
The answer is : 3,5,7,8*/
import java.util.HashSet;

public class HashSetComparison {

    public static void main(String[] args) {
        // Create the first hash set
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);
        hashSet1.add(10);

        // Create the second hash set
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(11);

        // Check if the hash sets are equal
        if (hashSet1.equals(hashSet2)) {
            System.out.println("The elements of both hash sets are equal.");
        } else {
            System.out.println("The elements of both hash sets are not equal.");
            
            // Find elements which are common in both hash sets
            HashSet<Integer> commonElements = new HashSet<>(hashSet1);
            commonElements.retainAll(hashSet2);
            System.out.println("The elements which are common in both hash sets are: " + commonElements);
        }
    }
}
/*Exercise 5
• Write a Java program to add all the elements which is divisible
by both 3 and 5 of a priority queue to another priority queue.*/
import java.util.PriorityQueue;

public class PriorityQueueDivisible {

    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> originalQueue = new PriorityQueue<>();
        originalQueue.add(15);
        originalQueue.add(9);
        originalQueue.add(25);
        originalQueue.add(30);
        originalQueue.add(12);
        originalQueue.add(7);
        originalQueue.add(20);
        
        // Create a new priority queue to store elements divisible by both 3 and 5
        PriorityQueue<Integer> divisibleBy3And5Queue = new PriorityQueue<>();
        
        // Add elements divisible by both 3 and 5 to the new priority queue
        for (Integer num : originalQueue) {
            if (num % 3 == 0 && num % 5 == 0) {
                divisibleBy3And5Queue.add(num);
            }
        }
        
        // Print the elements in the new priority queue
        System.out.println("Elements divisible by both 3 and 5:");
        while (!divisibleBy3And5Queue.isEmpty()) {
            System.out.println(divisibleBy3And5Queue.poll());
        }
    }
}
/*Create a class called Cinema with attributes (String Genre, double
rating, double revenue, String Director, String year). By using
LinkedHashSet, write a java program to Implement the following
• Sort the cinema objects based on the Genre
• Find the movie that made highest profit
• Sort the cinema objects based on year
• Find the total revenue of all the years
 */
import java.util.Comparator;

class Cinema {
    private String genre;
    private double rating;
    private double revenue;
    private String director;
    private String year;

    public Cinema(String genre, double rating, double revenue, String director, String year) {
        this.genre = genre;
        this.rating = rating;
        this.revenue = revenue;
        this.director = director;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Genre: " + genre + ", Rating: " + rating + ", Revenue: " + revenue + ", Director: " + director + ", Year: " + year;
    }
}

public class CinemaManagement {

    public static void main(String[] args) {
        // Create a LinkedHashSet to store Cinema objects
        LinkedHashSet<Cinema> cinemaSet = new LinkedHashSet<>();

        // Add Cinema objects
        cinemaSet.add(new Cinema("Action", 8.5, 1000000, "John Doe", "2021"));
        cinemaSet.add(new Cinema("Comedy", 7.8, 800000, "Jane Smith", "2020"));
        cinemaSet.add(new Cinema("Drama", 9.2, 1200000, "David Johnson", "2019"));
        cinemaSet.add(new Cinema("Action", 8.0, 1500000, "Michael Brown", "2021"));
        cinemaSet.add(new Cinema("Comedy", 7.6, 700000, "Emma Wilson", "2020"));

        // Sort the cinema objects based on the Genre
        cinemaSet.stream()
            .sorted(Comparator.comparing(Cinema::getGenre))
            .forEach(System.out::println);

        // Find the movie that made the highest profit
        Cinema highestProfitMovie = cinemaSet.stream()
            .max(Comparator.comparing(Cinema::getRevenue))
            .orElse(null);
        System.out.println("\nMovie with highest profit: " + highestProfitMovie);

        // Sort the cinema objects based on the year
        cinemaSet.stream()
            .sorted(Comparator.comparing(Cinema::getYear))
            .forEach(System.out::println);

        // Find the total revenue of all the years
        double totalRevenue = cinemaSet.stream()
            .mapToDouble(Cinema::getRevenue)
            .sum();
        System.out.println("\nTotal revenue of all the years: " + totalRevenue);
    }
}
/*Comparaot rwith sets*/
import java.util.Comparator;
import java.util. LinkedHashSet;
import java.util.TreeSet;
class friendsMarks {
String name;
String nickName;
int marks;
public friendsMarks(String name, String nickName,
int marks)
this.name = name;
this.nickName = nickName;
this.marks = marks;
// getter for name
public String getName() { return name; }
// setter for name
public void setName(String name) { this.name = name; }
// getter for marks
public int getMarks() { return marks; }
// setter for marks
public void setMarks(int marks) { this.marks = marks; }
// getter for nickname
public String getNickName() { return nickName; }
// setter for nickname
public void setNickName(String nickName)
this.nickName = nickName;
｝
//@Override toString method public String toString()
{
return "friendsMarks{"
+ "name='" + name + '|'' + ", nickName='" + nickName + '|'' + ", marks=" + marks + '}';
}
//for comparing names
class nameCompare implements Comparator<friendsMarks> {
@Override
public int compare(friendsMarks friendl,
friendsMarks friend2)
return friendl.getName().compareTo(
friend2.getName());
}
｝I/ for comparing nick name
class nickNameCompare implements Comparator< friendsMarks> {
• @Override
public int compare(friendsMarks obj1, friendsMarks obj2)
return obj1.getNickName().compareTo(
obj2.getNickName());
｝
//for comparing marks
class marksCompare implements Comparator<friendsMarks> {
• @Override
public int compare(friendsMarks f1, friendsMarks f2)
if (f1.getMarks() › f2.getMarks()) {
return 1;
｝
else {
return -1;
}
｝
public class Main {
public static void main(String[] args)
//Creating LinkedHashSet
LinkedHashSet<friendsMarks> linkedHashSet
= new LinkedHashSet<>();
//adding elements to LinkedHashSet
linkedHashSet.add (
new friendsMarks ("Raushan", "Chamgader", 99));
linkedHashSet.add (
new friendsMarks("Yashdeep", "Dopa", 95));
linkedHashSet.add (
new friendsMarks ("Rupesh", "Gian", 92));
linkedHashSet. add (
new friendsMarks("Shishya", "Gorilla", 47));
linkedHashSet. add (
new friendsMarks("Sarthak", "Nagin", 78)); linkedHashSet.add(
new friendsMarks("Sonika", "Chipkali", 67)); linkedHashSet.add(
new friendsMarks("Himanshu", "Lalten", 57));
//Creating TreeSet
//and we have to pass Comparator object
//of marksCompare class
//in the TreeSet constructor
/I so that we can sort according to the marks TreeSet< friendsMarks> treeSeto
= new TreeSet<>(new marksCompare());
/I storing elements of LinkedHashSet
//into TreeSet by using method addA11()
treeSete.addAl1(linkedHashSet);
System.out.println("Sorting on the basis of marks");
//Displaying using loop
for (friendsMarks tree : treeSeto)
System.out.println(tree);
//Creating TreeSet
//and we have to pass Comparator object
//of nameCompare class
//in the TreeSet constructor
// so that we can sort according to the name
TreeSet<friendsMarks> treeSet1= new TreeSet<>(new nameCompare ());
/I storing elements of LinkedHashSet
//into TreeSet by using method addA11()
treeSet1.addA11(linkedHashSet);
//Displaying using loop
System.out.println(
"In\nSorting on the basis of name");
for (friendsMarks tree : treeSet1)
System.out.printin(tree);
