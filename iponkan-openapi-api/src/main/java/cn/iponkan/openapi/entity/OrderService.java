package cn.iponkan.openapi.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author dongtangqiang
 */
@Api("订单服务")
@RequestMapping(value = "order", produces = "application/json;charset=utf-8")
public interface OrderService {
    String DEFAULT_CONTEXT_ID = "iponkan-openapi.orderService";

    @ApiOperation("保存订单，支持重复调用")
    @PostMapping("post")
    @ResponseBody
    String post(@Valid @RequestBody OrderDto order) throws Exception;


    @ApiOperation("获取订单，根据订单号")
    @GetMapping("get")
    @ResponseBody
    OrderDto get(String number) throws Exception;
}
