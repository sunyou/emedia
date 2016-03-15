package com.syou.emedia.server.model.report;

import java.util.Date;

public class PFWifiReport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.report_id
     *
     * @mbggenerated
     */
    private Integer reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.mac
     *
     * @mbggenerated
     */
    private String mac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.ac_id
     *
     * @mbggenerated
     */
    private String acId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.ac_name
     *
     * @mbggenerated
     */
    private String acName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.ac_desc
     *
     * @mbggenerated
     */
    private String acDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_wifi_report.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.report_id
     *
     * @return the value of platform_wifi_report.report_id
     *
     * @mbggenerated
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.report_id
     *
     * @param reportId the value for platform_wifi_report.report_id
     *
     * @mbggenerated
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.ip
     *
     * @return the value of platform_wifi_report.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.ip
     *
     * @param ip the value for platform_wifi_report.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.mac
     *
     * @return the value of platform_wifi_report.mac
     *
     * @mbggenerated
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.mac
     *
     * @param mac the value for platform_wifi_report.mac
     *
     * @mbggenerated
     */
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.ac_id
     *
     * @return the value of platform_wifi_report.ac_id
     *
     * @mbggenerated
     */
    public String getAcId() {
        return acId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.ac_id
     *
     * @param acId the value for platform_wifi_report.ac_id
     *
     * @mbggenerated
     */
    public void setAcId(String acId) {
        this.acId = acId == null ? null : acId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.ac_name
     *
     * @return the value of platform_wifi_report.ac_name
     *
     * @mbggenerated
     */
    public String getAcName() {
        return acName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.ac_name
     *
     * @param acName the value for platform_wifi_report.ac_name
     *
     * @mbggenerated
     */
    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.ac_desc
     *
     * @return the value of platform_wifi_report.ac_desc
     *
     * @mbggenerated
     */
    public String getAcDesc() {
        return acDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.ac_desc
     *
     * @param acDesc the value for platform_wifi_report.ac_desc
     *
     * @mbggenerated
     */
    public void setAcDesc(String acDesc) {
        this.acDesc = acDesc == null ? null : acDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_wifi_report.create_time
     *
     * @return the value of platform_wifi_report.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_wifi_report.create_time
     *
     * @param createTime the value for platform_wifi_report.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reportId=").append(reportId);
        sb.append(", ip=").append(ip);
        sb.append(", mac=").append(mac);
        sb.append(", acId=").append(acId);
        sb.append(", acName=").append(acName);
        sb.append(", acDesc=").append(acDesc);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}