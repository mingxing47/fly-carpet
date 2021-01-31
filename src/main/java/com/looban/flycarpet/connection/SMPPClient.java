package com.looban.flycarpet.connection;

import com.looban.flycarpet.config.Config;

public class SMPPClient {
    private Url url;

    private Config config;

    public SMPPClient(Url url, Config config) {
        this.url = url;
        this.config = config;
    }
}
