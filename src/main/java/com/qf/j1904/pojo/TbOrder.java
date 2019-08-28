package com.qf.j1904.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbOrder implements Serializable {
    private Integer orderid;

    private Date createtime;

    private Date endingtime;

    private Integer idvalid;

    private static final long serialVersionUID = 1L;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndingtime() {
        return endingtime;
    }

    public void setEndingtime(Date endingtime) {
        this.endingtime = endingtime;
    }

    public Integer getIdvalid() {
        return idvalid;
    }

    public void setIdvalid(Integer idvalid) {
        this.idvalid = idvalid;
    }
}