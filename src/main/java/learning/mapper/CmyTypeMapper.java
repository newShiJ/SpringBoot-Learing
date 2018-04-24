package learning.mapper;

import learning.model.CmyType;

public interface CmyTypeMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CmyType record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CmyType record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CmyType selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CmyType record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CmyType record);
}