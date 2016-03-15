package com.syou.emedia.server.mapper.sync;

import com.syou.emedia.server.model.sync.PFSyncAppInfo;
import com.syou.emedia.server.model.sync.PFSyncAppInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PFSyncAppInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int countByExample(PFSyncAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int deleteByExample(PFSyncAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer syncId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int insert(PFSyncAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int insertSelective(PFSyncAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    List<PFSyncAppInfo> selectByExampleWithRowbounds(PFSyncAppInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    List<PFSyncAppInfo> selectByExample(PFSyncAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    PFSyncAppInfo selectByPrimaryKey(Integer syncId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PFSyncAppInfo record, @Param("example") PFSyncAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PFSyncAppInfo record, @Param("example") PFSyncAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PFSyncAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_sync_appinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PFSyncAppInfo record);
}