package com.syou.emedia.server.mapper.app;

import com.syou.emedia.server.model.app.PFFreeGiveRecord;
import com.syou.emedia.server.model.app.PFFreeGiveRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFFreeGiveRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int countByExample(PFFreeGiveRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int deleteByExample(PFFreeGiveRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer giveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int insert(PFFreeGiveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int insertSelective(PFFreeGiveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    List<PFFreeGiveRecord> selectByExampleWithRowbounds(PFFreeGiveRecordExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    List<PFFreeGiveRecord> selectByExample(PFFreeGiveRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    PFFreeGiveRecord selectByPrimaryKey(Integer giveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFFreeGiveRecord record, @Param("example") PFFreeGiveRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFFreeGiveRecord record, @Param("example") PFFreeGiveRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFFreeGiveRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_give_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFFreeGiveRecord record);
}