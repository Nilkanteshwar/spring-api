package examApi.controller;

import examApi.exam.question;
import examApi.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class quizController {

    @Autowired
    questionService QuestionService;



    @GetMapping("allQuestions")
    public List<question> getAllQuestions(){
        return QuestionService.getAllQuestions();

    }
}
