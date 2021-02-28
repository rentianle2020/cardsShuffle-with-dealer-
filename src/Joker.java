public enum Joker {
    BIG_JOKER("BJ"),SMALL_JOKER("SJ");

    private final String abbr;

    Joker(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
