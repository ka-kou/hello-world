package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.TblCom01JobExec;
import jp.co.daitoku_sh.dfcm.common.db.model.TblCom01JobExecExample;
import org.apache.ibatis.annotations.Param;

public interface TblCom01JobExecMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(TblCom01JobExecExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(TblCom01JobExecExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(Long jobNo);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(TblCom01JobExec record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(TblCom01JobExec record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<TblCom01JobExec> selectByExample(TblCom01JobExecExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  TblCom01JobExec selectByPrimaryKey(Long jobNo);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") TblCom01JobExec record,
      @Param("example") TblCom01JobExecExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") TblCom01JobExec record,
      @Param("example") TblCom01JobExecExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(TblCom01JobExec record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_COM01_JOB_EXEC
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(TblCom01JobExec record);
}