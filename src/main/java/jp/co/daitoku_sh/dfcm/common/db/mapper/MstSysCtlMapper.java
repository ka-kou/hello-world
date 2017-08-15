package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstSysCtl;
import jp.co.daitoku_sh.dfcm.common.db.model.MstSysCtlExample;
import org.apache.ibatis.annotations.Param;

public interface MstSysCtlMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstSysCtlExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstSysCtlExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstSysCtl record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstSysCtl record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstSysCtl> selectByExample(MstSysCtlExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstSysCtl record,
      @Param("example") MstSysCtlExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_SYS_CTL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstSysCtl record,
      @Param("example") MstSysCtlExample example);
}