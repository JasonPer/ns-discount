package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class GameBases implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "游戏英文名")
    private String nameEn;

    @ApiModelProperty(value = "游戏中文名")
    private String nameZh;

    @ApiModelProperty(value = "港区价格")
    private Long code;

    @ApiModelProperty(value = "发行时间")
    private Date issueDate;

    @ApiModelProperty(value = "游戏类型")
    private String tags;

    @ApiModelProperty(value = "游戏大小")
    private String gameSize;

    @ApiModelProperty(value = "支持玩家人数")
    private String playerNum;

    @ApiModelProperty(value = "ign评分")
    private String ign;

    @ApiModelProperty(value = "官方中文：0不支持，1支持")
    private Integer supportZh;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "封面图URL")
    private String coverUrl;

    @ApiModelProperty(value = "游戏简介")
    private String introduction;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getGameSize() {
        return gameSize;
    }

    public void setGameSize(String gameSize) {
        this.gameSize = gameSize;
    }

    public String getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(String playerNum) {
        this.playerNum = playerNum;
    }

    public String getIgn() {
        return ign;
    }

    public void setIgn(String ign) {
        this.ign = ign;
    }

    public Integer getSupportZh() {
        return supportZh;
    }

    public void setSupportZh(Integer supportZh) {
        this.supportZh = supportZh;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", nameZh=").append(nameZh);
        sb.append(", code=").append(code);
        sb.append(", issueDate=").append(issueDate);
        sb.append(", tags=").append(tags);
        sb.append(", gameSize=").append(gameSize);
        sb.append(", playerNum=").append(playerNum);
        sb.append(", ign=").append(ign);
        sb.append(", supportZh=").append(supportZh);
        sb.append(", createTime=").append(createTime);
        sb.append(", coverUrl=").append(coverUrl);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}