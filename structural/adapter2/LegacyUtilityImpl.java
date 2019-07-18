package structual.adapter2;

public class LegacyUtilityImpl implements LegacyUtility {
    @Override
    public String getTime() {
        return "legacy getTime()";
    }

    @Override
    public String randomKey() {
        return "legacy randomKey()";
    }

    @Override
    public String hexToString() {
        return "legacy hexToString()";
    }
}
