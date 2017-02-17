package com.lgd.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaseInfoVehicleInnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseInfoVehicleInnerExample() {
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

        public Criteria andMinOilWearIsNull() {
            addCriterion("min_oil_wear is null");
            return (Criteria) this;
        }

        public Criteria andMinOilWearIsNotNull() {
            addCriterion("min_oil_wear is not null");
            return (Criteria) this;
        }

        public Criteria andMinOilWearEqualTo(Double value) {
            addCriterion("min_oil_wear =", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearNotEqualTo(Double value) {
            addCriterion("min_oil_wear <>", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearGreaterThan(Double value) {
            addCriterion("min_oil_wear >", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearGreaterThanOrEqualTo(Double value) {
            addCriterion("min_oil_wear >=", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearLessThan(Double value) {
            addCriterion("min_oil_wear <", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearLessThanOrEqualTo(Double value) {
            addCriterion("min_oil_wear <=", value, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearIn(List<Double> values) {
            addCriterion("min_oil_wear in", values, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearNotIn(List<Double> values) {
            addCriterion("min_oil_wear not in", values, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearBetween(Double value1, Double value2) {
            addCriterion("min_oil_wear between", value1, value2, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andMinOilWearNotBetween(Double value1, Double value2) {
            addCriterion("min_oil_wear not between", value1, value2, "minOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearIsNull() {
            addCriterion("average_oil_wear is null");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearIsNotNull() {
            addCriterion("average_oil_wear is not null");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearEqualTo(Double value) {
            addCriterion("average_oil_wear =", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearNotEqualTo(Double value) {
            addCriterion("average_oil_wear <>", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearGreaterThan(Double value) {
            addCriterion("average_oil_wear >", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearGreaterThanOrEqualTo(Double value) {
            addCriterion("average_oil_wear >=", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearLessThan(Double value) {
            addCriterion("average_oil_wear <", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearLessThanOrEqualTo(Double value) {
            addCriterion("average_oil_wear <=", value, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearIn(List<Double> values) {
            addCriterion("average_oil_wear in", values, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearNotIn(List<Double> values) {
            addCriterion("average_oil_wear not in", values, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearBetween(Double value1, Double value2) {
            addCriterion("average_oil_wear between", value1, value2, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andAverageOilWearNotBetween(Double value1, Double value2) {
            addCriterion("average_oil_wear not between", value1, value2, "averageOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearIsNull() {
            addCriterion("max_oil_wear is null");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearIsNotNull() {
            addCriterion("max_oil_wear is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearEqualTo(Double value) {
            addCriterion("max_oil_wear =", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearNotEqualTo(Double value) {
            addCriterion("max_oil_wear <>", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearGreaterThan(Double value) {
            addCriterion("max_oil_wear >", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearGreaterThanOrEqualTo(Double value) {
            addCriterion("max_oil_wear >=", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearLessThan(Double value) {
            addCriterion("max_oil_wear <", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearLessThanOrEqualTo(Double value) {
            addCriterion("max_oil_wear <=", value, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearIn(List<Double> values) {
            addCriterion("max_oil_wear in", values, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearNotIn(List<Double> values) {
            addCriterion("max_oil_wear not in", values, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearBetween(Double value1, Double value2) {
            addCriterion("max_oil_wear between", value1, value2, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMaxOilWearNotBetween(Double value1, Double value2) {
            addCriterion("max_oil_wear not between", value1, value2, "maxOilWear");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemIsNull() {
            addCriterion("min_intake_tem is null");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemIsNotNull() {
            addCriterion("min_intake_tem is not null");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemEqualTo(Double value) {
            addCriterion("min_intake_tem =", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemNotEqualTo(Double value) {
            addCriterion("min_intake_tem <>", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemGreaterThan(Double value) {
            addCriterion("min_intake_tem >", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemGreaterThanOrEqualTo(Double value) {
            addCriterion("min_intake_tem >=", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemLessThan(Double value) {
            addCriterion("min_intake_tem <", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemLessThanOrEqualTo(Double value) {
            addCriterion("min_intake_tem <=", value, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemIn(List<Double> values) {
            addCriterion("min_intake_tem in", values, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemNotIn(List<Double> values) {
            addCriterion("min_intake_tem not in", values, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemBetween(Double value1, Double value2) {
            addCriterion("min_intake_tem between", value1, value2, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinIntakeTemNotBetween(Double value1, Double value2) {
            addCriterion("min_intake_tem not between", value1, value2, "minIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemIsNull() {
            addCriterion("average_intake_tem is null");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemIsNotNull() {
            addCriterion("average_intake_tem is not null");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemEqualTo(Double value) {
            addCriterion("average_intake_tem =", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemNotEqualTo(Double value) {
            addCriterion("average_intake_tem <>", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemGreaterThan(Double value) {
            addCriterion("average_intake_tem >", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemGreaterThanOrEqualTo(Double value) {
            addCriterion("average_intake_tem >=", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemLessThan(Double value) {
            addCriterion("average_intake_tem <", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemLessThanOrEqualTo(Double value) {
            addCriterion("average_intake_tem <=", value, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemIn(List<Double> values) {
            addCriterion("average_intake_tem in", values, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemNotIn(List<Double> values) {
            addCriterion("average_intake_tem not in", values, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemBetween(Double value1, Double value2) {
            addCriterion("average_intake_tem between", value1, value2, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andAverageIntakeTemNotBetween(Double value1, Double value2) {
            addCriterion("average_intake_tem not between", value1, value2, "averageIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemIsNull() {
            addCriterion("max_intake_tem is null");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemIsNotNull() {
            addCriterion("max_intake_tem is not null");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemEqualTo(Double value) {
            addCriterion("max_intake_tem =", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemNotEqualTo(Double value) {
            addCriterion("max_intake_tem <>", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemGreaterThan(Double value) {
            addCriterion("max_intake_tem >", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemGreaterThanOrEqualTo(Double value) {
            addCriterion("max_intake_tem >=", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemLessThan(Double value) {
            addCriterion("max_intake_tem <", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemLessThanOrEqualTo(Double value) {
            addCriterion("max_intake_tem <=", value, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemIn(List<Double> values) {
            addCriterion("max_intake_tem in", values, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemNotIn(List<Double> values) {
            addCriterion("max_intake_tem not in", values, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemBetween(Double value1, Double value2) {
            addCriterion("max_intake_tem between", value1, value2, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMaxIntakeTemNotBetween(Double value1, Double value2) {
            addCriterion("max_intake_tem not between", value1, value2, "maxIntakeTem");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowIsNull() {
            addCriterion("min_air_flow is null");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowIsNotNull() {
            addCriterion("min_air_flow is not null");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowEqualTo(Double value) {
            addCriterion("min_air_flow =", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowNotEqualTo(Double value) {
            addCriterion("min_air_flow <>", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowGreaterThan(Double value) {
            addCriterion("min_air_flow >", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("min_air_flow >=", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowLessThan(Double value) {
            addCriterion("min_air_flow <", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowLessThanOrEqualTo(Double value) {
            addCriterion("min_air_flow <=", value, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowIn(List<Double> values) {
            addCriterion("min_air_flow in", values, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowNotIn(List<Double> values) {
            addCriterion("min_air_flow not in", values, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowBetween(Double value1, Double value2) {
            addCriterion("min_air_flow between", value1, value2, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinAirFlowNotBetween(Double value1, Double value2) {
            addCriterion("min_air_flow not between", value1, value2, "minAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowIsNull() {
            addCriterion("average_air_flow is null");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowIsNotNull() {
            addCriterion("average_air_flow is not null");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowEqualTo(Double value) {
            addCriterion("average_air_flow =", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowNotEqualTo(Double value) {
            addCriterion("average_air_flow <>", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowGreaterThan(Double value) {
            addCriterion("average_air_flow >", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("average_air_flow >=", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowLessThan(Double value) {
            addCriterion("average_air_flow <", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowLessThanOrEqualTo(Double value) {
            addCriterion("average_air_flow <=", value, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowIn(List<Double> values) {
            addCriterion("average_air_flow in", values, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowNotIn(List<Double> values) {
            addCriterion("average_air_flow not in", values, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowBetween(Double value1, Double value2) {
            addCriterion("average_air_flow between", value1, value2, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andAverageAirFlowNotBetween(Double value1, Double value2) {
            addCriterion("average_air_flow not between", value1, value2, "averageAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowIsNull() {
            addCriterion("max_air_flow is null");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowIsNotNull() {
            addCriterion("max_air_flow is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowEqualTo(Double value) {
            addCriterion("max_air_flow =", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowNotEqualTo(Double value) {
            addCriterion("max_air_flow <>", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowGreaterThan(Double value) {
            addCriterion("max_air_flow >", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowGreaterThanOrEqualTo(Double value) {
            addCriterion("max_air_flow >=", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowLessThan(Double value) {
            addCriterion("max_air_flow <", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowLessThanOrEqualTo(Double value) {
            addCriterion("max_air_flow <=", value, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowIn(List<Double> values) {
            addCriterion("max_air_flow in", values, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowNotIn(List<Double> values) {
            addCriterion("max_air_flow not in", values, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowBetween(Double value1, Double value2) {
            addCriterion("max_air_flow between", value1, value2, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMaxAirFlowNotBetween(Double value1, Double value2) {
            addCriterion("max_air_flow not between", value1, value2, "maxAirFlow");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageIsNull() {
            addCriterion("min_battery_voltage is null");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageIsNotNull() {
            addCriterion("min_battery_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageEqualTo(Double value) {
            addCriterion("min_battery_voltage =", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageNotEqualTo(Double value) {
            addCriterion("min_battery_voltage <>", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageGreaterThan(Double value) {
            addCriterion("min_battery_voltage >", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("min_battery_voltage >=", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageLessThan(Double value) {
            addCriterion("min_battery_voltage <", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageLessThanOrEqualTo(Double value) {
            addCriterion("min_battery_voltage <=", value, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageIn(List<Double> values) {
            addCriterion("min_battery_voltage in", values, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageNotIn(List<Double> values) {
            addCriterion("min_battery_voltage not in", values, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageBetween(Double value1, Double value2) {
            addCriterion("min_battery_voltage between", value1, value2, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinBatteryVoltageNotBetween(Double value1, Double value2) {
            addCriterion("min_battery_voltage not between", value1, value2, "minBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageIsNull() {
            addCriterion("average_battery_voltage is null");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageIsNotNull() {
            addCriterion("average_battery_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageEqualTo(Double value) {
            addCriterion("average_battery_voltage =", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageNotEqualTo(Double value) {
            addCriterion("average_battery_voltage <>", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageGreaterThan(Double value) {
            addCriterion("average_battery_voltage >", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("average_battery_voltage >=", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageLessThan(Double value) {
            addCriterion("average_battery_voltage <", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageLessThanOrEqualTo(Double value) {
            addCriterion("average_battery_voltage <=", value, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageIn(List<Double> values) {
            addCriterion("average_battery_voltage in", values, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageNotIn(List<Double> values) {
            addCriterion("average_battery_voltage not in", values, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageBetween(Double value1, Double value2) {
            addCriterion("average_battery_voltage between", value1, value2, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andAverageBatteryVoltageNotBetween(Double value1, Double value2) {
            addCriterion("average_battery_voltage not between", value1, value2, "averageBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageIsNull() {
            addCriterion("max_battery_voltage is null");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageIsNotNull() {
            addCriterion("max_battery_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageEqualTo(Double value) {
            addCriterion("max_battery_voltage =", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageNotEqualTo(Double value) {
            addCriterion("max_battery_voltage <>", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageGreaterThan(Double value) {
            addCriterion("max_battery_voltage >", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("max_battery_voltage >=", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageLessThan(Double value) {
            addCriterion("max_battery_voltage <", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageLessThanOrEqualTo(Double value) {
            addCriterion("max_battery_voltage <=", value, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageIn(List<Double> values) {
            addCriterion("max_battery_voltage in", values, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageNotIn(List<Double> values) {
            addCriterion("max_battery_voltage not in", values, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageBetween(Double value1, Double value2) {
            addCriterion("max_battery_voltage between", value1, value2, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMaxBatteryVoltageNotBetween(Double value1, Double value2) {
            addCriterion("max_battery_voltage not between", value1, value2, "maxBatteryVoltage");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemIsNull() {
            addCriterion("min_coolant_tem is null");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemIsNotNull() {
            addCriterion("min_coolant_tem is not null");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemEqualTo(Double value) {
            addCriterion("min_coolant_tem =", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemNotEqualTo(Double value) {
            addCriterion("min_coolant_tem <>", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemGreaterThan(Double value) {
            addCriterion("min_coolant_tem >", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemGreaterThanOrEqualTo(Double value) {
            addCriterion("min_coolant_tem >=", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemLessThan(Double value) {
            addCriterion("min_coolant_tem <", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemLessThanOrEqualTo(Double value) {
            addCriterion("min_coolant_tem <=", value, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemIn(List<Double> values) {
            addCriterion("min_coolant_tem in", values, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemNotIn(List<Double> values) {
            addCriterion("min_coolant_tem not in", values, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemBetween(Double value1, Double value2) {
            addCriterion("min_coolant_tem between", value1, value2, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMinCoolantTemNotBetween(Double value1, Double value2) {
            addCriterion("min_coolant_tem not between", value1, value2, "minCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemIsNull() {
            addCriterion("average_coolant_tem is null");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemIsNotNull() {
            addCriterion("average_coolant_tem is not null");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemEqualTo(Double value) {
            addCriterion("average_coolant_tem =", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemNotEqualTo(Double value) {
            addCriterion("average_coolant_tem <>", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemGreaterThan(Double value) {
            addCriterion("average_coolant_tem >", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemGreaterThanOrEqualTo(Double value) {
            addCriterion("average_coolant_tem >=", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemLessThan(Double value) {
            addCriterion("average_coolant_tem <", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemLessThanOrEqualTo(Double value) {
            addCriterion("average_coolant_tem <=", value, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemIn(List<Double> values) {
            addCriterion("average_coolant_tem in", values, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemNotIn(List<Double> values) {
            addCriterion("average_coolant_tem not in", values, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemBetween(Double value1, Double value2) {
            addCriterion("average_coolant_tem between", value1, value2, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andAverageCoolantTemNotBetween(Double value1, Double value2) {
            addCriterion("average_coolant_tem not between", value1, value2, "averageCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemIsNull() {
            addCriterion("max_coolant_tem is null");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemIsNotNull() {
            addCriterion("max_coolant_tem is not null");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemEqualTo(Double value) {
            addCriterion("max_coolant_tem =", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemNotEqualTo(Double value) {
            addCriterion("max_coolant_tem <>", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemGreaterThan(Double value) {
            addCriterion("max_coolant_tem >", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemGreaterThanOrEqualTo(Double value) {
            addCriterion("max_coolant_tem >=", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemLessThan(Double value) {
            addCriterion("max_coolant_tem <", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemLessThanOrEqualTo(Double value) {
            addCriterion("max_coolant_tem <=", value, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemIn(List<Double> values) {
            addCriterion("max_coolant_tem in", values, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemNotIn(List<Double> values) {
            addCriterion("max_coolant_tem not in", values, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemBetween(Double value1, Double value2) {
            addCriterion("max_coolant_tem between", value1, value2, "maxCoolantTem");
            return (Criteria) this;
        }

        public Criteria andMaxCoolantTemNotBetween(Double value1, Double value2) {
            addCriterion("max_coolant_tem not between", value1, value2, "maxCoolantTem");
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