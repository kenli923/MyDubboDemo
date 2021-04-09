package com.lzj.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "刘德华演唱会门票";
    }
}
