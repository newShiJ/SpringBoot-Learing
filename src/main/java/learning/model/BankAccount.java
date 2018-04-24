package learning.model;

import java.io.Serializable;

public class BankAccount implements Serializable {
    /**
     * uuid主键
     */
    private String id;

    /**
     * 录入时间
     */
    private String createTime;

    /**
     * 是否逻辑删除
     */
    private String deleted;

    /**
     * 操作企业编号
     */
    private String opCmyCode;

    /**
     * 修改企业名称
     */
    private String opCmyName;

    /**
     * 操作时间
     */
    private String opTime;

    /**
     * 操作人编号
     */
    private String operatorCode;

    /**
     * 操作人名称
     */
    private String operatorName;

    /**
     * 预留字段1，使用后及时修改注释
     */
    private String reserved1;

    /**
     * 预留字段2，使用后及时修改注释
     */
    private String reserved2;

    /**
     * 预留字段3，使用后及时修改注释
     */
    private String reserved3;

    /**
     * 预留字段4，使用后及时修改注释
     */
    private Long reserved4;

    /**
     * 预留字段5，使用后及时修改注释
     */
    private Long reserved5;

    /**
     * 签名， 用于验证其他字段的值是否正确
     */
    private String signature;

    /**
     * 
     */
    private Integer version;

    /**
     * 开户账号名
     */
    private String accountName;

    /**
     * 账号状态,正常或着冻结
     */
    private String accountState;

    /**
     * 账户类型,eg. 一般结算账号
     */
    private String accountType;

    /**
     * 银行卡账号,银行卡号
     */
    private String bankNumber;

    /**
     * 企业代码
     */
    private String cmyCode;

    /**
     * 企业名称
     */
    private String cmyName;

    /**
     * 是否默认银行账号
     */
    private String isDefaultAccount;

    /**
     * 开户银行
     */
    private String openBank;

    /**
     * 开户城市
     */
    private String openCity;

    /**
     * 开户省份
     */
    private String openProvince;

    /**
     * 开户支行
     */
    private String openSubBranch;

    /**
     * bank_account
     */
    private static final long serialVersionUID = 1L;

    /**
     * uuid主键
     * @return id uuid主键
     */
    public String getId() {
        return id;
    }

    /**
     * uuid主键
     * @param id uuid主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 录入时间
     * @return create_time 录入时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 录入时间
     * @param createTime 录入时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 是否逻辑删除
     * @return deleted 是否逻辑删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 是否逻辑删除
     * @param deleted 是否逻辑删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    /**
     * 操作企业编号
     * @return op_cmy_code 操作企业编号
     */
    public String getOpCmyCode() {
        return opCmyCode;
    }

    /**
     * 操作企业编号
     * @param opCmyCode 操作企业编号
     */
    public void setOpCmyCode(String opCmyCode) {
        this.opCmyCode = opCmyCode == null ? null : opCmyCode.trim();
    }

    /**
     * 修改企业名称
     * @return op_cmy_name 修改企业名称
     */
    public String getOpCmyName() {
        return opCmyName;
    }

    /**
     * 修改企业名称
     * @param opCmyName 修改企业名称
     */
    public void setOpCmyName(String opCmyName) {
        this.opCmyName = opCmyName == null ? null : opCmyName.trim();
    }

    /**
     * 操作时间
     * @return op_time 操作时间
     */
    public String getOpTime() {
        return opTime;
    }

    /**
     * 操作时间
     * @param opTime 操作时间
     */
    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    /**
     * 操作人编号
     * @return operator_code 操作人编号
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 操作人编号
     * @param operatorCode 操作人编号
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    /**
     * 操作人名称
     * @return operator_name 操作人名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 操作人名称
     * @param operatorName 操作人名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @return reserved1 预留字段1，使用后及时修改注释
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 预留字段1，使用后及时修改注释
     * @param reserved1 预留字段1，使用后及时修改注释
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @return reserved2 预留字段2，使用后及时修改注释
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 预留字段2，使用后及时修改注释
     * @param reserved2 预留字段2，使用后及时修改注释
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @return reserved3 预留字段3，使用后及时修改注释
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 预留字段3，使用后及时修改注释
     * @param reserved3 预留字段3，使用后及时修改注释
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @return reserved4 预留字段4，使用后及时修改注释
     */
    public Long getReserved4() {
        return reserved4;
    }

    /**
     * 预留字段4，使用后及时修改注释
     * @param reserved4 预留字段4，使用后及时修改注释
     */
    public void setReserved4(Long reserved4) {
        this.reserved4 = reserved4;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @return reserved5 预留字段5，使用后及时修改注释
     */
    public Long getReserved5() {
        return reserved5;
    }

    /**
     * 预留字段5，使用后及时修改注释
     * @param reserved5 预留字段5，使用后及时修改注释
     */
    public void setReserved5(Long reserved5) {
        this.reserved5 = reserved5;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @return signature 签名， 用于验证其他字段的值是否正确
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 签名， 用于验证其他字段的值是否正确
     * @param signature 签名， 用于验证其他字段的值是否正确
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * 
     * @return version 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 开户账号名
     * @return account_name 开户账号名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 开户账号名
     * @param accountName 开户账号名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * 账号状态,正常或着冻结
     * @return account_state 账号状态,正常或着冻结
     */
    public String getAccountState() {
        return accountState;
    }

    /**
     * 账号状态,正常或着冻结
     * @param accountState 账号状态,正常或着冻结
     */
    public void setAccountState(String accountState) {
        this.accountState = accountState == null ? null : accountState.trim();
    }

    /**
     * 账户类型,eg. 一般结算账号
     * @return account_type 账户类型,eg. 一般结算账号
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 账户类型,eg. 一般结算账号
     * @param accountType 账户类型,eg. 一般结算账号
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 银行卡账号,银行卡号
     * @return bank_number 银行卡账号,银行卡号
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * 银行卡账号,银行卡号
     * @param bankNumber 银行卡账号,银行卡号
     */
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    /**
     * 企业代码
     * @return cmy_code 企业代码
     */
    public String getCmyCode() {
        return cmyCode;
    }

    /**
     * 企业代码
     * @param cmyCode 企业代码
     */
    public void setCmyCode(String cmyCode) {
        this.cmyCode = cmyCode == null ? null : cmyCode.trim();
    }

    /**
     * 企业名称
     * @return cmy_name 企业名称
     */
    public String getCmyName() {
        return cmyName;
    }

    /**
     * 企业名称
     * @param cmyName 企业名称
     */
    public void setCmyName(String cmyName) {
        this.cmyName = cmyName == null ? null : cmyName.trim();
    }

    /**
     * 是否默认银行账号
     * @return is_default_account 是否默认银行账号
     */
    public String getIsDefaultAccount() {
        return isDefaultAccount;
    }

    /**
     * 是否默认银行账号
     * @param isDefaultAccount 是否默认银行账号
     */
    public void setIsDefaultAccount(String isDefaultAccount) {
        this.isDefaultAccount = isDefaultAccount == null ? null : isDefaultAccount.trim();
    }

    /**
     * 开户银行
     * @return open_bank 开户银行
     */
    public String getOpenBank() {
        return openBank;
    }

    /**
     * 开户银行
     * @param openBank 开户银行
     */
    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    /**
     * 开户城市
     * @return open_city 开户城市
     */
    public String getOpenCity() {
        return openCity;
    }

    /**
     * 开户城市
     * @param openCity 开户城市
     */
    public void setOpenCity(String openCity) {
        this.openCity = openCity == null ? null : openCity.trim();
    }

    /**
     * 开户省份
     * @return open_province 开户省份
     */
    public String getOpenProvince() {
        return openProvince;
    }

    /**
     * 开户省份
     * @param openProvince 开户省份
     */
    public void setOpenProvince(String openProvince) {
        this.openProvince = openProvince == null ? null : openProvince.trim();
    }

    /**
     * 开户支行
     * @return open_sub_branch 开户支行
     */
    public String getOpenSubBranch() {
        return openSubBranch;
    }

    /**
     * 开户支行
     * @param openSubBranch 开户支行
     */
    public void setOpenSubBranch(String openSubBranch) {
        this.openSubBranch = openSubBranch == null ? null : openSubBranch.trim();
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BankAccount other = (BankAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getOpCmyCode() == null ? other.getOpCmyCode() == null : this.getOpCmyCode().equals(other.getOpCmyCode()))
            && (this.getOpCmyName() == null ? other.getOpCmyName() == null : this.getOpCmyName().equals(other.getOpCmyName()))
            && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
            && (this.getOperatorCode() == null ? other.getOperatorCode() == null : this.getOperatorCode().equals(other.getOperatorCode()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()))
            && (this.getReserved3() == null ? other.getReserved3() == null : this.getReserved3().equals(other.getReserved3()))
            && (this.getReserved4() == null ? other.getReserved4() == null : this.getReserved4().equals(other.getReserved4()))
            && (this.getReserved5() == null ? other.getReserved5() == null : this.getReserved5().equals(other.getReserved5()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getAccountState() == null ? other.getAccountState() == null : this.getAccountState().equals(other.getAccountState()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getBankNumber() == null ? other.getBankNumber() == null : this.getBankNumber().equals(other.getBankNumber()))
            && (this.getCmyCode() == null ? other.getCmyCode() == null : this.getCmyCode().equals(other.getCmyCode()))
            && (this.getCmyName() == null ? other.getCmyName() == null : this.getCmyName().equals(other.getCmyName()))
            && (this.getIsDefaultAccount() == null ? other.getIsDefaultAccount() == null : this.getIsDefaultAccount().equals(other.getIsDefaultAccount()))
            && (this.getOpenBank() == null ? other.getOpenBank() == null : this.getOpenBank().equals(other.getOpenBank()))
            && (this.getOpenCity() == null ? other.getOpenCity() == null : this.getOpenCity().equals(other.getOpenCity()))
            && (this.getOpenProvince() == null ? other.getOpenProvince() == null : this.getOpenProvince().equals(other.getOpenProvince()))
            && (this.getOpenSubBranch() == null ? other.getOpenSubBranch() == null : this.getOpenSubBranch().equals(other.getOpenSubBranch()));
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getOpCmyCode() == null) ? 0 : getOpCmyCode().hashCode());
        result = prime * result + ((getOpCmyName() == null) ? 0 : getOpCmyName().hashCode());
        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
        result = prime * result + ((getOperatorCode() == null) ? 0 : getOperatorCode().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        result = prime * result + ((getReserved3() == null) ? 0 : getReserved3().hashCode());
        result = prime * result + ((getReserved4() == null) ? 0 : getReserved4().hashCode());
        result = prime * result + ((getReserved5() == null) ? 0 : getReserved5().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getAccountState() == null) ? 0 : getAccountState().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getBankNumber() == null) ? 0 : getBankNumber().hashCode());
        result = prime * result + ((getCmyCode() == null) ? 0 : getCmyCode().hashCode());
        result = prime * result + ((getCmyName() == null) ? 0 : getCmyName().hashCode());
        result = prime * result + ((getIsDefaultAccount() == null) ? 0 : getIsDefaultAccount().hashCode());
        result = prime * result + ((getOpenBank() == null) ? 0 : getOpenBank().hashCode());
        result = prime * result + ((getOpenCity() == null) ? 0 : getOpenCity().hashCode());
        result = prime * result + ((getOpenProvince() == null) ? 0 : getOpenProvince().hashCode());
        result = prime * result + ((getOpenSubBranch() == null) ? 0 : getOpenSubBranch().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated 2018-04-23
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", opCmyCode=").append(opCmyCode);
        sb.append(", opCmyName=").append(opCmyName);
        sb.append(", opTime=").append(opTime);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append(", reserved3=").append(reserved3);
        sb.append(", reserved4=").append(reserved4);
        sb.append(", reserved5=").append(reserved5);
        sb.append(", signature=").append(signature);
        sb.append(", version=").append(version);
        sb.append(", accountName=").append(accountName);
        sb.append(", accountState=").append(accountState);
        sb.append(", accountType=").append(accountType);
        sb.append(", bankNumber=").append(bankNumber);
        sb.append(", cmyCode=").append(cmyCode);
        sb.append(", cmyName=").append(cmyName);
        sb.append(", isDefaultAccount=").append(isDefaultAccount);
        sb.append(", openBank=").append(openBank);
        sb.append(", openCity=").append(openCity);
        sb.append(", openProvince=").append(openProvince);
        sb.append(", openSubBranch=").append(openSubBranch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}