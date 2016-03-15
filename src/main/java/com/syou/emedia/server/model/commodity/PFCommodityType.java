package com.syou.emedia.server.model.commodity;

import java.util.Date;

public class PFCommodityType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_commodity_type.commodity_type_id
     *
     * @mbggenerated
     */
    private Integer commodityTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_commodity_type.commodity_type_name
     *
     * @mbggenerated
     */
    private String commodityTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_commodity_type.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_commodity_type.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_commodity_type.commodity_type_id
     *
     * @return the value of platform_commodity_type.commodity_type_id
     *
     * @mbggenerated
     */
    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_commodity_type.commodity_type_id
     *
     * @param commodityTypeId the value for platform_commodity_type.commodity_type_id
     *
     * @mbggenerated
     */
    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_commodity_type.commodity_type_name
     *
     * @return the value of platform_commodity_type.commodity_type_name
     *
     * @mbggenerated
     */
    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_commodity_type.commodity_type_name
     *
     * @param commodityTypeName the value for platform_commodity_type.commodity_type_name
     *
     * @mbggenerated
     */
    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName == null ? null : commodityTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_commodity_type.status
     *
     * @return the value of platform_commodity_type.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_commodity_type.status
     *
     * @param status the value for platform_commodity_type.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_commodity_type.create_time
     *
     * @return the value of platform_commodity_type.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_commodity_type.create_time
     *
     * @param createTime the value for platform_commodity_type.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity_type
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", commodityTypeName=").append(commodityTypeName);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}