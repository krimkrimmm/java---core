package enums;

public enum Role {
    ADMIN("Admin"),
    USER("User");

    private final String roleName;

    public String getRoleName() {
        return roleName;
    }

    Role(String roleName) {
        this.roleName = roleName;
    }


}

