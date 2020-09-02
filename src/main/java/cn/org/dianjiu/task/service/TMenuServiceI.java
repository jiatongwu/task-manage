package cn.org.dianjiu.task.service;

import cn.org.dianjiu.task.common.req.TMenuReq;
import cn.org.dianjiu.task.common.resp.TMenuResp;
import cn.org.dianjiu.task.dao.TMenuDao;

import java.util.List;

/**
 * (TMenu)表服务接口
 *
 * @author dianjiu
 * @since 2020-07-01 00:07:31
 */
public interface TMenuServiceI {
   
    TMenuResp getById(Integer id);

    TMenuResp getByEntity(TMenuReq tMenuReq);

    List<TMenuResp> listByEntity(TMenuReq tMenuReq);

    List<TMenuResp> listByIds(List<Integer> ids);

    int insert(TMenuReq tMenuReq);

    int insertBatch(List<TMenuReq> list);

    int update(TMenuReq tMenuReq);

    int updateBatch(List<TMenuReq> list);

    int deleteById(Integer id);

    int deleteByEntity(TMenuReq tMenuReq);
  
    int deleteByIds(List<Integer> list);
    
    int countAll();
    
    int countByEntity(TMenuReq tMenuReq);
}