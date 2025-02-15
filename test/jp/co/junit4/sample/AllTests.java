package jp.co.junit4.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/*
RunWithアノテーション:おまじないのようなものです。あまり深く考えずに毎回これを記述すればいいやと思ってください。
SuiteClassesアノテーション:一括実行したいテスト・クラスを記述します。
*/
@RunWith(Suite.class)
@SuiteClasses({ ConvertorUtilityTest.class, ValidatorUtilityTest.class})
public class AllTests {

}
