public enum Suit {
    SPADE("S"),HEART("H"),DIAMOND("D"),CLUB("C");

    private final String abbr;

    Suit(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
