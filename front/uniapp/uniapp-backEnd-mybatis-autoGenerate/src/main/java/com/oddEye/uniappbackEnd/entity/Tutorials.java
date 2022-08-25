package com.oddEye.uniappbackEnd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author oddEye
 * @since 2022-04-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Tutorials对象", description="")
public class Tutorials implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long id;

    private String description;

    private Boolean published;

    private String title;


}
