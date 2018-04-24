package learning.mapper;

import learning.model.BankSiteInfo;

public interface BankSiteInfoMapper {
    /**
     *
     * @mbg.generated 2018-04-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insert(BankSiteInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int insertSelective(BankSiteInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    BankSiteInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKeySelective(BankSiteInfo record);

    /**
     *
     * @mbg.generated 2018-04-23
     */
    int updateByPrimaryKey(BankSiteInfo record);
}