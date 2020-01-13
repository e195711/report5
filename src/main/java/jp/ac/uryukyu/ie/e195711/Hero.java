package jp.ac.uryukyu.ie.e195711;

/**
 * 生物クラスを継承してヒーロークラスを定義する。
 * 定義しているフィールド変数は以下。
 *  String name; //ヒーローの名前
 *  int hitPoint; //ヒーローのHP
 *  int attack; //ヒーローの攻撃力
 *  boolean dead; //ヒーローの生死状態。true=死亡。
 * Created by ko-ta on 2019/11/23.
 */
public class Hero extends LivingThing{
    /**
     * superクラスのコントラクタを呼び出す。
     * 名前、最大HP、攻撃力を指定する。
     * @param name ヒーローの名前
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero(String name, int maximumHP, int attack){
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}