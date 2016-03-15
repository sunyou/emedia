package com.syou.emedia.server.model.shipment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PFShipmentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public PFShipmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
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
     * This method corresponds to the database table platform_shipment
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
     * This method corresponds to the database table platform_shipment
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table platform_shipment
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
     * This class corresponds to the database table platform_shipment
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

        public Criteria andShipmentIdIsNull() {
            addCriterion("shipment_id is null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIsNotNull() {
            addCriterion("shipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentIdEqualTo(Integer value) {
            addCriterion("shipment_id =", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotEqualTo(Integer value) {
            addCriterion("shipment_id <>", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThan(Integer value) {
            addCriterion("shipment_id >", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipment_id >=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThan(Integer value) {
            addCriterion("shipment_id <", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipment_id <=", value, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdIn(List<Integer> values) {
            addCriterion("shipment_id in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotIn(List<Integer> values) {
            addCriterion("shipment_id not in", values, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("shipment_id between", value1, value2, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipment_id not between", value1, value2, "shipmentId");
            return (Criteria) this;
        }

        public Criteria andShipmentResultIsNull() {
            addCriterion("shipment_result is null");
            return (Criteria) this;
        }

        public Criteria andShipmentResultIsNotNull() {
            addCriterion("shipment_result is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentResultEqualTo(String value) {
            addCriterion("shipment_result =", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultNotEqualTo(String value) {
            addCriterion("shipment_result <>", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultGreaterThan(String value) {
            addCriterion("shipment_result >", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultGreaterThanOrEqualTo(String value) {
            addCriterion("shipment_result >=", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultLessThan(String value) {
            addCriterion("shipment_result <", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultLessThanOrEqualTo(String value) {
            addCriterion("shipment_result <=", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultLike(String value) {
            addCriterion("shipment_result like", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultNotLike(String value) {
            addCriterion("shipment_result not like", value, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultIn(List<String> values) {
            addCriterion("shipment_result in", values, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultNotIn(List<String> values) {
            addCriterion("shipment_result not in", values, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultBetween(String value1, String value2) {
            addCriterion("shipment_result between", value1, value2, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentResultNotBetween(String value1, String value2) {
            addCriterion("shipment_result not between", value1, value2, "shipmentResult");
            return (Criteria) this;
        }

        public Criteria andShipmentDescIsNull() {
            addCriterion("shipment_desc is null");
            return (Criteria) this;
        }

        public Criteria andShipmentDescIsNotNull() {
            addCriterion("shipment_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentDescEqualTo(String value) {
            addCriterion("shipment_desc =", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescNotEqualTo(String value) {
            addCriterion("shipment_desc <>", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescGreaterThan(String value) {
            addCriterion("shipment_desc >", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescGreaterThanOrEqualTo(String value) {
            addCriterion("shipment_desc >=", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescLessThan(String value) {
            addCriterion("shipment_desc <", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescLessThanOrEqualTo(String value) {
            addCriterion("shipment_desc <=", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescLike(String value) {
            addCriterion("shipment_desc like", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescNotLike(String value) {
            addCriterion("shipment_desc not like", value, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescIn(List<String> values) {
            addCriterion("shipment_desc in", values, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescNotIn(List<String> values) {
            addCriterion("shipment_desc not in", values, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescBetween(String value1, String value2) {
            addCriterion("shipment_desc between", value1, value2, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andShipmentDescNotBetween(String value1, String value2) {
            addCriterion("shipment_desc not between", value1, value2, "shipmentDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(String value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(String value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(String value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(String value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLike(String value) {
            addCriterion("commodity_id like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotLike(String value) {
            addCriterion("commodity_id not like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<String> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<String> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(String value1, String value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(String value1, String value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("terminal_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("terminal_id =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("terminal_id <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("terminal_id >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_id >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("terminal_id <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("terminal_id <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("terminal_id like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("terminal_id not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("terminal_id in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("terminal_id not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("terminal_id between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("terminal_id not between", value1, value2, "terminalId");
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
     * This class corresponds to the database table platform_shipment
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
     * This class corresponds to the database table platform_shipment
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