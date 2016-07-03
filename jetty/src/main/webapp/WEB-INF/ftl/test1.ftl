<html>
<body>
<h2>Hello World!</h2>
<#--测试freemarker-->
<h2>测试freemarker</h2>
<div>三目运算：${true?string("yes","false")}</div>
<#assign time = .now>
<div>获取当前时间格式化：${.now?string("yyyy-MM-dd HH:mm:ss")}</div>
<#assign  number = 45>
<#assign number_formart = "currency">
${number?string.number}
${number?string.currency}
${number?string.percent}
${number?string.bytes}
<hr>
<#assign obj = [1,2,3] >
<#if obj ??>
<span>obj不为空：说明？？表示不为空 为true</span>
<#else >
<span>obj为空</span>
</#if>
<#if obj?exists>
<hr>
<span>obj存在</span>
</#if>
<hr>
<#list obj as index>
    ${index!"0"}
<hr>
</#list>
</body>
</html>
