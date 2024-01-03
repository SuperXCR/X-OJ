package com.yupi.xoj.judge.strategy;

import com.yupi.xoj.model.dto.questionsubmit.JudgeInfo;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 *
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
