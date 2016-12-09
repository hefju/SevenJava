package com.gage.dao;

import javax.persistence.*;

/**
 * Created by rush on 2016/12/9.
 */
@Entity
@Table(name = "active_code", schema = "gage", catalog = "")
public class ActiveCodeEntity {
    private int id;
    private String activeKey;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "activeKey", nullable = true, length = 40)
    public String getActiveKey() {
        return activeKey;
    }

    public void setActiveKey(String activeKey) {
        this.activeKey = activeKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiveCodeEntity that = (ActiveCodeEntity) o;

        if (id != that.id) return false;
        if (activeKey != null ? !activeKey.equals(that.activeKey) : that.activeKey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (activeKey != null ? activeKey.hashCode() : 0);
        return result;
    }
}
