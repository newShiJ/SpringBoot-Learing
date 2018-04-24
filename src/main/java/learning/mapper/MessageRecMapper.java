package learning.mapper;

import learning.model.MessageRec;

public interface MessageRecMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(MessageRec record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(MessageRec record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    MessageRec selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(MessageRec record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(MessageRec record);
}