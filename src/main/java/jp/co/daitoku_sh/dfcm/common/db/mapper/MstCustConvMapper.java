package jp.co.daitoku_sh.dfcm.common.db.mapper;

import java.util.List;
import jp.co.daitoku_sh.dfcm.common.db.model.MstCustConv;
import jp.co.daitoku_sh.dfcm.common.db.model.MstCustConvExample;
import jp.co.daitoku_sh.dfcm.common.db.model.MstCustConvKey;
import org.apache.ibatis.annotations.Param;

public interface MstCustConvMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int countByExample(MstCustConvExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByExample(MstCustConvExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int deleteByPrimaryKey(MstCustConvKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insert(MstCustConv record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int insertSelective(MstCustConv record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  List<MstCustConv> selectByExample(MstCustConvExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  MstCustConv selectByPrimaryKey(MstCustConvKey key);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExampleSelective(@Param("record") MstCustConv record,
      @Param("example") MstCustConvExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByExample(@Param("record") MstCustConv record,
      @Param("example") MstCustConvExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKeySelective(MstCustConv record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table MST_CUST_CONV
   * @mbggenerated  Sat Oct 24 16:19:36 ICT 2015
   */
  int updateByPrimaryKey(MstCustConv record);
}