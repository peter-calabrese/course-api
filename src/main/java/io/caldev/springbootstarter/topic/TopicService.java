package io.caldev.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Business Service - @service is a stereotype service, tells Spring this is a Spring Business Service
@Service
public class TopicService {
List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java ", "Core Java", "Core Java Description"),
                new Topic("javascript", "Javascript", "Javascript Description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }
    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));

    }
}
