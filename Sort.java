
public class Sort {
	void bubbleSorting(Employee[] emp, int em_cnt) {
		for(int i = 0; i < em_cnt -1; i++) {
			if(emp[i].em_num > emp[i+1].em_num) {
				Employee temp = emp[i];
				emp[i] = emp[i + 1];
				emp[i + 1] = temp;
			}
		}
	}
}
