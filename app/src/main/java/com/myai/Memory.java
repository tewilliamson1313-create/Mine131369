package com.myai;

public class Memory {
  private String[] data;
  private int index;

  public Memory() {
    data = new String[100];
    index = 0;
  }

  public void storeData(String input) {
    if (index < data.length) {
      data[index++] = input;
    }
  }

  public String retrieveData(String query) {
    return "Retrieved: " + query;
  }

  public String[] getAllData() {
    String[] result = new String[index];
    System.arraycopy(data, 0, result, 0, index);
    return result;
  }

  public void clearMemory() {
    data = new String[100];
    index = 0;
  }
}
