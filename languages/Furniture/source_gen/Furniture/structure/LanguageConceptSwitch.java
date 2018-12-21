package Furniture.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Component = 0;
  public static final int Garage_Project = 1;
  public static final int Project_Component = 2;
  public static final int Text_Line = 3;
  public static final int Warehouse = 4;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xba1c46a5482045d5L, 0x9b2c6521c394c581L);
    builder.put(0x61a1f56ddc201198L, Component);
    builder.put(0x5418fa6ab58180f0L, Garage_Project);
    builder.put(0x5418fa6ab5818106L, Project_Component);
    builder.put(0x5418fa6ab58180f6L, Text_Line);
    builder.put(0x61a1f56ddc201179L, Warehouse);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}