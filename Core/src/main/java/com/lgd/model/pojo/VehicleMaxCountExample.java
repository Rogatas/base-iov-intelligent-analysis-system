package com.lgd.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class VehicleMaxCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleMaxCountExample() {
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

        public Criteria andInnerIdIsNull() {
            addCriterion("inner_id is null");
            return (Criteria) this;
        }

        public Criteria andInnerIdIsNotNull() {
            addCriterion("inner_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnerIdEqualTo(String value) {
            addCriterion("inner_id =", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotEqualTo(String value) {
            addCriterion("inner_id <>", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThan(String value) {
            addCriterion("inner_id >", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("inner_id >=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThan(String value) {
            addCriterion("inner_id <", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLessThanOrEqualTo(String value) {
            addCriterion("inner_id <=", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdLike(String value) {
            addCriterion("inner_id like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotLike(String value) {
            addCriterion("inner_id not like", value, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdIn(List<String> values) {
            addCriterion("inner_id in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotIn(List<String> values) {
            addCriterion("inner_id not in", values, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdBetween(String value1, String value2) {
            addCriterion("inner_id between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andInnerIdNotBetween(String value1, String value2) {
            addCriterion("inner_id not between", value1, value2, "innerId");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIsNull() {
            addCriterion("max_speed is null");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIsNotNull() {
            addCriterion("max_speed is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedEqualTo(Integer value) {
            addCriterion("max_speed =", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotEqualTo(Integer value) {
            addCriterion("max_speed <>", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedGreaterThan(Integer value) {
            addCriterion("max_speed >", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_speed >=", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedLessThan(Integer value) {
            addCriterion("max_speed <", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("max_speed <=", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIn(List<Integer> values) {
            addCriterion("max_speed in", values, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotIn(List<Integer> values) {
            addCriterion("max_speed not in", values, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedBetween(Integer value1, Integer value2) {
            addCriterion("max_speed between", value1, value2, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("max_speed not between", value1, value2, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxMileageIsNull() {
            addCriterion("max_mileage is null");
            return (Criteria) this;
        }

        public Criteria andMaxMileageIsNotNull() {
            addCriterion("max_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxMileageEqualTo(Integer value) {
            addCriterion("max_mileage =", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageNotEqualTo(Integer value) {
            addCriterion("max_mileage <>", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageGreaterThan(Integer value) {
            addCriterion("max_mileage >", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_mileage >=", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageLessThan(Integer value) {
            addCriterion("max_mileage <", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageLessThanOrEqualTo(Integer value) {
            addCriterion("max_mileage <=", value, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageIn(List<Integer> values) {
            addCriterion("max_mileage in", values, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageNotIn(List<Integer> values) {
            addCriterion("max_mileage not in", values, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageBetween(Integer value1, Integer value2) {
            addCriterion("max_mileage between", value1, value2, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("max_mileage not between", value1, value2, "maxMileage");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedIsNull() {
            addCriterion("max_engine_speed is null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedIsNotNull() {
            addCriterion("max_engine_speed is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedEqualTo(Integer value) {
            addCriterion("max_engine_speed =", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedNotEqualTo(Integer value) {
            addCriterion("max_engine_speed <>", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedGreaterThan(Integer value) {
            addCriterion("max_engine_speed >", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_engine_speed >=", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedLessThan(Integer value) {
            addCriterion("max_engine_speed <", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("max_engine_speed <=", value, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedIn(List<Integer> values) {
            addCriterion("max_engine_speed in", values, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedNotIn(List<Integer> values) {
            addCriterion("max_engine_speed not in", values, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_speed between", value1, value2, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_speed not between", value1, value2, "maxEngineSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemIsNull() {
            addCriterion("max_engine_tem is null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemIsNotNull() {
            addCriterion("max_engine_tem is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemEqualTo(Integer value) {
            addCriterion("max_engine_tem =", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemNotEqualTo(Integer value) {
            addCriterion("max_engine_tem <>", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemGreaterThan(Integer value) {
            addCriterion("max_engine_tem >", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_engine_tem >=", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemLessThan(Integer value) {
            addCriterion("max_engine_tem <", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemLessThanOrEqualTo(Integer value) {
            addCriterion("max_engine_tem <=", value, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemIn(List<Integer> values) {
            addCriterion("max_engine_tem in", values, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemNotIn(List<Integer> values) {
            addCriterion("max_engine_tem not in", values, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_tem between", value1, value2, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineTemNotBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_tem not between", value1, value2, "maxEngineTem");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadIsNull() {
            addCriterion("max_engine_load is null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadIsNotNull() {
            addCriterion("max_engine_load is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadEqualTo(Integer value) {
            addCriterion("max_engine_load =", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadNotEqualTo(Integer value) {
            addCriterion("max_engine_load <>", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadGreaterThan(Integer value) {
            addCriterion("max_engine_load >", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_engine_load >=", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadLessThan(Integer value) {
            addCriterion("max_engine_load <", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadLessThanOrEqualTo(Integer value) {
            addCriterion("max_engine_load <=", value, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadIn(List<Integer> values) {
            addCriterion("max_engine_load in", values, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadNotIn(List<Integer> values) {
            addCriterion("max_engine_load not in", values, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_load between", value1, value2, "maxEngineLoad");
            return (Criteria) this;
        }

        public Criteria andMaxEngineLoadNotBetween(Integer value1, Integer value2) {
            addCriterion("max_engine_load not between", value1, value2, "maxEngineLoad");
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