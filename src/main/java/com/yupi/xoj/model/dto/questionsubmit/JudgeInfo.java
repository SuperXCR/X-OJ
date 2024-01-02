package com.yupi.xoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 *
 * @Author : SuperXCR
 * @Create 2023-12-27
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗时间（ms）
     */
    private Long time;

    /**
     * 消耗内存（KB）
     */
    private Long memory;

}
