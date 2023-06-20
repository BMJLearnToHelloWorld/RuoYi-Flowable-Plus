package org.dromara.workflow.domain.vo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import org.dromara.workflow.domain.WfForm;

import java.io.Serial;

/**
 * 流程分类视图对象
 *
 * @author KonBAI
 * @createTime 2022/3/7 22:07
 */
@Data
@AutoMapper(target = WfForm.class, convertGenerate = false)
public class WfFormVo {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 表单主键
     */
    private Long formId;

    /**
     * 表单名称
     */
    private String formName;

    /**
     * 表单内容
     */
    private String content;

    /**
     * 备注
     */
    private String remark;
}
