package com.qf.j1904.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEvaluationExample() {
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

        public Criteria andEvaluationidIsNull() {
            addCriterion("evaluationId is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationidIsNotNull() {
            addCriterion("evaluationId is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationidEqualTo(Integer value) {
            addCriterion("evaluationId =", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidNotEqualTo(Integer value) {
            addCriterion("evaluationId <>", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidGreaterThan(Integer value) {
            addCriterion("evaluationId >", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluationId >=", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidLessThan(Integer value) {
            addCriterion("evaluationId <", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidLessThanOrEqualTo(Integer value) {
            addCriterion("evaluationId <=", value, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidIn(List<Integer> values) {
            addCriterion("evaluationId in", values, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidNotIn(List<Integer> values) {
            addCriterion("evaluationId not in", values, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidBetween(Integer value1, Integer value2) {
            addCriterion("evaluationId between", value1, value2, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationidNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluationId not between", value1, value2, "evaluationid");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarIsNull() {
            addCriterion("evaluationStar is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarIsNotNull() {
            addCriterion("evaluationStar is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarEqualTo(Integer value) {
            addCriterion("evaluationStar =", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarNotEqualTo(Integer value) {
            addCriterion("evaluationStar <>", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarGreaterThan(Integer value) {
            addCriterion("evaluationStar >", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluationStar >=", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarLessThan(Integer value) {
            addCriterion("evaluationStar <", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarLessThanOrEqualTo(Integer value) {
            addCriterion("evaluationStar <=", value, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarIn(List<Integer> values) {
            addCriterion("evaluationStar in", values, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarNotIn(List<Integer> values) {
            addCriterion("evaluationStar not in", values, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarBetween(Integer value1, Integer value2) {
            addCriterion("evaluationStar between", value1, value2, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationstarNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluationStar not between", value1, value2, "evaluationstar");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoIsNull() {
            addCriterion("evaluationInfo is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoIsNotNull() {
            addCriterion("evaluationInfo is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoEqualTo(String value) {
            addCriterion("evaluationInfo =", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoNotEqualTo(String value) {
            addCriterion("evaluationInfo <>", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoGreaterThan(String value) {
            addCriterion("evaluationInfo >", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoGreaterThanOrEqualTo(String value) {
            addCriterion("evaluationInfo >=", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoLessThan(String value) {
            addCriterion("evaluationInfo <", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoLessThanOrEqualTo(String value) {
            addCriterion("evaluationInfo <=", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoLike(String value) {
            addCriterion("evaluationInfo like", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoNotLike(String value) {
            addCriterion("evaluationInfo not like", value, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoIn(List<String> values) {
            addCriterion("evaluationInfo in", values, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoNotIn(List<String> values) {
            addCriterion("evaluationInfo not in", values, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoBetween(String value1, String value2) {
            addCriterion("evaluationInfo between", value1, value2, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationinfoNotBetween(String value1, String value2) {
            addCriterion("evaluationInfo not between", value1, value2, "evaluationinfo");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgIsNull() {
            addCriterion("evaluationImg is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgIsNotNull() {
            addCriterion("evaluationImg is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgEqualTo(String value) {
            addCriterion("evaluationImg =", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgNotEqualTo(String value) {
            addCriterion("evaluationImg <>", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgGreaterThan(String value) {
            addCriterion("evaluationImg >", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgGreaterThanOrEqualTo(String value) {
            addCriterion("evaluationImg >=", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgLessThan(String value) {
            addCriterion("evaluationImg <", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgLessThanOrEqualTo(String value) {
            addCriterion("evaluationImg <=", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgLike(String value) {
            addCriterion("evaluationImg like", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgNotLike(String value) {
            addCriterion("evaluationImg not like", value, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgIn(List<String> values) {
            addCriterion("evaluationImg in", values, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgNotIn(List<String> values) {
            addCriterion("evaluationImg not in", values, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgBetween(String value1, String value2) {
            addCriterion("evaluationImg between", value1, value2, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andEvaluationimgNotBetween(String value1, String value2) {
            addCriterion("evaluationImg not between", value1, value2, "evaluationimg");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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