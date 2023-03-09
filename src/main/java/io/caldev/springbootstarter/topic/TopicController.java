package io.caldev.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {
    @Autowired // Spring annotation that marks needing dependency injection
    private TopicService topicService;

    @RequestMapping("/topics")
    public List <Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

}
