package com.syou.emedia.server.model.attr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PFAttrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public PFAttrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
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
     * This method corresponds to the database table platform_system_attr
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
     * This method corresponds to the database table platform_system_attr
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_system_attr
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
     * This class corresponds to the database table platform_system_attr
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

        public Criteria andAttrIdIsNull() {
            addCriterion("attr_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Integer value) {
            addCriterion("attr_id =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Integer value) {
            addCriterion("attr_id <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Integer value) {
            addCriterion("attr_id >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_id >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Integer value) {
            addCriterion("attr_id <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_id <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Integer> values) {
            addCriterion("attr_id in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Integer> values) {
            addCriterion("attr_id not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_id between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_id not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrSpecIsNull() {
            addCriterion("attr_spec is null");
            return (Criteria) this;
        }

        public Criteria andAttrSpecIsNotNull() {
            addCriterion("attr_spec is not null");
            return (Criteria) this;
        }

        public Criteria andAttrSpecEqualTo(String value) {
            addCriterion("attr_spec =", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecNotEqualTo(String value) {
            addCriterion("attr_spec <>", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecGreaterThan(String value) {
            addCriterion("attr_spec >", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecGreaterThanOrEqualTo(String value) {
            addCriterion("attr_spec >=", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecLessThan(String value) {
            addCriterion("attr_spec <", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecLessThanOrEqualTo(String value) {
            addCriterion("attr_spec <=", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecLike(String value) {
            addCriterion("attr_spec like", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecNotLike(String value) {
            addCriterion("attr_spec not like", value, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecIn(List<String> values) {
            addCriterion("attr_spec in", values, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecNotIn(List<String> values) {
            addCriterion("attr_spec not in", values, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecBetween(String value1, String value2) {
            addCriterion("attr_spec between", value1, value2, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrSpecNotBetween(String value1, String value2) {
            addCriterion("attr_spec not between", value1, value2, "attrSpec");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNull() {
            addCriterion("attr_code is null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIsNotNull() {
            addCriterion("attr_code is not null");
            return (Criteria) this;
        }

        public Criteria andAttrCodeEqualTo(String value) {
            addCriterion("attr_code =", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotEqualTo(String value) {
            addCriterion("attr_code <>", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThan(String value) {
            addCriterion("attr_code >", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_code >=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThan(String value) {
            addCriterion("attr_code <", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("attr_code <=", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeLike(String value) {
            addCriterion("attr_code like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotLike(String value) {
            addCriterion("attr_code not like", value, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeIn(List<String> values) {
            addCriterion("attr_code in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotIn(List<String> values) {
            addCriterion("attr_code not in", values, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeBetween(String value1, String value2) {
            addCriterion("attr_code between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrCodeNotBetween(String value1, String value2) {
            addCriterion("attr_code not between", value1, value2, "attrCode");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNull() {
            addCriterion("attr_value is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNotNull() {
            addCriterion("attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueEqualTo(String value) {
            addCriterion("attr_value =", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotEqualTo(String value) {
            addCriterion("attr_value <>", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThan(String value) {
            addCriterion("attr_value >", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("attr_value >=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThan(String value) {
            addCriterion("attr_value <", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThanOrEqualTo(String value) {
            addCriterion("attr_value <=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLike(String value) {
            addCriterion("attr_value like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotLike(String value) {
            addCriterion("attr_value not like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueIn(List<String> values) {
            addCriterion("attr_value in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotIn(List<String> values) {
            addCriterion("attr_value not in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueBetween(String value1, String value2) {
            addCriterion("attr_value between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotBetween(String value1, String value2) {
            addCriterion("attr_value not between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNull() {
            addCriterion("attr_type is null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNotNull() {
            addCriterion("attr_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeEqualTo(String value) {
            addCriterion("attr_type =", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotEqualTo(String value) {
            addCriterion("attr_type <>", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThan(String value) {
            addCriterion("attr_type >", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attr_type >=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThan(String value) {
            addCriterion("attr_type <", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThanOrEqualTo(String value) {
            addCriterion("attr_type <=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLike(String value) {
            addCriterion("attr_type like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotLike(String value) {
            addCriterion("attr_type not like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIn(List<String> values) {
            addCriterion("attr_type in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotIn(List<String> values) {
            addCriterion("attr_type not in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeBetween(String value1, String value2) {
            addCriterion("attr_type between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotBetween(String value1, String value2) {
            addCriterion("attr_type not between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("sys_code is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("sys_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("sys_code =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("sys_code <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("sys_code >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_code >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("sys_code <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_code <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("sys_code like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("sys_code not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("sys_code in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("sys_code not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("sys_code between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("sys_code not between", value1, value2, "sysCode");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table platform_system_attr
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
     * This class corresponds to the database table platform_system_attr
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