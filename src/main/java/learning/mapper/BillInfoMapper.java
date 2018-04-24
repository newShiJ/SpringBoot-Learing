package learning.mapper;

import learning.model.BillInfo;

import java.util.List;

public interface BillInfoMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BillInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BillInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BillInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BillInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BillInfo record);

    List<BillInfo> selectAll();
}