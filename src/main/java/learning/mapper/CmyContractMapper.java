package learning.mapper;

import learning.model.CmyContract;

public interface CmyContractMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CmyContract record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CmyContract record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CmyContract selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CmyContract record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CmyContract record);
}