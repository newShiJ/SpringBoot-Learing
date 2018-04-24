package learning.mapper;

import learning.model.UserCmyRes;

public interface UserCmyResMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(UserCmyRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(UserCmyRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    UserCmyRes selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(UserCmyRes record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(UserCmyRes record);
}