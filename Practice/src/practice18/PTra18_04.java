/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList <entityPlayer> player = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                // ★ 1行ごとにArrayListに格納してください
                entityPlayer p = new entityPlayer();

                p.setPosition(line[0]);
                p.setName(line[1]);
                p.setCountry(line[2]);
                p.setTeam(line[3]);

              player.add(p);


            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

        Collections.shuffle(player);


        for(int num1 = 0; num1 < 1; num1++) {
        	player.get(num1).getPosition().contains("GK");{
                System.out.println(player.get(num1));
        	}
        }

//
//        for(int num2 = 0; num2 < 4; num2++) {
//        num2 = new java.util.Random().nextInt(24) + 5;
//             if(num2 > 4) {
//            	 continue;
//             }
//        	System.out.println(player.get(num2));
//        }
//
//        for(int num3 = 0; num3 < 4; num3++) {
//        num3 = new java.util.Random().nextInt(39) + 25;
//            if(num3 > 4) {
//            	continue;
//            }
//        	System.out.println(player.get(num3));
//        }
//
//        for(int num4 = 0; num4 < 2; num4++) {
//        num4 = new java.util.Random().nextInt(54) +40;
//           if(num4 > 2 )
//        	System.out.println(player.get(num4));
//        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        }
	}

