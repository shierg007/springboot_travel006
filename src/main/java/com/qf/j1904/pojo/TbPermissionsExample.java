package com.qf.j1904.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPermissionsExample() {
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

        public Criteria andPermissionidIsNull() {
            addCriterion("permissionId is null");
            return (Criteria) this;
        }

        public Criteria andPermissionidIsNotNull() {
            addCriterion("permissionId is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionidEqualTo(Integer value) {
            addCriterion("permissionId =", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotEqualTo(Integer value) {
            addCriterion("permissionId <>", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThan(Integer value) {
            addCriterion("permissionId >", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("permissionId >=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThan(Integer value) {
            addCriterion("permissionId <", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThanOrEqualTo(Integer value) {
            addCriterion("permissionId <=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidIn(List<Integer> values) {
            addCriterion("permissionId in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotIn(List<Integer> values) {
            addCriterion("permissionId not in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidBetween(Integer value1, Integer value2) {
            addCriterion("permissionId between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotBetween(Integer value1, Integer value2) {
            addCriterion("permissionId not between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIsNull() {
            addCriterion("permissionName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIsNotNull() {
            addCriterion("permissionName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionnameEqualTo(String value) {
            addCriterion("permissionName =", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotEqualTo(String value) {
            addCriterion("permissionName <>", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameGreaterThan(String value) {
            addCriterion("permissionName >", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameGreaterThanOrEqualTo(String value) {
            addCriterion("permissionName >=", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLessThan(String value) {
            addCriterion("permissionName <", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLessThanOrEqualTo(String value) {
            addCriterion("permissionName <=", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLike(String value) {
            addCriterion("permissionName like", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotLike(String value) {
            addCriterion("permissionName not like", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIn(List<String> values) {
            addCriterion("permissionName in", values, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotIn(List<String> values) {
            addCriterion("permissionName not in", values, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameBetween(String value1, String value2) {
            addCriterion("permissionName between", value1, value2, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotBetween(String value1, String value2) {
            addCriterion("permissionName not between", value1, value2, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissiondescIsNull() {
            addCriterion("permissionDesc is null");
            return (Criteria) this;
        }

        public Criteria andPermissiondescIsNotNull() {
            addCriterion("permissionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPermissiondescEqualTo(String value) {
            addCriterion("permissionDesc =", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescNotEqualTo(String value) {
            addCriterion("permissionDesc <>", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescGreaterThan(String value) {
            addCriterion("permissionDesc >", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescGreaterThanOrEqualTo(String value) {
            addCriterion("permissionDesc >=", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescLessThan(String value) {
            addCriterion("permissionDesc <", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescLessThanOrEqualTo(String value) {
            addCriterion("permissionDesc <=", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescLike(String value) {
            addCriterion("permissionDesc like", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescNotLike(String value) {
            addCriterion("permissionDesc not like", value, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescIn(List<String> values) {
            addCriterion("permissionDesc in", values, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescNotIn(List<String> values) {
            addCriterion("permissionDesc not in", values, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescBetween(String value1, String value2) {
            addCriterion("permissionDesc between", value1, value2, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissiondescNotBetween(String value1, String value2) {
            addCriterion("permissionDesc not between", value1, value2, "permissiondesc");
            return (Criteria) this;
        }

        public Criteria andPermissionurlIsNull() {
            addCriterion("permissionUrl is null");
            return (Criteria) this;
        }

        public Criteria andPermissionurlIsNotNull() {
            addCriterion("permissionUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionurlEqualTo(String value) {
            addCriterion("permissionUrl =", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlNotEqualTo(String value) {
            addCriterion("permissionUrl <>", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlGreaterThan(String value) {
            addCriterion("permissionUrl >", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlGreaterThanOrEqualTo(String value) {
            addCriterion("permissionUrl >=", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlLessThan(String value) {
            addCriterion("permissionUrl <", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlLessThanOrEqualTo(String value) {
            addCriterion("permissionUrl <=", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlLike(String value) {
            addCriterion("permissionUrl like", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlNotLike(String value) {
            addCriterion("permissionUrl not like", value, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlIn(List<String> values) {
            addCriterion("permissionUrl in", values, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlNotIn(List<String> values) {
            addCriterion("permissionUrl not in", values, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlBetween(String value1, String value2) {
            addCriterion("permissionUrl between", value1, value2, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andPermissionurlNotBetween(String value1, String value2) {
            addCriterion("permissionUrl not between", value1, value2, "permissionurl");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNull() {
            addCriterion("ifValid is null");
            return (Criteria) this;
        }

        public Criteria andIfvalidIsNotNull() {
            addCriterion("ifValid is not null");
            return (Criteria) this;
        }

        public Criteria andIfvalidEqualTo(Integer value) {
            addCriterion("ifValid =", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotEqualTo(Integer value) {
            addCriterion("ifValid <>", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThan(Integer value) {
            addCriterion("ifValid >", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ifValid >=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThan(Integer value) {
            addCriterion("ifValid <", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidLessThanOrEqualTo(Integer value) {
            addCriterion("ifValid <=", value, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidIn(List<Integer> values) {
            addCriterion("ifValid in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotIn(List<Integer> values) {
            addCriterion("ifValid not in", values, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidBetween(Integer value1, Integer value2) {
            addCriterion("ifValid between", value1, value2, "ifvalid");
            return (Criteria) this;
        }

        public Criteria andIfvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("ifValid not between", value1, value2, "ifvalid");
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