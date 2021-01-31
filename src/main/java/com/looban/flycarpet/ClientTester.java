package com.looban.flycarpet;

import com.looban.flycarpet.config.Config;
import com.looban.flycarpet.connection.SMPPClient;
import com.looban.flycarpet.connection.Url;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientTester {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientTester.class);

    public static void main(String[] args) {
        LOGGER.info("test");
        Config config = new Config();
        Url url = new Url();
        SMPPClient smppClient = new SMPPClient(url, config);

    }
}
