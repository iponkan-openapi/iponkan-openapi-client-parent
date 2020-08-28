package cn.iponkan.openapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * 订单
 *
 * @author dongtangqiang
 */
@ApiModel(description = "订单")
public class OrderDto {
    /**
     * 单据uuid
     */
    private String id;
    /**
     * 单号
     */
    private String number;
    /**
     * 来源
     */
    private String source;

    @ApiModelProperty("订单uuid")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ApiModelProperty("单号")
    @NotNull
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @ApiModelProperty("订单来源")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
