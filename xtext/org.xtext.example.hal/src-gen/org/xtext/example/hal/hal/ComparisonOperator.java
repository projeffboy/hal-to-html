/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.hal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.hal.hal.HalPackage#getComparisonOperator()
 * @model
 * @generated
 */
public enum ComparisonOperator implements Enumerator
{
  /**
   * The '<em><b>EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(0, "EQUAL", "="),

  /**
   * The '<em><b>GREATERTHAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATERTHAN_VALUE
   * @generated
   * @ordered
   */
  GREATERTHAN(1, "GREATERTHAN", ">"),

  /**
   * The '<em><b>GREATERTHANOREQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATERTHANOREQUAL_VALUE
   * @generated
   * @ordered
   */
  GREATERTHANOREQUAL(2, "GREATERTHANOREQUAL", ">="),

  /**
   * The '<em><b>LESSTHAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSTHAN_VALUE
   * @generated
   * @ordered
   */
  LESSTHAN(3, "LESSTHAN", "<"),

  /**
   * The '<em><b>LESSTHANOREQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSTHANOREQUAL_VALUE
   * @generated
   * @ordered
   */
  LESSTHANOREQUAL(4, "LESSTHANOREQUAL", "<="),

  /**
   * The '<em><b>NOTEQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTEQUAL_VALUE
   * @generated
   * @ordered
   */
  NOTEQUAL(5, "NOTEQUAL", "!=");

  /**
   * The '<em><b>EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model literal="="
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 0;

  /**
   * The '<em><b>GREATERTHAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATERTHAN
   * @model literal="&gt;"
   * @generated
   * @ordered
   */
  public static final int GREATERTHAN_VALUE = 1;

  /**
   * The '<em><b>GREATERTHANOREQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATERTHANOREQUAL
   * @model literal="&gt;="
   * @generated
   * @ordered
   */
  public static final int GREATERTHANOREQUAL_VALUE = 2;

  /**
   * The '<em><b>LESSTHAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSTHAN
   * @model literal="&lt;"
   * @generated
   * @ordered
   */
  public static final int LESSTHAN_VALUE = 3;

  /**
   * The '<em><b>LESSTHANOREQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESSTHANOREQUAL
   * @model literal="&lt;="
   * @generated
   * @ordered
   */
  public static final int LESSTHANOREQUAL_VALUE = 4;

  /**
   * The '<em><b>NOTEQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTEQUAL
   * @model literal="!="
   * @generated
   * @ordered
   */
  public static final int NOTEQUAL_VALUE = 5;

  /**
   * An array of all the '<em><b>Comparison Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ComparisonOperator[] VALUES_ARRAY =
    new ComparisonOperator[]
    {
      EQUAL,
      GREATERTHAN,
      GREATERTHANOREQUAL,
      LESSTHAN,
      LESSTHANOREQUAL,
      NOTEQUAL,
    };

  /**
   * A public read-only list of all the '<em><b>Comparison Operator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ComparisonOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComparisonOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ComparisonOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparison Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ComparisonOperator get(int value)
  {
    switch (value)
    {
      case EQUAL_VALUE: return EQUAL;
      case GREATERTHAN_VALUE: return GREATERTHAN;
      case GREATERTHANOREQUAL_VALUE: return GREATERTHANOREQUAL;
      case LESSTHAN_VALUE: return LESSTHAN;
      case LESSTHANOREQUAL_VALUE: return LESSTHANOREQUAL;
      case NOTEQUAL_VALUE: return NOTEQUAL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ComparisonOperator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ComparisonOperator
