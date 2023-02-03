package com.easy.bright.bot.service;

import com.easy.bright.bot.model.TestResult;
import com.easy.bright.bot.repository.TestResultRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class TestResultService {

    private TestResultRepository testResultRepository;

    public TestResultService(TestResultRepository testResultRepository){
        this.testResultRepository = testResultRepository;
    }

}
