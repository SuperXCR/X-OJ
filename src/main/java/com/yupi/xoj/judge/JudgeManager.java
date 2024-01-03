package com.yupi.xoj.judge;

import com.yupi.xoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.xoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.xoj.judge.strategy.JudgeContext;
import com.yupi.xoj.judge.strategy.JudgeStrategy;
import com.yupi.xoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.xoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 *
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
