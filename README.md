# OOMAlarm

 ##堆内存溢出邮箱报警
 

 `文件结构`

![][foryou]      

 
 App：配置虚拟机xms和xmx
     
      vm arguments :(右键app:run as->run configuration->Arguments)复制下文配置:注解,E:/huajiancode1/OOMAlarm 路径需要你根据你自身保存路径手动修    改
      
      -verbose:gc 
      -XX:+PrintGC
      -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
      -XX:OnOutOfMemoryError="c:\windows\system32\cmd.exe /c E:/huajiancode1/OOMAlarm/target/client/bin/start.bat %p"
      
      配置完之后run,会抛出异常并发送邮件:（有兴趣可以浏览报警类代码）


 [foryou]:https://github.com/SunshineBoyTT/OOMAlarm/blob/master/QQ%E5%9B%BE%E7%89%8720180131141326.png
