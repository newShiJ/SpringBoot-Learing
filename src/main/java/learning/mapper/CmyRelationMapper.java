package learning.mapper;

import learning.model.CmyRelation;

public interface CmyRelationMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CmyRelation record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CmyRelation record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CmyRelation selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CmyRelation record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CmyRelation record);
}