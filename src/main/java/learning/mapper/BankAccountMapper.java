package learning.mapper;

import learning.model.BankAccount;

public interface BankAccountMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BankAccount record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BankAccount record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BankAccount selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BankAccount record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BankAccount record);
}