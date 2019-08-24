package com.qf.j1904.pojo;

import java.io.Serializable;

public class TbPermissions implements Serializable {
    private Integer id;

    private Integer pId;

    private String permissionname;

    private String permissiondesc;

    private String permissionurl;

    private Integer ifvalid;

    private String checked = "false";

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getPermissiondesc() {
        return permissiondesc;
    }

    public void setPermissiondesc(String permissiondesc) {
        this.permissiondesc = permissiondesc == null ? null : permissiondesc.trim();
    }

    public String getPermissionurl() {
        return permissionurl;
    }

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl == null ? null : permissionurl.trim();
    }

    public Integer getIfvalid() {
        return ifvalid;
    }

    @Override
    public String toString() {
        return "TbPermissions{" +
                "id=" + id +
                ", pId=" + pId +
                ", permissionname='" + permissionname + '\'' +
                ", permissiondesc='" + permissiondesc + '\'' +
                ", permissionurl='" + permissionurl + '\'' +
                ", ifvalid=" + ifvalid +
                ", checked='" + checked + '\'' +
                '}';
    }

    public void setIfvalid(Integer ifvalid) {
        this.ifvalid = ifvalid;
    }
}