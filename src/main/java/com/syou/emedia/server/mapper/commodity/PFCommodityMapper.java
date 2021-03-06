package com.syou.emedia.server.mapper.commodity;

import com.syou.emedia.server.model.commodity.PFCommodity;
import com.syou.emedia.server.model.commodity.PFCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFCommodityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int countByExample(PFCommodityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int deleteByExample(PFCommodityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer commodityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int insert(PFCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int insertSelective(PFCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    List<PFCommodity> selectByExampleWithRowbounds(PFCommodityExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    List<PFCommodity> selectByExample(PFCommodityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    PFCommodity selectByPrimaryKey(Integer commodityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFCommodity record, @Param("example") PFCommodityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFCommodity record, @Param("example") PFCommodityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_commodity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFCommodity record);
}