# OOMAlarm

##堆内存溢出邮箱报警
 
<br>
文件结构

|——————src/main/java———————|——com.oom.App  内存溢出类
|                          |
|                          |——com.oom.Alarm  报警类
|
|——————src/main/resources————
|                           |---config/mail.setting 邮箱配置
|
|
|——————src/test/java

<br>
maven:|
      |   mail:邮箱
      |   hutool:公共包
      |   start.bat生成插件
      
<br>
App：配置虚拟机xms和xmx
     
      vm arguments :(右键app:run as->run configuration->Arguments)复制下文配置:注解,E:/huajiancode1/OOMAlarm 路径需要你根据你自身保存路径手动修改
      
      -verbose:gc 
      -XX:+PrintGC
      -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
      -XX:OnOutOfMemoryError="c:\windows\system32\cmd.exe /c E:/huajiancode1/OOMAlarm/target/client/bin/start.bat %p"
      
      配置完之后run,会抛出异常并发送邮件:（有兴趣可以浏览报警类代码）
