/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		practice13.common.SuperHero superHero = new practice13.common.SuperHero();
		practice13.common.Slime slime = new practice13.common.Slime();

		       superHero.setName("勇者（装備あり）");
		       System.out.println(superHero.getName());

		       slime.setName("スライム");
		       System.out.println(slime.getName());

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		       practice13.common.Item item = new Item("こんぼう",4);

		       superHero.setEquipment(item);


		       while (true) {
					if (superHero.damage(slime.attack())) {
						System.out.println("スライムはヒーロとの戦闘に勝利した");
					     break;
					}
		        	if (slime.damage(superHero.attack())) {
						System.out.println("ヒーローはスライムとの戦闘に勝利した");
		                break;
		        	}
				}


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
