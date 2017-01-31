package io.javabrains.springbootstarter.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	CourseService topicService;
	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
	
	@RequestMapping("/topics")
	public List<Course> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Course getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Course topic)
	{
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Course topic,@PathVariable String id)
	{
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@RequestBody Course topic,@PathVariable String id)
	{
		topicService.deleteTopic(topic, id);
	}
	

}
