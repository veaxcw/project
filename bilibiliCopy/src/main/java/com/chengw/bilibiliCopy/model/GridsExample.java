package com.bilibili.main.model;

import java.util.ArrayList;
import java.util.List;

public class GridsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GridsExample() {
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

        public Criteria andGridIdIsNull() {
            addCriterion("grid_id is null");
            return (Criteria) this;
        }

        public Criteria andGridIdIsNotNull() {
            addCriterion("grid_id is not null");
            return (Criteria) this;
        }

        public Criteria andGridIdEqualTo(String value) {
            addCriterion("grid_id =", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotEqualTo(String value) {
            addCriterion("grid_id <>", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThan(String value) {
            addCriterion("grid_id >", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThanOrEqualTo(String value) {
            addCriterion("grid_id >=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThan(String value) {
            addCriterion("grid_id <", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThanOrEqualTo(String value) {
            addCriterion("grid_id <=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLike(String value) {
            addCriterion("grid_id like", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotLike(String value) {
            addCriterion("grid_id not like", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdIn(List<String> values) {
            addCriterion("grid_id in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotIn(List<String> values) {
            addCriterion("grid_id not in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdBetween(String value1, String value2) {
            addCriterion("grid_id between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotBetween(String value1, String value2) {
            addCriterion("grid_id not between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridsNameIsNull() {
            addCriterion("grids_name is null");
            return (Criteria) this;
        }

        public Criteria andGridsNameIsNotNull() {
            addCriterion("grids_name is not null");
            return (Criteria) this;
        }

        public Criteria andGridsNameEqualTo(String value) {
            addCriterion("grids_name =", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameNotEqualTo(String value) {
            addCriterion("grids_name <>", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameGreaterThan(String value) {
            addCriterion("grids_name >", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameGreaterThanOrEqualTo(String value) {
            addCriterion("grids_name >=", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameLessThan(String value) {
            addCriterion("grids_name <", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameLessThanOrEqualTo(String value) {
            addCriterion("grids_name <=", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameLike(String value) {
            addCriterion("grids_name like", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameNotLike(String value) {
            addCriterion("grids_name not like", value, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameIn(List<String> values) {
            addCriterion("grids_name in", values, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameNotIn(List<String> values) {
            addCriterion("grids_name not in", values, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameBetween(String value1, String value2) {
            addCriterion("grids_name between", value1, value2, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridsNameNotBetween(String value1, String value2) {
            addCriterion("grids_name not between", value1, value2, "gridsName");
            return (Criteria) this;
        }

        public Criteria andGridPriceIsNull() {
            addCriterion("grid_price is null");
            return (Criteria) this;
        }

        public Criteria andGridPriceIsNotNull() {
            addCriterion("grid_price is not null");
            return (Criteria) this;
        }

        public Criteria andGridPriceEqualTo(String value) {
            addCriterion("grid_price =", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceNotEqualTo(String value) {
            addCriterion("grid_price <>", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceGreaterThan(String value) {
            addCriterion("grid_price >", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceGreaterThanOrEqualTo(String value) {
            addCriterion("grid_price >=", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceLessThan(String value) {
            addCriterion("grid_price <", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceLessThanOrEqualTo(String value) {
            addCriterion("grid_price <=", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceLike(String value) {
            addCriterion("grid_price like", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceNotLike(String value) {
            addCriterion("grid_price not like", value, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceIn(List<String> values) {
            addCriterion("grid_price in", values, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceNotIn(List<String> values) {
            addCriterion("grid_price not in", values, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceBetween(String value1, String value2) {
            addCriterion("grid_price between", value1, value2, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridPriceNotBetween(String value1, String value2) {
            addCriterion("grid_price not between", value1, value2, "gridPrice");
            return (Criteria) this;
        }

        public Criteria andGridImgIsNull() {
            addCriterion("grid_img is null");
            return (Criteria) this;
        }

        public Criteria andGridImgIsNotNull() {
            addCriterion("grid_img is not null");
            return (Criteria) this;
        }

        public Criteria andGridImgEqualTo(String value) {
            addCriterion("grid_img =", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgNotEqualTo(String value) {
            addCriterion("grid_img <>", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgGreaterThan(String value) {
            addCriterion("grid_img >", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgGreaterThanOrEqualTo(String value) {
            addCriterion("grid_img >=", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgLessThan(String value) {
            addCriterion("grid_img <", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgLessThanOrEqualTo(String value) {
            addCriterion("grid_img <=", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgLike(String value) {
            addCriterion("grid_img like", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgNotLike(String value) {
            addCriterion("grid_img not like", value, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgIn(List<String> values) {
            addCriterion("grid_img in", values, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgNotIn(List<String> values) {
            addCriterion("grid_img not in", values, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgBetween(String value1, String value2) {
            addCriterion("grid_img between", value1, value2, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridImgNotBetween(String value1, String value2) {
            addCriterion("grid_img not between", value1, value2, "gridImg");
            return (Criteria) this;
        }

        public Criteria andGridsStockIsNull() {
            addCriterion("grids_stock is null");
            return (Criteria) this;
        }

        public Criteria andGridsStockIsNotNull() {
            addCriterion("grids_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGridsStockEqualTo(Integer value) {
            addCriterion("grids_stock =", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockNotEqualTo(Integer value) {
            addCriterion("grids_stock <>", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockGreaterThan(Integer value) {
            addCriterion("grids_stock >", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("grids_stock >=", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockLessThan(Integer value) {
            addCriterion("grids_stock <", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockLessThanOrEqualTo(Integer value) {
            addCriterion("grids_stock <=", value, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockIn(List<Integer> values) {
            addCriterion("grids_stock in", values, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockNotIn(List<Integer> values) {
            addCriterion("grids_stock not in", values, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockBetween(Integer value1, Integer value2) {
            addCriterion("grids_stock between", value1, value2, "gridsStock");
            return (Criteria) this;
        }

        public Criteria andGridsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("grids_stock not between", value1, value2, "gridsStock");
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