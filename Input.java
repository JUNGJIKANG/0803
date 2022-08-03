import java.util.Scanner;

public class Input {
	int input(Employee[] array) {
		Scanner sc = new Scanner(System.in);
		String io = "";
		int i = 0;
		do {
			array[i] = new Employee();
			System.out.print("사원번호 : ");
			array[i].em_num = sc.nextInt();
			boolean flag = true; // 불린 사용하여 판별(거짓=같은사람)
			for (int j = 0; j < i; j++) { // 사원번호 확인
				if (array[i].em_num == array[j].em_num) {
					flag = false;
					break; // 사원 번호가 같다면 break
				}
			}
			if (flag == false) {
				System.out.print("이미 입력 된 사원입니다.\n");
				continue; // 같은 사람 입력시 재입력하도록
			}
			System.out.print("급 : ");
			array[i].em_g = sc.nextInt();
			System.out.print("호 : ");
			array[i].em_y = sc.nextInt();
			System.out.print("수당 : ");
			array[i].em_pay = sc.nextInt();
			sc.nextLine();
			i++;

			System.out.print("입력/출력(I/O)? : ");
			io = sc.nextLine();
			System.out.println();
		} while (i < 5 && (io.equals("I") || io.equals("i")));	
		return i;
	}
}