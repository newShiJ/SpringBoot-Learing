package learning.mapper;

import learning.model.CompanyInfo;

public interface CompanyInfoMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(CompanyInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(CompanyInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    CompanyInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(CompanyInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(CompanyInfo record);
}