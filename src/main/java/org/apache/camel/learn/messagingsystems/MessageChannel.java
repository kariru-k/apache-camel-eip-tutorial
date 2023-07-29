package org.apache.camel.learn.messagingsystems;

import org.apache.camel.builder.RouteBuilder;

public class MessageChannel extends RouteBuilder {

    @Override
    public void configure(){
        from("file:src/testdata/input?noop=true")
                .log("A file!")
                .to("file:src/testdata/output");
    }
}
