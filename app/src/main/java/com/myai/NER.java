package com.myai;

public class NER {
  public String extractEntities(String input) {
    StringBuilder entities = new StringBuilder();
    String[] words = input.split("\\s+");
    for (String word : words) {
      if (isNamedEntity(word)) {
        entities.append(word).append(" ");
      }
    }
    return entities.toString().trim();
  }

  private boolean isNamedEntity(String word) {
    return Character.isUpperCase(word.charAt(0));
  }
}
