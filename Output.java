
public class Output {
	void output(Employee[] emp, int em_cnt) {
		printLabel();
		for(int i = 0; i < em_cnt; i++) {
			System.out.printf("%3d\t%2d\t%2d\t%6d\t%8d\t%4d\t\t%d\n",
					emp[i].em_num, emp[i].em_g, emp[i].em_y, emp[i].em_pay, emp[i].em_ji, emp[i].em_se, emp[i].em_cha );
		}
		System.out.println("-------------------------------------------------------");
	}
	
	void printLabel() {
		System.out.println("\t\t\t << 급여 관리 프로그램 >>");
		System.out.println("-------------------------------------------------------");
		System.out.println("사번\t급수\t호\t수당\t\t지급액\t세금\t\t차인지급액");
		System.out.println("-------------------------------------------------------");
	}
}
