
public class Student {
	//private two attribute or instant variables
	private String studentName;
	private int studentScore;
	//setters and getters method 
	public void setName(String stdName) {
		studentName = stdName;
	}
	public String getName() {
		return studentName;
	}
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	public int getScore() {
		return studentScore;
	}
	public boolean checkScore() {
		/*if(getScore()>=0 && getScore()<=100) {
			return true;
		}else {
			return false;
		}*/
		/*if(getScore()>=0&&getScore()<=100) {
				return true;
			return false;
		}*/
		return getScore()>=0 && getScore()<=100;
	}
	public boolean isPass() {
		if (getScore()>=50) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
