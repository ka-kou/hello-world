package jp.co.daitoku_sh.dfcm.common.db.model;

public class MstCourseKey {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column MST_COURSE.Jigyo_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  private String jigyoCode;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column MST_COURSE.Cos_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  private String cosCode;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column MST_COURSE.Jigyo_Code
   * @return  the value of MST_COURSE.Jigyo_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  public String getJigyoCode() {
    return jigyoCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column MST_COURSE.Jigyo_Code
   * @param jigyoCode  the value for MST_COURSE.Jigyo_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  public void setJigyoCode(String jigyoCode) {
    this.jigyoCode = jigyoCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column MST_COURSE.Cos_Code
   * @return  the value of MST_COURSE.Cos_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  public String getCosCode() {
    return cosCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column MST_COURSE.Cos_Code
   * @param cosCode  the value for MST_COURSE.Cos_Code
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  public void setCosCode(String cosCode) {
    this.cosCode = cosCode;
  }
}