package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstListDist;
import jp.co.daitoku_sh.dfcm.common.db.model.MstListDistExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstListDistKey;
import org.apache.ibatis.annotations.Param;

public interface MstListDistMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstListDistExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstListDistExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstListDistKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstListDist record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstListDist record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstListDist> selectByExample(MstListDistExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstListDist selectByPrimaryKey(MstListDistKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstListDist record,
      @Param("example") MstListDistExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstListDist record,
      @Param("example") MstListDistExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstListDist record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_LIST_DIST
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstListDist record);
}