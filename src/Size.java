public enum Size {
    L("Large"),
    S("Small"),
    M("Medium"),
    XL("Extra Large");

    private String size;

    public String getSize() {
        return size;
    }

    private Size(String size) {
        this.size = size;
    }
}
