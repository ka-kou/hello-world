package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.TblSei01UrkBody;
import jp.co.daitoku_sh.dfcm.common.db.model.TblSei01UrkBodyExample;
import org.apache.ibatis.annotations.Param;

public interface TblSei01UrkBodyMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(TblSei01UrkBodyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(TblSei01UrkBodyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(Long uriNo);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(TblSei01UrkBody record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(TblSei01UrkBody record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<TblSei01UrkBody> selectByExample(TblSei01UrkBodyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  TblSei01UrkBody selectByPrimaryKey(Long uriNo);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") TblSei01UrkBody record,
      @Param("example") TblSei01UrkBodyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") TblSei01UrkBody record,
      @Param("example") TblSei01UrkBodyExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(TblSei01UrkBody record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_SEI01_URK_BODY
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(TblSei01UrkBody record);
}