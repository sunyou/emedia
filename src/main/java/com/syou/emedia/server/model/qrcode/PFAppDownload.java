package com.syou.emedia.server.model.qrcode;

import java.util.Date;

public class PFAppDownload {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_app_download.download_id
     *
     * @mbggenerated
     */
    private Integer downloadId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_app_download.mac
     *
     * @mbggenerated
     */
    private String mac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_app_download.app_id
     *
     * @mbggenerated
     */
    private Integer appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_app_download.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_app_download.download_id
     *
     * @return the value of platform_app_download.download_id
     *
     * @mbggenerated
     */
    public Integer getDownloadId() {
        return downloadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_app_download.download_id
     *
     * @param downloadId the value for platform_app_download.download_id
     *
     * @mbggenerated
     */
    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_app_download.mac
     *
     * @return the value of platform_app_download.mac
     *
     * @mbggenerated
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_app_download.mac
     *
     * @param mac the value for platform_app_download.mac
     *
     * @mbggenerated
     */
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_app_download.app_id
     *
     * @return the value of platform_app_download.app_id
     *
     * @mbggenerated
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_app_download.app_id
     *
     * @param appId the value for platform_app_download.app_id
     *
     * @mbggenerated
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_app_download.create_time
     *
     * @return the value of platform_app_download.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_app_download.create_time
     *
     * @param createTime the value for platform_app_download.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_app_download
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", downloadId=").append(downloadId);
        sb.append(", mac=").append(mac);
        sb.append(", appId=").append(appId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}