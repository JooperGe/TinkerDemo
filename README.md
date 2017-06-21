# TinkerDemo
Tinker实践

![](https://img.shields.io/github/release/qubyte/rubidium.svg)
![](https://img.shields.io/badge/language-java-orange.svg)
![](https://img.shields.io/badge/platform-android-lightgreen.svg)
    
 **实践步骤：**
 
   >1.使用AndroidStudio打开项目后，使用命令行编译oldApk：gradle assembleDebug，编译成功后会在/app/build/bakApk下生成对应的文件；   
   2.修改app下的build.gradle文件：在ext标签下，将app-release-0605-17-38-15.apk、app-release-0605-17-38-15-mapping.txt、app-release-0605-17-38-15-R.txt   
三者修改为对应第一步生成的几个文件名，注：debug打包不会生成mapping文件，只需将名称中对应的日期修改即可；
   3.任一修改项目中的代码，如在主页面布局中修改Hello World！   
   4.使用命令行编译newApk：gradle tinkerPatchDebug，编译成功后会在/app/build/outputs/tinkerPatch下生成对应的文件；   
   5.注意在MainActivity中load(View v)方法中的加载路径，该路径可以任意修改，最后需要将步骤4中生成的patch_signed_7zip.apk文件拷贝至手机中该路径即可；   
   6.安装步骤1中生成的apk并启动，点击load按钮，重启应用，此时页面中间的文字会变为步骤3中修改后的文字。
   
 **注意：**
 
    1.Can't update AndroidManifest.xml, such as add Android Component.   
    2.Do not support some Samsung models with os version android-21.   
    3.Due to Google Play Developer Distribution Agreement, we can't dynamic update our apk.   