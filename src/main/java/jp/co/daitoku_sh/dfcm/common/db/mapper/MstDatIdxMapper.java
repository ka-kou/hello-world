package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstDatIdx;
import jp.co.daitoku_sh.dfcm.common.db.model.MstDatIdxExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstDatIdxKey;
import org.apache.ibatis.annotations.Param;

public interface MstDatIdxMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstDatIdxExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstDatIdxExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstDatIdxKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstDatIdx record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstDatIdx record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstDatIdx> selectByExample(MstDatIdxExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstDatIdx selectByPrimaryKey(MstDatIdxKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstDatIdx record,
      @Param("example") MstDatIdxExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstDatIdx record,
      @Param("example") MstDatIdxExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstDatIdx record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_DAT_IDX
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstDatIdx record);
}