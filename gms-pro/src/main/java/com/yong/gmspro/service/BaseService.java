package com.yong.gmspro.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class BaseService<T> {

    @Autowired(required = false)
    BaseMapper<T> baseMapper;

    /**
     * 无条件查询所有
     * @return
     */
    public List<T> query(QueryWrapper<T> queryWrapper) {
        List list = baseMapper.selectList(queryWrapper);
        return list;
    }

    /**
     * 通过主键获取实体对象公共方法
     * @param id
     * @return
     */
    public T load(Serializable id){
        return (T) baseMapper.selectById(id);
    }

    /**
     * 保存公用方法
     * @param entity
     */
    public void save(T entity){
        baseMapper.insert(entity);
    }

    /**
     * 更新公用方法
     * @param entity
     */
    public void update(T entity){
        baseMapper.update(entity,null);
    }

    /**
     * 删除对象公用方法
     * @param entity
     */
    public void delete(T entity){
        Wrapper<T> wrapper = new Wrapper<T>() {
            @Override
            public T getEntity() {
                return entity;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            @Override
            public String getCustomSqlSegment() {
                return null;
            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        };
        baseMapper.delete(wrapper);
    }

    /**
     * 通过主键删除公用删除方法
     *
     * @param id
     */
    public void delete(Serializable id){
        baseMapper.deleteById(id);
    }
}
