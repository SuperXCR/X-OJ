package com.yupi.xoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.xoj.model.entity.Question;
import com.yupi.xoj.service.QuestionService;
import com.yupi.xoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Superman
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2023-12-27 17:42:20
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




