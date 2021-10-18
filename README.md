# telek-fx
JavaFX utility classes I usually use.


<br>

## How to import into a gradle project

Add these lines in your build.gradle file:

```GROOVY
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation ('com.github.oziris78:telek-fx:v0.1.2'){
        exclude group: 'org.openjfx'
    }
}
```

<br>
If you use modules you will also need to add this line:

```
requires telekfx;
```
<br>
A module-info.java example:

```

module myproject.main {

    requires javafx.graphics;
    // other javafx stuff here
    // other library stuff here
    // ...
    
    requires telekfx;
    
    opens com.example.main;
    exports com.example;

}

```

