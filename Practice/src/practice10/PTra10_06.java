package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
          Car car1 = new Car();
           car1.color = "あか";
           car1.gasoline = 70;

          Car car2 = new Car();
          car2.color = "白";
          car2.gasoline = 50;

          Car car3  = new Car();
          car3.color = "緑";
          car3.gasoline = 40;

         final int distance = 300;

         int sum1 = 0;
         int n1 = 0;

            while (true) {
			int a = car1.run();
			sum1 += a;
			n1 += 1;


            if (sum1 >= 300) {
          System.out.println("目的地にまで" + n1 + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
			 break;
            }
			 if (a == -1) {
				 System.out.println("目的地に到達できませんでした");
				break;
			 }
      }


            int sum2 = 0;
            int n2 = 0;


         	while (true) {
         	  int b = car2.run();
    		  sum2 += b;
    		  n2 += 1;


    	    if (sum2 >= 300) {
           System.out.println("目的地にまで" + n2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
        	    break;
    	       }
    	    if (b == -1) {
    	    	System.out.println("目的地に到達できませんでした");
				break;
			}
         }

            int sum3 = 0;
            int n3 = 0;

         	while (true) {
    		  int c = car3.run();
    		  sum3 += c;
    		  n3 += 1;


            if (sum3 >= 300) {
              System.out.println("目的地にまで" + n3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
        	      break;
                 	}
            if (c == -1) {
                System.out.println("目的地に到達できませんでした");
				break;
			}

		}








		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

	}
}
