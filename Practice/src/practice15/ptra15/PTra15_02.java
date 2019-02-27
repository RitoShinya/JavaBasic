/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
         System.out.println(((Java2Month)room).getCurriculum()[0]);
         System.out.println(((Java2Month)room).getCurriculum()[1]);
         System.out.println(((Java2Month)room).getCurriculum()[2]);
         System.out.println(((Java2Month)room).getCurriculum()[3]);
         System.out.println(((Java2Month)room).getCurriculum()[4]);
         System.out.println(((Java2Month)room).getCurriculum()[5]);
         System.out.println(((Java2Month)room).getCurriculum()[6]);



		// 取得したカリキュラム情報を全て出力してください

	}
}
