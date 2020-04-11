package org.jasonper.discountmbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PlayerGameReminds implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "外键，关联游戏基本信息表(降价游戏)")
    private Long gameBaseId;

    @ApiModelProperty(value = "外键，关联玩家基本信息表")
    private Long playerBaseId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGameBaseId() {
        return gameBaseId;
    }

    public void setGameBaseId(Long gameBaseId) {
        this.gameBaseId = gameBaseId;
    }

    public Long getPlayerBaseId() {
        return playerBaseId;
    }

    public void setPlayerBaseId(Long playerBaseId) {
        this.playerBaseId = playerBaseId;
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
        sb.append(", gameBaseId=").append(gameBaseId);
        sb.append(", playerBaseId=").append(playerBaseId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}