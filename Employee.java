class Employee{
	static final int TA=4;
	static final int DA=5;
	static final int HRA=6;

	int id, sal, tot, bonus, ta, da, hra;
	String employeeName;
	
	Employee(int id,String employeeName, int sal){
		id=eid;
		nam=enam;
		sal=esal;
	}



		void calculateNetPay()
		{
		ta=TA * sal /100;
		da=DA * sal /100;
		hra=HRA * sal /100;

		
		if(sal<8000)
			bonus=1500;
		else if (sal<13000) {
			bonus=700;
		}
		else if (sal<18000) {
			bonus=900;
		}
		else if (sal<23000) {
			bonus=1100;
		}
		else {
			bonus=500;
		}
			tot=sal+bonus+da+hra;

		}

		void printEmployeeDetails(){
			System.out.println("Name="+employeeName+"\nEmployee ID="+id+"\nEmployee NET Salary="+tot);
			System.out.println("Basic="+sal+"\tTA="+ta+"\tDA="+da+"\tHRA="+hra+"\tBonus="+bonus);
		}
	
}