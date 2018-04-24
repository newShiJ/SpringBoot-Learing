package learning.mapper;

import learning.model.BusinessFlow;

public interface BusinessFlowMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BusinessFlow record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BusinessFlow record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BusinessFlow selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BusinessFlow record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BusinessFlow record);
}