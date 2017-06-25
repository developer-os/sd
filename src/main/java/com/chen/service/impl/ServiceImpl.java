package com.chen.service.impl;

import com.chen.service.IService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class ServiceImpl<T,PK> implements IService<T, PK> {
    @Override
    public boolean insert(T entity) {
        return false;
    }

    @Override
    public boolean insertSelective(T entity) {
        return false;
    }

    @Override
    public boolean insertBatch(List<T> entityList) {
        return false;
    }

    @Override
    public boolean insertBatchSelective(List<T> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean insertBatch(List<T> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean insertBatchSelective(List<T> entityList) {
        return false;
    }

    @Override
    public boolean deleteById(Serializable id) {
        return false;
    }

    @Override
    public boolean deleteByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean deleteSelective(T entity) {
        return false;
    }

    @Override
    public boolean deleteBatchIds(List<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(T entity) {
        return false;
    }

    @Override
    public boolean updateSelectiveById(T entity) {
        return false;
    }

    @Override
    public boolean update(T entity, T whereEntity) {
        return false;
    }

    @Override
    public boolean updateSelective(T entity, T whereEntity) {
        return false;
    }

    @Override
    public boolean updateBatchById(List<T> entityList) {
        return false;
    }

    @Override
    public boolean insertOrUpdate(T entity) {
        return false;
    }

    @Override
    public boolean insertOrUpdateSelective(T entity) {
        return false;
    }

    @Override
    public T selectById(Serializable id) {
        return null;
    }

    @Override
    public List<T> selectBatchIds(List<? extends Serializable> idList) {
        return null;
    }

    @Override
    public List<T> selectByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public T selectOne(T entity) {
        return null;
    }

    @Override
    public int selectCount(T entity) {
        return 0;
    }
}
