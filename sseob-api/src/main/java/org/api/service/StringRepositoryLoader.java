package org.api.service;

import org.domain.service.StringRepository;

import java.util.ServiceLoader;

public class StringRepositoryLoader {
  
  private static final String DEFAULT_REPOSITORY_NAME = "org.domain.service.DatabaseStringRepository";
  
  public static StringRepository getDefault() {
    return getRepository(DEFAULT_REPOSITORY_NAME);
  }
  
  public static StringRepository getRepository(String name) {

    for (StringRepository stringRepository : ServiceLoader.load(StringRepository.class)) {
      if (stringRepository.getClass().getName().contains(name)) {
        return stringRepository;
      }
    }
    
    throw new IllegalArgumentException("일치하는 StringRepository가 없습니다. : " + name);
  
  }
  
  
}
