package learning.model;

import java.io.Serializable;

public class CreditRecord implements Serializable {
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
     * 原始额度
     */
    private Long amount;

    /**
     * 额度类型:总额度、已分配、已开单
     */
    private String amountType;

    /**
     * 企业代码
     */
    private String cmyCode;

    /**
     * 企业名称
     */
    private String cmyName;

    /**
     * 变化的额度 +/-
     */
    private Long cngAmount;

    /**
     * 保理商代码
     */
    private String factorCmyCode;

    /**
     * 保理商名称
     */
    private String factorCmyName;

    /**
     * 额度被占用方企业代码
     */
    private String occupiedCmyCode;

    /**
     * 额度被占用方企业名称
     */
    private String occupiedCmyName;

    /**
     * 额度操作类型:分出额度，被分配额度,额度审核生效(审核时变化额度为0)，额度审核驳回，开单额度扣除，兑付额度恢复，额度冻结，额度解冻，额度到期失效。
     */
    private String opType;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * credit_record
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
     * 原始额度
     * @return amount 原始额度
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 原始额度
     * @param amount 原始额度
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * 额度类型:总额度、已分配、已开单
     * @return amount_type 额度类型:总额度、已分配、已开单
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * 额度类型:总额度、已分配、已开单
     * @param amountType 额度类型:总额度、已分配、已开单
     */
    public void setAmountType(String amountType) {
        this.amountType = amountType == null ? null : amountType.trim();
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
     * 变化的额度 +/-
     * @return cng_amount 变化的额度 +/-
     */
    public Long getCngAmount() {
        return cngAmount;
    }

    /**
     * 变化的额度 +/-
     * @param cngAmount 变化的额度 +/-
     */
    public void setCngAmount(Long cngAmount) {
        this.cngAmount = cngAmount;
    }

    /**
     * 保理商代码
     * @return factor_cmy_code 保理商代码
     */
    public String getFactorCmyCode() {
        return factorCmyCode;
    }

    /**
     * 保理商代码
     * @param factorCmyCode 保理商代码
     */
    public void setFactorCmyCode(String factorCmyCode) {
        this.factorCmyCode = factorCmyCode == null ? null : factorCmyCode.trim();
    }

    /**
     * 保理商名称
     * @return factor_cmy_name 保理商名称
     */
    public String getFactorCmyName() {
        return factorCmyName;
    }

    /**
     * 保理商名称
     * @param factorCmyName 保理商名称
     */
    public void setFactorCmyName(String factorCmyName) {
        this.factorCmyName = factorCmyName == null ? null : factorCmyName.trim();
    }

    /**
     * 额度被占用方企业代码
     * @return occupied_cmy_code 额度被占用方企业代码
     */
    public String getOccupiedCmyCode() {
        return occupiedCmyCode;
    }

    /**
     * 额度被占用方企业代码
     * @param occupiedCmyCode 额度被占用方企业代码
     */
    public void setOccupiedCmyCode(String occupiedCmyCode) {
        this.occupiedCmyCode = occupiedCmyCode == null ? null : occupiedCmyCode.trim();
    }

    /**
     * 额度被占用方企业名称
     * @return occupied_cmy_name 额度被占用方企业名称
     */
    public String getOccupiedCmyName() {
        return occupiedCmyName;
    }

    /**
     * 额度被占用方企业名称
     * @param occupiedCmyName 额度被占用方企业名称
     */
    public void setOccupiedCmyName(String occupiedCmyName) {
        this.occupiedCmyName = occupiedCmyName == null ? null : occupiedCmyName.trim();
    }

    /**
     * 额度操作类型:分出额度，被分配额度,额度审核生效(审核时变化额度为0)，额度审核驳回，开单额度扣除，兑付额度恢复，额度冻结，额度解冻，额度到期失效。
     * @return op_type 额度操作类型:分出额度，被分配额度,额度审核生效(审核时变化额度为0)，额度审核驳回，开单额度扣除，兑付额度恢复，额度冻结，额度解冻，额度到期失效。
     */
    public String getOpType() {
        return opType;
    }

    /**
     * 额度操作类型:分出额度，被分配额度,额度审核生效(审核时变化额度为0)，额度审核驳回，开单额度扣除，兑付额度恢复，额度冻结，额度解冻，额度到期失效。
     * @param opType 额度操作类型:分出额度，被分配额度,额度审核生效(审核时变化额度为0)，额度审核驳回，开单额度扣除，兑付额度恢复，额度冻结，额度解冻，额度到期失效。
     */
    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    /**
     * 备注说明
     * @return remark 备注说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注说明
     * @param remark 备注说明
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        CreditRecord other = (CreditRecord) that;
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
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAmountType() == null ? other.getAmountType() == null : this.getAmountType().equals(other.getAmountType()))
            && (this.getCmyCode() == null ? other.getCmyCode() == null : this.getCmyCode().equals(other.getCmyCode()))
            && (this.getCmyName() == null ? other.getCmyName() == null : this.getCmyName().equals(other.getCmyName()))
            && (this.getCngAmount() == null ? other.getCngAmount() == null : this.getCngAmount().equals(other.getCngAmount()))
            && (this.getFactorCmyCode() == null ? other.getFactorCmyCode() == null : this.getFactorCmyCode().equals(other.getFactorCmyCode()))
            && (this.getFactorCmyName() == null ? other.getFactorCmyName() == null : this.getFactorCmyName().equals(other.getFactorCmyName()))
            && (this.getOccupiedCmyCode() == null ? other.getOccupiedCmyCode() == null : this.getOccupiedCmyCode().equals(other.getOccupiedCmyCode()))
            && (this.getOccupiedCmyName() == null ? other.getOccupiedCmyName() == null : this.getOccupiedCmyName().equals(other.getOccupiedCmyName()))
            && (this.getOpType() == null ? other.getOpType() == null : this.getOpType().equals(other.getOpType()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
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
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAmountType() == null) ? 0 : getAmountType().hashCode());
        result = prime * result + ((getCmyCode() == null) ? 0 : getCmyCode().hashCode());
        result = prime * result + ((getCmyName() == null) ? 0 : getCmyName().hashCode());
        result = prime * result + ((getCngAmount() == null) ? 0 : getCngAmount().hashCode());
        result = prime * result + ((getFactorCmyCode() == null) ? 0 : getFactorCmyCode().hashCode());
        result = prime * result + ((getFactorCmyName() == null) ? 0 : getFactorCmyName().hashCode());
        result = prime * result + ((getOccupiedCmyCode() == null) ? 0 : getOccupiedCmyCode().hashCode());
        result = prime * result + ((getOccupiedCmyName() == null) ? 0 : getOccupiedCmyName().hashCode());
        result = prime * result + ((getOpType() == null) ? 0 : getOpType().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", amount=").append(amount);
        sb.append(", amountType=").append(amountType);
        sb.append(", cmyCode=").append(cmyCode);
        sb.append(", cmyName=").append(cmyName);
        sb.append(", cngAmount=").append(cngAmount);
        sb.append(", factorCmyCode=").append(factorCmyCode);
        sb.append(", factorCmyName=").append(factorCmyName);
        sb.append(", occupiedCmyCode=").append(occupiedCmyCode);
        sb.append(", occupiedCmyName=").append(occupiedCmyName);
        sb.append(", opType=").append(opType);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}