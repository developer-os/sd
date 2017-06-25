package com.chen.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public interface IService<T,PK> {
    boolean insert(T entity);
    boolean insertSelective(T entity);
    boolean insertBatch(List<T> entityList);
    boolean insertBatchSelective(List<T> entityList,int batchSize);
    boolean insertBatch(List<T> entityList, int batchSize);
    boolean insertBatchSelective(List<T> entityList);
    boolean deleteById(Serializable id);
    boolean deleteByMap(Map<String, Object> columnMap);
    boolean deleteSelective(T entity);
    boolean deleteBatchIds(List<? extends Serializable> idList);
    boolean updateById(T entity);
    boolean updateSelectiveById(T entity);
    boolean update(T entity, T whereEntity);
    boolean updateSelective(T entity, T whereEntity);
    boolean updateBatchById(List<T> entityList);
    boolean insertOrUpdate(T entity);
    boolean insertOrUpdateSelective(T entity);
    T selectById(Serializable id);
    List<T> selectBatchIds(List<? extends Serializable> idList);
    List<T> selectByMap(Map<String, Object> columnMap);
    T selectOne(T entity);
//    T selectOne(EntityWrapper<T> entityWrapper);
    int selectCount(T entity);
//    int selectCount(EntityWrapper<T> entityWrapper);
//    List<T> selectList(EntityWrapper<T> entityWrapper);
//    Page<T> selectPage(Page<T> page, EntityWrapper<T> entityWrapper);

}
