package structual.adapter2;

public class NewUtilityImpl implements NewUtility {
    @Override
    public String getTime() {
        return "new getTime()";
    }

    @Override
    public String randomKey() {
        return "new randomKey()";
    }

    @Override
    public String hexToString() {
        return "new hexToString()";
    }
    @Override
    public String stringToHex() {
        return null;
    }

    @Override
    public String stringToSha256() {
        return null;
    }
}
