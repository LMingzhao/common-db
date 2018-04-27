package com.dsplat.dao.dbinc;

import com.dsplat.dao.dbinc.mybatis.CmsUserPO;
import com.dsplat.dao.dbinc.mybatis.CmsUserPOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserPOMapper {
    long countByExample(CmsUserPOCriteria example);

    int deleteByExample(CmsUserPOCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsUserPO record);

    int insertSelective(CmsUserPO record);

    List<CmsUserPO> selectByExample(CmsUserPOCriteria example);

    CmsUserPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsUserPO record, @Param("example") CmsUserPOCriteria example);

    int updateByExample(@Param("record") CmsUserPO record, @Param("example") CmsUserPOCriteria example);

    int updateByPrimaryKeySelective(CmsUserPO record);

    int updateByPrimaryKey(CmsUserPO record);
}