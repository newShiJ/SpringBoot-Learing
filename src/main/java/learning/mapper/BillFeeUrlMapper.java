package learning.mapper;

import learning.model.BillFeeUrl;

public interface BillFeeUrlMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BillFeeUrl record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BillFeeUrl record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BillFeeUrl selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BillFeeUrl record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BillFeeUrl record);
}