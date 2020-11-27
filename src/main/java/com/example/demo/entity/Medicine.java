package com.example.demo.entity;

import java.sql.Date;

public class Medicine {

    private Integer id;
    private String name;
    private String shuLiang;
    private String weiZhi;
    private String guiGe;
    private String baoZhuang;
    private String changShang;
    private Date shengChanRiQi;
    private Date youXiaoQi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShuLiang() {
        return shuLiang;
    }

    public void setShuLiang(String shuLiang) {
        this.shuLiang = shuLiang;
    }

    public String getWeiZhi() {
        return weiZhi;
    }

    public void setWeiZhi(String weiZhi) {
        this.weiZhi = weiZhi;
    }

    public String getGuiGe() {
        return guiGe;
    }

    public void setGuiGe(String guiGe) {
        this.guiGe = guiGe;
    }

    public String getBaoZhuang() {
        return baoZhuang;
    }

    public void setBaoZhuang(String baoZhuang) {
        this.baoZhuang = baoZhuang;
    }

    public String getChangShang() {
        return changShang;
    }

    public void setChangShang(String changShang) {
        this.changShang = changShang;
    }

    public Date getShengChanRiQi() {
        return shengChanRiQi;
    }

    public void setShengChanRiQi(Date shengChanRiQi) {
        this.shengChanRiQi = shengChanRiQi;
    }

    public Date getYouXiaoQi() {
        return youXiaoQi;
    }

    public void setYouXiaoQi(Date youXiaoQi) {
        this.youXiaoQi = youXiaoQi;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shuLiang='" + shuLiang + '\'' +
                ", weiZhi='" + weiZhi + '\'' +
                ", guiGe='" + guiGe + '\'' +
                ", baoZhuang='" + baoZhuang + '\'' +
                ", changShang='" + changShang + '\'' +
                ", shengChanRiQi=" + shengChanRiQi +
                ", youXiaoQi=" + youXiaoQi +
                '}';
    }
}
