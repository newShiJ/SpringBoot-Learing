package learning.mapper;

import learning.model.MessageTemplate;

public interface MessageTemplateMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(MessageTemplate record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(MessageTemplate record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    MessageTemplate selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(MessageTemplate record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(MessageTemplate record);
}