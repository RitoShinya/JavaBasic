package practice12;

/*
 * PTra12_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import practice12.common.Student;

public class PTra12_01 {
	public static void main(String[] args) {

		/*
		 * common.Studentにアクセサを追加し、
		 * ★ フィールドのアクセス修飾子を外部クラスからのアクセスを禁止させるようにしてください
		 *
		 * ★ 下記、インスタンスフィールドへのアクセスをアクセサ経由に変更してください
		 */
		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentName("リゾーム太郎");
		student.setCompanyName("株式会社リゾーム");
		student.setClassName("Z教室");
		student.setMail("rhizome@hogehoge.com");
		student.setPassword("1qazxcvb");

		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getCompanyName());
		System.out.println(student.getClassName());
		System.out.println(student.getMail());
		System.out.println(student.getPassword());
	}
}
