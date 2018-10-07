package com.sky.hypro.service;


/**
 * @Author: CarryJey
 * @Date: 2018/10/7 11:14:01
 */
public interface DemoInterface {

    /**
     * 接口层，定义对应的接口，供其他服务调用
     * @param id
     * @return DemoBean
     */
    DemoBean getDemoBean(int id);

}
