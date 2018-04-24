package learning.mapper;

import learning.model.CreditManage;

public interface CreditManageMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CreditManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CreditManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CreditManage selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CreditManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CreditManage record);
}