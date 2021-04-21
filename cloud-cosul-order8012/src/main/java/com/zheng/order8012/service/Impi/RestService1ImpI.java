package com.zheng.order8012.service.Impi;

import com.zheng.order8012.service.RestService1;
import org.springframework.stereotype.Component;

@Component
public class RestService1ImpI implements RestService1 {
    @Override
    public String info_ok() {
        return "cuowu";
    }

    @Override
    public String info_time() {
        return "cuowu";
    }
}
