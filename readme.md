# 责任链模式
责任链模式主要还是在于链条管理者的使用，将管理者作为整个过滤器的核心，就能让人很容易的理解整个责任链模式的作用方式，具体的使用场景有netty对出站和入站数据的处理，有一个pipeline来作为handler的管理者，可以对数据进行处理，包括了encoder，TCP拆包和粘包等等

#迭代器模式
唯一给我的感觉就是有一句话讲的很多，计算机中不能解决的问题都能通过加一个中间层来解决


# 策略模式
策略模式就是在进行‘计算’，‘比较’的时候不要将具体的比较（计算）策略写死，而是动态根据上下文的情况具体的策略进行运算，从而具有了较强的拓展性.
	eg：jdk提供的comparable<E> 和 comparator<E> 的比较大小的问题电商系统进行打折的时候，有很多的打折规则，也可以使用策略模式来实现。

# 观察者模式
观察者模式中核心理念就是化主动为被动，将我去主动处理他，换成他主动来被处理。大体上是在被观察者身上添加一个监听。要明白观察者和被观察者之间的关系

# reactor模式
要理解nio.pdf中描述的 `reactor pattern`  
*具体查看https://github.com/iluwatar/java-design-patterns

# 适配器模式
在查看 `Spring` 中的 `HandlerMapping` 和 `HandlerAdapter` 时发现了适配器的使用


# 加入监听器 
    *   事件驱动监听器.根据某个时间触发
       
        `tomcat` 组件启动, `blade` 触发某个时间，参数可以自行定义，具体的触发可以根据业务，组件进行

    *   监听启动. 仅执行一次
    
        `Listener` Servlet 规范
    
    
# 加入缓存池(使用信号量)