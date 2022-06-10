package fpt.aptech.parkinggo.domain.response;

import fpt.aptech.parkinggo.domain.enumm.Roles;

public class LoginRes {
    private String token;
    private Roles role;

    public LoginRes() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
