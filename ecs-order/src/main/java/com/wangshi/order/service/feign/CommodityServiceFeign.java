/*
 * =============================================================
 * Copyright (c) 2012 ~ 2019. wangshi.com All rights reserved.
 *                                           Created by wangjian
 * =============================================================
 */

package com.wangshi.order.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Author: wangjian
 * Date:   19-10-17
 * Description:
 */
@FeignClient(name="ecs-commodity", contextId = "commodity", url = "172.16.9.175:8082")
public interface CommodityServiceFeign {

    @PostMapping("/commodity/{id}/{quantity}")
    String minusCommodity(@PathVariable("id") String id, @PathVariable("quantity")int quantity);
}
