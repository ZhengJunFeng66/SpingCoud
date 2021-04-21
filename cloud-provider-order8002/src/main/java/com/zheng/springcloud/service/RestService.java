package com.zheng.springcloud.service;

import com.zheng.springcloud.api.RestApi;
import com.zheng.springcloud.service.serviceIpmI.RestServiceIpmp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT",fallback = RestServiceIpmp.class)
public interface RestService extends RestApi {
}
