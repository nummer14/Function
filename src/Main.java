public class Main {
    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력 ===");
        Main.printStudent(name:"Alice",  age: 20);
        printStudent(name:"Bob",  age:22);
        printStudent(name:"Charlie",  age:25);
    }
}