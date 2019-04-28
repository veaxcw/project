package com.bilibili.main.model;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeIsNull() {
            addCriterion("video_watch_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeIsNotNull() {
            addCriterion("video_watch_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeEqualTo(String value) {
            addCriterion("video_watch_time =", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeNotEqualTo(String value) {
            addCriterion("video_watch_time <>", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeGreaterThan(String value) {
            addCriterion("video_watch_time >", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_watch_time >=", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeLessThan(String value) {
            addCriterion("video_watch_time <", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeLessThanOrEqualTo(String value) {
            addCriterion("video_watch_time <=", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeLike(String value) {
            addCriterion("video_watch_time like", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeNotLike(String value) {
            addCriterion("video_watch_time not like", value, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeIn(List<String> values) {
            addCriterion("video_watch_time in", values, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeNotIn(List<String> values) {
            addCriterion("video_watch_time not in", values, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeBetween(String value1, String value2) {
            addCriterion("video_watch_time between", value1, value2, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideoWatchTimeNotBetween(String value1, String value2) {
            addCriterion("video_watch_time not between", value1, value2, "videoWatchTime");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNull() {
            addCriterion("videoTime is null");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNotNull() {
            addCriterion("videoTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideotimeEqualTo(String value) {
            addCriterion("videoTime =", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotEqualTo(String value) {
            addCriterion("videoTime <>", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThan(String value) {
            addCriterion("videoTime >", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoTime >=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThan(String value) {
            addCriterion("videoTime <", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThanOrEqualTo(String value) {
            addCriterion("videoTime <=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLike(String value) {
            addCriterion("videoTime like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotLike(String value) {
            addCriterion("videoTime not like", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeIn(List<String> values) {
            addCriterion("videoTime in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotIn(List<String> values) {
            addCriterion("videoTime not in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeBetween(String value1, String value2) {
            addCriterion("videoTime between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotBetween(String value1, String value2) {
            addCriterion("videoTime not between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(String value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(String value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(String value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(String value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(String value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLike(String value) {
            addCriterion("video_status like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotLike(String value) {
            addCriterion("video_status not like", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<String> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<String> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(String value1, String value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(String value1, String value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIsNull() {
            addCriterion("video_category is null");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIsNotNull() {
            addCriterion("video_category is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryEqualTo(String value) {
            addCriterion("video_category =", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotEqualTo(String value) {
            addCriterion("video_category <>", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryGreaterThan(String value) {
            addCriterion("video_category >", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("video_category >=", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLessThan(String value) {
            addCriterion("video_category <", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLessThanOrEqualTo(String value) {
            addCriterion("video_category <=", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryLike(String value) {
            addCriterion("video_category like", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotLike(String value) {
            addCriterion("video_category not like", value, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryIn(List<String> values) {
            addCriterion("video_category in", values, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotIn(List<String> values) {
            addCriterion("video_category not in", values, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryBetween(String value1, String value2) {
            addCriterion("video_category between", value1, value2, "videoCategory");
            return (Criteria) this;
        }

        public Criteria andVideoCategoryNotBetween(String value1, String value2) {
            addCriterion("video_category not between", value1, value2, "videoCategory");
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