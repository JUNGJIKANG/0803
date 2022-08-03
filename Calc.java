
public class Calc {
	
	
	static int[][] salary = {
			{ 95000, 80000},
			{92000, 75000},
			{89000, 70000},
			{86000, 65000},
			{83000, 60000}
	};
	
	void calc(Employee[] emp, int em_cnt) {
		for(int i = 0; i < em_cnt; i++) {
			emp[i].em_ji = salary[emp[i].em_y -1][emp[i].em_g-1] + emp[i].em_pay;
			
			double t_rate;
			int jo;
			if(emp[i].em_ji >= 90000) {
				t_rate = 0.012;
				jo = 1000;
			}else if(emp[i].em_ji >= 80000) {
				t_rate = 0.007;
				jo = 500;
			}else if(emp[i].em_ji >= 70000) {
				t_rate = 0.005;
				jo = 300;
			}else{
				t_rate = 0;
				jo = 0;
			}
			emp[i].em_se = (int)(emp[i].em_ji * t_rate) - jo ;
			emp[i].em_cha = emp[i].em_ji - emp[i].em_se;
		}
	}
	
	
}
