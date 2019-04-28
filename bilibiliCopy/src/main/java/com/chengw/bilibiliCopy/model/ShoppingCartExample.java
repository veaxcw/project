package com.bilibili.main.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(String value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(String value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(String value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(String value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(String value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(String value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLike(String value) {
            addCriterion("cart_id like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotLike(String value) {
            addCriterion("cart_id not like", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<String> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<String> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(String value1, String value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(String value1, String value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIsNull() {
            addCriterion("shopping_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIsNotNull() {
            addCriterion("shopping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdEqualTo(String value) {
            addCriterion("shopping_id =", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotEqualTo(String value) {
            addCriterion("shopping_id <>", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThan(String value) {
            addCriterion("shopping_id >", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_id >=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThan(String value) {
            addCriterion("shopping_id <", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThanOrEqualTo(String value) {
            addCriterion("shopping_id <=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLike(String value) {
            addCriterion("shopping_id like", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotLike(String value) {
            addCriterion("shopping_id not like", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIn(List<String> values) {
            addCriterion("shopping_id in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotIn(List<String> values) {
            addCriterion("shopping_id not in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdBetween(String value1, String value2) {
            addCriterion("shopping_id between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotBetween(String value1, String value2) {
            addCriterion("shopping_id not between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShopppingNameIsNull() {
            addCriterion("shoppping_name is null");
            return (Criteria) this;
        }

        public Criteria andShopppingNameIsNotNull() {
            addCriterion("shoppping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopppingNameEqualTo(String value) {
            addCriterion("shoppping_name =", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameNotEqualTo(String value) {
            addCriterion("shoppping_name <>", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameGreaterThan(String value) {
            addCriterion("shoppping_name >", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shoppping_name >=", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameLessThan(String value) {
            addCriterion("shoppping_name <", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameLessThanOrEqualTo(String value) {
            addCriterion("shoppping_name <=", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameLike(String value) {
            addCriterion("shoppping_name like", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameNotLike(String value) {
            addCriterion("shoppping_name not like", value, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameIn(List<String> values) {
            addCriterion("shoppping_name in", values, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameNotIn(List<String> values) {
            addCriterion("shoppping_name not in", values, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameBetween(String value1, String value2) {
            addCriterion("shoppping_name between", value1, value2, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShopppingNameNotBetween(String value1, String value2) {
            addCriterion("shoppping_name not between", value1, value2, "shopppingName");
            return (Criteria) this;
        }

        public Criteria andShoppingImageIsNull() {
            addCriterion("shopping_image is null");
            return (Criteria) this;
        }

        public Criteria andShoppingImageIsNotNull() {
            addCriterion("shopping_image is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingImageEqualTo(String value) {
            addCriterion("shopping_image =", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageNotEqualTo(String value) {
            addCriterion("shopping_image <>", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageGreaterThan(String value) {
            addCriterion("shopping_image >", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_image >=", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageLessThan(String value) {
            addCriterion("shopping_image <", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageLessThanOrEqualTo(String value) {
            addCriterion("shopping_image <=", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageLike(String value) {
            addCriterion("shopping_image like", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageNotLike(String value) {
            addCriterion("shopping_image not like", value, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageIn(List<String> values) {
            addCriterion("shopping_image in", values, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageNotIn(List<String> values) {
            addCriterion("shopping_image not in", values, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageBetween(String value1, String value2) {
            addCriterion("shopping_image between", value1, value2, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingImageNotBetween(String value1, String value2) {
            addCriterion("shopping_image not between", value1, value2, "shoppingImage");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNull() {
            addCriterion("shopping_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNotNull() {
            addCriterion("shopping_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceEqualTo(String value) {
            addCriterion("shopping_price =", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotEqualTo(String value) {
            addCriterion("shopping_price <>", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThan(String value) {
            addCriterion("shopping_price >", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_price >=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThan(String value) {
            addCriterion("shopping_price <", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThanOrEqualTo(String value) {
            addCriterion("shopping_price <=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLike(String value) {
            addCriterion("shopping_price like", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotLike(String value) {
            addCriterion("shopping_price not like", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIn(List<String> values) {
            addCriterion("shopping_price in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotIn(List<String> values) {
            addCriterion("shopping_price not in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceBetween(String value1, String value2) {
            addCriterion("shopping_price between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotBetween(String value1, String value2) {
            addCriterion("shopping_price not between", value1, value2, "shoppingPrice");
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