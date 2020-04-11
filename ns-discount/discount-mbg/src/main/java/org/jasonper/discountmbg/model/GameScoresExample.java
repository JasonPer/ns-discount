package org.jasonper.discountmbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameScoresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameScoresExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andGameAssessIsNull() {
            addCriterion("game_assess is null");
            return (Criteria) this;
        }

        public Criteria andGameAssessIsNotNull() {
            addCriterion("game_assess is not null");
            return (Criteria) this;
        }

        public Criteria andGameAssessEqualTo(String value) {
            addCriterion("game_assess =", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessNotEqualTo(String value) {
            addCriterion("game_assess <>", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessGreaterThan(String value) {
            addCriterion("game_assess >", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessGreaterThanOrEqualTo(String value) {
            addCriterion("game_assess >=", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessLessThan(String value) {
            addCriterion("game_assess <", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessLessThanOrEqualTo(String value) {
            addCriterion("game_assess <=", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessLike(String value) {
            addCriterion("game_assess like", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessNotLike(String value) {
            addCriterion("game_assess not like", value, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessIn(List<String> values) {
            addCriterion("game_assess in", values, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessNotIn(List<String> values) {
            addCriterion("game_assess not in", values, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessBetween(String value1, String value2) {
            addCriterion("game_assess between", value1, value2, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameAssessNotBetween(String value1, String value2) {
            addCriterion("game_assess not between", value1, value2, "gameAssess");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIsNull() {
            addCriterion("game_base_id is null");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIsNotNull() {
            addCriterion("game_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdEqualTo(Long value) {
            addCriterion("game_base_id =", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotEqualTo(Long value) {
            addCriterion("game_base_id <>", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdGreaterThan(Long value) {
            addCriterion("game_base_id >", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("game_base_id >=", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdLessThan(Long value) {
            addCriterion("game_base_id <", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdLessThanOrEqualTo(Long value) {
            addCriterion("game_base_id <=", value, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdIn(List<Long> values) {
            addCriterion("game_base_id in", values, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotIn(List<Long> values) {
            addCriterion("game_base_id not in", values, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdBetween(Long value1, Long value2) {
            addCriterion("game_base_id between", value1, value2, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andGameBaseIdNotBetween(Long value1, Long value2) {
            addCriterion("game_base_id not between", value1, value2, "gameBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIsNull() {
            addCriterion("player_base_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIsNotNull() {
            addCriterion("player_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdEqualTo(Long value) {
            addCriterion("player_base_id =", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotEqualTo(Long value) {
            addCriterion("player_base_id <>", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdGreaterThan(Long value) {
            addCriterion("player_base_id >", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("player_base_id >=", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdLessThan(Long value) {
            addCriterion("player_base_id <", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdLessThanOrEqualTo(Long value) {
            addCriterion("player_base_id <=", value, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdIn(List<Long> values) {
            addCriterion("player_base_id in", values, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotIn(List<Long> values) {
            addCriterion("player_base_id not in", values, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdBetween(Long value1, Long value2) {
            addCriterion("player_base_id between", value1, value2, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andPlayerBaseIdNotBetween(Long value1, Long value2) {
            addCriterion("player_base_id not between", value1, value2, "playerBaseId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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