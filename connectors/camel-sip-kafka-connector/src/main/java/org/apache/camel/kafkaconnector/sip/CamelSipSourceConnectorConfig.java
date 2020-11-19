/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.sip;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSipSourceConnectorConfig extends CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SIP_PATH_URI_CONF = "camel.source.path.uri";
    public static final String CAMEL_SOURCE_SIP_PATH_URI_DOC = "URI of the SIP server to connect to (the username and password can be included such as: john:secretmyserver:9999)";
    public static final String CAMEL_SOURCE_SIP_PATH_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_CONF = "camel.source.endpoint.cacheConnections";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_DOC = "Should connections be cached by the SipStack to reduce cost of connection creation. This is useful if the connection is used for long running conversations.";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_CONF = "camel.source.endpoint.contentSubType";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_DOC = "Setting for contentSubType can be set to any valid MimeSubType.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_DEFAULT = "plain";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_CONF = "camel.source.endpoint.contentType";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_DOC = "Setting for contentType can be set to any valid MimeType.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_DEFAULT = "text";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_CONF = "camel.source.endpoint.eventHeaderName";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_DOC = "Setting for a String based event type.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_CONF = "camel.source.endpoint.eventId";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_DOC = "Setting for a String based event Id. Mandatory setting unless a registry based FromHeader is specified";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_CONF = "camel.source.endpoint.fromHost";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_DOC = "Hostname of the message originator. Mandatory setting unless a registry based FromHeader is specified";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_CONF = "camel.source.endpoint.fromPort";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_DOC = "Port of the message originator. Mandatory setting unless a registry based FromHeader is specified";
    public static final Integer CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_CONF = "camel.source.endpoint.fromUser";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_DOC = "Username of the message originator. Mandatory setting unless a registry based custom FromHeader is specified.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_CONF = "camel.source.endpoint.msgExpiration";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_DOC = "The amount of time a message received at an endpoint is considered valid";
    public static final Integer CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_DEFAULT = 3600;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_CONF = "camel.source.endpoint.receiveTimeoutMillis";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_DOC = "Setting for specifying amount of time to wait for a Response and/or Acknowledgement can be received from another SIP stack";
    public static final Long CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_DEFAULT = 10000L;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_CONF = "camel.source.endpoint.stackName";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_DOC = "Name of the SIP Stack instance associated with an SIP Endpoint.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_DEFAULT = "NAME_NOT_SET";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_CONF = "camel.source.endpoint.toHost";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_DOC = "Hostname of the message receiver. Mandatory setting unless a registry based ToHeader is specified";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_CONF = "camel.source.endpoint.toPort";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_DOC = "Portname of the message receiver. Mandatory setting unless a registry based ToHeader is specified";
    public static final Integer CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_CONF = "camel.source.endpoint.toUser";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_DOC = "Username of the message receiver. Mandatory setting unless a registry based custom ToHeader is specified.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_CONF = "camel.source.endpoint.transport";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_DOC = "Setting for choice of transport protocol. Valid choices are tcp or udp. One of: [tcp] [udp]";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_DEFAULT = "tcp";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_CONF = "camel.source.endpoint.consumer";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_DOC = "This setting is used to determine whether the kind of header (FromHeader,ToHeader etc) that needs to be created for this endpoint";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_CONF = "camel.source.endpoint.presenceAgent";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_DOC = "This setting is used to distinguish between a Presence Agent & a consumer. This is due to the fact that the SIP Camel component ships with a basic Presence Agent (for testing purposes only). Consumers have to set this flag to true.";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_CONF = "camel.source.endpoint.addressFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_DOC = "To use a custom AddressFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_CONF = "camel.source.endpoint.callIdHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_DOC = "A custom Header object containing call details. Must implement the type javax.sip.header.CallIdHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_CONF = "camel.source.endpoint.contactHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_DOC = "An optional custom Header object containing verbose contact details (email, phone number etc). Must implement the type javax.sip.header.ContactHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_CONF = "camel.source.endpoint.contentTypeHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_DOC = "A custom Header object containing message content details. Must implement the type javax.sip.header.ContentTypeHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_CONF = "camel.source.endpoint.eventHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_DOC = "A custom Header object containing event details. Must implement the type javax.sip.header.EventHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_CONF = "camel.source.endpoint.expiresHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_DOC = "A custom Header object containing message expiration details. Must implement the type javax.sip.header.ExpiresHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_CONF = "camel.source.endpoint.extensionHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_DOC = "A custom Header object containing user/application specific details. Must implement the type javax.sip.header.ExtensionHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_CONF = "camel.source.endpoint.fromHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_DOC = "A custom Header object containing message originator settings. Must implement the type javax.sip.header.FromHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_CONF = "camel.source.endpoint.headerFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_DOC = "To use a custom HeaderFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_CONF = "camel.source.endpoint.listeningPoint";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_DOC = "To use a custom ListeningPoint implementation";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_CONF = "camel.source.endpoint.maxForwardsHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_DOC = "A custom Header object containing details on maximum proxy forwards. This header places a limit on the viaHeaders possible. Must implement the type javax.sip.header.MaxForwardsHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_CONF = "camel.source.endpoint.maxMessageSize";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_DOC = "Setting for maximum allowed Message size in bytes.";
    public static final Integer CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT = 1048576;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_CONF = "camel.source.endpoint.messageFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_DOC = "To use a custom MessageFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_CONF = "camel.source.endpoint.sipFactory";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_DOC = "To use a custom SipFactory to create the SipStack to be used";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_CONF = "camel.source.endpoint.sipStack";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_DOC = "To use a custom SipStack";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_CONF = "camel.source.endpoint.sipUri";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_DOC = "To use a custom SipURI. If none configured, then the SipUri fallback to use the options toUser toHost:toPort";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_CONF = "camel.source.endpoint.toHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_DOC = "A custom Header object containing message receiver settings. Must implement the type javax.sip.header.ToHeader";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_CONF = "camel.source.endpoint.viaHeaders";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_DOC = "List of custom Header objects of the type javax.sip.header.ViaHeader. Each ViaHeader containing a proxy address for request forwarding. (Note this header is automatically updated by each proxy when the request arrives at its listener)";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_CONF = "camel.source.endpoint.implementationDebugLogFile";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_DOC = "Name of client debug log file to use for logging";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_CONF = "camel.source.endpoint.implementationServerLogFile";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_DOC = "Name of server log file to use for logging";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_CONF = "camel.source.endpoint.implementationTraceLevel";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_DOC = "Logging level for tracing";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_DEFAULT = "0";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_CONF = "camel.source.endpoint.maxForwards";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_DOC = "Number of maximum proxy forwards";
    public static final Integer CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_CONF = "camel.source.endpoint.useRouterForAllUris";
    public static final String CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_DOC = "This setting is used when requests are sent to the Presence Agent via a proxy.";
    public static final Boolean CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.sip.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.sip.autowiredEnabled";
    public static final String CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelSipSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSipSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SIP_PATH_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_PATH_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SIP_PATH_URI_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CACHE_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_SUB_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_NAME_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_ID_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_FROM_HOST_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_FROM_PORT_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_FROM_USER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_MSG_EXPIRATION_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_RECEIVE_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_STACK_NAME_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_TO_HOST_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_TO_PORT_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_TO_USER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_TRANSPORT_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CONSUMER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_PRESENCE_AGENT_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_ADDRESS_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CALL_ID_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CONTACT_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_CONTENT_TYPE_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EVENT_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EXPIRES_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_EXTENSION_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_FROM_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_HEADER_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_LISTENING_POINT_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_MAX_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_MESSAGE_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_SIP_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_SIP_STACK_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_SIP_URI_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_TO_HEADER_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_VIA_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_DEBUG_LOG_FILE_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_SERVER_LOG_FILE_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_IMPLEMENTATION_TRACE_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_MAX_FORWARDS_DOC);
        conf.define(CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_ENDPOINT_USE_ROUTER_FOR_ALL_URIS_DOC);
        conf.define(CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SIP_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}