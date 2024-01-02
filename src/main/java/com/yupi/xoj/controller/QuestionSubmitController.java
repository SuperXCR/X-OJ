package com.yupi.xoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.xoj.annotation.AuthCheck;
import com.yupi.xoj.common.BaseResponse;
import com.yupi.xoj.common.ErrorCode;
import com.yupi.xoj.common.ResultUtils;
import com.yupi.xoj.constant.UserConstant;
import com.yupi.xoj.exception.BusinessException;
import com.yupi.xoj.model.dto.question.QuestionQueryRequest;
import com.yupi.xoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.xoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.xoj.model.entity.Question;
import com.yupi.xoj.model.entity.QuestionSubmit;
import com.yupi.xoj.model.entity.User;
import com.yupi.xoj.model.vo.QuestionSubmitVO;
import com.yupi.xoj.service.QuestionService;
import com.yupi.xoj.service.QuestionSubmitService;
import com.yupi.xoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 */
@RestController
@RequestMapping("/question_submit")
@Slf4j
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 提交题目
     * @param questionSubmitAddRequest
     * @param request
     * @return 提交记录的 id
     */
    @PostMapping("/")
    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
                                         HttpServletRequest request) {
        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        //
        final User loginUser = userService.getLoginUser(request);
        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
        return ResultUtils.success(questionSubmitId);
    }

    /**
     * 分页获取题目提交列表（仅管理员 和 用户本人可见）
     *
     * @param questionSubmitQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page")
    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest,
                                                                         HttpServletRequest request) {
        long current = questionSubmitQueryRequest.getCurrent();
        long size = questionSubmitQueryRequest.getPageSize();
        // 从数据库中查询原始的题目提交分页信息
        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
        // 返回脱敏信息
        final User loginUser = userService.getLoginUser(request);
        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage, loginUser));
    }

}
