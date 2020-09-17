# 活动的生命周期：

当一个Activity刚刚启动的时候，它会执行onCreate()，onStart()，onResume()三个方法。

当此时有另一个Activity来到前台的时候：

情况一：（新来的Activity占据屏幕，原来的Activity不可见）原来的Activity将会

执行onPause()，onStop()方法。此时点击手机返回按钮，原来的Activity将会执行onRestart()，onStart()，onResume()。

情况二：（新来的Activity占据屏幕一部分，原来的Activity依旧可见）此时原来的Activity将会执行OnPause()方法，并不会执行onStop()，此时点击手机返回按钮，原来的Activity将不会执行onRestart()，onStart()，只会执行onResume()。



参考Demo：https://github.com/crazymen-nanke/learn_activity_lifecycle

Demo项目树:

![image-20200917130710654](https://zl.crazymen.cn/images/image-20200917130710654.png)

DialogActivity设置了android:theme="@style/Theme.AppCompat.Dialog"。

运行截图：

![image-20200917130116163](https://zl.crazymen.cn/images/image-20200917130116163.png)

刚启动时logcat显示效果：

![image-20200917130426250](https://zl.crazymen.cn/images/image-20200917130426250.png)

情况一：

当我点击第一个按钮, logcat显示效果 ：

![image-20200917131008711](https://zl.crazymen.cn/images/image-20200917131008711.png)



此时点击返回按钮, logcat显示效果 ：

![image-20200917131235593](https://zl.crazymen.cn/images/image-20200917131235593.png)



情况二：

当我点击第二个按钮, logcat显示效果 ：

![image-20200917131434944](https://zl.crazymen.cn/images/image-20200917131434944.png)



此时点击返回按钮, logcat显示效果 ：

![image-20200917131556195](https://zl.crazymen.cn/images/image-20200917131556195.png)