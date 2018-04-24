package learning.mapper;

import learning.model.UserCmy;

public interface UserCmyMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(UserCmy record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(UserCmy record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    UserCmy selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(UserCmy record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(UserCmy record);
}