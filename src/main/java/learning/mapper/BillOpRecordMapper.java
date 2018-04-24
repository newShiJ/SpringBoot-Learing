package learning.mapper;

import learning.model.BillOpRecord;

public interface BillOpRecordMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BillOpRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BillOpRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BillOpRecord selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BillOpRecord record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BillOpRecord record);
}