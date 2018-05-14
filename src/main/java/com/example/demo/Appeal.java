package com.example.demo;

import java.util.Date;

/**
 * Created by xiaodm on 2018/5/2.
 */
public class Appeal {
    private int id;
    private String appealName;
    private String addr;
    private String tel;
    private Date appealTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppealName() {
        return appealName;
    }

    public void setAppealName(String appealName) {
        this.appealName = appealName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(Date appealTime) {
        this.appealTime = appealTime;
    }


}
