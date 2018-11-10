package com.sky.hypro.service.tools;

/**
 * 数据加解密服务
 *
 * <p>该加密服务会根据加解密场景的不同选择对应的 key，使用方正确设定场景即可。
 *
 * @author CarryJey
 * @since 2018/11/1
 */
public interface CryptoService {

    /**
     * 使用场景
     */
    int CRYPTO_SCENE_TEST= 1;

    /**
     * rsa 解密
     */
    byte[] rsaDecrypt(int cryptoScene, byte[] data);

    /**
     * rsa 加密
     */
    byte[] rsaEncrypt(int cryptoScene, byte[] data);

    /**
     * rsa 加密
     * @param data 要加密的字符串，该方法会使用 UTF-8 编码将字符串转换为 byte array
     */
    byte[] rsaEncryptString(int cryptoScene, String data);
}
