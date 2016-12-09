package com.gage.dao;

import javax.persistence.*;

/**
 * Created by rush on 2016/12/9.
 */
@Entity
@Table(name = "assignment", schema = "gage", catalog = "")
public class AssignmentEntity {
    private int id;
    private String inMaterial;
    private String outMaterial;
    private String name;
    private String description;
    private String detail;
    private Integer starId;
    private Integer planetId;
    private Integer commanderId;
    private String commanderName;
    private Byte active;
    private Integer influenceId;
    private String type;
    private String action;
    private Integer number;
    private Byte npcFlag;
    private Integer version;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "inMaterial", nullable = true, length = -1)
    public String getInMaterial() {
        return inMaterial;
    }

    public void setInMaterial(String inMaterial) {
        this.inMaterial = inMaterial;
    }

    @Basic
    @Column(name = "outMaterial", nullable = true, length = -1)
    public String getOutMaterial() {
        return outMaterial;
    }

    public void setOutMaterial(String outMaterial) {
        this.outMaterial = outMaterial;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "detail", nullable = true, length = -1)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "starId", nullable = true)
    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    @Basic
    @Column(name = "planetId", nullable = true)
    public Integer getPlanetId() {
        return planetId;
    }

    public void setPlanetId(Integer planetId) {
        this.planetId = planetId;
    }

    @Basic
    @Column(name = "commanderId", nullable = true)
    public Integer getCommanderId() {
        return commanderId;
    }

    public void setCommanderId(Integer commanderId) {
        this.commanderId = commanderId;
    }

    @Basic
    @Column(name = "commanderName", nullable = true, length = 50)
    public String getCommanderName() {
        return commanderName;
    }

    public void setCommanderName(String commanderName) {
        this.commanderName = commanderName;
    }

    @Basic
    @Column(name = "active", nullable = true)
    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "influenceId", nullable = true)
    public Integer getInfluenceId() {
        return influenceId;
    }

    public void setInfluenceId(Integer influenceId) {
        this.influenceId = influenceId;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 30)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "action", nullable = true, length = 20)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "npcFlag", nullable = true)
    public Byte getNpcFlag() {
        return npcFlag;
    }

    public void setNpcFlag(Byte npcFlag) {
        this.npcFlag = npcFlag;
    }

    @Basic
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssignmentEntity that = (AssignmentEntity) o;

        if (id != that.id) return false;
        if (inMaterial != null ? !inMaterial.equals(that.inMaterial) : that.inMaterial != null) return false;
        if (outMaterial != null ? !outMaterial.equals(that.outMaterial) : that.outMaterial != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (starId != null ? !starId.equals(that.starId) : that.starId != null) return false;
        if (planetId != null ? !planetId.equals(that.planetId) : that.planetId != null) return false;
        if (commanderId != null ? !commanderId.equals(that.commanderId) : that.commanderId != null) return false;
        if (commanderName != null ? !commanderName.equals(that.commanderName) : that.commanderName != null)
            return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (influenceId != null ? !influenceId.equals(that.influenceId) : that.influenceId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (action != null ? !action.equals(that.action) : that.action != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (npcFlag != null ? !npcFlag.equals(that.npcFlag) : that.npcFlag != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (inMaterial != null ? inMaterial.hashCode() : 0);
        result = 31 * result + (outMaterial != null ? outMaterial.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (starId != null ? starId.hashCode() : 0);
        result = 31 * result + (planetId != null ? planetId.hashCode() : 0);
        result = 31 * result + (commanderId != null ? commanderId.hashCode() : 0);
        result = 31 * result + (commanderName != null ? commanderName.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (influenceId != null ? influenceId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (npcFlag != null ? npcFlag.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
