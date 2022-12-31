# ZGUIApi
Welcome to the ZGUIApi Spigot library page.

If you find bugs- report them as a GitHub issue. Thanks!

## What is ZGUIApi
ZGUIApi is an Api to make Guis in Minecraft.
You can use it with the versions starting from 1.8 to 1.19

## How to use
Before using ZGUIApi you need to download the ZGUIApi plugin and put it in your plugins folder.
You need to also add it as a dependency in your `plugin.yml` file like this:
``` yml
depend: [ZGUIApi]
```

To use the API you will need to add it in your plugin

### Maven
To Use it with maven you need to add the repo like this:
```xml
        <repository>
            <id>zffu-repo</id>
            <url>https://nexus.zffu.ml/maven</url>
        </repository>
```

and add the dependency:
```xml
   <dependency>
            <groupId>net.zffu</groupId>
            <artifactId>zgui-api</artifactId>
            <version>1.0</version>
            <scope>provided</scope>
    </dependency>
```

You can find examples on the repo wiki
