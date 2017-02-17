package com.lgd.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class VinDimensionCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VinDimensionCountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andUvCountryIsNull() {
            addCriterion("uv_country is null");
            return (Criteria) this;
        }

        public Criteria andUvCountryIsNotNull() {
            addCriterion("uv_country is not null");
            return (Criteria) this;
        }

        public Criteria andUvCountryEqualTo(Integer value) {
            addCriterion("uv_country =", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryNotEqualTo(Integer value) {
            addCriterion("uv_country <>", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryGreaterThan(Integer value) {
            addCriterion("uv_country >", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_country >=", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryLessThan(Integer value) {
            addCriterion("uv_country <", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryLessThanOrEqualTo(Integer value) {
            addCriterion("uv_country <=", value, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryIn(List<Integer> values) {
            addCriterion("uv_country in", values, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryNotIn(List<Integer> values) {
            addCriterion("uv_country not in", values, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryBetween(Integer value1, Integer value2) {
            addCriterion("uv_country between", value1, value2, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_country not between", value1, value2, "uvCountry");
            return (Criteria) this;
        }

        public Criteria andUvOemIsNull() {
            addCriterion("uv_oem is null");
            return (Criteria) this;
        }

        public Criteria andUvOemIsNotNull() {
            addCriterion("uv_oem is not null");
            return (Criteria) this;
        }

        public Criteria andUvOemEqualTo(Integer value) {
            addCriterion("uv_oem =", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemNotEqualTo(Integer value) {
            addCriterion("uv_oem <>", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemGreaterThan(Integer value) {
            addCriterion("uv_oem >", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_oem >=", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemLessThan(Integer value) {
            addCriterion("uv_oem <", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemLessThanOrEqualTo(Integer value) {
            addCriterion("uv_oem <=", value, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemIn(List<Integer> values) {
            addCriterion("uv_oem in", values, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemNotIn(List<Integer> values) {
            addCriterion("uv_oem not in", values, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemBetween(Integer value1, Integer value2) {
            addCriterion("uv_oem between", value1, value2, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvOemNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_oem not between", value1, value2, "uvOem");
            return (Criteria) this;
        }

        public Criteria andUvYearIsNull() {
            addCriterion("uv_year is null");
            return (Criteria) this;
        }

        public Criteria andUvYearIsNotNull() {
            addCriterion("uv_year is not null");
            return (Criteria) this;
        }

        public Criteria andUvYearEqualTo(Integer value) {
            addCriterion("uv_year =", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearNotEqualTo(Integer value) {
            addCriterion("uv_year <>", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearGreaterThan(Integer value) {
            addCriterion("uv_year >", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_year >=", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearLessThan(Integer value) {
            addCriterion("uv_year <", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearLessThanOrEqualTo(Integer value) {
            addCriterion("uv_year <=", value, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearIn(List<Integer> values) {
            addCriterion("uv_year in", values, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearNotIn(List<Integer> values) {
            addCriterion("uv_year not in", values, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearBetween(Integer value1, Integer value2) {
            addCriterion("uv_year between", value1, value2, "uvYear");
            return (Criteria) this;
        }

        public Criteria andUvYearNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_year not between", value1, value2, "uvYear");
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