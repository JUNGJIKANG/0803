
public class EM {
	public static void main(String[] args) {
		Input input = new Input();
		Calc calc = new Calc();
		Output output = new Output();
		Sort sort = new Sort();
		Employee[] emp = new Employee[5];
		
		int em_cnt = input.input(emp);
		calc.calc(emp, em_cnt);
		sort.bubbleSorting(emp, em_cnt);
		output.output(emp, em_cnt);
	}
}
