package learning.mapper;

import learning.model.DictionaryTable;

public interface DictionaryTableMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(DictionaryTable record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(DictionaryTable record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    DictionaryTable selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(DictionaryTable record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(DictionaryTable record);
}