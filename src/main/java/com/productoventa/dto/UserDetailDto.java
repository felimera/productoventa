package com.productoventa.dto;

public class UserDetailDto {
    private Long UserId;
    private String UserCodigo;
    private String UserLogin;
    private String UserPass;

    public UserDetailDto() {
    }

    public UserDetailDto(Long userId, String userCodigo, String userLogin, String userPass) {
        UserId = userId;
        UserCodigo = userCodigo;
        UserLogin = userLogin;
        UserPass = userPass;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserCodigo() {
        return UserCodigo;
    }

    public void setUserCodigo(String userCodigo) {
        UserCodigo = userCodigo;
    }

    public String getUserLogin() {
        return UserLogin;
    }

    public void setUserLogin(String userLogin) {
        UserLogin = userLogin;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }
}
