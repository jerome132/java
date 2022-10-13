public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private Student[] students;
	private int numStudents;

	public StudentScores() {
		students = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		students[numStudents] = new Student(name, score);
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (students[i].getScores() > students[highest].getScores())
				highest = i;

		return students[highest].getNames();
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (students[i].getScores() < students[lowest].getScores())
				lowest = i;

		return students[lowest].getNames();
	}
}
