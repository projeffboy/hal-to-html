/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.hal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.hal.hal.Action;
import org.xtext.example.hal.hal.Command;
import org.xtext.example.hal.hal.Device;
import org.xtext.example.hal.hal.HalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hal.hal.impl.ActionImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link org.xtext.example.hal.hal.impl.ActionImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuator()
   * @generated
   * @ordered
   */
  protected Device actuator;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected Command command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HalPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device getActuator()
  {
    if (actuator != null && actuator.eIsProxy())
    {
      InternalEObject oldActuator = (InternalEObject)actuator;
      actuator = (Device)eResolveProxy(oldActuator);
      if (actuator != oldActuator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTION__ACTUATOR, oldActuator, actuator));
      }
    }
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device basicGetActuator()
  {
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setActuator(Device newActuator)
  {
    Device oldActuator = actuator;
    actuator = newActuator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__ACTUATOR, oldActuator, actuator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command getCommand()
  {
    if (command != null && command.eIsProxy())
    {
      InternalEObject oldCommand = (InternalEObject)command;
      command = (Command)eResolveProxy(oldCommand);
      if (command != oldCommand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTION__COMMAND, oldCommand, command));
      }
    }
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommand(Command newCommand)
  {
    Command oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTION__COMMAND, oldCommand, command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HalPackage.ACTION__ACTUATOR:
        if (resolve) return getActuator();
        return basicGetActuator();
      case HalPackage.ACTION__COMMAND:
        if (resolve) return getCommand();
        return basicGetCommand();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HalPackage.ACTION__ACTUATOR:
        setActuator((Device)newValue);
        return;
      case HalPackage.ACTION__COMMAND:
        setCommand((Command)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HalPackage.ACTION__ACTUATOR:
        setActuator((Device)null);
        return;
      case HalPackage.ACTION__COMMAND:
        setCommand((Command)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HalPackage.ACTION__ACTUATOR:
        return actuator != null;
      case HalPackage.ACTION__COMMAND:
        return command != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
