package com.github.gregwhitaker.ratpackconfig.example;

import com.github.gregwhitaker.ratpackconfig.example.api.ApiEndpoints;
import com.github.gregwhitaker.ratpackconfig.example.api.ApiModule;
import com.github.gregwhitaker.ratpackconfig.example.config.QuotesConfig;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

/**
 * Starts the example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
                        .require("/quoteconfig", QuotesConfig.class)
                        .baseDir(BaseDir.find()).build())
                .registry(Guice.registry(b -> b
                        .module(ApiModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiEndpoints.class)
                )
        );
    }
}
