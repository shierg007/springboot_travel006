package com.qf.j1904.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIsNull() {
            addCriterion("endingTime is null");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIsNotNull() {
            addCriterion("endingTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndingtimeEqualTo(Date value) {
            addCriterion("endingTime =", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotEqualTo(Date value) {
            addCriterion("endingTime <>", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeGreaterThan(Date value) {
            addCriterion("endingTime >", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endingTime >=", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeLessThan(Date value) {
            addCriterion("endingTime <", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeLessThanOrEqualTo(Date value) {
            addCriterion("endingTime <=", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIn(List<Date> values) {
            addCriterion("endingTime in", values, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotIn(List<Date> values) {
            addCriterion("endingTime not in", values, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeBetween(Date value1, Date value2) {
            addCriterion("endingTime between", value1, value2, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotBetween(Date value1, Date value2) {
            addCriterion("endingTime not between", value1, value2, "endingtime");
            return (Criteria) this;
        }

        public Criteria andIdvalidIsNull() {
            addCriterion("idValid is null");
            return (Criteria) this;
        }

        public Criteria andIdvalidIsNotNull() {
            addCriterion("idValid is not null");
            return (Criteria) this;
        }

        public Criteria andIdvalidEqualTo(Integer value) {
            addCriterion("idValid =", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidNotEqualTo(Integer value) {
            addCriterion("idValid <>", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidGreaterThan(Integer value) {
            addCriterion("idValid >", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("idValid >=", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidLessThan(Integer value) {
            addCriterion("idValid <", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidLessThanOrEqualTo(Integer value) {
            addCriterion("idValid <=", value, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidIn(List<Integer> values) {
            addCriterion("idValid in", values, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidNotIn(List<Integer> values) {
            addCriterion("idValid not in", values, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidBetween(Integer value1, Integer value2) {
            addCriterion("idValid between", value1, value2, "idvalid");
            return (Criteria) this;
        }

        public Criteria andIdvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("idValid not between", value1, value2, "idvalid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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