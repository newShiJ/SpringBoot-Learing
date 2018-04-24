package learning.mapper;

import learning.model.User;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String address);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    User selectByPrimaryKey(String address);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(User record);
}