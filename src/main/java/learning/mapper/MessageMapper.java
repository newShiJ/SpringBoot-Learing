package learning.mapper;

import learning.model.Message;

public interface MessageMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(Message record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(Message record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    Message selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(Message record);
}