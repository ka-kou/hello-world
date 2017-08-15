package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFuncAuth;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFuncAuthExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstFuncAuthKey;
import org.apache.ibatis.annotations.Param;

public interface MstFuncAuthMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstFuncAuthExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstFuncAuthExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstFuncAuthKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstFuncAuth record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstFuncAuth record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstFuncAuth> selectByExample(MstFuncAuthExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstFuncAuth selectByPrimaryKey(MstFuncAuthKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstFuncAuth record,
      @Param("example") MstFuncAuthExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstFuncAuth record,
      @Param("example") MstFuncAuthExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstFuncAuth record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_Func_Auth
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstFuncAuth record);
}