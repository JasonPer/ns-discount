package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PlayerPosts implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "帖子主题")
    private String theme;

    @ApiModelProperty(value = "帖子正文")
    private String content;

    @ApiModelProperty(value = "外键，关联玩家基本信息表")
    private Long playerBaseId;

    @ApiModelProperty(value = "外键，关联游戏基本信息表")
    private Long gameBaseId;

    @ApiModelProperty(value = "是否申请加精：0否1是")
    private Integer addFine;

    @ApiModelProperty(value = "是否精华帖子:0否1是")
    private Integer isFine;

    @ApiModelProperty(value = "发帖时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getPlayerBaseId() {
        return playerBaseId;
    }

    public void setPlayerBaseId(Long playerBaseId) {
        this.playerBaseId = playerBaseId;
    }

    public Long getGameBaseId() {
        return gameBaseId;
    }

    public void setGameBaseId(Long gameBaseId) {
        this.gameBaseId = gameBaseId;
    }

    public Integer getAddFine() {
        return addFine;
    }

    public void setAddFine(Integer addFine) {
        this.addFine = addFine;
    }

    public Integer getIsFine() {
        return isFine;
    }

    public void setIsFine(Integer isFine) {
        this.isFine = isFine;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", theme=").append(theme);
        sb.append(", content=").append(content);
        sb.append(", playerBaseId=").append(playerBaseId);
        sb.append(", gameBaseId=").append(gameBaseId);
        sb.append(", addFine=").append(addFine);
        sb.append(", isFine=").append(isFine);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}