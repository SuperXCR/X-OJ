package com.yupi.xoj.judge.codesandbox;

import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
public interface CodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
