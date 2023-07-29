package org.apache.camel.learn.messagingsystems;

import org.apache.camel.builder.RouteBuilder;

public class MessageChannel extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:src/testdata/input")
                .to("file:src/testdata/output");
    }
}
