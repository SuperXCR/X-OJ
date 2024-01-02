package com.yupi.xoj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 *
 * @Author : SuperXCR
 * @Create 2023-12-27
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制(ms)
     */
    private Long timeLimit;

    /**
     * 内存限制(KB)
     */
    private Long memoryLimit;

    /**
     * 堆栈限制(KB)
     */
    private Long stackLimit;

}
