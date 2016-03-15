package com.syou.emedia.server.model.report;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PFWifiReportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public PFWifiReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
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
     * This method corresponds to the database table platform_wifi_report
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
     * This method corresponds to the database table platform_wifi_report
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_wifi_report
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
     * This class corresponds to the database table platform_wifi_report
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Integer value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Integer value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Integer value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Integer value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Integer> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Integer> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Integer value1, Integer value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(String value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(String value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(String value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(String value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(String value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLike(String value) {
            addCriterion("ac_id like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotLike(String value) {
            addCriterion("ac_id not like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<String> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<String> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(String value1, String value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(String value1, String value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcNameIsNull() {
            addCriterion("ac_name is null");
            return (Criteria) this;
        }

        public Criteria andAcNameIsNotNull() {
            addCriterion("ac_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcNameEqualTo(String value) {
            addCriterion("ac_name =", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotEqualTo(String value) {
            addCriterion("ac_name <>", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameGreaterThan(String value) {
            addCriterion("ac_name >", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameGreaterThanOrEqualTo(String value) {
            addCriterion("ac_name >=", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLessThan(String value) {
            addCriterion("ac_name <", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLessThanOrEqualTo(String value) {
            addCriterion("ac_name <=", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameLike(String value) {
            addCriterion("ac_name like", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotLike(String value) {
            addCriterion("ac_name not like", value, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameIn(List<String> values) {
            addCriterion("ac_name in", values, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotIn(List<String> values) {
            addCriterion("ac_name not in", values, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameBetween(String value1, String value2) {
            addCriterion("ac_name between", value1, value2, "acName");
            return (Criteria) this;
        }

        public Criteria andAcNameNotBetween(String value1, String value2) {
            addCriterion("ac_name not between", value1, value2, "acName");
            return (Criteria) this;
        }

        public Criteria andAcDescIsNull() {
            addCriterion("ac_desc is null");
            return (Criteria) this;
        }

        public Criteria andAcDescIsNotNull() {
            addCriterion("ac_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAcDescEqualTo(String value) {
            addCriterion("ac_desc =", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescNotEqualTo(String value) {
            addCriterion("ac_desc <>", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescGreaterThan(String value) {
            addCriterion("ac_desc >", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescGreaterThanOrEqualTo(String value) {
            addCriterion("ac_desc >=", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescLessThan(String value) {
            addCriterion("ac_desc <", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescLessThanOrEqualTo(String value) {
            addCriterion("ac_desc <=", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescLike(String value) {
            addCriterion("ac_desc like", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescNotLike(String value) {
            addCriterion("ac_desc not like", value, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescIn(List<String> values) {
            addCriterion("ac_desc in", values, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescNotIn(List<String> values) {
            addCriterion("ac_desc not in", values, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescBetween(String value1, String value2) {
            addCriterion("ac_desc between", value1, value2, "acDesc");
            return (Criteria) this;
        }

        public Criteria andAcDescNotBetween(String value1, String value2) {
            addCriterion("ac_desc not between", value1, value2, "acDesc");
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
     * This class corresponds to the database table platform_wifi_report
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
     * This class corresponds to the database table platform_wifi_report
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