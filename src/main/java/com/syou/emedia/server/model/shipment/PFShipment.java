package com.syou.emedia.server.model.shipment;

import java.util.Date;

public class PFShipment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.shipment_id
     *
     * @mbggenerated
     */
    private Integer shipmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.shipment_result
     *
     * @mbggenerated
     */
    private String shipmentResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.shipment_desc
     *
     * @mbggenerated
     */
    private String shipmentDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.commodity_id
     *
     * @mbggenerated
     */
    private String commodityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.terminal_id
     *
     * @mbggenerated
     */
    private String terminalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform_shipment.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.shipment_id
     *
     * @return the value of platform_shipment.shipment_id
     *
     * @mbggenerated
     */
    public Integer getShipmentId() {
        return shipmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.shipment_id
     *
     * @param shipmentId the value for platform_shipment.shipment_id
     *
     * @mbggenerated
     */
    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.shipment_result
     *
     * @return the value of platform_shipment.shipment_result
     *
     * @mbggenerated
     */
    public String getShipmentResult() {
        return shipmentResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.shipment_result
     *
     * @param shipmentResult the value for platform_shipment.shipment_result
     *
     * @mbggenerated
     */
    public void setShipmentResult(String shipmentResult) {
        this.shipmentResult = shipmentResult == null ? null : shipmentResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.shipment_desc
     *
     * @return the value of platform_shipment.shipment_desc
     *
     * @mbggenerated
     */
    public String getShipmentDesc() {
        return shipmentDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.shipment_desc
     *
     * @param shipmentDesc the value for platform_shipment.shipment_desc
     *
     * @mbggenerated
     */
    public void setShipmentDesc(String shipmentDesc) {
        this.shipmentDesc = shipmentDesc == null ? null : shipmentDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.commodity_id
     *
     * @return the value of platform_shipment.commodity_id
     *
     * @mbggenerated
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.commodity_id
     *
     * @param commodityId the value for platform_shipment.commodity_id
     *
     * @mbggenerated
     */
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.terminal_id
     *
     * @return the value of platform_shipment.terminal_id
     *
     * @mbggenerated
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.terminal_id
     *
     * @param terminalId the value for platform_shipment.terminal_id
     *
     * @mbggenerated
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform_shipment.create_time
     *
     * @return the value of platform_shipment.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform_shipment.create_time
     *
     * @param createTime the value for platform_shipment.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shipmentId=").append(shipmentId);
        sb.append(", shipmentResult=").append(shipmentResult);
        sb.append(", shipmentDesc=").append(shipmentDesc);
        sb.append(", commodityId=").append(commodityId);
        sb.append(", terminalId=").append(terminalId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}