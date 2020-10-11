package aop.annotation;

import org.springframework.stereotype.Component;

@Component("personDaoAOPAnno")
public class PersonDaoImpl implements PersonDao{
	@Override
	public String save() {
		System.out.println("save");
		return "保存成功";
	}
}
