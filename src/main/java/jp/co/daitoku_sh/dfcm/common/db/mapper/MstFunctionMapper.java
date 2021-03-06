package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFunction;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFunctionExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFunctionKey;
import org.apache.ibatis.annotations.Param;

public interface MstFunctionMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstFunctionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstFunctionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstFunctionKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstFunction record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstFunction record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstFunction> selectByExample(MstFunctionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstFunction selectByPrimaryKey(MstFunctionKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstFunction record,
      @Param("example") MstFunctionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstFunction record,
      @Param("example") MstFunctionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstFunction record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_FUNCTION
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstFunction record);
}