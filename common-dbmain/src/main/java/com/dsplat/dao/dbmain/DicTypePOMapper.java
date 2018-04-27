package com.dsplat.dao.dbmain;

import com.dsplat.dao.dbmain.mybatis.DicTypePO;
import com.dsplat.dao.dbmain.mybatis.DicTypePOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicTypePOMapper {
    long countByExample(DicTypePOCriteria example);

    int deleteByExample(DicTypePOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DicTypePO record);

    int insertSelective(DicTypePO record);

    List<DicTypePO> selectByExample(DicTypePOCriteria example);

    DicTypePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DicTypePO record, @Param("example") DicTypePOCriteria example);

    int updateByExample(@Param("record") DicTypePO record, @Param("example") DicTypePOCriteria example);

    int updateByPrimaryKeySelective(DicTypePO record);

    int updateByPrimaryKey(DicTypePO record);
}