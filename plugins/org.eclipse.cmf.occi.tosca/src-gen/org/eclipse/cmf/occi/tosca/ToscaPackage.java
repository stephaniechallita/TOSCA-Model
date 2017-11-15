/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.tosca;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.tosca.ToscaFactory
 * @model kind="package"
 * @generated
 */
public interface ToscaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tosca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.occi/tosca/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tosca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaPackage eINSTANCE = org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayStringImpl <em>array String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayStringImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayString()
	 * @generated
	 */
	int ARRAY_STRING = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRING__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayBooleanImpl <em>array Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayBooleanImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayBoolean()
	 * @generated
	 */
	int ARRAY_BOOLEAN = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOOLEAN__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOOLEAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BOOLEAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayByteImpl <em>array Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayByteImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayByte()
	 * @generated
	 */
	int ARRAY_BYTE = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BYTE__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BYTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_BYTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayDoubleImpl <em>array Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayDoubleImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayDouble()
	 * @generated
	 */
	int ARRAY_DOUBLE = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DOUBLE__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DOUBLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DOUBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayFloatImpl <em>array Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayFloatImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayFloat()
	 * @generated
	 */
	int ARRAY_FLOAT = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FLOAT__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FLOAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FLOAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayIntegerImpl <em>array Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayIntegerImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayInteger()
	 * @generated
	 */
	int ARRAY_INTEGER = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INTEGER__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INTEGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INTEGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayLongImpl <em>array Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayLongImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayLong()
	 * @generated
	 */
	int ARRAY_LONG = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LONG__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LONG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LONG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayShortImpl <em>array Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.arrayShortImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayShort()
	 * @generated
	 */
	int ARRAY_SHORT = 7;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SHORT__VALUES = 0;

	/**
	 * The number of structural features of the '<em>array Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SHORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>array Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SHORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl <em>toscadatatypesnetwork Network Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkNetworkInfo()
	 * @generated
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO = 8;

	/**
	 * The feature id for the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID = 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES = 1;

	/**
	 * The feature id for the '<em><b>Networkname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME = 2;

	/**
	 * The number of structural features of the '<em>toscadatatypesnetwork Network Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>toscadatatypesnetwork Network Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_NETWORK_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortInfoImpl <em>toscadatatypesnetwork Port Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortInfoImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO = 9;

	/**
	 * The feature id for the '<em><b>Portname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO__PORTNAME = 0;

	/**
	 * The feature id for the '<em><b>Networkid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO__NETWORKID = 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO__ADDRESSES = 2;

	/**
	 * The feature id for the '<em><b>Macaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO__MACADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Portid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO__PORTID = 4;

	/**
	 * The number of structural features of the '<em>toscadatatypesnetwork Port Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>toscadatatypesnetwork Port Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesCredentialImpl <em>toscadatatypes Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesCredentialImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesCredential()
	 * @generated
	 */
	int TOSCADATATYPES_CREDENTIAL = 10;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL__KEYS = 1;

	/**
	 * The feature id for the '<em><b>Tokentype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL__TOKENTYPE = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL__USER = 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL__TOKEN = 4;

	/**
	 * The number of structural features of the '<em>toscadatatypes Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>toscadatatypes Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPES_CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortSpecImpl <em>toscadatatypesnetwork Port Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortSpecImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC = 11;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Targetrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC__TARGETRANGE = 1;

	/**
	 * The feature id for the '<em><b>Sourcerange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC__SOURCERANGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC__TARGET = 4;

	/**
	 * The number of structural features of the '<em>toscadatatypesnetwork Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>toscadatatypesnetwork Port Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCADATATYPESNETWORK_PORT_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_rootImpl <em>Tosca capabilities root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_root()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_nodeImpl <em>Tosca capabilities node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_nodeImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_node()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_NODE = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NODE_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpointImpl <em>Tosca capabilities endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpointImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__INITIATOR = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__SECURE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__PORTS = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT__URL_PATH = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_scalableImpl <em>Tosca capabilities scalable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_scalableImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_scalable()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_SCALABLE = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca capabilities scalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca capabilities scalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_SCALABLE_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_network_bindableImpl <em>Tosca capabilities network bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_network_bindableImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_network_bindable()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__MIXIN = TOSCA_CAPABILITIES_NODE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__ENTITY = TOSCA_CAPABILITIES_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE__ATTRIBUTES = TOSCA_CAPABILITIES_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities network bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE_FEATURE_COUNT = TOSCA_CAPABILITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities network bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_NETWORK_BINDABLE_OPERATION_COUNT = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl <em>Tosca capabilities container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_container()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_CONTAINER = 17;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tosca capabilities container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tosca capabilities container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_CONTAINER_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_databaseImpl <em>Tosca capabilities endpoint database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_databaseImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_database()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE = 18;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_DATABASE_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl <em>Tosca capabilities endpoint public</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC = 19;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The feature id for the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint public</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_PUBLIC_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_adminImpl <em>Tosca capabilities endpoint admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_adminImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_admin()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN = 20;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__MIXIN = TOSCA_CAPABILITIES_ENDPOINT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__ENTITY = TOSCA_CAPABILITIES_ENDPOINT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__ATTRIBUTES = TOSCA_CAPABILITIES_ENDPOINT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORT_NAME = TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PROTOCOL = TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORT = TOSCA_CAPABILITIES_ENDPOINT__PORT;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__INITIATOR = TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__NETWORK_NAME = TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__SECURE = TOSCA_CAPABILITIES_ENDPOINT__SECURE;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__PORTS = TOSCA_CAPABILITIES_ENDPOINT__PORTS;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN__URL_PATH = TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;

	/**
	 * The number of structural features of the '<em>Tosca capabilities endpoint admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN_FEATURE_COUNT = TOSCA_CAPABILITIES_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities endpoint admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ENDPOINT_ADMIN_OPERATION_COUNT = TOSCA_CAPABILITIES_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_operatingsystemImpl <em>Tosca capabilities operatingsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_operatingsystemImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM = 21;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM__ARCHITECTURE = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tosca capabilities operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tosca capabilities operatingsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_OPERATINGSYSTEM_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_attachmentImpl <em>Tosca capabilities attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_attachmentImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_attachment()
	 * @generated
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT = 22;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__MIXIN = TOSCA_CAPABILITIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__ENTITY = TOSCA_CAPABILITIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT__ATTRIBUTES = TOSCA_CAPABILITIES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca capabilities attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT_FEATURE_COUNT = TOSCA_CAPABILITIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca capabilities attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_CAPABILITIES_ATTACHMENT_OPERATION_COUNT = TOSCA_CAPABILITIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl <em>Tosca nodes root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_root()
	 * @generated
	 */
	int TOSCA_NODES_ROOT = 23;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__MIXIN = TOSCA_CAPABILITIES_NODE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__ENTITY = TOSCA_CAPABILITIES_NODE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT__ATTRIBUTES = TOSCA_CAPABILITIES_NODE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT_FEATURE_COUNT = TOSCA_CAPABILITIES_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___CREATE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___CONFIGURE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___DELETE = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca nodes root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_ROOT_OPERATION_COUNT = TOSCA_CAPABILITIES_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl <em>Tosca nodes webapplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_webapplication()
	 * @generated
	 */
	int TOSCA_NODES_WEBAPPLICATION = 24;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Context Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tosca nodes webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes webapplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBAPPLICATION_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl <em>Tosca nodes softwarecomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT = 25;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tosca nodes softwarecomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes softwarecomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_dbmsImpl <em>Tosca nodes dbms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_dbmsImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_dbms()
	 * @generated
	 */
	int TOSCA_NODES_DBMS = 26;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__NUM_CPUS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__CPU_FREQUENCY = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__MEM_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS__ROOT_PASSWORD = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tosca nodes dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Database</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes dbms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DBMS_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl <em>Tosca nodes objectstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_objectstorage()
	 * @generated
	 */
	int TOSCA_NODES_OBJECTSTORAGE = 27;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE__NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Tosca nodes objectstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes objectstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_OBJECTSTORAGE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl <em>Tosca nodes compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_compute()
	 * @generated
	 */
	int TOSCA_NODES_COMPUTE = 28;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MIN_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MAX_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DEFAULT_INSTANCES = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__TYPE = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DISTRIBUTION = TOSCA_NODES_ROOT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__VERSION = TOSCA_NODES_ROOT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__ARCHITECTURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__NUM_CPUS = TOSCA_NODES_ROOT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__DISK_SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__CPU_FREQUENCY = TOSCA_NODES_ROOT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__MEM_SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Private Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS = TOSCA_NODES_ROOT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS = TOSCA_NODES_ROOT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE__NETWORKS = TOSCA_NODES_ROOT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Tosca nodes compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Source Must Be Software Component</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca nodes compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_COMPUTE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl <em>Tosca nodes loadbalancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_loadbalancer()
	 * @generated
	 */
	int TOSCA_NODES_LOADBALANCER = 29;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Floating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__FLOATING = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__DNS_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER__ALGORITHM = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tosca nodes loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes loadbalancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_LOADBALANCER_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webserverImpl <em>Tosca nodes webserver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webserverImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_webserver()
	 * @generated
	 */
	int TOSCA_NODES_WEBSERVER = 30;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORT_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PROTOCOL = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__INITIATOR = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__NETWORK_NAME = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__SECURE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__PORTS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__URL_PATH = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__NUM_CPUS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__CPU_FREQUENCY = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER__MEM_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Tosca nodes webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Web Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes webserver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_WEBSERVER_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_databaseImpl <em>Tosca nodes database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_databaseImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_database()
	 * @generated
	 */
	int TOSCA_NODES_DATABASE = 31;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORT_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PROTOCOL = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORT = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__INITIATOR = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__NETWORK_NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Secure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__SECURE = TOSCA_NODES_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PORTS = TOSCA_NODES_ROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__URL_PATH = TOSCA_NODES_ROOT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__PASSWORD = TOSCA_NODES_ROOT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__NAME = TOSCA_NODES_ROOT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE__USER = TOSCA_NODES_ROOT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Tosca nodes database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_DATABASE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_applicationImpl <em>Tosca nodes container application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_applicationImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_container_application()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION = 32;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca nodes container application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes container application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_APPLICATION_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl <em>Tosca nodes container runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_container_runtime()
	 * @generated
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME = 33;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MIXIN = TOSCA_NODES_SOFTWARECOMPONENT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ENTITY = TOSCA_NODES_SOFTWARECOMPONENT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ATTRIBUTES = TOSCA_NODES_SOFTWARECOMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Admin Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__ADMIN_CREDENTIAL = TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__COMPONENT_VERSION = TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MIN_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MAX_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__DEFAULT_INSTANCES = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__NUM_CPUS = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__DISK_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__CPU_FREQUENCY = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME__MEM_SIZE = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tosca nodes container runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME_FEATURE_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___CREATE = TOSCA_NODES_SOFTWARECOMPONENT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___CONFIGURE = TOSCA_NODES_SOFTWARECOMPONENT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___DELETE = TOSCA_NODES_SOFTWARECOMPONENT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca nodes container runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_CONTAINER_RUNTIME_OPERATION_COUNT = TOSCA_NODES_SOFTWARECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_blockstorageImpl <em>Tosca nodes blockstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_blockstorageImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_blockstorage()
	 * @generated
	 */
	int TOSCA_NODES_BLOCKSTORAGE = 34;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__MIXIN = TOSCA_NODES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__ENTITY = TOSCA_NODES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__ATTRIBUTES = TOSCA_NODES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__SIZE = TOSCA_NODES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID = TOSCA_NODES_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Snapshot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID = TOSCA_NODES_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca nodes blockstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE_FEATURE_COUNT = TOSCA_NODES_ROOT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___CREATE = TOSCA_NODES_ROOT___CREATE;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___CONFIGURE = TOSCA_NODES_ROOT___CONFIGURE;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___DELETE = TOSCA_NODES_ROOT___DELETE;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_NODES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca nodes blockstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_NODES_BLOCKSTORAGE_OPERATION_COUNT = TOSCA_NODES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_rootImpl <em>Tosca policies root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_root()
	 * @generated
	 */
	int TOSCA_POLICIES_ROOT = 35;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__MIXIN = SlaPackage.AGREEMENT_TERM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__ENTITY = SlaPackage.AGREEMENT_TERM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__ATTRIBUTES = SlaPackage.AGREEMENT_TERM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT_FEATURE_COUNT = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_ROOT_OPERATION_COUNT = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_updateImpl <em>Tosca policies update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_updateImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_update()
	 * @generated
	 */
	int TOSCA_POLICIES_UPDATE = 36;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_UPDATE_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_placementImpl <em>Tosca policies placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_placementImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_placement()
	 * @generated
	 */
	int TOSCA_POLICIES_PLACEMENT = 37;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PLACEMENT_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_scalingImpl <em>Tosca policies scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_scalingImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_scaling()
	 * @generated
	 */
	int TOSCA_POLICIES_SCALING = 38;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_SCALING_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_performanceImpl <em>Tosca policies performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_performanceImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_performance()
	 * @generated
	 */
	int TOSCA_POLICIES_PERFORMANCE = 39;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__MIXIN = TOSCA_POLICIES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__ENTITY = TOSCA_POLICIES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__ATTRIBUTES = TOSCA_POLICIES_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_TYPE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_STATE = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_DESC = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE__OCCI_AGREEMENT_TERM_REMEDY = TOSCA_POLICIES_ROOT__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The number of structural features of the '<em>Tosca policies performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE_FEATURE_COUNT = TOSCA_POLICIES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca policies performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_POLICIES_PERFORMANCE_OPERATION_COUNT = TOSCA_POLICIES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_groups_rootImpl <em>Tosca groups root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_groups_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_groups_root()
	 * @generated
	 */
	int TOSCA_GROUPS_ROOT = 40;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca groups root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca groups root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_GROUPS_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_rootImpl <em>Tosca interfaces root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_root()
	 * @generated
	 */
	int TOSCA_INTERFACES_ROOT = 41;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca interfaces root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_relationship_configureImpl <em>Tosca interfaces relationship configure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_relationship_configureImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_relationship_configure()
	 * @generated
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE = 42;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__MIXIN = TOSCA_INTERFACES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__ENTITY = TOSCA_INTERFACES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE__ATTRIBUTES = TOSCA_INTERFACES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces relationship configure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE_FEATURE_COUNT = TOSCA_INTERFACES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Pre configure source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Pre configure target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Post configure source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Post configure target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Target changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tosca interfaces relationship configure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE_OPERATION_COUNT = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_node_lifecycle_standardImpl <em>Tosca interfaces node lifecycle standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_node_lifecycle_standardImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_node_lifecycle_standard()
	 * @generated
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD = 43;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__MIXIN = TOSCA_INTERFACES_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__ENTITY = TOSCA_INTERFACES_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD__ATTRIBUTES = TOSCA_INTERFACES_ROOT__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Tosca interfaces node lifecycle standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD_FEATURE_COUNT = TOSCA_INTERFACES_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tosca interfaces node lifecycle standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD_OPERATION_COUNT = TOSCA_INTERFACES_ROOT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_rootImpl <em>Tosca relationships root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_rootImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_root()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ROOT = 44;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tosca relationships root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_connectstoImpl <em>Tosca relationships connectsto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_connectstoImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_connectsto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO = 45;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca relationships connectsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Tosca relationships connectsto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_routestoImpl <em>Tosca relationships routesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_routestoImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_routesto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO = 46;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__MIXIN = TOSCA_RELATIONSHIPS_CONNECTSTO__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__ENTITY = TOSCA_RELATIONSHIPS_CONNECTSTO__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_CONNECTSTO__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__STATE = TOSCA_RELATIONSHIPS_CONNECTSTO__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__TOSCA_ID = TOSCA_RELATIONSHIPS_CONNECTSTO__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO__CREDENTIAL = TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL;

	/**
	 * The number of structural features of the '<em>Tosca relationships routesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_CONNECTSTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_CONNECTSTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Load Balancer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO___SOURCE_MUST_BE_LOAD_BALANCER__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships routesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ROUTESTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_CONNECTSTO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_attachestoImpl <em>Tosca relationships attachesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_attachestoImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_attachesto()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO = 47;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tosca relationships attachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Compute And Target Must Be Block Storage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO___SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tosca relationships attachesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_ATTACHESTO_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_hostedonImpl <em>Tosca relationships hostedon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_hostedonImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_hostedon()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON = 48;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships hostedon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Web Server And Target Must Be Web Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Source Must Be Container Application And Target Must Be Container Runtime</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Source Must Be Software Component And Target Must Be Compute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Source Must Be Database And Target Must Be DBMS</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tosca relationships hostedon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_HOSTEDON_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_dependsonImpl <em>Tosca relationships dependson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_dependsonImpl
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_dependson()
	 * @generated
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON = 49;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__MIXIN = TOSCA_RELATIONSHIPS_ROOT__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__ENTITY = TOSCA_RELATIONSHIPS_ROOT__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__ATTRIBUTES = TOSCA_RELATIONSHIPS_ROOT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Tosca Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_NAME = TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__STATE = TOSCA_RELATIONSHIPS_ROOT__STATE;

	/**
	 * The feature id for the '<em><b>Tosca Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON__TOSCA_ID = TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID;

	/**
	 * The number of structural features of the '<em>Tosca relationships dependson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON_FEATURE_COUNT = TOSCA_RELATIONSHIPS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Source Must Be Node And Target Must Be Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON___SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE__DIAGNOSTICCHAIN_MAP = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tosca relationships dependson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOSCA_RELATIONSHIPS_DEPENDSON_OPERATION_COUNT = TOSCA_RELATIONSHIPS_ROOT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.protocolEnum <em>protocol Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.protocolEnum
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getprotocolEnum()
	 * @generated
	 */
	int PROTOCOL_ENUM = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.tosca.initiatorEnum <em>initiator Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.tosca.initiatorEnum
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getinitiatorEnum()
	 * @generated
	 */
	int INITIATOR_ENUM = 51;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 52;

	/**
	 * The meta object id for the '<em>string Min One</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getstringMinOne()
	 * @generated
	 */
	int STRING_MIN_ONE = 53;

	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 54;

	/**
	 * The meta object id for the '<em>byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getbyte()
	 * @generated
	 */
	int BYTE = 55;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 56;

	/**
	 * The meta object id for the '<em>float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getfloat()
	 * @generated
	 */
	int FLOAT = 57;

	/**
	 * The meta object id for the '<em>integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getinteger()
	 * @generated
	 */
	int INTEGER = 58;

	/**
	 * The meta object id for the '<em>integer Min One</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getintegerMinOne()
	 * @generated
	 */
	int INTEGER_MIN_ONE = 59;

	/**
	 * The meta object id for the '<em>long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getlong()
	 * @generated
	 */
	int LONG = 60;

	/**
	 * The meta object id for the '<em>short</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getshort()
	 * @generated
	 */
	int SHORT = 61;

	/**
	 * The meta object id for the '<em>map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getmap()
	 * @generated
	 */
	int MAP = 62;

	/**
	 * The meta object id for the '<em>version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getversion()
	 * @generated
	 */
	int VERSION = 63;

	/**
	 * The meta object id for the '<em>range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getrange()
	 * @generated
	 */
	int RANGE = 64;

	/**
	 * The meta object id for the '<em>toscadatatypesnetwork Port Def</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortDef()
	 * @generated
	 */
	int TOSCADATATYPESNETWORK_PORT_DEF = 65;

	/**
	 * The meta object id for the '<em>scalar Frequency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarFrequency()
	 * @generated
	 */
	int SCALAR_FREQUENCY = 66;

	/**
	 * The meta object id for the '<em>scalar Size Min One MB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinOneMB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ONE_MB = 67;

	/**
	 * The meta object id for the '<em>scalar Size Min Zero GB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinZeroGB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ZERO_GB = 68;

	/**
	 * The meta object id for the '<em>scalar Size Min Zero MB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinZeroMB()
	 * @generated
	 */
	int SCALAR_SIZE_MIN_ZERO_MB = 69;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayString <em>array String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array String</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayString
	 * @generated
	 */
	EClass getarrayString();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayString#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayString#getValues()
	 * @see #getarrayString()
	 * @generated
	 */
	EAttribute getarrayString_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayBoolean <em>array Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Boolean</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayBoolean
	 * @generated
	 */
	EClass getarrayBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayBoolean#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayBoolean#getValues()
	 * @see #getarrayBoolean()
	 * @generated
	 */
	EAttribute getarrayBoolean_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayByte <em>array Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Byte</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayByte
	 * @generated
	 */
	EClass getarrayByte();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayByte#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayByte#getValues()
	 * @see #getarrayByte()
	 * @generated
	 */
	EAttribute getarrayByte_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayDouble <em>array Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Double</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayDouble
	 * @generated
	 */
	EClass getarrayDouble();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayDouble#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayDouble#getValues()
	 * @see #getarrayDouble()
	 * @generated
	 */
	EAttribute getarrayDouble_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayFloat <em>array Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Float</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayFloat
	 * @generated
	 */
	EClass getarrayFloat();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayFloat#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayFloat#getValues()
	 * @see #getarrayFloat()
	 * @generated
	 */
	EAttribute getarrayFloat_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayInteger <em>array Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Integer</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayInteger
	 * @generated
	 */
	EClass getarrayInteger();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayInteger#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayInteger#getValues()
	 * @see #getarrayInteger()
	 * @generated
	 */
	EAttribute getarrayInteger_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayLong <em>array Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Long</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayLong
	 * @generated
	 */
	EClass getarrayLong();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayLong#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayLong#getValues()
	 * @see #getarrayLong()
	 * @generated
	 */
	EAttribute getarrayLong_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.arrayShort <em>array Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>array Short</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayShort
	 * @generated
	 */
	EClass getarrayShort();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.cmf.occi.tosca.arrayShort#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.eclipse.cmf.occi.tosca.arrayShort#getValues()
	 * @see #getarrayShort()
	 * @generated
	 */
	EAttribute getarrayShort_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo <em>toscadatatypesnetwork Network Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>toscadatatypesnetwork Network Info</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo
	 * @generated
	 */
	EClass gettoscadatatypesnetworkNetworkInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getNetworkid <em>Networkid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkid</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getNetworkid()
	 * @see #gettoscadatatypesnetworkNetworkInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkNetworkInfo_Networkid();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getAddresses()
	 * @see #gettoscadatatypesnetworkNetworkInfo()
	 * @generated
	 */
	EReference gettoscadatatypesnetworkNetworkInfo_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getNetworkname <em>Networkname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkname</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkNetworkInfo#getNetworkname()
	 * @see #gettoscadatatypesnetworkNetworkInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkNetworkInfo_Networkname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo <em>toscadatatypesnetwork Port Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>toscadatatypesnetwork Port Info</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo
	 * @generated
	 */
	EClass gettoscadatatypesnetworkPortInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getPortname <em>Portname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portname</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getPortname()
	 * @see #gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortInfo_Portname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getNetworkid <em>Networkid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networkid</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getNetworkid()
	 * @see #gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortInfo_Networkid();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addresses</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getAddresses()
	 * @see #gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	EReference gettoscadatatypesnetworkPortInfo_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getMacaddress <em>Macaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macaddress</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getMacaddress()
	 * @see #gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortInfo_Macaddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getPortid <em>Portid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portid</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortInfo#getPortid()
	 * @see #gettoscadatatypesnetworkPortInfo()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortInfo_Portid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential <em>toscadatatypes Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>toscadatatypes Credential</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential
	 * @generated
	 */
	EClass gettoscadatatypesCredential();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getProtocol()
	 * @see #gettoscadatatypesCredential()
	 * @generated
	 */
	EAttribute gettoscadatatypesCredential_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getKeys()
	 * @see #gettoscadatatypesCredential()
	 * @generated
	 */
	EAttribute gettoscadatatypesCredential_Keys();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getTokentype <em>Tokentype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokentype</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getTokentype()
	 * @see #gettoscadatatypesCredential()
	 * @generated
	 */
	EAttribute gettoscadatatypesCredential_Tokentype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getUser()
	 * @see #gettoscadatatypesCredential()
	 * @generated
	 */
	EAttribute gettoscadatatypesCredential_User();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesCredential#getToken()
	 * @see #gettoscadatatypesCredential()
	 * @generated
	 */
	EAttribute gettoscadatatypesCredential_Token();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec <em>toscadatatypesnetwork Port Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>toscadatatypesnetwork Port Spec</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec
	 * @generated
	 */
	EClass gettoscadatatypesnetworkPortSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getProtocol()
	 * @see #gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortSpec_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTargetrange <em>Targetrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targetrange</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTargetrange()
	 * @see #gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortSpec_Targetrange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSourcerange <em>Sourcerange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sourcerange</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSourcerange()
	 * @see #gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortSpec_Sourcerange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getSource()
	 * @see #gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortSpec_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.eclipse.cmf.occi.tosca.toscadatatypesnetworkPortSpec#getTarget()
	 * @see #gettoscadatatypesnetworkPortSpec()
	 * @generated
	 */
	EAttribute gettoscadatatypesnetworkPortSpec_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_root <em>Tosca capabilities root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_root
	 * @generated
	 */
	EClass getTosca_capabilities_root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_node <em>Tosca capabilities node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities node</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_node
	 * @generated
	 */
	EClass getTosca_capabilities_node();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint <em>Tosca capabilities endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPortName <em>Port Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPortName()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_PortName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getProtocol()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPort()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getInitiator()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Initiator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getNetworkName <em>Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getNetworkName()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_NetworkName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getSecure <em>Secure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getSecure()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Secure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ports</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getPorts()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getUrlPath <em>Url Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Path</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint#getUrlPath()
	 * @see #getTosca_capabilities_endpoint()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_UrlPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable <em>Tosca capabilities scalable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities scalable</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable
	 * @generated
	 */
	EClass getTosca_capabilities_scalable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMinInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getMaxInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getDefaultInstances <em>Default Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instances</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_scalable#getDefaultInstances()
	 * @see #getTosca_capabilities_scalable()
	 * @generated
	 */
	EAttribute getTosca_capabilities_scalable_DefaultInstances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable <em>Tosca capabilities network bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities network bindable</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_network_bindable
	 * @generated
	 */
	EClass getTosca_capabilities_network_bindable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container <em>Tosca capabilities container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities container</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container
	 * @generated
	 */
	EClass getTosca_capabilities_container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getNumCpus <em>Num Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cpus</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getNumCpus()
	 * @see #getTosca_capabilities_container()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_NumCpus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getDiskSize <em>Disk Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk Size</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getDiskSize()
	 * @see #getTosca_capabilities_container()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_DiskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getCpuFrequency <em>Cpu Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getCpuFrequency()
	 * @see #getTosca_capabilities_container()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getMemSize <em>Mem Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Size</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_container#getMemSize()
	 * @see #getTosca_capabilities_container()
	 * @generated
	 */
	EAttribute getTosca_capabilities_container_MemSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database <em>Tosca capabilities endpoint database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint database</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_database
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_database();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public <em>Tosca capabilities endpoint public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint public</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_public();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getFloating <em>Floating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getFloating()
	 * @see #getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_public_Floating();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getDnsName <em>Dns Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public#getDnsName()
	 * @see #getTosca_capabilities_endpoint_public()
	 * @generated
	 */
	EAttribute getTosca_capabilities_endpoint_public_DnsName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin <em>Tosca capabilities endpoint admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities endpoint admin</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_admin
	 * @generated
	 */
	EClass getTosca_capabilities_endpoint_admin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem <em>Tosca capabilities operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities operatingsystem</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem
	 * @generated
	 */
	EClass getTosca_capabilities_operatingsystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getType()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distribution</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getDistribution()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Distribution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getVersion()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_operatingsystem#getArchitecture()
	 * @see #getTosca_capabilities_operatingsystem()
	 * @generated
	 */
	EAttribute getTosca_capabilities_operatingsystem_Architecture();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_capabilities_attachment <em>Tosca capabilities attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca capabilities attachment</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_capabilities_attachment
	 * @generated
	 */
	EClass getTosca_capabilities_attachment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_root <em>Tosca nodes root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_root
	 * @generated
	 */
	EClass getTosca_nodes_root();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication <em>Tosca nodes webapplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webapplication</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication
	 * @generated
	 */
	EClass getTosca_nodes_webapplication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#getContextRoot <em>Context Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#getContextRoot()
	 * @see #getTosca_nodes_webapplication()
	 * @generated
	 */
	EAttribute getTosca_nodes_webapplication_ContextRoot();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webapplication#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent <em>Tosca nodes softwarecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes softwarecomponent</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent
	 * @generated
	 */
	EClass getTosca_nodes_softwarecomponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential <em>Admin Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admin Credential</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getAdminCredential()
	 * @see #getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	EReference getTosca_nodes_softwarecomponent_AdminCredential();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion <em>Component Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Version</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#getComponentVersion()
	 * @see #getTosca_nodes_softwarecomponent()
	 * @generated
	 */
	EAttribute getTosca_nodes_softwarecomponent_ComponentVersion();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_softwarecomponent#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms <em>Tosca nodes dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes dbms</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms
	 * @generated
	 */
	EClass getTosca_nodes_dbms();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getPort()
	 * @see #getTosca_nodes_dbms()
	 * @generated
	 */
	EAttribute getTosca_nodes_dbms_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getRootPassword <em>Root Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Password</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#getRootPassword()
	 * @see #getTosca_nodes_dbms()
	 * @generated
	 */
	EAttribute getTosca_nodes_dbms_RootPassword();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#SourceMustBeDatabase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Database</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_dbms#SourceMustBeDatabase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage <em>Tosca nodes objectstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes objectstorage</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage
	 * @generated
	 */
	EClass getTosca_nodes_objectstorage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#getSize()
	 * @see #getTosca_nodes_objectstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_objectstorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#getName()
	 * @see #getTosca_nodes_objectstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_objectstorage_Name();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_objectstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute <em>Tosca nodes compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes compute</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute
	 * @generated
	 */
	EClass getTosca_nodes_compute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getPrivateAddress <em>Private Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Address</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getPrivateAddress()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_PrivateAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getPublicAddress <em>Public Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Address</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getPublicAddress()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_PublicAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Networks</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#getNetworks()
	 * @see #getTosca_nodes_compute()
	 * @generated
	 */
	EAttribute getTosca_nodes_compute_Networks();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#SourceMustBeSoftwareComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Software Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Software Component</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#SourceMustBeSoftwareComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_compute#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer <em>Tosca nodes loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes loadbalancer</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer
	 * @generated
	 */
	EClass getTosca_nodes_loadbalancer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer#getAlgorithm()
	 * @see #getTosca_nodes_loadbalancer()
	 * @generated
	 */
	EAttribute getTosca_nodes_loadbalancer_Algorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver <em>Tosca nodes webserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes webserver</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver
	 * @generated
	 */
	EClass getTosca_nodes_webserver();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver#SourceMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Web Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Web Application</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_webserver#SourceMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database <em>Tosca nodes database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes database</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database
	 * @generated
	 */
	EClass getTosca_nodes_database();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getPassword()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getName()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database#getUser()
	 * @see #getTosca_nodes_database()
	 * @generated
	 */
	EAttribute getTosca_nodes_database_User();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_database#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_database#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application <em>Tosca nodes container application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes container application</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application
	 * @generated
	 */
	EClass getTosca_nodes_container_application();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_container_application#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime <em>Tosca nodes container runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes container runtime</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_container_runtime
	 * @generated
	 */
	EClass getTosca_nodes_container_runtime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage <em>Tosca nodes blockstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca nodes blockstorage</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage
	 * @generated
	 */
	EClass getTosca_nodes_blockstorage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getSize()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getVolumeId <em>Volume Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Id</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getVolumeId()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_VolumeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getSnapshotId <em>Snapshot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot Id</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#getSnapshotId()
	 * @see #getTosca_nodes_blockstorage()
	 * @generated
	 */
	EAttribute getTosca_nodes_blockstorage_SnapshotId();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_nodes_blockstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_root <em>Tosca policies root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_root
	 * @generated
	 */
	EClass getTosca_policies_root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_update <em>Tosca policies update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies update</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_update
	 * @generated
	 */
	EClass getTosca_policies_update();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_placement <em>Tosca policies placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies placement</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_placement
	 * @generated
	 */
	EClass getTosca_policies_placement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_scaling <em>Tosca policies scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies scaling</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_scaling
	 * @generated
	 */
	EClass getTosca_policies_scaling();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_policies_performance <em>Tosca policies performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca policies performance</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_policies_performance
	 * @generated
	 */
	EClass getTosca_policies_performance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_groups_root <em>Tosca groups root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca groups root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_groups_root
	 * @generated
	 */
	EClass getTosca_groups_root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_root <em>Tosca interfaces root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_root
	 * @generated
	 */
	EClass getTosca_interfaces_root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure <em>Tosca interfaces relationship configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces relationship configure</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure
	 * @generated
	 */
	EClass getTosca_interfaces_relationship_configure();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#pre_configure_source() <em>Pre configure source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre configure source</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#pre_configure_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Pre_configure_source();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#pre_configure_target() <em>Pre configure target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre configure target</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#pre_configure_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Pre_configure_target();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#post_configure_source() <em>Post configure source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post configure source</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#post_configure_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Post_configure_source();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#post_configure_target() <em>Post configure target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post configure target</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#post_configure_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Post_configure_target();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#remove_target() <em>Remove target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove target</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#remove_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Remove_target();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#add_target() <em>Add target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add target</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#add_target()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Add_target();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#add_source() <em>Add source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add source</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#add_source()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Add_source();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#target_changed() <em>Target changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target changed</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_relationship_configure#target_changed()
	 * @generated
	 */
	EOperation getTosca_interfaces_relationship_configure__Target_changed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard <em>Tosca interfaces node lifecycle standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca interfaces node lifecycle standard</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard
	 * @generated
	 */
	EClass getTosca_interfaces_node_lifecycle_standard();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#create() <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#create()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Create();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#configure() <em>Configure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#configure()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Configure();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_interfaces_node_lifecycle_standard#delete()
	 * @generated
	 */
	EOperation getTosca_interfaces_node_lifecycle_standard__Delete();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root <em>Tosca relationships root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships root</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root
	 * @generated
	 */
	EClass getTosca_relationships_root();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getToscaName <em>Tosca Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tosca Name</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getToscaName()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_ToscaName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getState()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getToscaId <em>Tosca Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tosca Id</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root#getToscaId()
	 * @see #getTosca_relationships_root()
	 * @generated
	 */
	EAttribute getTosca_relationships_root_ToscaId();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_root#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto <em>Tosca relationships connectsto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships connectsto</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto
	 * @generated
	 */
	EClass getTosca_relationships_connectsto();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credential</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_connectsto#getCredential()
	 * @see #getTosca_relationships_connectsto()
	 * @generated
	 */
	EReference getTosca_relationships_connectsto_Credential();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto <em>Tosca relationships routesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships routesto</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto
	 * @generated
	 */
	EClass getTosca_relationships_routesto();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto#SourceMustBeLoadBalancer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Load Balancer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Load Balancer</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_routesto#SourceMustBeLoadBalancer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto <em>Tosca relationships attachesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships attachesto</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto
	 * @generated
	 */
	EClass getTosca_relationships_attachesto();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#getLocation()
	 * @see #getTosca_relationships_attachesto()
	 * @generated
	 */
	EAttribute getTosca_relationships_attachesto_Location();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#SourceMustBeComputeAndTargetMustBeBlockStorage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Compute And Target Must Be Block Storage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Compute And Target Must Be Block Storage</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_attachesto#SourceMustBeComputeAndTargetMustBeBlockStorage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon <em>Tosca relationships hostedon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships hostedon</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon
	 * @generated
	 */
	EClass getTosca_relationships_hostedon();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeWebServerAndTargetMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Web Server And Target Must Be Web Application</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Web Server And Target Must Be Web Application</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeWebServerAndTargetMustBeWebApplication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Container Application And Target Must Be Container Runtime</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Container Application And Target Must Be Container Runtime</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeSoftwareComponentAndTargetMustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Software Component And Target Must Be Compute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Software Component And Target Must Be Compute</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeSoftwareComponentAndTargetMustBeCompute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeDatabaseAndTargetMustBeDBMS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Database And Target Must Be DBMS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Database And Target Must Be DBMS</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_hostedon#SourceMustBeDatabaseAndTargetMustBeDBMS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson <em>Tosca relationships dependson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tosca relationships dependson</em>'.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson
	 * @generated
	 */
	EClass getTosca_relationships_dependson();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson#SourceMustBeNodeAndTargetMustBeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Must Be Node And Target Must Be Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Must Be Node And Target Must Be Node</em>' operation.
	 * @see org.eclipse.cmf.occi.tosca.Tosca_relationships_dependson#SourceMustBeNodeAndTargetMustBeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.tosca.protocolEnum <em>protocol Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>protocol Enum</em>'.
	 * @see org.eclipse.cmf.occi.tosca.protocolEnum
	 * @generated
	 */
	EEnum getprotocolEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.tosca.initiatorEnum <em>initiator Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>initiator Enum</em>'.
	 * @see org.eclipse.cmf.occi.tosca.initiatorEnum
	 * @generated
	 */
	EEnum getinitiatorEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getstring();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string Min One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string Min One</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="minLength='1' pattern='null'"
	 * @generated
	 */
	EDataType getstringMinOne();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>byte</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 * @generated
	 */
	EDataType getbyte();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getfloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getinteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>integer Min One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>integer Min One</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='1'"
	 * @generated
	 */
	EDataType getintegerMinOne();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getlong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>short</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 * @generated
	 */
	EDataType getshort();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getmap();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>version</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='((\\d+)((\\.\\d+)+)?)'"
	 * @generated
	 */
	EDataType getversion();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>range</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="MinInclusive='1' MaxInclusive='65535'"
	 * @generated
	 */
	EDataType getrange();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>toscadatatypesnetwork Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>toscadatatypesnetwork Port Def</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="MinInclusive='1' MaxInclusive='65535'"
	 * @generated
	 */
	EDataType gettoscadatatypesnetworkPortDef();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>scalar Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Frequency</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="MinInclusive='0.1 GHz'"
	 * @generated
	 */
	EDataType getscalarFrequency();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min One MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min One MB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='1 MB'"
	 * @generated
	 */
	EDataType getscalarSizeMinOneMB();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min Zero GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min Zero GB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='0 GB'"
	 * @generated
	 */
	EDataType getscalarSizeMinZeroGB();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>scalar Size Min Zero MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>scalar Size Min Zero MB</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="MinInclusive='0 MB'"
	 * @generated
	 */
	EDataType getscalarSizeMinZeroMB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscaFactory getToscaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayStringImpl <em>array String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayStringImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayString()
		 * @generated
		 */
		EClass ARRAY_STRING = eINSTANCE.getarrayString();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_STRING__VALUES = eINSTANCE.getarrayString_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayBooleanImpl <em>array Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayBooleanImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayBoolean()
		 * @generated
		 */
		EClass ARRAY_BOOLEAN = eINSTANCE.getarrayBoolean();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_BOOLEAN__VALUES = eINSTANCE.getarrayBoolean_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayByteImpl <em>array Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayByteImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayByte()
		 * @generated
		 */
		EClass ARRAY_BYTE = eINSTANCE.getarrayByte();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_BYTE__VALUES = eINSTANCE.getarrayByte_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayDoubleImpl <em>array Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayDoubleImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayDouble()
		 * @generated
		 */
		EClass ARRAY_DOUBLE = eINSTANCE.getarrayDouble();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_DOUBLE__VALUES = eINSTANCE.getarrayDouble_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayFloatImpl <em>array Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayFloatImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayFloat()
		 * @generated
		 */
		EClass ARRAY_FLOAT = eINSTANCE.getarrayFloat();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_FLOAT__VALUES = eINSTANCE.getarrayFloat_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayIntegerImpl <em>array Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayIntegerImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayInteger()
		 * @generated
		 */
		EClass ARRAY_INTEGER = eINSTANCE.getarrayInteger();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INTEGER__VALUES = eINSTANCE.getarrayInteger_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayLongImpl <em>array Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayLongImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayLong()
		 * @generated
		 */
		EClass ARRAY_LONG = eINSTANCE.getarrayLong();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_LONG__VALUES = eINSTANCE.getarrayLong_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.arrayShortImpl <em>array Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.arrayShortImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getarrayShort()
		 * @generated
		 */
		EClass ARRAY_SHORT = eINSTANCE.getarrayShort();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SHORT__VALUES = eINSTANCE.getarrayShort_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl <em>toscadatatypesnetwork Network Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkNetworkInfoImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkNetworkInfo()
		 * @generated
		 */
		EClass TOSCADATATYPESNETWORK_NETWORK_INFO = eINSTANCE.gettoscadatatypesnetworkNetworkInfo();

		/**
		 * The meta object literal for the '<em><b>Networkid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKID = eINSTANCE.gettoscadatatypesnetworkNetworkInfo_Networkid();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCADATATYPESNETWORK_NETWORK_INFO__ADDRESSES = eINSTANCE.gettoscadatatypesnetworkNetworkInfo_Addresses();

		/**
		 * The meta object literal for the '<em><b>Networkname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_NETWORK_INFO__NETWORKNAME = eINSTANCE.gettoscadatatypesnetworkNetworkInfo_Networkname();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortInfoImpl <em>toscadatatypesnetwork Port Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortInfoImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortInfo()
		 * @generated
		 */
		EClass TOSCADATATYPESNETWORK_PORT_INFO = eINSTANCE.gettoscadatatypesnetworkPortInfo();

		/**
		 * The meta object literal for the '<em><b>Portname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_INFO__PORTNAME = eINSTANCE.gettoscadatatypesnetworkPortInfo_Portname();

		/**
		 * The meta object literal for the '<em><b>Networkid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_INFO__NETWORKID = eINSTANCE.gettoscadatatypesnetworkPortInfo_Networkid();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCADATATYPESNETWORK_PORT_INFO__ADDRESSES = eINSTANCE.gettoscadatatypesnetworkPortInfo_Addresses();

		/**
		 * The meta object literal for the '<em><b>Macaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_INFO__MACADDRESS = eINSTANCE.gettoscadatatypesnetworkPortInfo_Macaddress();

		/**
		 * The meta object literal for the '<em><b>Portid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_INFO__PORTID = eINSTANCE.gettoscadatatypesnetworkPortInfo_Portid();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesCredentialImpl <em>toscadatatypes Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesCredentialImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesCredential()
		 * @generated
		 */
		EClass TOSCADATATYPES_CREDENTIAL = eINSTANCE.gettoscadatatypesCredential();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPES_CREDENTIAL__PROTOCOL = eINSTANCE.gettoscadatatypesCredential_Protocol();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPES_CREDENTIAL__KEYS = eINSTANCE.gettoscadatatypesCredential_Keys();

		/**
		 * The meta object literal for the '<em><b>Tokentype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPES_CREDENTIAL__TOKENTYPE = eINSTANCE.gettoscadatatypesCredential_Tokentype();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPES_CREDENTIAL__USER = eINSTANCE.gettoscadatatypesCredential_User();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPES_CREDENTIAL__TOKEN = eINSTANCE.gettoscadatatypesCredential_Token();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortSpecImpl <em>toscadatatypesnetwork Port Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.toscadatatypesnetworkPortSpecImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortSpec()
		 * @generated
		 */
		EClass TOSCADATATYPESNETWORK_PORT_SPEC = eINSTANCE.gettoscadatatypesnetworkPortSpec();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_SPEC__PROTOCOL = eINSTANCE.gettoscadatatypesnetworkPortSpec_Protocol();

		/**
		 * The meta object literal for the '<em><b>Targetrange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_SPEC__TARGETRANGE = eINSTANCE.gettoscadatatypesnetworkPortSpec_Targetrange();

		/**
		 * The meta object literal for the '<em><b>Sourcerange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_SPEC__SOURCERANGE = eINSTANCE.gettoscadatatypesnetworkPortSpec_Sourcerange();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_SPEC__SOURCE = eINSTANCE.gettoscadatatypesnetworkPortSpec_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCADATATYPESNETWORK_PORT_SPEC__TARGET = eINSTANCE.gettoscadatatypesnetworkPortSpec_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_rootImpl <em>Tosca capabilities root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_root()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ROOT = eINSTANCE.getTosca_capabilities_root();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_nodeImpl <em>Tosca capabilities node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_nodeImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_node()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_NODE = eINSTANCE.getTosca_capabilities_node();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpointImpl <em>Tosca capabilities endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpointImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT = eINSTANCE.getTosca_capabilities_endpoint();

		/**
		 * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME = eINSTANCE.getTosca_capabilities_endpoint_PortName();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL = eINSTANCE.getTosca_capabilities_endpoint_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORT = eINSTANCE.getTosca_capabilities_endpoint_Port();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__INITIATOR = eINSTANCE.getTosca_capabilities_endpoint_Initiator();

		/**
		 * The meta object literal for the '<em><b>Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME = eINSTANCE.getTosca_capabilities_endpoint_NetworkName();

		/**
		 * The meta object literal for the '<em><b>Secure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__SECURE = eINSTANCE.getTosca_capabilities_endpoint_Secure();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__PORTS = eINSTANCE.getTosca_capabilities_endpoint_Ports();

		/**
		 * The meta object literal for the '<em><b>Url Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT__URL_PATH = eINSTANCE.getTosca_capabilities_endpoint_UrlPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_scalableImpl <em>Tosca capabilities scalable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_scalableImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_scalable()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_SCALABLE = eINSTANCE.getTosca_capabilities_scalable();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__MIN_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__MAX_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Default Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_SCALABLE__DEFAULT_INSTANCES = eINSTANCE.getTosca_capabilities_scalable_DefaultInstances();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_network_bindableImpl <em>Tosca capabilities network bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_network_bindableImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_network_bindable()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_NETWORK_BINDABLE = eINSTANCE.getTosca_capabilities_network_bindable();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl <em>Tosca capabilities container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_containerImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_container()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_CONTAINER = eINSTANCE.getTosca_capabilities_container();

		/**
		 * The meta object literal for the '<em><b>Num Cpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER__NUM_CPUS = eINSTANCE.getTosca_capabilities_container_NumCpus();

		/**
		 * The meta object literal for the '<em><b>Disk Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER__DISK_SIZE = eINSTANCE.getTosca_capabilities_container_DiskSize();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER__CPU_FREQUENCY = eINSTANCE.getTosca_capabilities_container_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Mem Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_CONTAINER__MEM_SIZE = eINSTANCE.getTosca_capabilities_container_MemSize();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_databaseImpl <em>Tosca capabilities endpoint database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_databaseImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_database()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_DATABASE = eINSTANCE.getTosca_capabilities_endpoint_database();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl <em>Tosca capabilities endpoint public</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_publicImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_public()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_PUBLIC = eINSTANCE.getTosca_capabilities_endpoint_public();

		/**
		 * The meta object literal for the '<em><b>Floating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING = eINSTANCE.getTosca_capabilities_endpoint_public_Floating();

		/**
		 * The meta object literal for the '<em><b>Dns Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME = eINSTANCE.getTosca_capabilities_endpoint_public_DnsName();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_adminImpl <em>Tosca capabilities endpoint admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_endpoint_adminImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_endpoint_admin()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ENDPOINT_ADMIN = eINSTANCE.getTosca_capabilities_endpoint_admin();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_operatingsystemImpl <em>Tosca capabilities operatingsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_operatingsystemImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_operatingsystem()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_OPERATINGSYSTEM = eINSTANCE.getTosca_capabilities_operatingsystem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__TYPE = eINSTANCE.getTosca_capabilities_operatingsystem_Type();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__DISTRIBUTION = eINSTANCE.getTosca_capabilities_operatingsystem_Distribution();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__VERSION = eINSTANCE.getTosca_capabilities_operatingsystem_Version();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_CAPABILITIES_OPERATINGSYSTEM__ARCHITECTURE = eINSTANCE.getTosca_capabilities_operatingsystem_Architecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_attachmentImpl <em>Tosca capabilities attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_capabilities_attachmentImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_capabilities_attachment()
		 * @generated
		 */
		EClass TOSCA_CAPABILITIES_ATTACHMENT = eINSTANCE.getTosca_capabilities_attachment();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl <em>Tosca nodes root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_root()
		 * @generated
		 */
		EClass TOSCA_NODES_ROOT = eINSTANCE.getTosca_nodes_root();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_root__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl <em>Tosca nodes webapplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webapplicationImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_webapplication()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBAPPLICATION = eINSTANCE.getTosca_nodes_webapplication();

		/**
		 * The meta object literal for the '<em><b>Context Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_WEBAPPLICATION__CONTEXT_ROOT = eINSTANCE.getTosca_nodes_webapplication_ContextRoot();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_WEBAPPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_webapplication__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl <em>Tosca nodes softwarecomponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_softwarecomponentImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_softwarecomponent()
		 * @generated
		 */
		EClass TOSCA_NODES_SOFTWARECOMPONENT = eINSTANCE.getTosca_nodes_softwarecomponent();

		/**
		 * The meta object literal for the '<em><b>Admin Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_NODES_SOFTWARECOMPONENT__ADMIN_CREDENTIAL = eINSTANCE.getTosca_nodes_softwarecomponent_AdminCredential();

		/**
		 * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_SOFTWARECOMPONENT__COMPONENT_VERSION = eINSTANCE.getTosca_nodes_softwarecomponent_ComponentVersion();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_SOFTWARECOMPONENT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_softwarecomponent__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_dbmsImpl <em>Tosca nodes dbms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_dbmsImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_dbms()
		 * @generated
		 */
		EClass TOSCA_NODES_DBMS = eINSTANCE.getTosca_nodes_dbms();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DBMS__PORT = eINSTANCE.getTosca_nodes_dbms_Port();

		/**
		 * The meta object literal for the '<em><b>Root Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DBMS__ROOT_PASSWORD = eINSTANCE.getTosca_nodes_dbms_RootPassword();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Database</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_DBMS___SOURCE_MUST_BE_DATABASE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_dbms__SourceMustBeDatabase__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl <em>Tosca nodes objectstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_objectstorageImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_objectstorage()
		 * @generated
		 */
		EClass TOSCA_NODES_OBJECTSTORAGE = eINSTANCE.getTosca_nodes_objectstorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_OBJECTSTORAGE__SIZE = eINSTANCE.getTosca_nodes_objectstorage_Size();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_OBJECTSTORAGE__NAME = eINSTANCE.getTosca_nodes_objectstorage_Name();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_OBJECTSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_objectstorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl <em>Tosca nodes compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_computeImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_compute()
		 * @generated
		 */
		EClass TOSCA_NODES_COMPUTE = eINSTANCE.getTosca_nodes_compute();

		/**
		 * The meta object literal for the '<em><b>Private Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__PRIVATE_ADDRESS = eINSTANCE.getTosca_nodes_compute_PrivateAddress();

		/**
		 * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__PUBLIC_ADDRESS = eINSTANCE.getTosca_nodes_compute_PublicAddress();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_COMPUTE__NETWORKS = eINSTANCE.getTosca_nodes_compute_Networks();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Software Component</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_COMPUTE___SOURCE_MUST_BE_SOFTWARE_COMPONENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_compute__SourceMustBeSoftwareComponent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_COMPUTE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_compute__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl <em>Tosca nodes loadbalancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_loadbalancer()
		 * @generated
		 */
		EClass TOSCA_NODES_LOADBALANCER = eINSTANCE.getTosca_nodes_loadbalancer();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_LOADBALANCER__ALGORITHM = eINSTANCE.getTosca_nodes_loadbalancer_Algorithm();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webserverImpl <em>Tosca nodes webserver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_webserverImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_webserver()
		 * @generated
		 */
		EClass TOSCA_NODES_WEBSERVER = eINSTANCE.getTosca_nodes_webserver();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Web Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_WEBSERVER___SOURCE_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_webserver__SourceMustBeWebApplication__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_databaseImpl <em>Tosca nodes database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_databaseImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_database()
		 * @generated
		 */
		EClass TOSCA_NODES_DATABASE = eINSTANCE.getTosca_nodes_database();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__PASSWORD = eINSTANCE.getTosca_nodes_database_Password();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__NAME = eINSTANCE.getTosca_nodes_database_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_DATABASE__USER = eINSTANCE.getTosca_nodes_database_User();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_DATABASE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_database__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_applicationImpl <em>Tosca nodes container application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_applicationImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_container_application()
		 * @generated
		 */
		EClass TOSCA_NODES_CONTAINER_APPLICATION = eINSTANCE.getTosca_nodes_container_application();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_CONTAINER_APPLICATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_container_application__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl <em>Tosca nodes container runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_container_runtimeImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_container_runtime()
		 * @generated
		 */
		EClass TOSCA_NODES_CONTAINER_RUNTIME = eINSTANCE.getTosca_nodes_container_runtime();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_blockstorageImpl <em>Tosca nodes blockstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_blockstorageImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_nodes_blockstorage()
		 * @generated
		 */
		EClass TOSCA_NODES_BLOCKSTORAGE = eINSTANCE.getTosca_nodes_blockstorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__SIZE = eINSTANCE.getTosca_nodes_blockstorage_Size();

		/**
		 * The meta object literal for the '<em><b>Volume Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__VOLUME_ID = eINSTANCE.getTosca_nodes_blockstorage_VolumeId();

		/**
		 * The meta object literal for the '<em><b>Snapshot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_NODES_BLOCKSTORAGE__SNAPSHOT_ID = eINSTANCE.getTosca_nodes_blockstorage_SnapshotId();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_NODES_BLOCKSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_nodes_blockstorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_rootImpl <em>Tosca policies root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_root()
		 * @generated
		 */
		EClass TOSCA_POLICIES_ROOT = eINSTANCE.getTosca_policies_root();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_updateImpl <em>Tosca policies update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_updateImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_update()
		 * @generated
		 */
		EClass TOSCA_POLICIES_UPDATE = eINSTANCE.getTosca_policies_update();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_placementImpl <em>Tosca policies placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_placementImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_placement()
		 * @generated
		 */
		EClass TOSCA_POLICIES_PLACEMENT = eINSTANCE.getTosca_policies_placement();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_scalingImpl <em>Tosca policies scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_scalingImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_scaling()
		 * @generated
		 */
		EClass TOSCA_POLICIES_SCALING = eINSTANCE.getTosca_policies_scaling();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_policies_performanceImpl <em>Tosca policies performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_policies_performanceImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_policies_performance()
		 * @generated
		 */
		EClass TOSCA_POLICIES_PERFORMANCE = eINSTANCE.getTosca_policies_performance();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_groups_rootImpl <em>Tosca groups root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_groups_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_groups_root()
		 * @generated
		 */
		EClass TOSCA_GROUPS_ROOT = eINSTANCE.getTosca_groups_root();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_rootImpl <em>Tosca interfaces root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_root()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_ROOT = eINSTANCE.getTosca_interfaces_root();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_relationship_configureImpl <em>Tosca interfaces relationship configure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_relationship_configureImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_relationship_configure()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE = eINSTANCE.getTosca_interfaces_relationship_configure();

		/**
		 * The meta object literal for the '<em><b>Pre configure source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Pre_configure_source();

		/**
		 * The meta object literal for the '<em><b>Pre configure target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___PRE_CONFIGURE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Pre_configure_target();

		/**
		 * The meta object literal for the '<em><b>Post configure source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Post_configure_source();

		/**
		 * The meta object literal for the '<em><b>Post configure target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___POST_CONFIGURE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Post_configure_target();

		/**
		 * The meta object literal for the '<em><b>Remove target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___REMOVE_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Remove_target();

		/**
		 * The meta object literal for the '<em><b>Add target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_TARGET = eINSTANCE.getTosca_interfaces_relationship_configure__Add_target();

		/**
		 * The meta object literal for the '<em><b>Add source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___ADD_SOURCE = eINSTANCE.getTosca_interfaces_relationship_configure__Add_source();

		/**
		 * The meta object literal for the '<em><b>Target changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_RELATIONSHIP_CONFIGURE___TARGET_CHANGED = eINSTANCE.getTosca_interfaces_relationship_configure__Target_changed();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_node_lifecycle_standardImpl <em>Tosca interfaces node lifecycle standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_interfaces_node_lifecycle_standardImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_interfaces_node_lifecycle_standard()
		 * @generated
		 */
		EClass TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD = eINSTANCE.getTosca_interfaces_node_lifecycle_standard();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CREATE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Create();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___CONFIGURE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Configure();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_INTERFACES_NODE_LIFECYCLE_STANDARD___DELETE = eINSTANCE.getTosca_interfaces_node_lifecycle_standard__Delete();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_rootImpl <em>Tosca relationships root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_rootImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_root()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ROOT = eINSTANCE.getTosca_relationships_root();

		/**
		 * The meta object literal for the '<em><b>Tosca Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__TOSCA_NAME = eINSTANCE.getTosca_relationships_root_ToscaName();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__STATE = eINSTANCE.getTosca_relationships_root_State();

		/**
		 * The meta object literal for the '<em><b>Tosca Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ROOT__TOSCA_ID = eINSTANCE.getTosca_relationships_root_ToscaId();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ROOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_root__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_connectstoImpl <em>Tosca relationships connectsto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_connectstoImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_connectsto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_CONNECTSTO = eINSTANCE.getTosca_relationships_connectsto();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOSCA_RELATIONSHIPS_CONNECTSTO__CREDENTIAL = eINSTANCE.getTosca_relationships_connectsto_Credential();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_routestoImpl <em>Tosca relationships routesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_routestoImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_routesto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ROUTESTO = eINSTANCE.getTosca_relationships_routesto();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Load Balancer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ROUTESTO___SOURCE_MUST_BE_LOAD_BALANCER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_routesto__SourceMustBeLoadBalancer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_attachestoImpl <em>Tosca relationships attachesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_attachestoImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_attachesto()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_ATTACHESTO = eINSTANCE.getTosca_relationships_attachesto();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOSCA_RELATIONSHIPS_ATTACHESTO__LOCATION = eINSTANCE.getTosca_relationships_attachesto_Location();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ATTACHESTO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_attachesto__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Compute And Target Must Be Block Storage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_ATTACHESTO___SOURCE_MUST_BE_COMPUTE_AND_TARGET_MUST_BE_BLOCK_STORAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_attachesto__SourceMustBeComputeAndTargetMustBeBlockStorage__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_hostedonImpl <em>Tosca relationships hostedon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_hostedonImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_hostedon()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_HOSTEDON = eINSTANCE.getTosca_relationships_hostedon();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Web Server And Target Must Be Web Application</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_WEB_SERVER_AND_TARGET_MUST_BE_WEB_APPLICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeWebServerAndTargetMustBeWebApplication__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Container Application And Target Must Be Container Runtime</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_CONTAINER_APPLICATION_AND_TARGET_MUST_BE_CONTAINER_RUNTIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeContainerApplicationAndTargetMustBeContainerRuntime__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Software Component And Target Must Be Compute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_SOFTWARE_COMPONENT_AND_TARGET_MUST_BE_COMPUTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeSoftwareComponentAndTargetMustBeCompute__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Database And Target Must Be DBMS</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_HOSTEDON___SOURCE_MUST_BE_DATABASE_AND_TARGET_MUST_BE_DBMS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_hostedon__SourceMustBeDatabaseAndTargetMustBeDBMS__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_dependsonImpl <em>Tosca relationships dependson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.impl.Tosca_relationships_dependsonImpl
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getTosca_relationships_dependson()
		 * @generated
		 */
		EClass TOSCA_RELATIONSHIPS_DEPENDSON = eINSTANCE.getTosca_relationships_dependson();

		/**
		 * The meta object literal for the '<em><b>Source Must Be Node And Target Must Be Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOSCA_RELATIONSHIPS_DEPENDSON___SOURCE_MUST_BE_NODE_AND_TARGET_MUST_BE_NODE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTosca_relationships_dependson__SourceMustBeNodeAndTargetMustBeNode__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.protocolEnum <em>protocol Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.protocolEnum
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getprotocolEnum()
		 * @generated
		 */
		EEnum PROTOCOL_ENUM = eINSTANCE.getprotocolEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.tosca.initiatorEnum <em>initiator Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.tosca.initiatorEnum
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getinitiatorEnum()
		 * @generated
		 */
		EEnum INITIATOR_ENUM = eINSTANCE.getinitiatorEnum();

		/**
		 * The meta object literal for the '<em>string</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getstring()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getstring();

		/**
		 * The meta object literal for the '<em>string Min One</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getstringMinOne()
		 * @generated
		 */
		EDataType STRING_MIN_ONE = eINSTANCE.getstringMinOne();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

		/**
		 * The meta object literal for the '<em>byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getbyte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getbyte();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

		/**
		 * The meta object literal for the '<em>float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getfloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getfloat();

		/**
		 * The meta object literal for the '<em>integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getinteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getinteger();

		/**
		 * The meta object literal for the '<em>integer Min One</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getintegerMinOne()
		 * @generated
		 */
		EDataType INTEGER_MIN_ONE = eINSTANCE.getintegerMinOne();

		/**
		 * The meta object literal for the '<em>long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getlong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getlong();

		/**
		 * The meta object literal for the '<em>short</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getshort()
		 * @generated
		 */
		EDataType SHORT = eINSTANCE.getshort();

		/**
		 * The meta object literal for the '<em>map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getmap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getmap();

		/**
		 * The meta object literal for the '<em>version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getversion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getversion();

		/**
		 * The meta object literal for the '<em>range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getrange()
		 * @generated
		 */
		EDataType RANGE = eINSTANCE.getrange();

		/**
		 * The meta object literal for the '<em>toscadatatypesnetwork Port Def</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#gettoscadatatypesnetworkPortDef()
		 * @generated
		 */
		EDataType TOSCADATATYPESNETWORK_PORT_DEF = eINSTANCE.gettoscadatatypesnetworkPortDef();

		/**
		 * The meta object literal for the '<em>scalar Frequency</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarFrequency()
		 * @generated
		 */
		EDataType SCALAR_FREQUENCY = eINSTANCE.getscalarFrequency();

		/**
		 * The meta object literal for the '<em>scalar Size Min One MB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinOneMB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ONE_MB = eINSTANCE.getscalarSizeMinOneMB();

		/**
		 * The meta object literal for the '<em>scalar Size Min Zero GB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinZeroGB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ZERO_GB = eINSTANCE.getscalarSizeMinZeroGB();

		/**
		 * The meta object literal for the '<em>scalar Size Min Zero MB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.tosca.impl.ToscaPackageImpl#getscalarSizeMinZeroMB()
		 * @generated
		 */
		EDataType SCALAR_SIZE_MIN_ZERO_MB = eINSTANCE.getscalarSizeMinZeroMB();

	}

} //ToscaPackage