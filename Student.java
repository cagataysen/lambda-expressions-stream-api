import java.util.*;
import java.util.stream.Collectors;

/**
 * The Class Student.
 */
public class Student {

    /** The id. */
    private int id;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The age. */
    private int age;

    /** The gender. */
    private String gender;

    /** The departmant name. */
    private String departmantName;

    /** The joined year. */
    private int joinedYear;

    /** The city. */
    private String city;

    /** The rank. */
    private int rank;

    /**
     * Instantiates a new employee.
     *
     * @param id the id
     * @param firstName the first name
     * @param lastName the last name
     * @param age the age
     * @param gender the gender
     * @param departmantName the departmant name
     * @param joinedYear the joined year
     * @param city the city
     * @param rank the rank
     */
    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
                   int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age.
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     *
     * @param gender the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the departmant name.
     *
     * @return the departmant name
     */
    public String getDepartmantName() {
        return departmantName;
    }

    /**
     * Sets the departmant name.
     *
     * @param departmantName the new departmant name
     */
    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    /**
     * Gets the joined year.
     *
     * @return the joined year
     */
    public int getJoinedYear() {
        return joinedYear;
    }

    /**
     * Sets the joined year.
     *
     * @param joinedYear the new joined year
     */
    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the rank.
     *
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the rank.
     *
     * @param rank the new rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
                + city + ", rank=" + rank + "]";
    }


    /**
     *
     *List of Students
     *
     */



    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "John", "Doe", 30, "Male", "Electrical Engineering", 2015, "New York", 122),
                new Student(2, "Emma", "Smith", 24, "Female", "Computer Science", 2018, "Los Angeles", 67),
                new Student(3, "Michael", "Johnson", 26, "Male", "Mechanical Engineering", 2019, "Chicago", 164),
                new Student(4, "Emily", "Brown", 28, "Female", "Biomedical Engineering", 2014, "Boston", 26),
                new Student(5, "Daniel", "Garcia", 23, "Male", "Chemical Engineering", 2022, "San Francisco", 12),
                new Student(6, "Sophia", "Martinez", 22, "Female", "Mechanical Engineering", 2023, "Miami", 90),
                new Student(7, "Matthew", "Lopez", 25, "Male", "Aerospace Engineering", 2014, "Houston", 324),
                new Student(8, "Olivia", "Hernandez", 29, "Female", "Aerospace Engineering", 2014, "Seattle", 433),
                new Student(9, "William", "Young", 27, "Male", "Industrial Engineering", 2018, "Dallas", 7),
                new Student(10, "Isabella", "King", 26, "Female", "Industrial Engineering", 2017, "Atlanta", 98));

        /**
         * Q1
         *
         *
         *Find list of students whose first name starts with alphabet A
         *
         * */

        List<Student> lstStuName = list.stream().filter(x->x.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println("List of students whose name starts with letter A : "+lstStuName);

        /**
         * Q2
         *
         *Group The Student By Department Names
         *
         * */

        Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println("Students grouped by the department names :" + mapData);



        /**
         * Q3
         *
         *Find the total count of student using stream
         *
         * */

        long studentCount = list.stream().count();
        System.out.println("Students count : " + studentCount);


        /**
        * Q4
        *
        * Find the max age of student
        *
        * */

        OptionalInt maxAge = list.stream().mapToInt(dt->dt.getAge()).max();
        System.out.println("Max age : " + maxAge.getAsInt());


        /**
         * Q5
         *
         * Find all departments names
         *
         **/

        List<String> departmentsName = list.stream().map(x->x.getDepartmantName()).distinct().collect(Collectors.toList());
        System.out.println("Departments name : " + departmentsName);


        /**
         *Q6
         *
         * Find the count of student in each department
         *
         */

        Map<String, Long> countOfStudentsByDepartment = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println("Total number of students : " + countOfStudentsByDepartment.size());



        /**
         * Q7
         *
         *  Find the list of students whose age is less than 30
         *
         * */

        List<Student> youngStudents = list.stream().filter(x->x.getAge() < 30).collect(Collectors.toList());
        System.out.println("Young students : " + youngStudents);



        /**
         *Q8
         *
         * Find the list of students whose rank is in between 50 and 100
         *
         * */

        List<Student> highRankedStudents = list.stream().filter(x->x.getRank() > 50 && x.getRank() < 100).collect(Collectors.toList());
        System.out.println("High Ranked students : " + highRankedStudents);

        /**
         *Q9
         *
         * Find the average age of male and female students
         *
         * */

        Map<String, Double> averageAgeGender = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age : " + averageAgeGender);

        /**
         *Q10
         *
         * Find the department who is having maximum number of students
         *
         * */

        Map.Entry<String, Long> entry = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println("Department having maximum number of students : "+entry);


        /**
         *Q11
         *
         * Find the Students who stays in Delhi and sort them by their names
         *
         * */

        List<Student> lstDelhistudent = list.stream().filter(dt -> dt.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println("List of students who stays in Delhi and sort them by their names : "+lstDelhistudent);


        /**
         *Q12
         *
         * Find the average rank in all departments
         *
         * */

        Map<String, Double> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
        System.out.println("Average rank in all departments  : "+collect);

        /**
         *Q13
         *
         * Find the highest rank in each department
         *
         * */

        Map<String, Optional<Student>> studentData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,
                Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department  : "+studentData);

        /**
         *Q14
         *
         * Find the list of students and sort them by their rank
         *
         * */

        List<Student> stuRankSorted = list.stream().sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());
        System.out.println("List of students sorted by their rank  : "+stuRankSorted);

        /**
         *Q15
         *
         * Find the student who has second rank
         *
         * */

        Student student = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println("Second highest rank student  : "+student);

        /**
         *Q16
         *
         * Find the average age of students
         *
         * */

        Double averageAge = list.stream().mapToInt(x->x.getAge()).average().getAsDouble();
        System.out.println("Average age : " + averageAge);


    }





}