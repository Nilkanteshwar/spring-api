package examApi.service;

import examApi.Dao.questionDao;
import examApi.exam.question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class questionService {

    @Autowired
    questionDao QuestionDao;

    public List<question> getAllQuestions() {
        return QuestionDao.findAll();
    }

    public List<question> getQuestionByCategory(String category) {
        return QuestionDao.getQuestionByCategory(category);
    }


    public String addQuestion(question que) {

         QuestionDao.save(que);
        return"success";
    }
}
