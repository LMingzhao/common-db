package com.dsplat.dao.dbmain;

import com.dsplat.dao.dbmain.mybatis.DicPO;
import com.dsplat.dao.dbmain.mybatis.DicPOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicPOMapper {
    long countByExample(DicPOCriteria example);

    int deleteByExample(DicPOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicPO record);

    int insertSelective(DicPO record);

    List<DicPO> selectByExample(DicPOCriteria example);

    DicPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicPO record, @Param("example") DicPOCriteria example);

    int updateByExample(@Param("record") DicPO record, @Param("example") DicPOCriteria example);

    int updateByPrimaryKeySelective(DicPO record);

    int updateByPrimaryKey(DicPO record);
}