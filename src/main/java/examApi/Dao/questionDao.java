package examApi.Dao;

import examApi.exam.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionDao extends JpaRepository<question,Integer> {

    List<question>getQuestionByCategory(String category);

}
