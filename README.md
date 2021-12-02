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
    implementation ('com.github.oziris78:telek-fx:v0.2'){
        exclude group: 'org.openjfx'
    }
}
```

