package com.syou.emedia.server.model.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PFCodeMappingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public PFCodeMappingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCodeMappingIdIsNull() {
            addCriterion("code_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdIsNotNull() {
            addCriterion("code_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdEqualTo(Integer value) {
            addCriterion("code_mapping_id =", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdNotEqualTo(Integer value) {
            addCriterion("code_mapping_id <>", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdGreaterThan(Integer value) {
            addCriterion("code_mapping_id >", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_mapping_id >=", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdLessThan(Integer value) {
            addCriterion("code_mapping_id <", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_mapping_id <=", value, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdIn(List<Integer> values) {
            addCriterion("code_mapping_id in", values, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdNotIn(List<Integer> values) {
            addCriterion("code_mapping_id not in", values, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdBetween(Integer value1, Integer value2) {
            addCriterion("code_mapping_id between", value1, value2, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_mapping_id not between", value1, value2, "codeMappingId");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeIsNull() {
            addCriterion("code_mapping_type is null");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeIsNotNull() {
            addCriterion("code_mapping_type is not null");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeEqualTo(String value) {
            addCriterion("code_mapping_type =", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeNotEqualTo(String value) {
            addCriterion("code_mapping_type <>", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeGreaterThan(String value) {
            addCriterion("code_mapping_type >", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("code_mapping_type >=", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeLessThan(String value) {
            addCriterion("code_mapping_type <", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeLessThanOrEqualTo(String value) {
            addCriterion("code_mapping_type <=", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeLike(String value) {
            addCriterion("code_mapping_type like", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeNotLike(String value) {
            addCriterion("code_mapping_type not like", value, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeIn(List<String> values) {
            addCriterion("code_mapping_type in", values, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeNotIn(List<String> values) {
            addCriterion("code_mapping_type not in", values, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeBetween(String value1, String value2) {
            addCriterion("code_mapping_type between", value1, value2, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeMappingTypeNotBetween(String value1, String value2) {
            addCriterion("code_mapping_type not between", value1, value2, "codeMappingType");
            return (Criteria) this;
        }

        public Criteria andCodeAIdIsNull() {
            addCriterion("code_a_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeAIdIsNotNull() {
            addCriterion("code_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeAIdEqualTo(String value) {
            addCriterion("code_a_id =", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdNotEqualTo(String value) {
            addCriterion("code_a_id <>", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdGreaterThan(String value) {
            addCriterion("code_a_id >", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdGreaterThanOrEqualTo(String value) {
            addCriterion("code_a_id >=", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdLessThan(String value) {
            addCriterion("code_a_id <", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdLessThanOrEqualTo(String value) {
            addCriterion("code_a_id <=", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdLike(String value) {
            addCriterion("code_a_id like", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdNotLike(String value) {
            addCriterion("code_a_id not like", value, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdIn(List<String> values) {
            addCriterion("code_a_id in", values, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdNotIn(List<String> values) {
            addCriterion("code_a_id not in", values, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdBetween(String value1, String value2) {
            addCriterion("code_a_id between", value1, value2, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAIdNotBetween(String value1, String value2) {
            addCriterion("code_a_id not between", value1, value2, "codeAId");
            return (Criteria) this;
        }

        public Criteria andCodeAValueIsNull() {
            addCriterion("code_a_value is null");
            return (Criteria) this;
        }

        public Criteria andCodeAValueIsNotNull() {
            addCriterion("code_a_value is not null");
            return (Criteria) this;
        }

        public Criteria andCodeAValueEqualTo(String value) {
            addCriterion("code_a_value =", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueNotEqualTo(String value) {
            addCriterion("code_a_value <>", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueGreaterThan(String value) {
            addCriterion("code_a_value >", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueGreaterThanOrEqualTo(String value) {
            addCriterion("code_a_value >=", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueLessThan(String value) {
            addCriterion("code_a_value <", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueLessThanOrEqualTo(String value) {
            addCriterion("code_a_value <=", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueLike(String value) {
            addCriterion("code_a_value like", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueNotLike(String value) {
            addCriterion("code_a_value not like", value, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueIn(List<String> values) {
            addCriterion("code_a_value in", values, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueNotIn(List<String> values) {
            addCriterion("code_a_value not in", values, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueBetween(String value1, String value2) {
            addCriterion("code_a_value between", value1, value2, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeAValueNotBetween(String value1, String value2) {
            addCriterion("code_a_value not between", value1, value2, "codeAValue");
            return (Criteria) this;
        }

        public Criteria andCodeACodeIsNull() {
            addCriterion("code_a_code is null");
            return (Criteria) this;
        }

        public Criteria andCodeACodeIsNotNull() {
            addCriterion("code_a_code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeACodeEqualTo(String value) {
            addCriterion("code_a_code =", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeNotEqualTo(String value) {
            addCriterion("code_a_code <>", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeGreaterThan(String value) {
            addCriterion("code_a_code >", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeGreaterThanOrEqualTo(String value) {
            addCriterion("code_a_code >=", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeLessThan(String value) {
            addCriterion("code_a_code <", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeLessThanOrEqualTo(String value) {
            addCriterion("code_a_code <=", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeLike(String value) {
            addCriterion("code_a_code like", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeNotLike(String value) {
            addCriterion("code_a_code not like", value, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeIn(List<String> values) {
            addCriterion("code_a_code in", values, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeNotIn(List<String> values) {
            addCriterion("code_a_code not in", values, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeBetween(String value1, String value2) {
            addCriterion("code_a_code between", value1, value2, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeACodeNotBetween(String value1, String value2) {
            addCriterion("code_a_code not between", value1, value2, "codeACode");
            return (Criteria) this;
        }

        public Criteria andCodeZIdIsNull() {
            addCriterion("code_z_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeZIdIsNotNull() {
            addCriterion("code_z_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeZIdEqualTo(String value) {
            addCriterion("code_z_id =", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdNotEqualTo(String value) {
            addCriterion("code_z_id <>", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdGreaterThan(String value) {
            addCriterion("code_z_id >", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdGreaterThanOrEqualTo(String value) {
            addCriterion("code_z_id >=", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdLessThan(String value) {
            addCriterion("code_z_id <", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdLessThanOrEqualTo(String value) {
            addCriterion("code_z_id <=", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdLike(String value) {
            addCriterion("code_z_id like", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdNotLike(String value) {
            addCriterion("code_z_id not like", value, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdIn(List<String> values) {
            addCriterion("code_z_id in", values, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdNotIn(List<String> values) {
            addCriterion("code_z_id not in", values, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdBetween(String value1, String value2) {
            addCriterion("code_z_id between", value1, value2, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZIdNotBetween(String value1, String value2) {
            addCriterion("code_z_id not between", value1, value2, "codeZId");
            return (Criteria) this;
        }

        public Criteria andCodeZValueIsNull() {
            addCriterion("code_z_value is null");
            return (Criteria) this;
        }

        public Criteria andCodeZValueIsNotNull() {
            addCriterion("code_z_value is not null");
            return (Criteria) this;
        }

        public Criteria andCodeZValueEqualTo(String value) {
            addCriterion("code_z_value =", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueNotEqualTo(String value) {
            addCriterion("code_z_value <>", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueGreaterThan(String value) {
            addCriterion("code_z_value >", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueGreaterThanOrEqualTo(String value) {
            addCriterion("code_z_value >=", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueLessThan(String value) {
            addCriterion("code_z_value <", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueLessThanOrEqualTo(String value) {
            addCriterion("code_z_value <=", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueLike(String value) {
            addCriterion("code_z_value like", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueNotLike(String value) {
            addCriterion("code_z_value not like", value, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueIn(List<String> values) {
            addCriterion("code_z_value in", values, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueNotIn(List<String> values) {
            addCriterion("code_z_value not in", values, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueBetween(String value1, String value2) {
            addCriterion("code_z_value between", value1, value2, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZValueNotBetween(String value1, String value2) {
            addCriterion("code_z_value not between", value1, value2, "codeZValue");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeIsNull() {
            addCriterion("code_z_code is null");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeIsNotNull() {
            addCriterion("code_z_code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeEqualTo(String value) {
            addCriterion("code_z_code =", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeNotEqualTo(String value) {
            addCriterion("code_z_code <>", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeGreaterThan(String value) {
            addCriterion("code_z_code >", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code_z_code >=", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeLessThan(String value) {
            addCriterion("code_z_code <", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeLessThanOrEqualTo(String value) {
            addCriterion("code_z_code <=", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeLike(String value) {
            addCriterion("code_z_code like", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeNotLike(String value) {
            addCriterion("code_z_code not like", value, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeIn(List<String> values) {
            addCriterion("code_z_code in", values, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeNotIn(List<String> values) {
            addCriterion("code_z_code not in", values, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeBetween(String value1, String value2) {
            addCriterion("code_z_code between", value1, value2, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCodeZCodeNotBetween(String value1, String value2) {
            addCriterion("code_z_code not between", value1, value2, "codeZCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNull() {
            addCriterion("status_cd is null");
            return (Criteria) this;
        }

        public Criteria andStatusCdIsNotNull() {
            addCriterion("status_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCdEqualTo(String value) {
            addCriterion("status_cd =", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotEqualTo(String value) {
            addCriterion("status_cd <>", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThan(String value) {
            addCriterion("status_cd >", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdGreaterThanOrEqualTo(String value) {
            addCriterion("status_cd >=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThan(String value) {
            addCriterion("status_cd <", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLessThanOrEqualTo(String value) {
            addCriterion("status_cd <=", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdLike(String value) {
            addCriterion("status_cd like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotLike(String value) {
            addCriterion("status_cd not like", value, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdIn(List<String> values) {
            addCriterion("status_cd in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotIn(List<String> values) {
            addCriterion("status_cd not in", values, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdBetween(String value1, String value2) {
            addCriterion("status_cd between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusCdNotBetween(String value1, String value2) {
            addCriterion("status_cd not between", value1, value2, "statusCd");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNull() {
            addCriterion("status_time is null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIsNotNull() {
            addCriterion("status_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTimeEqualTo(Date value) {
            addCriterion("status_time =", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotEqualTo(Date value) {
            addCriterion("status_time <>", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThan(Date value) {
            addCriterion("status_time >", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("status_time >=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThan(Date value) {
            addCriterion("status_time <", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeLessThanOrEqualTo(Date value) {
            addCriterion("status_time <=", value, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeIn(List<Date> values) {
            addCriterion("status_time in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotIn(List<Date> values) {
            addCriterion("status_time not in", values, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeBetween(Date value1, Date value2) {
            addCriterion("status_time between", value1, value2, "statusTime");
            return (Criteria) this;
        }

        public Criteria andStatusTimeNotBetween(Date value1, Date value2) {
            addCriterion("status_time not between", value1, value2, "statusTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table platform_code_mapping
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table platform_code_mapping
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}