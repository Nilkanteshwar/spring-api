package examApi.controller;

import examApi.exam.question;
import examApi.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("category/{category}")
    public List<question>getQuestionByCategory(@PathVariable String category){
        return QuestionService.getQuestionByCategory(category);

    }
@PostMapping("add")
    public String addQuestion(@RequestBody question que){
        return QuestionService.addQuestion(que);

    }
}
