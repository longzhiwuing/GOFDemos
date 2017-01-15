package com.lzw.builder;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhongyong@cecdat.com
 * Date: 2017/1/15
 * Time: 10:20
 */
public class Config {
    private String protocol;
    private String ip;
    private String port;

    public String getProtocol() {
        return protocol;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Config{" +
                "protocol='" + protocol + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                '}';
    }

    //新增Builder静态类并赋默认值
    public static class Builder {
        private String protocol = "http://";
        private String ip = "127.0.0.1";
        private String port = "80";

        //为每一个属性创建返回自身Builder对象的方法
        public Builder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPort(String port) {
            this.port = port;
            return this;
        }

        //新建一个aplly方法，传一个父类引用，赋值构建的参数
        public void apply2Super(Config config) {
            config.protocol = this.protocol;
            config.ip = this.ip;
            config.port = this.port;
        }

        //新建一个build方法，创建一个父类对象，传递给apply方法为这个空对象赋构建出来的参数值，返回这个构建对象即可。
        public Config build(){
            Config config = new Config();
            apply2Super(config);
            return config;
        }


    }
}
