package com.schneider.auth.model;

public class AuthResponse {

    private String username;

    private String roleName;

    private String accessToken;

    public AuthResponse() { }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public AuthResponse(String username, String accessToken,String roleName) {
        this.username = username;
        this.accessToken = accessToken;
        this.roleName=roleName;
    }
}
