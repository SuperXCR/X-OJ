package com.yupi.xoj.judge.codesandbox.impl;

import com.yupi.xoj.judge.codesandbox.CodeSandbox;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.xoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.xoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.xoj.model.enums.QuestionSubmitLanguageEnum;
import com.yupi.xoj.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author : SuperXCR
 * @Create 2024-01-03
 *
 * 示例代码沙箱
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setTime(100L);
        judgeInfo.setMemory(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        
        return executeCodeResponse;
    }
}
