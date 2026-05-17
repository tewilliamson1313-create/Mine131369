package com.myai;

public class Tokenization {
  public String[] tokenize(String input) {
    return input.split("\\s+");
  }

  public String detokenize(String[] tokens) {
    return String.join(" ", tokens);
  }
}
