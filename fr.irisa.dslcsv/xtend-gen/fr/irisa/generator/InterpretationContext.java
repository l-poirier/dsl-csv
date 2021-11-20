package fr.irisa.generator;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class InterpretationContext {
  public String stdout = "";
  
  public String stderr = "";
  
  public Map<String, Object> variables = new HashMap<String, Object>();
}
