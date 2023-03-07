package io.caldev.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// Business Service - @service is a stereotype service, tells Spring this is a Spring Business Service
@Service
public class TopicService {
List<Topic> topics = Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }
}