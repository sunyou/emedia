package com.syou.emedia.server.mapper.report;

import com.syou.emedia.server.model.report.PFWifiReport;
import com.syou.emedia.server.model.report.PFWifiReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFWifiReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int countByExample(PFWifiReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int deleteByExample(PFWifiReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer reportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int insert(PFWifiReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int insertSelective(PFWifiReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    List<PFWifiReport> selectByExampleWithRowbounds(PFWifiReportExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    List<PFWifiReport> selectByExample(PFWifiReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    PFWifiReport selectByPrimaryKey(Integer reportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFWifiReport record, @Param("example") PFWifiReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFWifiReport record, @Param("example") PFWifiReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFWifiReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFWifiReport record);
}