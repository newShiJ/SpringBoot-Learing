package learning.mapper;

import learning.model.UserCmyPosition;

public interface UserCmyPositionMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(UserCmyPosition record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(UserCmyPosition record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    UserCmyPosition selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(UserCmyPosition record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(UserCmyPosition record);
}