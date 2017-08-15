package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstSChain;
import jp.co.daitoku_sh.dfcm.common.db.model.MstSChainExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstSChainKey;
import org.apache.ibatis.annotations.Param;

public interface MstSChainMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstSChainExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstSChainExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstSChainKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstSChain record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstSChain record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstSChain> selectByExample(MstSChainExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstSChain selectByPrimaryKey(MstSChainKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstSChain record,
      @Param("example") MstSChainExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstSChain record,
      @Param("example") MstSChainExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstSChain record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_S_CHAIN
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstSChain record);
}