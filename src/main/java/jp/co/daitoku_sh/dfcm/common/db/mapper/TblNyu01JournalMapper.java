package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.TblNyu01Journal;
import jp.co.daitoku_sh.dfcm.common.db.model.TblNyu01JournalExample;
import jp.co.daitoku_sh.dfcm.common.db.model.TblNyu01JournalKey;
import org.apache.ibatis.annotations.Param;

public interface TblNyu01JournalMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(TblNyu01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(TblNyu01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(TblNyu01JournalKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(TblNyu01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(TblNyu01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<TblNyu01Journal> selectByExample(TblNyu01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  TblNyu01Journal selectByPrimaryKey(TblNyu01JournalKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") TblNyu01Journal record,
      @Param("example") TblNyu01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") TblNyu01Journal record,
      @Param("example") TblNyu01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(TblNyu01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_NYU01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(TblNyu01Journal record);
}