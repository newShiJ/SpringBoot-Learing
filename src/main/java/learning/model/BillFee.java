package learning.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class BillFee implements Serializable {
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
     * 调整天数（+/-）
     */
    private Integer adjustCount;

    /**
     * 缴费金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    private Long amount;

    /**
     * 银单编号
     */
    private String billCode;

    /**
     * 业务编号
     */
    private String businessNo;

    /**
     * 天数类型:（0表示365，1表示360）
     */
    private String daysType;

    /**
     * 费用类型:"系统管理费，保证费，贴现利息，逾期利息，兑付; 放款凭证 -- 待整理全量的费用凭证 收款凭证 缴费凭证"
     */
    private String feeType;

    /**
     * (0表示全闭，1表示左开右闭)
     */
    private String intervalType;

    /**
     * 付费凭证附件Url:
     */
    private String manageFeeUrl;

    /**
     * 收款者银行户主
     */
    private String payeeBankAccount;

    /**
     * 收款者银行卡号
     */
    private String payeeBankCard;

    /**
     * 收款企业代码
     */
    private String payeeCmyCode;

    /**
     * 收款企业名称
     */
    private String payeeCmyName;

    /**
     * 收款者开户行
     */
    private String payeeOpenBank;

    /**
     * 付款企业代码:
     */
    private String payerCmyCode;

    /**
     * 付款企业名称
     */
    private String payerCmyName;

    /**
     * 缴费利率:
     */
    private BigDecimal rate;

    /**
     * 实际天数  or 月数:实际天数  or 月数
     */
    private Integer realCount;

    /**
     * 状态
     */
    private String status;

    /**
     * 缴费(原始申请的 例如再融资申请金额)金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    private Long oldAmount;

    /**
     * bill_fee
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
     * 调整天数（+/-）
     * @return adjust_count 调整天数（+/-）
     */
    public Integer getAdjustCount() {
        return adjustCount;
    }

    /**
     * 调整天数（+/-）
     * @param adjustCount 调整天数（+/-）
     */
    public void setAdjustCount(Integer adjustCount) {
        this.adjustCount = adjustCount;
    }

    /**
     * 缴费金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     * @return amount 缴费金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 缴费金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     * @param amount 缴费金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 银单编号
     * @return bill_code 银单编号
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 银单编号
     * @param billCode 银单编号
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 业务编号
     * @return business_no 业务编号
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 业务编号
     * @param businessNo 业务编号
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    /**
     * 天数类型:（0表示365，1表示360）
     * @return days_type 天数类型:（0表示365，1表示360）
     */
    public String getDaysType() {
        return daysType;
    }

    /**
     * 天数类型:（0表示365，1表示360）
     * @param daysType 天数类型:（0表示365，1表示360）
     */
    public void setDaysType(String daysType) {
        this.daysType = daysType == null ? null : daysType.trim();
    }

    /**
     * 费用类型:"系统管理费，保证费，贴现利息，逾期利息，兑付; 放款凭证 -- 待整理全量的费用凭证 收款凭证 缴费凭证"
     * @return fee_type 费用类型:"系统管理费，保证费，贴现利息，逾期利息，兑付; 放款凭证 -- 待整理全量的费用凭证 收款凭证 缴费凭证"
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * 费用类型:"系统管理费，保证费，贴现利息，逾期利息，兑付; 放款凭证 -- 待整理全量的费用凭证 收款凭证 缴费凭证"
     * @param feeType 费用类型:"系统管理费，保证费，贴现利息，逾期利息，兑付; 放款凭证 -- 待整理全量的费用凭证 收款凭证 缴费凭证"
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    /**
     * (0表示全闭，1表示左开右闭)
     * @return interval_type (0表示全闭，1表示左开右闭)
     */
    public String getIntervalType() {
        return intervalType;
    }

    /**
     * (0表示全闭，1表示左开右闭)
     * @param intervalType (0表示全闭，1表示左开右闭)
     */
    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType == null ? null : intervalType.trim();
    }

    /**
     * 付费凭证附件Url:
     * @return manage_fee_url 付费凭证附件Url:
     */
    public String getManageFeeUrl() {
        return manageFeeUrl;
    }

    /**
     * 付费凭证附件Url:
     * @param manageFeeUrl 付费凭证附件Url:
     */
    public void setManageFeeUrl(String manageFeeUrl) {
        this.manageFeeUrl = manageFeeUrl == null ? null : manageFeeUrl.trim();
    }

    /**
     * 收款者银行户主
     * @return payee_bank_account 收款者银行户主
     */
    public String getPayeeBankAccount() {
        return payeeBankAccount;
    }

    /**
     * 收款者银行户主
     * @param payeeBankAccount 收款者银行户主
     */
    public void setPayeeBankAccount(String payeeBankAccount) {
        this.payeeBankAccount = payeeBankAccount == null ? null : payeeBankAccount.trim();
    }

    /**
     * 收款者银行卡号
     * @return payee_bank_card 收款者银行卡号
     */
    public String getPayeeBankCard() {
        return payeeBankCard;
    }

    /**
     * 收款者银行卡号
     * @param payeeBankCard 收款者银行卡号
     */
    public void setPayeeBankCard(String payeeBankCard) {
        this.payeeBankCard = payeeBankCard == null ? null : payeeBankCard.trim();
    }

    /**
     * 收款企业代码
     * @return payee_cmy_code 收款企业代码
     */
    public String getPayeeCmyCode() {
        return payeeCmyCode;
    }

    /**
     * 收款企业代码
     * @param payeeCmyCode 收款企业代码
     */
    public void setPayeeCmyCode(String payeeCmyCode) {
        this.payeeCmyCode = payeeCmyCode == null ? null : payeeCmyCode.trim();
    }

    /**
     * 收款企业名称
     * @return payee_cmy_name 收款企业名称
     */
    public String getPayeeCmyName() {
        return payeeCmyName;
    }

    /**
     * 收款企业名称
     * @param payeeCmyName 收款企业名称
     */
    public void setPayeeCmyName(String payeeCmyName) {
        this.payeeCmyName = payeeCmyName == null ? null : payeeCmyName.trim();
    }

    /**
     * 收款者开户行
     * @return payee_open_bank 收款者开户行
     */
    public String getPayeeOpenBank() {
        return payeeOpenBank;
    }

    /**
     * 收款者开户行
     * @param payeeOpenBank 收款者开户行
     */
    public void setPayeeOpenBank(String payeeOpenBank) {
        this.payeeOpenBank = payeeOpenBank == null ? null : payeeOpenBank.trim();
    }

    /**
     * 付款企业代码:
     * @return payer_cmy_code 付款企业代码:
     */
    public String getPayerCmyCode() {
        return payerCmyCode;
    }

    /**
     * 付款企业代码:
     * @param payerCmyCode 付款企业代码:
     */
    public void setPayerCmyCode(String payerCmyCode) {
        this.payerCmyCode = payerCmyCode == null ? null : payerCmyCode.trim();
    }

    /**
     * 付款企业名称
     * @return payer_cmy_name 付款企业名称
     */
    public String getPayerCmyName() {
        return payerCmyName;
    }

    /**
     * 付款企业名称
     * @param payerCmyName 付款企业名称
     */
    public void setPayerCmyName(String payerCmyName) {
        this.payerCmyName = payerCmyName == null ? null : payerCmyName.trim();
    }

    /**
     * 缴费利率:
     * @return rate 缴费利率:
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 缴费利率:
     * @param rate 缴费利率:
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 实际天数  or 月数:实际天数  or 月数
     * @return real_count 实际天数  or 月数:实际天数  or 月数
     */
    public Integer getRealCount() {
        return realCount;
    }

    /**
     * 实际天数  or 月数:实际天数  or 月数
     * @param realCount 实际天数  or 月数:实际天数  or 月数
     */
    public void setRealCount(Integer realCount) {
        this.realCount = realCount;
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 缴费(原始申请的 例如再融资申请金额)金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     * @return old_amount 缴费(原始申请的 例如再融资申请金额)金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    public Long getOldAmount() {
        return oldAmount;
    }

    /**
     * 缴费(原始申请的 例如再融资申请金额)金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     * @param oldAmount 缴费(原始申请的 例如再融资申请金额)金额:金额存储到分，扩大100倍存储，展示时在缩小100倍
     */
    public void setOldAmount(Long oldAmount) {
        this.oldAmount = oldAmount;
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
        BillFee other = (BillFee) that;
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
            && (this.getAdjustCount() == null ? other.getAdjustCount() == null : this.getAdjustCount().equals(other.getAdjustCount()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBillCode() == null ? other.getBillCode() == null : this.getBillCode().equals(other.getBillCode()))
            && (this.getBusinessNo() == null ? other.getBusinessNo() == null : this.getBusinessNo().equals(other.getBusinessNo()))
            && (this.getDaysType() == null ? other.getDaysType() == null : this.getDaysType().equals(other.getDaysType()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getIntervalType() == null ? other.getIntervalType() == null : this.getIntervalType().equals(other.getIntervalType()))
            && (this.getManageFeeUrl() == null ? other.getManageFeeUrl() == null : this.getManageFeeUrl().equals(other.getManageFeeUrl()))
            && (this.getPayeeBankAccount() == null ? other.getPayeeBankAccount() == null : this.getPayeeBankAccount().equals(other.getPayeeBankAccount()))
            && (this.getPayeeBankCard() == null ? other.getPayeeBankCard() == null : this.getPayeeBankCard().equals(other.getPayeeBankCard()))
            && (this.getPayeeCmyCode() == null ? other.getPayeeCmyCode() == null : this.getPayeeCmyCode().equals(other.getPayeeCmyCode()))
            && (this.getPayeeCmyName() == null ? other.getPayeeCmyName() == null : this.getPayeeCmyName().equals(other.getPayeeCmyName()))
            && (this.getPayeeOpenBank() == null ? other.getPayeeOpenBank() == null : this.getPayeeOpenBank().equals(other.getPayeeOpenBank()))
            && (this.getPayerCmyCode() == null ? other.getPayerCmyCode() == null : this.getPayerCmyCode().equals(other.getPayerCmyCode()))
            && (this.getPayerCmyName() == null ? other.getPayerCmyName() == null : this.getPayerCmyName().equals(other.getPayerCmyName()))
            && (this.getRate() == null ? other.getRate() == null : this.getRate().equals(other.getRate()))
            && (this.getRealCount() == null ? other.getRealCount() == null : this.getRealCount().equals(other.getRealCount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOldAmount() == null ? other.getOldAmount() == null : this.getOldAmount().equals(other.getOldAmount()));
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
        result = prime * result + ((getAdjustCount() == null) ? 0 : getAdjustCount().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBillCode() == null) ? 0 : getBillCode().hashCode());
        result = prime * result + ((getBusinessNo() == null) ? 0 : getBusinessNo().hashCode());
        result = prime * result + ((getDaysType() == null) ? 0 : getDaysType().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getIntervalType() == null) ? 0 : getIntervalType().hashCode());
        result = prime * result + ((getManageFeeUrl() == null) ? 0 : getManageFeeUrl().hashCode());
        result = prime * result + ((getPayeeBankAccount() == null) ? 0 : getPayeeBankAccount().hashCode());
        result = prime * result + ((getPayeeBankCard() == null) ? 0 : getPayeeBankCard().hashCode());
        result = prime * result + ((getPayeeCmyCode() == null) ? 0 : getPayeeCmyCode().hashCode());
        result = prime * result + ((getPayeeCmyName() == null) ? 0 : getPayeeCmyName().hashCode());
        result = prime * result + ((getPayeeOpenBank() == null) ? 0 : getPayeeOpenBank().hashCode());
        result = prime * result + ((getPayerCmyCode() == null) ? 0 : getPayerCmyCode().hashCode());
        result = prime * result + ((getPayerCmyName() == null) ? 0 : getPayerCmyName().hashCode());
        result = prime * result + ((getRate() == null) ? 0 : getRate().hashCode());
        result = prime * result + ((getRealCount() == null) ? 0 : getRealCount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOldAmount() == null) ? 0 : getOldAmount().hashCode());
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
        sb.append(", adjustCount=").append(adjustCount);
        sb.append(", amount=").append(amount);
        sb.append(", billCode=").append(billCode);
        sb.append(", businessNo=").append(businessNo);
        sb.append(", daysType=").append(daysType);
        sb.append(", feeType=").append(feeType);
        sb.append(", intervalType=").append(intervalType);
        sb.append(", manageFeeUrl=").append(manageFeeUrl);
        sb.append(", payeeBankAccount=").append(payeeBankAccount);
        sb.append(", payeeBankCard=").append(payeeBankCard);
        sb.append(", payeeCmyCode=").append(payeeCmyCode);
        sb.append(", payeeCmyName=").append(payeeCmyName);
        sb.append(", payeeOpenBank=").append(payeeOpenBank);
        sb.append(", payerCmyCode=").append(payerCmyCode);
        sb.append(", payerCmyName=").append(payerCmyName);
        sb.append(", rate=").append(rate);
        sb.append(", realCount=").append(realCount);
        sb.append(", status=").append(status);
        sb.append(", oldAmount=").append(oldAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}