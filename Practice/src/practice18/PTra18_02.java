/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_02  {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
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


            for (entityPlayer a :player) {

    			System.out.println(a);
    		}

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう


          }
	}

