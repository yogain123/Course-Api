package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService 
{
	
	@Autowired
	private CourseRepository topicRepository;
	
//	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring","Spring framework","Spring FrameWork Description"),
//			new Topic("java","java framework","java FrameWork Description"),
//			new Topic("hibernate","hibetrnate framework","hibetrnate FrameWork Description")
//			));
	
	public List<Course> getAllTopics()
	{
		//return topics;
		ArrayList<Course> topics=new ArrayList<Course>();
		topicRepository.findAll()
				.forEach(topics::add);
		
		return topics;
	}
	
	public Course getTopic(String id)
	{
//		 for(Topic z : topics)
//		{
//			if(z.getId().equals(id))
//				return z;
//		}
//		return null;
		
		return topicRepository.findOne(id);
				
		
	}
	
	public void addTopic(Course topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(Course topic,String id)
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
	
	public void deleteTopic(Course topic,String id)
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
