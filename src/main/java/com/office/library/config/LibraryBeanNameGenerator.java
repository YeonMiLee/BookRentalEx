package com.office.library.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class LibraryBeanNameGenerator implements BeanNameGenerator {
	
	/*
	 * user와 admin의 book패키지 = controller/dao/service의 같은 빈네임 충돌 해결방법
	 *  -> BeanNameGenerator 이용하기 / servlet-context 에 base-package에도 추가 해주어야함
	 */
	

	@Override
	public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
		System.out.println(definition.getBeanClassName());
		
		return definition.getBeanClassName();
	}

}
