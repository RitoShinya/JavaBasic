package practice14.common;

public class JavaCourse implements Course  {

	public String PREFIX = "【Eラーニング】";


	public String getCourseName() {
            return "【Eラーニング】Java";
	}

	public String[] getCourseUnit() {
         String[] name = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	      return name;
	}
}
