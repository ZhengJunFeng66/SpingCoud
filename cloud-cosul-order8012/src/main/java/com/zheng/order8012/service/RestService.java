package com.zheng.order8012.service;

import com.zheng.order8012.api.RestCosulApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "cloud-consul-payment")
public interface RestService extends RestCosulApi {
}
