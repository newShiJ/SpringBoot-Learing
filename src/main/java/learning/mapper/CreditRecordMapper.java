package learning.mapper;

import learning.model.CreditRecord;

public interface CreditRecordMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CreditRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CreditRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CreditRecord selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CreditRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CreditRecord record);
}