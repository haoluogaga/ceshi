package com.pxy.pojo;

public class UserInfo {
    private Integer userid;

    private String username;

    private String paswword;

    private Integer typeid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPaswword() {
        return paswword;
    }

    public void setPaswword(String paswword) {
        this.paswword = paswword == null ? null : paswword.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}