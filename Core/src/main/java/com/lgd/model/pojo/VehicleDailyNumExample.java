package com.lgd.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VehicleDailyNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleDailyNumExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(String value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(String value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(String value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(String value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(String value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLike(String value) {
            addCriterion("vehicle_id like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotLike(String value) {
            addCriterion("vehicle_id not like", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<String> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<String> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(String value1, String value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(String value1, String value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNull() {
            addCriterion("storage_time is null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNotNull() {
            addCriterion("storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeEqualTo(Date value) {
            addCriterionForJDBCDate("storage_time =", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("storage_time <>", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("storage_time >", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("storage_time >=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThan(Date value) {
            addCriterionForJDBCDate("storage_time <", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("storage_time <=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIn(List<Date> values) {
            addCriterionForJDBCDate("storage_time in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("storage_time not in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("storage_time between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("storage_time not between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumIsNull() {
            addCriterion("vehicle_id_num is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumIsNotNull() {
            addCriterion("vehicle_id_num is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumEqualTo(Integer value) {
            addCriterion("vehicle_id_num =", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumNotEqualTo(Integer value) {
            addCriterion("vehicle_id_num <>", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumGreaterThan(Integer value) {
            addCriterion("vehicle_id_num >", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id_num >=", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumLessThan(Integer value) {
            addCriterion("vehicle_id_num <", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id_num <=", value, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumIn(List<Integer> values) {
            addCriterion("vehicle_id_num in", values, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumNotIn(List<Integer> values) {
            addCriterion("vehicle_id_num not in", values, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id_num between", value1, value2, "vehicleIdNum");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id_num not between", value1, value2, "vehicleIdNum");
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