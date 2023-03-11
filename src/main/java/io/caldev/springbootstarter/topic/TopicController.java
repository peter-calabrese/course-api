package io.caldev.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void update(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }
    @RequestMapping(method = RequestMethod.DELETE, value ="/topic/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
