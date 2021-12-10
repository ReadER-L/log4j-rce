# Apache-Log4j
Apache Log4j 远程代码执行

> 攻击者可直接构造恶意请求，触发远程代码执行漏洞。漏洞利用无需特殊配置，经阿里云安全团队验证，Apache Struts2、Apache Solr、Apache Druid、Apache Flink等均受影响

![](https://github.com/ReadER-L/log4j-rce/blob/master/img/1.png)

## 注意事项

在复现过程中，如果你的JDK版本是JDK 6u211、7u201、8u191之后的话，那需要`System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");`添加如下JAVA代码，因为在这些版本之后，是默认将`com.sun.jndi.ldap.object.trustURLCodebase`设为false的。

