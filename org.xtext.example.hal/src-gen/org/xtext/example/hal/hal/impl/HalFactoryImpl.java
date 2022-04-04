/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.hal.hal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.hal.hal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HalFactoryImpl extends EFactoryImpl implements HalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HalFactory init()
  {
    try
    {
      HalFactory theHalFactory = (HalFactory)EPackage.Registry.INSTANCE.getEFactory(HalPackage.eNS_URI);
      if (theHalFactory != null)
      {
        return theHalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HalFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HalPackage.HAL: return createHAL();
      case HalPackage.DEVICE_TYPE: return createDeviceType();
      case HalPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case HalPackage.ROOM: return createRoom();
      case HalPackage.AUTOMATION_RULE: return createAutomationRule();
      case HalPackage.SENSOR_ENTRY: return createSensorEntry();
      case HalPackage.DEVICE: return createDevice();
      case HalPackage.ACTION: return createAction();
      case HalPackage.ATOMIC_RELATIONAL_TERM: return createAtomicRelationalTerm();
      case HalPackage.COMPOUND_RELATIONAL_TERM: return createCompoundRelationalTerm();
      case HalPackage.COMMAND: return createCommand();
      case HalPackage.SENSOR: return createSensor();
      case HalPackage.ACTUATOR: return createActuator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HalPackage.COMPARISON_OPERATOR:
        return createComparisonOperatorFromString(eDataType, initialValue);
      case HalPackage.BOOLEAN_OPERATOR:
        return createBooleanOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HalPackage.COMPARISON_OPERATOR:
        return convertComparisonOperatorToString(eDataType, instanceValue);
      case HalPackage.BOOLEAN_OPERATOR:
        return convertBooleanOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HAL createHAL()
  {
    HALImpl hal = new HALImpl();
    return hal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceType createDeviceType()
  {
    DeviceTypeImpl deviceType = new DeviceTypeImpl();
    return deviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Room createRoom()
  {
    RoomImpl room = new RoomImpl();
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AutomationRule createAutomationRule()
  {
    AutomationRuleImpl automationRule = new AutomationRuleImpl();
    return automationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorEntry createSensorEntry()
  {
    SensorEntryImpl sensorEntry = new SensorEntryImpl();
    return sensorEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicRelationalTerm createAtomicRelationalTerm()
  {
    AtomicRelationalTermImpl atomicRelationalTerm = new AtomicRelationalTermImpl();
    return atomicRelationalTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompoundRelationalTerm createCompoundRelationalTerm()
  {
    CompoundRelationalTermImpl compoundRelationalTerm = new CompoundRelationalTermImpl();
    return compoundRelationalTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actuator createActuator()
  {
    ActuatorImpl actuator = new ActuatorImpl();
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue)
  {
    ComparisonOperator result = ComparisonOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue)
  {
    BooleanOperator result = BooleanOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HalPackage getHalPackage()
  {
    return (HalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HalPackage getPackage()
  {
    return HalPackage.eINSTANCE;
  }

} //HalFactoryImpl
