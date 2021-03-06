package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstUser;
import jp.co.daitoku_sh.dfcm.common.db.model.MstUserExample;
import org.apache.ibatis.annotations.Param;

public interface MstUserMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstUserExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstUserExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(String userCode);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstUser> selectByExample(MstUserExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstUser selectByPrimaryKey(String userCode);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstUser record,
      @Param("example") MstUserExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstUser record,
      @Param("example") MstUserExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstUser record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_USER
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstUser record);
}