<p align="center"><img src="https://raw.githubusercontent.com/ShatteredSuite/ShatteredUtilities2/master/header.png" alt=""/></p>

-----
<p align=""center">
<a href="https://github.com/ShatteredSuite/ShatteredUtilities/blob/master/LICENSE"><img alt="License" src="https://img.shields.io/github/license/ShatteredSuite/ShatteredUtilities?style=for-the-badge&logo=github" /></a>
<a href="https://github.com/ShatteredSuite/ShatteredUtilities/issues"><img alt="GitHub Issues" src="https://img.shields.io/github/issues/ShatteredSuite/ShatteredUtilities?style=for-the-badge&logo=github" /></a>
<a href="https://github.com/ShatteredSuite/ShatteredUtilities/releases"><img alt="GitHub Version" src="https://img.shields.io/github/tag/ShatteredSuite/ShatteredUtilities?label=Github%20Version&style=for-the-badge&logo=github" /></a>
<a href="https://discord.gg/zUbNX9t"><img alt="Discord" src="https://img.shields.io/badge/Get%20Help-On%20Discord-%237289DA?style=for-the-badge&logo=discord" /></a>
<a href="ko-fi.com/uberpilot"><img alt="Ko-Fi" src="https://img.shields.io/badge/Support-on%20Ko--fi-%23F16061?style=for-the-badge&logo=ko-fi" /></a>

### About
ShatteredUtilities (ShatteredUtil) is a collection of commonly-repeaded code across my plugins. I've written it to 
reduce the amount of repeated code and allow me to update the code in a more organized way. 

### Supported Versions
* 1.12.2
* 1.13.2
* 1.14.4
* 1.15.2

I plan to support the most recent release on each of the past three versions actively, as well as any old versions that
do not become too taxing to maintain.

### Features
* NBT Manipulation
* Message sending
* Message placeholder replacing

### Using This Library
Requires Git and Gradle. This also requires having Spigot built for each of the supported versions.

```bash
git clone https://github.com/ShatteredSuite/ShatteredUtilities2
cd ShatteredUtilities
gradle clean build publishToMavenLocal
```

#### Gradle

Add the following to your `build.gradle`:
```groovy
repositories {
    mavenLocal()
}

dependencies {
    implementation group: 'com.github.shatteredsuite', name: 'ShatteredUtilities', version: '2.0.0'
}
```

Optionally shadow this into your plugin:
```groovy
plugins {
    id 'com.github.johnrengelman.shadow' version '5.1.0'
}

// Some other things...

shadowJar {
    dependencies {
        include dependency('org.bstats:bstats-bukkit')
        include dependency('com.github.shatteredsuite:ShatteredUtilities')
    }
    relocate('org.bstats.bukkit', packagePath + '.dependencies')
    relocate('com.github.shatteredsuite.utilities', packagePath + '.dependencies')
}
```

#### Maven
Add this to your `pom.xml`:
```xml
<dependencies>
    <dependency>
        <groupId>org.projpi</groupId>groupId>
        <artifactId>ShatteredUtilities</artifactId>artifactId>
        <version>1.6.2</version>version>
        <scope>compile</scope>scope>
    </dependency>dependency>
</dependencies>
```

Optionally shade this into your plugin:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <relocations>
                    <relocation>
                        <pattern>com.github.shatteredsuite.utilities</pattern>
                        <shadedPattern>your.package.util</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
