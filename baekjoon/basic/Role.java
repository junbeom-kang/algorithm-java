public enum Role {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    private String value;

    Role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
