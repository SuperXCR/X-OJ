package com.yupi.xoj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 *
 * @Author : SuperXCR
 * @Create 2023-12-27
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
