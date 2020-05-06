package org.jasonper.discountportal.domain;

import java.util.Date;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 16:28
 * @description
 */
public class CarouseSimple {
    private Long id;
    private String infoName;
    private String infoUrl;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
