Struts2框架
1.Action操作
  (1)action创建的三种方式
     继承类 ActionSupport
   
  (2)配置action访问路径
     创建Struts.xml配置文件，这个文件的名称和位置固定在src下。
     
  (3)配置访问action的多个方法
     使用通配符方式配置
     
  (4)在action获取表单提交数据
    获取Request对象
    属性封装(不能与模型驱动同时存在)
    模型驱动(重点)
    表达式封装
    
  (5)在action操作域对象
   使用ServletActionContext获取对象
    
  (6)配置struts过滤器
  
 2.值栈
   (1) 向值栈放数据
   -set方法
   -push方法
   -定义变量，生成get方法
   
   (2)向值栈获取数据
   -在jsp中使用struts2标签+ognl获取
   -<s:property>
   -<s:iterator>
   
  3.拦截器
  (1) aop和责任链模式
  (2) 自定义拦截器 
  -继承MethodFilterInterceptor
  -重写类里面的方法
  -配置拦截器和action关联
  