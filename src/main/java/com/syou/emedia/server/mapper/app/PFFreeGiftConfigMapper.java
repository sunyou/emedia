package com.syou.emedia.server.mapper.app;

import com.syou.emedia.server.model.app.PFFreeGiftConfig;
import com.syou.emedia.server.model.app.PFFreeGiftConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFFreeGiftConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int countByExample(PFFreeGiftConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int deleteByExample(PFFreeGiftConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int insert(PFFreeGiftConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int insertSelective(PFFreeGiftConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    List<PFFreeGiftConfig> selectByExampleWithRowbounds(PFFreeGiftConfigExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    List<PFFreeGiftConfig> selectByExample(PFFreeGiftConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    PFFreeGiftConfig selectByPrimaryKey(Integer configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFFreeGiftConfig record, @Param("example") PFFreeGiftConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFFreeGiftConfig record, @Param("example") PFFreeGiftConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFFreeGiftConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_free_gift_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFFreeGiftConfig record);
}