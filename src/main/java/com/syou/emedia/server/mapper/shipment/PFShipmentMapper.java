package com.syou.emedia.server.mapper.shipment;

import com.syou.emedia.server.model.shipment.PFShipment;
import com.syou.emedia.server.model.shipment.PFShipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFShipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int countByExample(PFShipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int deleteByExample(PFShipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer shipmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int insert(PFShipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int insertSelective(PFShipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    List<PFShipment> selectByExampleWithRowbounds(PFShipmentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    List<PFShipment> selectByExample(PFShipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    PFShipment selectByPrimaryKey(Integer shipmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFShipment record, @Param("example") PFShipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFShipment record, @Param("example") PFShipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFShipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFShipment record);
}