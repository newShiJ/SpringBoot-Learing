package learning.mapper;

import learning.model.AbnormalData;

public interface AbnormalDataMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(AbnormalData record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(AbnormalData record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    AbnormalData selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(AbnormalData record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(AbnormalData record);
}