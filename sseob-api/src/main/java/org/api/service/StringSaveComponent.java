package org.api.service;

import org.domain.service.StringRepository;

public class StringSaveComponent {
  
  private final StringRepository stringRepository = StringRepositoryLoader.getDefault();
  
  public void save(String string) {
    stringRepository.save(string);
  }
  
}
