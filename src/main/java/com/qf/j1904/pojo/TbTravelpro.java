package com.qf.j1904.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbTravelpro implements Serializable {
    private Integer travelid;

    private String travelname;

    private BigDecimal travelprice;

    private String traveladress;

    private Integer traveltime;

    private String traveltype;

    private Date createtime;

    private Date changetime;

    private Integer operator;

    private String travelinfo;

    private Date endingtime;

    private static final long serialVersionUID = 1L;

    public Integer getTravelid() {
        return travelid;
    }

    public void setTravelid(Integer travelid) {
        this.travelid = travelid;
    }

    public String getTravelname() {
        return travelname;
    }

    public void setTravelname(String travelname) {
        this.travelname = travelname == null ? null : travelname.trim();
    }

    public BigDecimal getTravelprice() {
        return travelprice;
    }

    public void setTravelprice(BigDecimal travelprice) {
        this.travelprice = travelprice;
    }

    public String getTraveladress() {
        return traveladress;
    }

    public void setTraveladress(String traveladress) {
        this.traveladress = traveladress == null ? null : traveladress.trim();
    }

    public Integer getTraveltime() {
        return traveltime;
    }

    public void setTraveltime(Integer traveltime) {
        this.traveltime = traveltime;
    }

    public String getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(String traveltype) {
        this.traveltype = traveltype == null ? null : traveltype.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getTravelinfo() {
        return travelinfo;
    }

    public void setTravelinfo(String travelinfo) {
        this.travelinfo = travelinfo == null ? null : travelinfo.trim();
    }

    public Date getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(Date endingtime) {
        this.endingtime = endingtime;
    }
}