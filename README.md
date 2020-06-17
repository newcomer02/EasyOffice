# EasyOffice
> `EasyOffice`简易办公，是一个基于`SSM框架`的`传统Java web`项目。主要内容是实现了自动化办公中报销单模块的管理，使用`shiro`框架实现统一的用户认证和资源授权。项目分为`表现层`，`业务层`，`持久层`三个模块，结构清晰明了，易于扩展。该程序编写过程中，使用了maven项目管理工具，简化了文档管理和项目配置，同时，也使我们了解到现代企业自动化办公的一些应用场景，最重要的是完成了对`spring`+`springMVC`+ `mybatis`+`shiro`的较好整合及应用。

# 项目介绍
## 项目结构
* oa_dao: 持久层
  * java.dao: 包含数据访问接口
  * java.entity: 包含与数据库对应的实体类
  * java.global: 包含全局变量文件
  * resources: 包含sql语句映射及数据库mybatis相关配置文件
* oa_biz: 业务层
  * java.Impl: 包含业务逻辑代码
  * resources: 包含AOP相关配置
* oa_web: 表现层
  * java.controller: 包含控制器类
  * java.dto: 包含与页面提交信息对应的实体类
  * java.global: 包含编码过滤器和拦截器
  * resources: spingMVC、shiro相关配置
  * webapps: 包含.jsp,.js等前端代码
  
# 声明
该项目是练习项目，没有参与任何商业行为。

