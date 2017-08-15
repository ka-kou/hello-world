package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.TblUri01Journal;
import jp.co.daitoku_sh.dfcm.common.db.model.TblUri01JournalExample;
import jp.co.daitoku_sh.dfcm.common.db.model.TblUri01JournalKey;
import org.apache.ibatis.annotations.Param;

public interface TblUri01JournalMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(TblUri01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(TblUri01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(TblUri01JournalKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(TblUri01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(TblUri01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<TblUri01Journal> selectByExample(TblUri01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  TblUri01Journal selectByPrimaryKey(TblUri01JournalKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") TblUri01Journal record,
      @Param("example") TblUri01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") TblUri01Journal record,
      @Param("example") TblUri01JournalExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(TblUri01Journal record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table TBL_URI01_JOURNAL
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(TblUri01Journal record);
}