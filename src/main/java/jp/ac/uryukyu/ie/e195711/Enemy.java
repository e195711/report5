package jp.ac.uryukyu.ie.e195711;

/**
 * 生物クラスを継承して敵クラスを定義する。
 * 定義しているフィールド変数は以下。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by ko-ta on 2019/11/23.
 */
public class Enemy extends LivingThing{
    /**
     * superクラスのコントラクタを呼び出す。
     * 名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * superクラスと処理後の出力メッセージが異なる。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}