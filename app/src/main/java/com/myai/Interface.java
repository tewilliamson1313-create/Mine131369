package com.myai;

public class Interface {
  private Brain brain;
  private Memory memory;

  public Interface(Brain brain, Memory memory) {
    this.brain = brain;
    this.memory = memory;
  }

  public String getResponse(String input) {
    String response = brain.makeDecision(input);
    response += "\n" + brain.solveProblem(input);
    memory.storeData(input);
    return response;
  }
}
