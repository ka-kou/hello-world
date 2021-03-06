/**
 * パッケージ名:jp.co.daitoku_sh.dfcm.dfcmmain.db.mapper
 * ファイル名:Mst0101d01Mapper.java
 * 
 * <p>作成者:アクトブレーンベトナム
 * 作成日:2015/08/24
 * 
 * <p>履歴
 * -------------------------------------------------------------------------
 * 日付 指示者 担当 内容
 * -------------------------------------------------------------------------
 * 2015/08/24 1.00 ABV)コイー 新規開発
 * -------------------------------------------------------------------------
 * 
 * <p>ALL RIGHTS RESERVED COPYRIGHT (C)2015 TSUZUKI DENKI CO.,LTD.
 */

package jp.co.daitoku_sh.dfcm.dfcmmain.db.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultHandler;

import jp.co.daitoku_sh.dfcm.dfcmmain.component.mst.MstSJigyoInfo;
import jp.co.daitoku_sh.dfcm.dfcmmain.component.mst.MstUserInfoMst0101d02;

/**
 * 一覧画面でのマップ
 * 
 * @author アクトブレーンベトナム コイー
 * @version 1.0.0
 * @since 1.0.0
 */
public interface Mst0101d01Mapper {

  ArrayList<MstSJigyoInfo> getSJigyoInfo(Map<String, Object> parms);


  List<MstUserInfoMst0101d02> getSearchResult(Map<String, Object> parms);
  
  void getSearchResult(Map<String, Object> parms, ResultHandler handler);

  String getuserName(Map<String, Object> parms);
}
