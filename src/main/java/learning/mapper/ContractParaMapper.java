package learning.mapper;

import learning.model.ContractPara;

public interface ContractParaMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(ContractPara record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(ContractPara record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    ContractPara selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(ContractPara record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(ContractPara record);
}