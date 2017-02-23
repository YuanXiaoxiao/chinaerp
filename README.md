#chinaerp

## 项目介绍

这个项目是仿照erp项目，所做的练习项目。
从解决问题的方式入手，去练习业内的解决方案，远比课本知识来的快。


## Issue
#### 这里暂时记录下，目前存在的代码实现上的问题
#### 1. xml配置bean注入 
jdbcTemplateDao中， datasource通过xml配置注入，注入失败

#### 2. viewresolver 
这里暂时用个最简单的方式，实现controller返回string，根据指定前缀和后缀跳转到指定的jsp页面，日后深入研究一下

#### 3. 容器的部署问题
配置文件修改，需要重新启动tomcat
jsp页面的修改，直接重新刷新页面即可