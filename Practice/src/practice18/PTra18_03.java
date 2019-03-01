/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {

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

        for (int i = 0; i < player.size(); i++) {
        	if (player.get(i).getTeam().contains("レアル・マドリード")) {
				continue;
			}
        	if (player.get(i).getTeam().contains("バルセロナ")){
				continue;
			}
	              System.out.println(player.get(i));
        }








		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


		// ★ 削除後のArrayListの中身を全件出力してください
	}

	}

