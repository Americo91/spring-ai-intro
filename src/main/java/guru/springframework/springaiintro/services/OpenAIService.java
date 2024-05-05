package guru.springframework.springaiintro.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import guru.springframework.springaiintro.model.Answer;
import guru.springframework.springaiintro.model.GetCapitalRequest;
import guru.springframework.springaiintro.model.GetCapitalResponse;
import guru.springframework.springaiintro.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    GetCapitalResponse getCapitalWithInfoBean(GetCapitalRequest getCapitalRequest);
}
