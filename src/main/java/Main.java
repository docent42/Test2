public class Main {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.listEmpsByPosition("плотник").forEach(System.out::println);
    }
}
