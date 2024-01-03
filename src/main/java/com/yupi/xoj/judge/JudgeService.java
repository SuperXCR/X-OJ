package com.yupi.xoj.judge;

import com.yupi.xoj.model.entity.QuestionSubmit;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 *
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
