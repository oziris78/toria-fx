# Toria FX

<p> <!-- BADGES -->
<!-- badge 1 -->
    <a href="https://github.com/oziris78/toria-fx/stargazers">
        <img alt="GitHub stars" src="https://img.shields.io/github/stars/oziris78/toria-fx">
    </a>
<!-- badge 2 -->
    <a href="https://github.com/oziris78/toria-fx/network">
        <img alt="GitHub forks" src="https://img.shields.io/github/forks/oziris78/toria-fx">
    </a>
<!-- badge 3 -->
    <a href="https://github.com/oziris78/toria-fx/blob/master/LICENSE.txt">
        <img alt="GitHub license" src="https://img.shields.io/github/license/oziris78/toria-fx?color=blue"/>
    </a>
<!-- badge 4 -->
    <img alt="GitHub Repo size" src="https://img.shields.io/github/repo-size/oziris78/toria-fx"/>
<!-- badge end -->
</p>

JavaFX utility classes I usually use.


<br>

## How to import into a gradle project

Add these lines in your build.gradle file:

```GROOVY
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation ('com.github.oziris78:toria-fx:v0.3'){
        exclude group: 'org.openjfx'
    }
}
```


## Projects That Use Toria FX

<a href="https://github.com/oziris78/javafx-playground"> JavaFX Playground </a>
