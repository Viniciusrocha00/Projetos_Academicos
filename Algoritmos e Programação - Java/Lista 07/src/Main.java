//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Integer> nums = Arrays.asList(1,2,3,4);
    nums.stream()
            .map(n -> n + 1)
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
