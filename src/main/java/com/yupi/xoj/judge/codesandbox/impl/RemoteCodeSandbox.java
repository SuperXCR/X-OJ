package com.yupi.xoj.judge.codesandbox.impl;

import com.yupi.xoj.judge.codesandbox.CodeSandbox;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.xoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 * @Author : SuperXCR
 * @Create 2024-01-03
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
