package structual.adapter2;

public class UtilityAdapter implements NewUtility {

    private LegacyUtility legacyUtility;

    public UtilityAdapter(LegacyUtilityImpl legacyUtility){
        this.legacyUtility = legacyUtility;
    }

    @Override
    public String getTime() {
        return legacyUtility.getTime();
    }

    @Override
    public String randomKey() {
        return legacyUtility.randomKey();
    }

    @Override
    public String hexToString() {
        return "new version heXtoString()";
    }

    @Override
    public String stringToHex() {
        return "new version StringToHex()";
    }

    @Override
    public String stringToSha256() {
        return "new version StringToSha256()";
    }
}
