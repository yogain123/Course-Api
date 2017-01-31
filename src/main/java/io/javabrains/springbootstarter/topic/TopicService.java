package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService 
{
	
	@Autowired
	private TopicRepository topicRepository;
	
//	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring","Spring framework","Spring FrameWork Description"),
//			new Topic("java","java framework","java FrameWork Description"),
//			new Topic("hibernate","hibetrnate framework","hibetrnate FrameWork Description")
//			));
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		ArrayList<Topic> topics=new ArrayList<Topic>();
		topicRepository.findAll()
				.forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(String id)
	{
//		 for(Topic z : topics)
//		{
//			if(z.getId().equals(id))
//				return z;
//		}
//		return null;
		
		return topicRepository.findOne(id);
				
		
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic,String id)
	{
//		for(int i = 0;i<topics.size();i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i, topic);
//			}
//		}
		
		topicRepository.save(topic);
	}
	
	public void deleteTopic(Topic topic,String id)
	{
//		for(int i = 0;i<topics.size();i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.remove(i);
//			}
//		}
		
		topicRepository.delete(id);
	}
}
