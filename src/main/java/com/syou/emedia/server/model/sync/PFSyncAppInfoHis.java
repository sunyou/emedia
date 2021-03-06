package com.syou.emedia.server.model.sync;

import java.util.Date;

public class PFSyncAppInfoHis {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.his_id
     *
     * @mbggenerated
     */
    private Integer hisId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.sync_id
     *
     * @mbggenerated
     */
    private Integer syncId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.channel_id
     *
     * @mbggenerated
     */
    private String channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.ext_app_code
     *
     * @mbggenerated
     */
    private String extAppCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.mac
     *
     * @mbggenerated
     */
    private String mac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.first_login_time
     *
     * @mbggenerated
     */
    private Date firstLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_sync_appinfo_his.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.his_id
     *
     * @return the value of platform_sync_appinfo_his.his_id
     *
     * @mbggenerated
     */
    public Integer getHisId() {
        return hisId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.his_id
     *
     * @param hisId the value for platform_sync_appinfo_his.his_id
     *
     * @mbggenerated
     */
    public void setHisId(Integer hisId) {
        this.hisId = hisId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.sync_id
     *
     * @return the value of platform_sync_appinfo_his.sync_id
     *
     * @mbggenerated
     */
    public Integer getSyncId() {
        return syncId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.sync_id
     *
     * @param syncId the value for platform_sync_appinfo_his.sync_id
     *
     * @mbggenerated
     */
    public void setSyncId(Integer syncId) {
        this.syncId = syncId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.channel_id
     *
     * @return the value of platform_sync_appinfo_his.channel_id
     *
     * @mbggenerated
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.channel_id
     *
     * @param channelId the value for platform_sync_appinfo_his.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.ext_app_code
     *
     * @return the value of platform_sync_appinfo_his.ext_app_code
     *
     * @mbggenerated
     */
    public String getExtAppCode() {
        return extAppCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.ext_app_code
     *
     * @param extAppCode the value for platform_sync_appinfo_his.ext_app_code
     *
     * @mbggenerated
     */
    public void setExtAppCode(String extAppCode) {
        this.extAppCode = extAppCode == null ? null : extAppCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.mac
     *
     * @return the value of platform_sync_appinfo_his.mac
     *
     * @mbggenerated
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.mac
     *
     * @param mac the value for platform_sync_appinfo_his.mac
     *
     * @mbggenerated
     */
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.first_login_time
     *
     * @return the value of platform_sync_appinfo_his.first_login_time
     *
     * @mbggenerated
     */
    public Date getFirstLoginTime() {
        return firstLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.first_login_time
     *
     * @param firstLoginTime the value for platform_sync_appinfo_his.first_login_time
     *
     * @mbggenerated
     */
    public void setFirstLoginTime(Date firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_sync_appinfo_his.create_time
     *
     * @return the value of platform_sync_appinfo_his.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_sync_appinfo_his.create_time
     *
     * @param createTime the value for platform_sync_appinfo_his.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo_his
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hisId=").append(hisId);
        sb.append(", syncId=").append(syncId);
        sb.append(", channelId=").append(channelId);
        sb.append(", extAppCode=").append(extAppCode);
        sb.append(", mac=").append(mac);
        sb.append(", firstLoginTime=").append(firstLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}