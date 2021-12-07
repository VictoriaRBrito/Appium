# <img src="https://cdn.worldvectorlogo.com/logos/appium.svg" alt = "logo Appium" width = "30"> Appium
Trabalho desenvolvido sobre a ferramenta Appium.
<h1> :speech_balloon: O que é o Appium? </h1>
Appium é uma ferramenta de código aberto usada para automatização de aplicativos da web para celular, nativos e híbridos  em sistemas como iOS, Android e Windows desktop. 
Ele valida a compatibilidade, usabilidade e tempo de resposta dos navegadores e aplicativos em vários dispositivos móveis. 
É uma plataforma cruzada, permite que você escreva testes em várias plataformas usando a mesma API. Isso permite a reutilização de código entre conjuntos de teste IOS, Android e Windows. E, suporta várias linguagens de programação, como: Python, PHP, Java e Perl.

<h1> :white_check_mark: Pré-requisitos: </h1>

- [Node.js](https://nodejs.org/en/)
- [Java](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Android Studio](https://developer.android.com/studio?hl=pt&gclid=CjwKCAiAhreNBhAYEiwAFGGKPLl92qAbFtHdGtSQpwLJVMCEam45-3_BWsbSImP7isde66uMK93drxoCEVwQAvD_BwE&gclsrc=aw.ds)
- [IntelliJ](https://www.jetbrains.com/pt-br/idea/)
- [Appium Server](https://appium.io)
- [Appium Client](https://appium.io/docs/en/about-appium/getting-started/?lang=pt#appium-clients)
- [Selenium Jar](https://www.selenium.dev/downloads/)

## :computer: Configurando as variáveis ambiente
  É necessário configurar as variáveis ambiente no Windows, para isso digite os comandos a seguir no terminal
  
  Para o JAVA_HOME (x é a versão da sua JDK):
```bash
$ set JAVA_HOME "C:\Program Files\Java\jdk-xx.x.x"
```
  Colocando JAVA_HOME na PATH:
```bash
$ set PATH=%PATH%;C:\Program Files\Java\jdk-xx.x.x\bin
```
  Adicionando a variável ANDROID_HOME:
  ```bash
$ set ANDROID_HOME "C:\<pasta da instalação>\android-sdk-windows"
```
  Colocando ANDROID_HOME na PATH:
```bash
$ set PATH=%PATH%;%ANDROID_HOME%\tools;%ANDROID_HOME%\platform-tools
```
  Adicionando a variável MAVEN_HOME:
  ```bash
$ set MAVEN_HOME "C:\<pasta da instalação>\apache-maven-x.x.x"
```
  Colocando MAVEN_HOME na PATH:
```bash
$ set PATH=%PATH%;%MAVEN_HOME%\bin
```

### Verifique se as instalações estão corretas:
Para verificar se a instalação das ferramentas necessárias para o Appium foram feitas corretamente, abra o terminal e digite este comando:
  
```bash
$ npx appium-doctor
```

<h1><img src="https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_maven_icon_130397.png" alt = "logo Maven" width = "45">Java Client através do Maven</h1>
  Basta você inserir a seguinte dependência no arquivo pom.xml do seu projeto:

  ```
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>7.6.0</version>
</dependency>

```
  Depois no diretório do projeto abra o terminal e digite o seguinte comando:
  ```
mvn clean install
```
<h1><img src="https://cdn.worldvectorlogo.com/logos/appium.svg" alt = "logo Appium" width = "30"> Executando o Appium</h1>
  Digite o seguinte comando no seu terminal:
  
```bash
$ appium
```

