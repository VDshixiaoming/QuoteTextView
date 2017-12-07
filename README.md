# QuoteTextView
实现效果如下：   

![实现效果：](https://github.com/VDshixiaoming/QuoteTextView/raw/master/QuoteTextView/screenshot3.png)  

[原理：](http://blog.csdn.net/wanmeilang123/article/details/77898666)
图文混排效果，自定义省略符号，图片文字水平对齐
# 使用方法
``` java
setText(String text);
setQuoteTextView(String text, String imgLeft, String imgRight, String ellipse, int count);
```
text-文本，imgLeft-文本左图片资源名称，imgRight-文本右图片资源名称，ellipse-自定义省略符号，count-预留占位空间
