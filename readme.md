AOP
 
   1.配置流程
   
      首先引入包AOP
          <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-aop</artifactId>
          </dependency>
      加入注解@Aspect配置类放到容器中
      配置通知点和织入点@Before("execution( * com.springboot.apo.*.*(..))")

    
   2.配置介绍
     
      #spring.aop.auto=true 是否启用AOP
      #spring.aop.proxy-target-class=true 默认是CGLIB,false是jdk代理用，必须接口获取代理