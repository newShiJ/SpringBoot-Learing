package learning.mapper;

import learning.model.ParaManage;

public interface ParaManageMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(ParaManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(ParaManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    ParaManage selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(ParaManage record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(ParaManage record);
}