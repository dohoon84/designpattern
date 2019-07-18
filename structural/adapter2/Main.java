package structual.adapter2;

public class Main {
    public static void main(String[] args) {

        /*
        구버전유틸은 사용할 수 있는 메소드3개
         */
        LegacyUtility legacyUtility = new LegacyUtilityImpl();
        System.out.println(legacyUtility.randomKey());
        System.out.println(legacyUtility.hexToString());
        System.out.println(legacyUtility.getTime());

        /*
        신규 버전에서 기존의 레거시 메소드를 사용하고 싶다면 인터페이스를 정의하고
        레거시 메소드를 그대로 사용할 수 있다.
        */

        NewUtility newUtil = new UtilityAdapter(new LegacyUtilityImpl());
        System.out.println(newUtil.stringToSha256());
        System.out.println(newUtil.stringToHex());
        System.out.println(newUtil.randomKey());
        System.out.println(newUtil.hexToString());
        System.out.println(newUtil.getTime());
    }
}
