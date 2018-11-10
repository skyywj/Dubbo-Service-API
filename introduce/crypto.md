### rsa加解密服务接口

接口地址：https://github.com/skyywj/service-api/blob/master/src/main/java/com/sky/hypro/service/tools/CryptoService.java

接口如下：
```java
    /**
     * rsa 解密
     */
    byte[] rsaDecrypt(int cryptoScene, byte[] data);

    /**
     * rsa 加密
     */
    byte[] rsaEncrypt(int cryptoScene, byte[] data);
```