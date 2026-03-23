package com.learninglogsterminal.service;

import com.learninglogsterminal.entity.Topic;
import java.util.ArrayList;
import java.util.List;

public class TopicService {

    private final List<Topic> topics = new ArrayList<>();
    private int nextId = 1;

    // ============================================================
    // TODO 5: Implement addTopic()
    // ============================================================
    public Topic addTopic(String name) {
        Topic topic = new Topic(nextId, name);
        topics.add(topic);
        nextId++;
        return topic;
    }

    // ============================================================
    // TODO 6: Implement getAllTopics()
    // ============================================================
    public List<Topic> getAllTopics() {
        return topics;
    }

    // ============================================================
    // TODO 7: Implement getTopicCount()
    // ============================================================
    public int getTopicCount() {
        return topics.size();
    }
}