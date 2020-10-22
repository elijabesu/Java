package parts.ten.techniques;

public enum Colour {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code;

    Colour(String code) { // no need to write private
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
