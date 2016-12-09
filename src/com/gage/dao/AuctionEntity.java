package com.gage.dao;

import javax.persistence.*;

/**
 * Created by rush on 2016/12/9.
 */
@Entity
@Table(name = "auction", schema = "gage", catalog = "")
public class AuctionEntity {
    private int id;
    private String type;
    private Integer objectId;
    private String objectName;
    private Byte isTechnology;
    private Long number;
    private Integer commanderId;
    private String commanderName;
    private Integer initialHonours;
    private Integer buyoutHonours;
    private Integer starId;
    private String starName;
    private Integer planetId;
    private String planetName;
    private Integer durationTime;
    private Integer startTime;
    private Integer endTime;
    private Integer bidCommanderId;
    private String bidCommanderName;
    private Integer bidHonours;
    private Byte isFinish;
    private Byte isGet;
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
    @Column(name = "type", nullable = true, length = 15)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "objectId", nullable = true)
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "objectName", nullable = true, length = 50)
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Basic
    @Column(name = "isTechnology", nullable = true)
    public Byte getIsTechnology() {
        return isTechnology;
    }

    public void setIsTechnology(Byte isTechnology) {
        this.isTechnology = isTechnology;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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
    @Column(name = "initialHonours", nullable = true)
    public Integer getInitialHonours() {
        return initialHonours;
    }

    public void setInitialHonours(Integer initialHonours) {
        this.initialHonours = initialHonours;
    }

    @Basic
    @Column(name = "buyoutHonours", nullable = true)
    public Integer getBuyoutHonours() {
        return buyoutHonours;
    }

    public void setBuyoutHonours(Integer buyoutHonours) {
        this.buyoutHonours = buyoutHonours;
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
    @Column(name = "starName", nullable = true, length = 40)
    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
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
    @Column(name = "planetName", nullable = true, length = 40)
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    @Basic
    @Column(name = "durationTime", nullable = true)
    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    @Basic
    @Column(name = "startTime", nullable = true)
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "endTime", nullable = true)
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "bidCommanderId", nullable = true)
    public Integer getBidCommanderId() {
        return bidCommanderId;
    }

    public void setBidCommanderId(Integer bidCommanderId) {
        this.bidCommanderId = bidCommanderId;
    }

    @Basic
    @Column(name = "bidCommanderName", nullable = true, length = 50)
    public String getBidCommanderName() {
        return bidCommanderName;
    }

    public void setBidCommanderName(String bidCommanderName) {
        this.bidCommanderName = bidCommanderName;
    }

    @Basic
    @Column(name = "bidHonours", nullable = true)
    public Integer getBidHonours() {
        return bidHonours;
    }

    public void setBidHonours(Integer bidHonours) {
        this.bidHonours = bidHonours;
    }

    @Basic
    @Column(name = "isFinish", nullable = true)
    public Byte getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Byte isFinish) {
        this.isFinish = isFinish;
    }

    @Basic
    @Column(name = "isGet", nullable = true)
    public Byte getIsGet() {
        return isGet;
    }

    public void setIsGet(Byte isGet) {
        this.isGet = isGet;
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

        AuctionEntity that = (AuctionEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (objectName != null ? !objectName.equals(that.objectName) : that.objectName != null) return false;
        if (isTechnology != null ? !isTechnology.equals(that.isTechnology) : that.isTechnology != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (commanderId != null ? !commanderId.equals(that.commanderId) : that.commanderId != null) return false;
        if (commanderName != null ? !commanderName.equals(that.commanderName) : that.commanderName != null)
            return false;
        if (initialHonours != null ? !initialHonours.equals(that.initialHonours) : that.initialHonours != null)
            return false;
        if (buyoutHonours != null ? !buyoutHonours.equals(that.buyoutHonours) : that.buyoutHonours != null)
            return false;
        if (starId != null ? !starId.equals(that.starId) : that.starId != null) return false;
        if (starName != null ? !starName.equals(that.starName) : that.starName != null) return false;
        if (planetId != null ? !planetId.equals(that.planetId) : that.planetId != null) return false;
        if (planetName != null ? !planetName.equals(that.planetName) : that.planetName != null) return false;
        if (durationTime != null ? !durationTime.equals(that.durationTime) : that.durationTime != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (bidCommanderId != null ? !bidCommanderId.equals(that.bidCommanderId) : that.bidCommanderId != null)
            return false;
        if (bidCommanderName != null ? !bidCommanderName.equals(that.bidCommanderName) : that.bidCommanderName != null)
            return false;
        if (bidHonours != null ? !bidHonours.equals(that.bidHonours) : that.bidHonours != null) return false;
        if (isFinish != null ? !isFinish.equals(that.isFinish) : that.isFinish != null) return false;
        if (isGet != null ? !isGet.equals(that.isGet) : that.isGet != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (objectName != null ? objectName.hashCode() : 0);
        result = 31 * result + (isTechnology != null ? isTechnology.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (commanderId != null ? commanderId.hashCode() : 0);
        result = 31 * result + (commanderName != null ? commanderName.hashCode() : 0);
        result = 31 * result + (initialHonours != null ? initialHonours.hashCode() : 0);
        result = 31 * result + (buyoutHonours != null ? buyoutHonours.hashCode() : 0);
        result = 31 * result + (starId != null ? starId.hashCode() : 0);
        result = 31 * result + (starName != null ? starName.hashCode() : 0);
        result = 31 * result + (planetId != null ? planetId.hashCode() : 0);
        result = 31 * result + (planetName != null ? planetName.hashCode() : 0);
        result = 31 * result + (durationTime != null ? durationTime.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (bidCommanderId != null ? bidCommanderId.hashCode() : 0);
        result = 31 * result + (bidCommanderName != null ? bidCommanderName.hashCode() : 0);
        result = 31 * result + (bidHonours != null ? bidHonours.hashCode() : 0);
        result = 31 * result + (isFinish != null ? isFinish.hashCode() : 0);
        result = 31 * result + (isGet != null ? isGet.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
