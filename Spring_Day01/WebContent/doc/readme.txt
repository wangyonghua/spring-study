第一步：导入jar包
(1)Core Container
   Beans Core Context Spel
(2) 做Spring最基本功能时候，导入四个核心的jar包就可以了。
(3) 导入支持日志输出的jar包。     
第二步：创建类，在类里面创建方法
第三步：创建Spring配置文件，配置创建类
  spring 核心配置文件名称和位置不是固定的
  建议放在src下面，官方建议applicationContext.xml(名称可以随便起)
  引入schema约束
第四步：写代码测试对象的创建

配置文件没有提示
1.spring 引入schema约束，把约束文件引入到eclipse中
xml category beans约束 location找到beans路径

IOC两种方式：
  基于配置文件的方式
  基于注解的方式
3:Spring的Bean管理
  3.1 bean实例化的方式(3种方式)
     3.11 使用类的无参数构造的方式
     3.12 使用静态工厂创建
        创建静态方法，返回类对象
     3.13 使用实例工厂创建
        创建实例方法，返回类对象 
        
 4:属性注入
    4.1 通过构造函数注入
    4.2 通过类set设值
    4.3 使用接口注入
    
     


