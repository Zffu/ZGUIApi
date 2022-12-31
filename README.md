# ZGUIApi
Welcome to the ZGUIApi Spigot library page.

If you find bugs- report them as a GitHub issue. Thanks!

## What is ZGUIApi
ZGUIApi is an Api to make Guis in Minecraft.
You can use it with the versions starting from 1.8 to 1.19

## How to use
Before using ZGUIApi you need to download the ZGUIApi [plugin] (https://github.com/Radi0o/ZGUIApi/releases/download/1.0/zgui-api-1.0.jar) and put it in your plugins folder.
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

# Getting Started
## Create your ZGUI
To use ZGUIAPI you will need to create a class that extends the class ZGui, you will need to return the GUI name and the amount of rows but you will be able to change that later

```java
public class TestGUI extends ZGui {
    public TestGUI() {
        super("My Test GUI", 6);
    }
}
```


**The maximum amount of rows is 6**

## Adding Items
To add an item you need to add a function in your constructor:

```java
this.setItem(itemStack, 0);
```
### Adding Items in multiple Slots
If you need to add the same item in multiple slots then you can use this function

```java
this.setItemInSlots(itemStack, slotList);
```
### Creating a Border 
If you want to add a border to your gui you can use this function to do it:

```java
this.fillBorder(itemStack);
```

**NOTE: This function only works if the amount of rows is atleast 3**

### Filling the GUI with an item
If you want to fill the gui with one single item you can use

```java
this.fillWithItem(itemStack);
```

**NOTE: This function will only fill up the slots that are empty**

## Events
There are currently 4 events that you can use:
* When the gui is opened
* When the gui is closed
* When the player clicks on an item
* When the player drags out an item

An Event looks like this:

```java
@Override
    public boolean onItemDrag(Player p, ItemStack itemStack) {
        return true;
    }
```

**NOTE: You can cancel the event by returning true in the event function**

### Event Functions
| Event| Function| Cancelable |
| ----------- | ----------- | ----------- |
| When the Gui opens | ```public boolean onGUIOpen(Player p) ``` | YES |
| When the Gui closes| ```public void onGUIClose(Player p) ``` | NO |
| When the player clicks on an item | ```public boolean onItemClick(Player p, ItemStack itemStack) ``` | YES |
| When the player drags out an item | ```public boolean onItemDrag(Player p, ItemStack itemStack) ``` | YES |
