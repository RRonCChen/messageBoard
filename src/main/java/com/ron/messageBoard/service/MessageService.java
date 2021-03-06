package com.ron.messageBoard.service;

import com.ron.messageBoard.exception.MessageBoardException;
import com.ron.messageBoard.entity.api.result.MessageResultEntity;
import com.ron.messageBoard.entity.api.result.PageResultEntity;

public interface MessageService {

    MessageResultEntity getMessage(Long id) throws MessageBoardException;

    PageResultEntity<MessageResultEntity> getTopicMessages(Long topicId, Integer page, Integer size) throws MessageBoardException;

    void insertMessage(Long userId, Long topicId, String content) throws MessageBoardException;

    void updateMessage(Long id, String content) throws MessageBoardException;

    void deleteMessage(Long id) throws MessageBoardException;
}
