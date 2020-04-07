import java.util.*;

class Student {

	public static void main(String[] args) {
		String index;
		String firstName;
		String lastName;
		SLL<Integer> grades = new SLL<Integer>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			gerades.insertLast(scanner.nextInt());
		}


		public Student(String index) {
			this.index = index;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getIndex() {
			return index;
		}

		public String getLastName() {
			return lastName;
		}

		public double getAverage() {
			double suma = 0;
			SLLNode<Integer> tmp = grades.getFirst();
			while(tmp != null){
				suma = suma + tmp.element;
				tmp = tmp.succ; }
			double prosek = suma/grades.length();
		}

		public int ECTSCredits() {
			suma = 0;
			SLLNode<Integer> tmp = grades.getFirst();
			if (tmp.element = "6" || tmp.element = "7" || tmp.element = "8" || tmp.element = "9" || tmp.element = "10"){
				suma += 6;
			}
			tmp=tmp.succ;
		}


	}


}




