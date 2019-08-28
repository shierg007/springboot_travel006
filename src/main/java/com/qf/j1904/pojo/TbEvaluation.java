package com.qf.j1904.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbEvaluation implements Serializable {
    private Integer evaluationid;

    private Integer evaluationstar;

    private String evaluationinfo;

    private String evaluationimg;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getEvaluationid() {
        return evaluationid;
    }

    public void setEvaluationid(Integer evaluationid) {
        this.evaluationid = evaluationid;
    }

    public Integer getEvaluationstar() {
        return evaluationstar;
    }

    public void setEvaluationstar(Integer evaluationstar) {
        this.evaluationstar = evaluationstar;
    }

    public String getEvaluationinfo() {
        return evaluationinfo;
    }

    public void setEvaluationinfo(String evaluationinfo) {
        this.evaluationinfo = evaluationinfo == null ? null : evaluationinfo.trim();
    }

    public String getEvaluationimg() {
        return evaluationimg;
    }

    public void setEvaluationimg(String evaluationimg) {
        this.evaluationimg = evaluationimg == null ? null : evaluationimg.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}