package learning.mapper;

import learning.model.TypePosRes;

public interface TypePosResMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(TypePosRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(TypePosRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    TypePosRes selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(TypePosRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(TypePosRes record);
}