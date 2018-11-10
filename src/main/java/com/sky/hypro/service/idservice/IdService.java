package com.sky.hypro.service.idservice;

/**
 * ID 生成服务
 * CarryJey @Date: 2018/10/22 17:27:54
 */
public interface IdService {

    /**
     * 使用 snowflake 算法生成 id
     * 获取一个id接口
     * @throws InvalidSystemClock 系统时钟回退时抛出该异常
     */
    long snowflakeNextId() throws InvalidSystemClock;

    /**
     * 使用 snowflake 算法批量生成 id
     * 获取count个id接口
     * @param count - 生成 id 的数量，目前限制值 200
     * @throws InvalidSystemClock 系统时钟回退时抛出该异常
     */
    long[] snowflakeNextIds(int count) throws InvalidSystemClock;
}
