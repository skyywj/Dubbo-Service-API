### demo接口是一个模板接口，演示使用dubbo api

    service-api使用流程：
        1）api定义
        定义request和response类型，其实一定程度上替代了Entity层。
        定义interface
        定义完执行mvn install
        在dubbo服务中引入相关mvn依赖
        2）service实现
        在服务端实现api定义的接口，并将服务做成dubbo服务
        使用@Service(version="")
        3）其他服务使用
        使用@reference(version="")