package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstStrgTerm;
import jp.co.daitoku_sh.dfcm.common.db.model.MstStrgTermExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstStrgTermKey;
import org.apache.ibatis.annotations.Param;

public interface MstStrgTermMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstStrgTermExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstStrgTermExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstStrgTermKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstStrgTerm record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstStrgTerm record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstStrgTerm> selectByExample(MstStrgTermExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstStrgTerm selectByPrimaryKey(MstStrgTermKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstStrgTerm record,
      @Param("example") MstStrgTermExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstStrgTerm record,
      @Param("example") MstStrgTermExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstStrgTerm record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_STRG_TERM
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstStrgTerm record);
}