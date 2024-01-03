package com.yupi.xoj.judge.strategy;

import com.yupi.xoj.model.dto.question.JudgeCase;
import com.yupi.xoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.xoj.model.entity.Question;
import com.yupi.xoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;
    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase> judgeCasesList;
    private Question question;
    private QuestionSubmit questionSubmit;
}
