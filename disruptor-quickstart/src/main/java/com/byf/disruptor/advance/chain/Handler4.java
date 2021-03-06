package com.byf.disruptor.advance.chain;

import com.lmax.disruptor.EventHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Handler4 implements EventHandler<Trade> {
    @Override
    public void onEvent(Trade event, long l, boolean b) throws Exception {
        log.info("Handler4 : SET PRICE");
        event.setPrice(17.2);
    }
}
