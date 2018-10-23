注意代码格式化：IDEA

快捷键 windows：ctrl+alt+l   mac：option+command+l（win+alt+l）

此项目为`dubbo服务`的`api接口`服务。

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
        
## 相关接口说明：

 1、[demo接口](introduce/demo.md) 
 
 2、[钱包接口](introduce/wallet.md)
 
 3、[id生成器接口](introduce/idservice.md)
