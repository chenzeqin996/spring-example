package di.constructor;

import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

public class Person {
	private Long pid;
	private String pname;
	private Student student;
	private Set sets;
	private List lists;
	private Map map;
	private Properties properties;
	
	public Person(String pname,Student student){
		this.pname = pname;
		this.student = student;
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Set getSets() {
		return sets;
	}
	public void setSets(Set sets) {
		this.sets = sets;
	}
	public List getLists() {
		return lists;
	}
	public void setLists(List lists) {
		this.lists = lists;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
