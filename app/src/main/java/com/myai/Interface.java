package com.myai;

public class Interface {
  private Brain brain;
  private Memory memory;
  private Tokenization tokenization;
  private Lemmatization lemmatization;
  private NER ner;

  public Interface(Brain brain, Memory memory) {
    this.brain = brain;
    this.memory = memory;
    this.tokenization = new Tokenization();
    this.lemmatization = new Lemmatization();
    this.ner = new NER();
  }

  public String getResponse(String input) {
    String[] tokens = tokenization.tokenize(input);
    String[] lemmas = lemmatization.lemmatize(tokens);
    String entities = ner.extractEntities(input);

    String response = brain.makeDecision(input);
    response += "\n" + brain.solveProblem(input);
    response += "\nTokens: " + java.util.Arrays.toString(tokens);
    response += "\nLemmas: " + java.util.Arrays.toString(lemmas);
    response += "\nEntities: " + entities;

    memory.storeData(input);
    return response;
  }

  public String processWithML(String input) {
    String treeResult = brain.analyzeWithDecisionTree(input);
    String forestResult = brain.analyzeWithRandomForest(input);
    String svmResult = brain.analyzeWithSVM(input);

    return "DecisionTree: " + treeResult + "\nRandomForest: " + forestResult + "\nSVM: " + svmResult;
  }
}
