package learning.mapper;

import learning.model.Resource;

public interface ResourceMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(Resource record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(Resource record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    Resource selectByPrimaryKey(String code);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(Resource record);
}