package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.ai.azure.openai.AzureOpenAiChatModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping(path = "/chatbot", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@SuppressWarnings("UnnecessaryLocalVariable")
public class DemoChatbotController {

    private final AzureOpenAiChatModel chatModel;

    @GetMapping("/generate")
    public Map<String, String> generate(@RequestParam(value= "message") String message) {
        val generation = this.chatModel.call(message);
        val response = Map.of("generation", generation);
        return response;
    }

}
