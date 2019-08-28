package com.qf.j1904.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTravelproExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTravelproExample() {
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

        public Criteria andTravelidIsNull() {
            addCriterion("travelId is null");
            return (Criteria) this;
        }

        public Criteria andTravelidIsNotNull() {
            addCriterion("travelId is not null");
            return (Criteria) this;
        }

        public Criteria andTravelidEqualTo(Integer value) {
            addCriterion("travelId =", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotEqualTo(Integer value) {
            addCriterion("travelId <>", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidGreaterThan(Integer value) {
            addCriterion("travelId >", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("travelId >=", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidLessThan(Integer value) {
            addCriterion("travelId <", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidLessThanOrEqualTo(Integer value) {
            addCriterion("travelId <=", value, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidIn(List<Integer> values) {
            addCriterion("travelId in", values, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotIn(List<Integer> values) {
            addCriterion("travelId not in", values, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidBetween(Integer value1, Integer value2) {
            addCriterion("travelId between", value1, value2, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelidNotBetween(Integer value1, Integer value2) {
            addCriterion("travelId not between", value1, value2, "travelid");
            return (Criteria) this;
        }

        public Criteria andTravelnameIsNull() {
            addCriterion("travelName is null");
            return (Criteria) this;
        }

        public Criteria andTravelnameIsNotNull() {
            addCriterion("travelName is not null");
            return (Criteria) this;
        }

        public Criteria andTravelnameEqualTo(String value) {
            addCriterion("travelName =", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotEqualTo(String value) {
            addCriterion("travelName <>", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThan(String value) {
            addCriterion("travelName >", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameGreaterThanOrEqualTo(String value) {
            addCriterion("travelName >=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThan(String value) {
            addCriterion("travelName <", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLessThanOrEqualTo(String value) {
            addCriterion("travelName <=", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameLike(String value) {
            addCriterion("travelName like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotLike(String value) {
            addCriterion("travelName not like", value, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameIn(List<String> values) {
            addCriterion("travelName in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotIn(List<String> values) {
            addCriterion("travelName not in", values, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameBetween(String value1, String value2) {
            addCriterion("travelName between", value1, value2, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelnameNotBetween(String value1, String value2) {
            addCriterion("travelName not between", value1, value2, "travelname");
            return (Criteria) this;
        }

        public Criteria andTravelpriceIsNull() {
            addCriterion("travelPrice is null");
            return (Criteria) this;
        }

        public Criteria andTravelpriceIsNotNull() {
            addCriterion("travelPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTravelpriceEqualTo(BigDecimal value) {
            addCriterion("travelPrice =", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceNotEqualTo(BigDecimal value) {
            addCriterion("travelPrice <>", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceGreaterThan(BigDecimal value) {
            addCriterion("travelPrice >", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("travelPrice >=", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceLessThan(BigDecimal value) {
            addCriterion("travelPrice <", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("travelPrice <=", value, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceIn(List<BigDecimal> values) {
            addCriterion("travelPrice in", values, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceNotIn(List<BigDecimal> values) {
            addCriterion("travelPrice not in", values, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("travelPrice between", value1, value2, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTravelpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("travelPrice not between", value1, value2, "travelprice");
            return (Criteria) this;
        }

        public Criteria andTraveladressIsNull() {
            addCriterion("travelAdress is null");
            return (Criteria) this;
        }

        public Criteria andTraveladressIsNotNull() {
            addCriterion("travelAdress is not null");
            return (Criteria) this;
        }

        public Criteria andTraveladressEqualTo(String value) {
            addCriterion("travelAdress =", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressNotEqualTo(String value) {
            addCriterion("travelAdress <>", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressGreaterThan(String value) {
            addCriterion("travelAdress >", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressGreaterThanOrEqualTo(String value) {
            addCriterion("travelAdress >=", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressLessThan(String value) {
            addCriterion("travelAdress <", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressLessThanOrEqualTo(String value) {
            addCriterion("travelAdress <=", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressLike(String value) {
            addCriterion("travelAdress like", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressNotLike(String value) {
            addCriterion("travelAdress not like", value, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressIn(List<String> values) {
            addCriterion("travelAdress in", values, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressNotIn(List<String> values) {
            addCriterion("travelAdress not in", values, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressBetween(String value1, String value2) {
            addCriterion("travelAdress between", value1, value2, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveladressNotBetween(String value1, String value2) {
            addCriterion("travelAdress not between", value1, value2, "traveladress");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIsNull() {
            addCriterion("travelTime is null");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIsNotNull() {
            addCriterion("travelTime is not null");
            return (Criteria) this;
        }

        public Criteria andTraveltimeEqualTo(Integer value) {
            addCriterion("travelTime =", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotEqualTo(Integer value) {
            addCriterion("travelTime <>", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeGreaterThan(Integer value) {
            addCriterion("travelTime >", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("travelTime >=", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeLessThan(Integer value) {
            addCriterion("travelTime <", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeLessThanOrEqualTo(Integer value) {
            addCriterion("travelTime <=", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIn(List<Integer> values) {
            addCriterion("travelTime in", values, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotIn(List<Integer> values) {
            addCriterion("travelTime not in", values, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeBetween(Integer value1, Integer value2) {
            addCriterion("travelTime between", value1, value2, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("travelTime not between", value1, value2, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltypeIsNull() {
            addCriterion("travelType is null");
            return (Criteria) this;
        }

        public Criteria andTraveltypeIsNotNull() {
            addCriterion("travelType is not null");
            return (Criteria) this;
        }

        public Criteria andTraveltypeEqualTo(String value) {
            addCriterion("travelType =", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeNotEqualTo(String value) {
            addCriterion("travelType <>", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeGreaterThan(String value) {
            addCriterion("travelType >", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeGreaterThanOrEqualTo(String value) {
            addCriterion("travelType >=", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeLessThan(String value) {
            addCriterion("travelType <", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeLessThanOrEqualTo(String value) {
            addCriterion("travelType <=", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeLike(String value) {
            addCriterion("travelType like", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeNotLike(String value) {
            addCriterion("travelType not like", value, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeIn(List<String> values) {
            addCriterion("travelType in", values, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeNotIn(List<String> values) {
            addCriterion("travelType not in", values, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeBetween(String value1, String value2) {
            addCriterion("travelType between", value1, value2, "traveltype");
            return (Criteria) this;
        }

        public Criteria andTraveltypeNotBetween(String value1, String value2) {
            addCriterion("travelType not between", value1, value2, "traveltype");
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

        public Criteria andChangetimeIsNull() {
            addCriterion("changeTime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("changeTime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("changeTime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("changeTime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changeTime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("changeTime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("changeTime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("changeTime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("changeTime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("changeTime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("changeTime not between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andTravelinfoIsNull() {
            addCriterion("travelInfo is null");
            return (Criteria) this;
        }

        public Criteria andTravelinfoIsNotNull() {
            addCriterion("travelInfo is not null");
            return (Criteria) this;
        }

        public Criteria andTravelinfoEqualTo(String value) {
            addCriterion("travelInfo =", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoNotEqualTo(String value) {
            addCriterion("travelInfo <>", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoGreaterThan(String value) {
            addCriterion("travelInfo >", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoGreaterThanOrEqualTo(String value) {
            addCriterion("travelInfo >=", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoLessThan(String value) {
            addCriterion("travelInfo <", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoLessThanOrEqualTo(String value) {
            addCriterion("travelInfo <=", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoLike(String value) {
            addCriterion("travelInfo like", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoNotLike(String value) {
            addCriterion("travelInfo not like", value, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoIn(List<String> values) {
            addCriterion("travelInfo in", values, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoNotIn(List<String> values) {
            addCriterion("travelInfo not in", values, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoBetween(String value1, String value2) {
            addCriterion("travelInfo between", value1, value2, "travelinfo");
            return (Criteria) this;
        }

        public Criteria andTravelinfoNotBetween(String value1, String value2) {
            addCriterion("travelInfo not between", value1, value2, "travelinfo");
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