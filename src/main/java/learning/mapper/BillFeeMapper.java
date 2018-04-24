package learning.mapper;

import learning.model.BillFee;

public interface BillFeeMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BillFee record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BillFee record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BillFee selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BillFee record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BillFee record);
}