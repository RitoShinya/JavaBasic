package practice14.common;

public class DBCourse implements Course{

	public String PREFIX = "【Eラーニング】";

	public 	String getCourseName(){
		return "【Eラーニング】DB基礎";
	}

	public 	String[] getCourseUnit(){
		String[] name2 = {"DB基礎","SQL基礎","正規化","SQL応用"};
	    return name2;
	}


}
