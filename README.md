# ViewSelector
================================================================
说明
------------------------------------------------------------------
   平时我们开发项目，总会有加载界面，加载成功了显示数据界面，如果从服务端加载数据失败，就要显示失败界面，或者加载的数据是空数据的时候，要提示没有数据界面。还有，失败了，
肯定又要再次获取数据，又要需要重加载界面。如果你每个在一个xml里都写入这些布局，估计自己都会看晕，别说以后维护的人了。而且，很多地方都用到这些，你也不能一个一个的copy paste
吧，虽然可以用include的方式，毕竟还是不方便的。为此。我把这些都集合起来了，写成一个库，要改要增加新功能也简单了，呵呵。。。

用法
--------------------------------------------------
（1）初始化：（把目标view作为参数传进去，为了失败重加载需要继承ReloadCallback回调接口）
### ViewSelectorLayout viewSelectorLayout = new ViewSelectorLayout(getActivity(), targetView);
		viewSelectorLayout.setReLoadCallbackListener(this);
		return viewSelectorLayout;
	}
（2）显示目标界面
### viewSelectorLayout.show_ContentView();

（3）显示加载界面
### viewSelectorLayout.show_LoadingView();

（4）显示失败界面
### viewSelectorLayout.show_FailView();

(5)显示空界面
### viewSelectorLayout.show_EmptyView()
	
	
![](http://www.apkbus.com/data/attachment/forum/201504/03/113645d78y7514el74e1ff.gif)


