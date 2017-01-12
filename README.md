## Dagger2

### 1.项目引入dagger2

* 在项目下的build.gradle文件中添加apt插件:
buildscript {
    ...
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.2'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        //添加apt插件
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}

* 在app目录的build.gradle文件中添加:

//应用apt插件
apply plugin: 'com.neenbedankt.android-apt'

dependencies {

    引入dagger2
    compile 'com.google.dagger:dagger:2.4'
    apt 'com.google.dagger:dagger-compiler:2.4'
    //java注解
    provided 'org.glassfish:javax.annotation:10.0-b28'
}

