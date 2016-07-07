<html>
<head>
    <script type="text/javascript">
        function fun() {
            alert(typeof null);
            alert(typeof demo());
        }
        function demo(){
            alert("demo");
        }

    </script>

</head>
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


<#--测试自定义一个宏，传入参数-->
<#macro  test foo bar baaz>
<span>test:${foo} + ${bar} = ${baaz}</span>
</#macro>

<@test foo = 4 bar = 3 baaz = 7 />

<hr>
<#--自定义一个方法，传入参数-->
<#function avg p1 p2>
    <#return (p1+p2)/2.0>
</#function>

${avg(10,20)}


<h1>${user}自定义标签输出结果</h1><br/>
<@label num=12 />



<#--javaScript typeOf-->
<input type="button" value="click me!" onclick="fun()"/>

</body>

</html>
