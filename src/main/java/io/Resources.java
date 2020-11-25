package io;

import java.io.InputStream;

/**
 * 读取配置文件IO类
 */
public class Resources {

    public static InputStream getResourceAsStream(String path){
        InputStream resourceAsStream = Resources.class.getResourceAsStream(path);
        return resourceAsStream;
    }

}
