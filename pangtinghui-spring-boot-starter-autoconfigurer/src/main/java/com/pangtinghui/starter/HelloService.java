package com.pangtinghui.starter;



public class HelloService {
    HelloProperties helloProperties;

    public String sayHelloPangtinghui(String name){
        return helloProperties.getPreffix()+"-"+name+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
