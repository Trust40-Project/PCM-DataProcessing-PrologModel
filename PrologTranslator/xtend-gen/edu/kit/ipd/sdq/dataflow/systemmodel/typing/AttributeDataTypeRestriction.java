package edu.kit.ipd.sdq.dataflow.systemmodel.typing;

import edu.kit.ipd.sdq.dataflow.systemmodel.Attribute;
import edu.kit.ipd.sdq.dataflow.systemmodel.Blackboard;
import edu.kit.ipd.sdq.dataflow.systemmodel.DataType;
import edu.kit.ipd.sdq.dataflow.systemmodel.typing.AttributeRestriction;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Restriction that an unbound Attribute-Variable in an assignment rule must be part of a DataType.
 */
@Data
@SuppressWarnings("all")
public class AttributeDataTypeRestriction implements AttributeRestriction {
  private final DataType requiredContainingDataType;
  
  @Override
  public boolean doesAttributeMatch(final Blackboard bb, final Attribute attribute) {
    return bb.getDataTypeAttributes(this.requiredContainingDataType).contains(attribute);
  }
  
  public AttributeDataTypeRestriction(final DataType requiredContainingDataType) {
    super();
    this.requiredContainingDataType = requiredContainingDataType;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.requiredContainingDataType== null) ? 0 : this.requiredContainingDataType.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AttributeDataTypeRestriction other = (AttributeDataTypeRestriction) obj;
    if (this.requiredContainingDataType == null) {
      if (other.requiredContainingDataType != null)
        return false;
    } else if (!this.requiredContainingDataType.equals(other.requiredContainingDataType))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("requiredContainingDataType", this.requiredContainingDataType);
    return b.toString();
  }
  
  @Pure
  public DataType getRequiredContainingDataType() {
    return this.requiredContainingDataType;
  }
}
