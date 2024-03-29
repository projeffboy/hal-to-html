/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hal.hal.Room#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.hal.hal.Room#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.example.hal.hal.Room#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.example.hal.hal.Room#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.hal.hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.hal.hal.HalPackage#getRoom_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.hal.hal.Room#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(float)
   * @see org.xtext.example.hal.hal.HalPackage#getRoom_Length()
   * @model
   * @generated
   */
  float getLength();

  /**
   * Sets the value of the '{@link org.xtext.example.hal.hal.Room#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(float value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(float)
   * @see org.xtext.example.hal.hal.HalPackage#getRoom_Width()
   * @model
   * @generated
   */
  float getWidth();

  /**
   * Sets the value of the '{@link org.xtext.example.hal.hal.Room#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(float value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.hal.hal.Device}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see org.xtext.example.hal.hal.HalPackage#getRoom_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

} // Room
