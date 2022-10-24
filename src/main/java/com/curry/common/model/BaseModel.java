package com.curry.common.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 通用字段
 *
 * @author curry
 * @since 2022-10-24
 */
public class BaseModel<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 数据主键ID，一般建议为数据库自增，且类型为数字类型
     */
    private T id;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新人
     */
    private String lastUpdateUser;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastUpdateTime;

    /**
     * 是否删除，true表示数据已经删除
     */
    private Boolean deleted;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
