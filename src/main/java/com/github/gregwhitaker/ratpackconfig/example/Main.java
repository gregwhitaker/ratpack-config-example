package com.github.gregwhitaker.ratpackconfig.example;

import com.github.gregwhitaker.ratpackconfig.example.api.ApiEndpoints;
import com.github.gregwhitaker.ratpackconfig.example.api.ApiModule;
import com.github.gregwhitaker.ratpackconfig.example.config.QuotesConfig;
import com.github.gregwhitaker.ratpackconfig.example.service.ServiceModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
                        .require("/quotes", QuotesConfig.class)
                        .baseDir(BaseDir.find()).build())
                .registry(Guice.registry(b -> b
                        .module(ApiModule.class)
                        .module(ServiceModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiEndpoints.class)
                )
        );
    }
}
