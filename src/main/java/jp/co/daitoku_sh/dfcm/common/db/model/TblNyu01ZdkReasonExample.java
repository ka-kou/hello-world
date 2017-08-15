package jp.co.daitoku_sh.dfcm.common.db.model;

import java.util.ArrayList;
import java.util.List;

public class TblNyu01ZdkReasonExample {
    /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  protected String orderByClause;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  protected boolean distinct;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public TblNyu01ZdkReasonExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
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

    protected void addCriterion(String condition, Object value,
        String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2,
        String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property
            + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andNyuDenNoIsNull() {
      addCriterion("Nyu_Den_No is null");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoIsNotNull() {
      addCriterion("Nyu_Den_No is not null");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoEqualTo(Long value) {
      addCriterion("Nyu_Den_No =", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoNotEqualTo(Long value) {
      addCriterion("Nyu_Den_No <>", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoGreaterThan(Long value) {
      addCriterion("Nyu_Den_No >", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoGreaterThanOrEqualTo(Long value) {
      addCriterion("Nyu_Den_No >=", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoLessThan(Long value) {
      addCriterion("Nyu_Den_No <", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoLessThanOrEqualTo(Long value) {
      addCriterion("Nyu_Den_No <=", value, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoIn(List<Long> values) {
      addCriterion("Nyu_Den_No in", values, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoNotIn(List<Long> values) {
      addCriterion("Nyu_Den_No not in", values, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoBetween(Long value1, Long value2) {
      addCriterion("Nyu_Den_No between", value1, value2, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andNyuDenNoNotBetween(Long value1, Long value2) {
      addCriterion("Nyu_Den_No not between", value1, value2, "nyuDenNo");
      return (Criteria) this;
    }

    public Criteria andZrCodeIsNull() {
      addCriterion("Zr_Code is null");
      return (Criteria) this;
    }

    public Criteria andZrCodeIsNotNull() {
      addCriterion("Zr_Code is not null");
      return (Criteria) this;
    }

    public Criteria andZrCodeEqualTo(String value) {
      addCriterion("Zr_Code =", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeNotEqualTo(String value) {
      addCriterion("Zr_Code <>", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeGreaterThan(String value) {
      addCriterion("Zr_Code >", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeGreaterThanOrEqualTo(String value) {
      addCriterion("Zr_Code >=", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeLessThan(String value) {
      addCriterion("Zr_Code <", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeLessThanOrEqualTo(String value) {
      addCriterion("Zr_Code <=", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeLike(String value) {
      addCriterion("Zr_Code like", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeNotLike(String value) {
      addCriterion("Zr_Code not like", value, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeIn(List<String> values) {
      addCriterion("Zr_Code in", values, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeNotIn(List<String> values) {
      addCriterion("Zr_Code not in", values, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeBetween(String value1, String value2) {
      addCriterion("Zr_Code between", value1, value2, "zrCode");
      return (Criteria) this;
    }

    public Criteria andZrCodeNotBetween(String value1, String value2) {
      addCriterion("Zr_Code not between", value1, value2, "zrCode");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunIsNull() {
      addCriterion("Hyouji_Jun is null");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunIsNotNull() {
      addCriterion("Hyouji_Jun is not null");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunEqualTo(Short value) {
      addCriterion("Hyouji_Jun =", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunNotEqualTo(Short value) {
      addCriterion("Hyouji_Jun <>", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunGreaterThan(Short value) {
      addCriterion("Hyouji_Jun >", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunGreaterThanOrEqualTo(Short value) {
      addCriterion("Hyouji_Jun >=", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunLessThan(Short value) {
      addCriterion("Hyouji_Jun <", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunLessThanOrEqualTo(Short value) {
      addCriterion("Hyouji_Jun <=", value, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunIn(List<Short> values) {
      addCriterion("Hyouji_Jun in", values, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunNotIn(List<Short> values) {
      addCriterion("Hyouji_Jun not in", values, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunBetween(Short value1, Short value2) {
      addCriterion("Hyouji_Jun between", value1, value2, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andHyoujiJunNotBetween(Short value1, Short value2) {
      addCriterion("Hyouji_Jun not between", value1, value2, "hyoujiJun");
      return (Criteria) this;
    }

    public Criteria andKingakuIsNull() {
      addCriterion("Kingaku is null");
      return (Criteria) this;
    }

    public Criteria andKingakuIsNotNull() {
      addCriterion("Kingaku is not null");
      return (Criteria) this;
    }

    public Criteria andKingakuEqualTo(Integer value) {
      addCriterion("Kingaku =", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuNotEqualTo(Integer value) {
      addCriterion("Kingaku <>", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuGreaterThan(Integer value) {
      addCriterion("Kingaku >", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuGreaterThanOrEqualTo(Integer value) {
      addCriterion("Kingaku >=", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuLessThan(Integer value) {
      addCriterion("Kingaku <", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuLessThanOrEqualTo(Integer value) {
      addCriterion("Kingaku <=", value, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuIn(List<Integer> values) {
      addCriterion("Kingaku in", values, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuNotIn(List<Integer> values) {
      addCriterion("Kingaku not in", values, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuBetween(Integer value1, Integer value2) {
      addCriterion("Kingaku between", value1, value2, "kingaku");
      return (Criteria) this;
    }

    public Criteria andKingakuNotBetween(Integer value1, Integer value2) {
      addCriterion("Kingaku not between", value1, value2, "kingaku");
      return (Criteria) this;
    }

    public Criteria andInsUseridIsNull() {
      addCriterion("INS_USERID is null");
      return (Criteria) this;
    }

    public Criteria andInsUseridIsNotNull() {
      addCriterion("INS_USERID is not null");
      return (Criteria) this;
    }

    public Criteria andInsUseridEqualTo(String value) {
      addCriterion("INS_USERID =", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridNotEqualTo(String value) {
      addCriterion("INS_USERID <>", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridGreaterThan(String value) {
      addCriterion("INS_USERID >", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridGreaterThanOrEqualTo(String value) {
      addCriterion("INS_USERID >=", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridLessThan(String value) {
      addCriterion("INS_USERID <", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridLessThanOrEqualTo(String value) {
      addCriterion("INS_USERID <=", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridLike(String value) {
      addCriterion("INS_USERID like", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridNotLike(String value) {
      addCriterion("INS_USERID not like", value, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridIn(List<String> values) {
      addCriterion("INS_USERID in", values, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridNotIn(List<String> values) {
      addCriterion("INS_USERID not in", values, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridBetween(String value1, String value2) {
      addCriterion("INS_USERID between", value1, value2, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsUseridNotBetween(String value1, String value2) {
      addCriterion("INS_USERID not between", value1, value2, "insUserid");
      return (Criteria) this;
    }

    public Criteria andInsPgidIsNull() {
      addCriterion("INS_PGID is null");
      return (Criteria) this;
    }

    public Criteria andInsPgidIsNotNull() {
      addCriterion("INS_PGID is not null");
      return (Criteria) this;
    }

    public Criteria andInsPgidEqualTo(String value) {
      addCriterion("INS_PGID =", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidNotEqualTo(String value) {
      addCriterion("INS_PGID <>", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidGreaterThan(String value) {
      addCriterion("INS_PGID >", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidGreaterThanOrEqualTo(String value) {
      addCriterion("INS_PGID >=", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidLessThan(String value) {
      addCriterion("INS_PGID <", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidLessThanOrEqualTo(String value) {
      addCriterion("INS_PGID <=", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidLike(String value) {
      addCriterion("INS_PGID like", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidNotLike(String value) {
      addCriterion("INS_PGID not like", value, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidIn(List<String> values) {
      addCriterion("INS_PGID in", values, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidNotIn(List<String> values) {
      addCriterion("INS_PGID not in", values, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidBetween(String value1, String value2) {
      addCriterion("INS_PGID between", value1, value2, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsPgidNotBetween(String value1, String value2) {
      addCriterion("INS_PGID not between", value1, value2, "insPgid");
      return (Criteria) this;
    }

    public Criteria andInsYmdIsNull() {
      addCriterion("INS_YMD is null");
      return (Criteria) this;
    }

    public Criteria andInsYmdIsNotNull() {
      addCriterion("INS_YMD is not null");
      return (Criteria) this;
    }

    public Criteria andInsYmdEqualTo(String value) {
      addCriterion("INS_YMD =", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdNotEqualTo(String value) {
      addCriterion("INS_YMD <>", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdGreaterThan(String value) {
      addCriterion("INS_YMD >", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdGreaterThanOrEqualTo(String value) {
      addCriterion("INS_YMD >=", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdLessThan(String value) {
      addCriterion("INS_YMD <", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdLessThanOrEqualTo(String value) {
      addCriterion("INS_YMD <=", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdLike(String value) {
      addCriterion("INS_YMD like", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdNotLike(String value) {
      addCriterion("INS_YMD not like", value, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdIn(List<String> values) {
      addCriterion("INS_YMD in", values, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdNotIn(List<String> values) {
      addCriterion("INS_YMD not in", values, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdBetween(String value1, String value2) {
      addCriterion("INS_YMD between", value1, value2, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsYmdNotBetween(String value1, String value2) {
      addCriterion("INS_YMD not between", value1, value2, "insYmd");
      return (Criteria) this;
    }

    public Criteria andInsTimeIsNull() {
      addCriterion("INS_TIME is null");
      return (Criteria) this;
    }

    public Criteria andInsTimeIsNotNull() {
      addCriterion("INS_TIME is not null");
      return (Criteria) this;
    }

    public Criteria andInsTimeEqualTo(String value) {
      addCriterion("INS_TIME =", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeNotEqualTo(String value) {
      addCriterion("INS_TIME <>", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeGreaterThan(String value) {
      addCriterion("INS_TIME >", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeGreaterThanOrEqualTo(String value) {
      addCriterion("INS_TIME >=", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeLessThan(String value) {
      addCriterion("INS_TIME <", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeLessThanOrEqualTo(String value) {
      addCriterion("INS_TIME <=", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeLike(String value) {
      addCriterion("INS_TIME like", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeNotLike(String value) {
      addCriterion("INS_TIME not like", value, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeIn(List<String> values) {
      addCriterion("INS_TIME in", values, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeNotIn(List<String> values) {
      addCriterion("INS_TIME not in", values, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeBetween(String value1, String value2) {
      addCriterion("INS_TIME between", value1, value2, "insTime");
      return (Criteria) this;
    }

    public Criteria andInsTimeNotBetween(String value1, String value2) {
      addCriterion("INS_TIME not between", value1, value2, "insTime");
      return (Criteria) this;
    }

    public Criteria andUpdUseridIsNull() {
      addCriterion("UPD_USERID is null");
      return (Criteria) this;
    }

    public Criteria andUpdUseridIsNotNull() {
      addCriterion("UPD_USERID is not null");
      return (Criteria) this;
    }

    public Criteria andUpdUseridEqualTo(String value) {
      addCriterion("UPD_USERID =", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridNotEqualTo(String value) {
      addCriterion("UPD_USERID <>", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridGreaterThan(String value) {
      addCriterion("UPD_USERID >", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridGreaterThanOrEqualTo(String value) {
      addCriterion("UPD_USERID >=", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridLessThan(String value) {
      addCriterion("UPD_USERID <", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridLessThanOrEqualTo(String value) {
      addCriterion("UPD_USERID <=", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridLike(String value) {
      addCriterion("UPD_USERID like", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridNotLike(String value) {
      addCriterion("UPD_USERID not like", value, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridIn(List<String> values) {
      addCriterion("UPD_USERID in", values, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridNotIn(List<String> values) {
      addCriterion("UPD_USERID not in", values, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridBetween(String value1, String value2) {
      addCriterion("UPD_USERID between", value1, value2, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdUseridNotBetween(String value1, String value2) {
      addCriterion("UPD_USERID not between", value1, value2, "updUserid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidIsNull() {
      addCriterion("UPD_PGID is null");
      return (Criteria) this;
    }

    public Criteria andUpdPgidIsNotNull() {
      addCriterion("UPD_PGID is not null");
      return (Criteria) this;
    }

    public Criteria andUpdPgidEqualTo(String value) {
      addCriterion("UPD_PGID =", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidNotEqualTo(String value) {
      addCriterion("UPD_PGID <>", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidGreaterThan(String value) {
      addCriterion("UPD_PGID >", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidGreaterThanOrEqualTo(String value) {
      addCriterion("UPD_PGID >=", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidLessThan(String value) {
      addCriterion("UPD_PGID <", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidLessThanOrEqualTo(String value) {
      addCriterion("UPD_PGID <=", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidLike(String value) {
      addCriterion("UPD_PGID like", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidNotLike(String value) {
      addCriterion("UPD_PGID not like", value, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidIn(List<String> values) {
      addCriterion("UPD_PGID in", values, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidNotIn(List<String> values) {
      addCriterion("UPD_PGID not in", values, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidBetween(String value1, String value2) {
      addCriterion("UPD_PGID between", value1, value2, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdPgidNotBetween(String value1, String value2) {
      addCriterion("UPD_PGID not between", value1, value2, "updPgid");
      return (Criteria) this;
    }

    public Criteria andUpdYmdIsNull() {
      addCriterion("UPD_YMD is null");
      return (Criteria) this;
    }

    public Criteria andUpdYmdIsNotNull() {
      addCriterion("UPD_YMD is not null");
      return (Criteria) this;
    }

    public Criteria andUpdYmdEqualTo(String value) {
      addCriterion("UPD_YMD =", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdNotEqualTo(String value) {
      addCriterion("UPD_YMD <>", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdGreaterThan(String value) {
      addCriterion("UPD_YMD >", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdGreaterThanOrEqualTo(String value) {
      addCriterion("UPD_YMD >=", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdLessThan(String value) {
      addCriterion("UPD_YMD <", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdLessThanOrEqualTo(String value) {
      addCriterion("UPD_YMD <=", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdLike(String value) {
      addCriterion("UPD_YMD like", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdNotLike(String value) {
      addCriterion("UPD_YMD not like", value, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdIn(List<String> values) {
      addCriterion("UPD_YMD in", values, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdNotIn(List<String> values) {
      addCriterion("UPD_YMD not in", values, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdBetween(String value1, String value2) {
      addCriterion("UPD_YMD between", value1, value2, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdYmdNotBetween(String value1, String value2) {
      addCriterion("UPD_YMD not between", value1, value2, "updYmd");
      return (Criteria) this;
    }

    public Criteria andUpdTimeIsNull() {
      addCriterion("UPD_TIME is null");
      return (Criteria) this;
    }

    public Criteria andUpdTimeIsNotNull() {
      addCriterion("UPD_TIME is not null");
      return (Criteria) this;
    }

    public Criteria andUpdTimeEqualTo(String value) {
      addCriterion("UPD_TIME =", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeNotEqualTo(String value) {
      addCriterion("UPD_TIME <>", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeGreaterThan(String value) {
      addCriterion("UPD_TIME >", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeGreaterThanOrEqualTo(String value) {
      addCriterion("UPD_TIME >=", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeLessThan(String value) {
      addCriterion("UPD_TIME <", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeLessThanOrEqualTo(String value) {
      addCriterion("UPD_TIME <=", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeLike(String value) {
      addCriterion("UPD_TIME like", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeNotLike(String value) {
      addCriterion("UPD_TIME not like", value, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeIn(List<String> values) {
      addCriterion("UPD_TIME in", values, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeNotIn(List<String> values) {
      addCriterion("UPD_TIME not in", values, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeBetween(String value1, String value2) {
      addCriterion("UPD_TIME between", value1, value2, "updTime");
      return (Criteria) this;
    }

    public Criteria andUpdTimeNotBetween(String value1, String value2) {
      addCriterion("UPD_TIME not between", value1, value2, "updTime");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table TBL_NYU01_ZDK_REASON
   * @mbggenerated  Mon Nov 16 15:43:29 ICT 2015
   */
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

    protected Criterion(String condition, Object value, Object secondValue,
        String typeHandler) {
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_NYU01_ZDK_REASON
     *
     * @mbggenerated do_not_delete_during_merge Thu Sep 17 21:03:29 JST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}