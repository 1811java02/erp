package com.accp.pojo;

public class T_WAREHOUSE {
    private String wareid;

    private String warename;

    private String contentper;

    private String contentphone;

    private String contentadre;

    private String remark;

    public String getWareid() {
        return wareid;
    }

    public void setWareid(String wareid) {
        this.wareid = wareid == null ? null : wareid.trim();
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public String getContentper() {
        return contentper;
    }

    public void setContentper(String contentper) {
        this.contentper = contentper == null ? null : contentper.trim();
    }

    public String getContentphone() {
        return contentphone;
    }

    public void setContentphone(String contentphone) {
        this.contentphone = contentphone == null ? null : contentphone.trim();
    }

    public String getContentadre() {
        return contentadre;
    }

    public void setContentadre(String contentadre) {
        this.contentadre = contentadre == null ? null : contentadre.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}