package cs.edu.wap;

import cs.edu.wap.models.Quiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/quiz")
public class QuizServlet extends HttpServlet {
    Quiz quiz;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        quiz = (Quiz) session.getAttribute("Quiz");
        if (quiz.checkAnswer(Integer.parseInt(req.getParameter("answer"))))
            quiz.setScore(quiz.getScore() + 1);
        quiz.setCurrentQuestion(quiz.getCurrentQuestion() + 1);
        session.setAttribute("Quiz", quiz);
        if (quiz.getCurrentQuestion() == quiz.getQuestions().length)
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        req.getRequestDispatcher("question.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("Quiz") != null) {
            quiz = (Quiz) session.getAttribute("Quiz");
        } else {
            quiz = new Quiz(0);
            session.setAttribute("Quiz", quiz);
        }
        req.getRequestDispatcher("question.jsp").forward(req, resp);
    }

}
