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

    public static class Builder {
        private String protocol = "http://";
        private String ip = "127.0.0.1";
        private String port = "80";

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

        public void apply2Super(Config config) {
            config.protocol = this.protocol;
            config.ip = this.ip;
            config.port = this.port;
        }

        public Config build(){
            Config config = new Config();
            apply2Super(config);
            return config;
        }


    }
}
