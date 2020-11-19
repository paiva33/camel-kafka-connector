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
package org.apache.camel.kafkaconnector.thrift;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelThriftSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_THRIFT_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_THRIFT_PATH_HOST_DOC = "The Thrift server host name. This is localhost or 0.0.0.0 (if not defined) when being a consumer or remote server host name when using producer.";
    public static final String CAMEL_SOURCE_THRIFT_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_THRIFT_PATH_PORT_DOC = "The Thrift server port";
    public static final Integer CAMEL_SOURCE_THRIFT_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_PATH_SERVICE_CONF = "camel.source.path.service";
    public static final String CAMEL_SOURCE_THRIFT_PATH_SERVICE_DOC = "Fully qualified service name from the thrift descriptor file (package dot service definition name)";
    public static final String CAMEL_SOURCE_THRIFT_PATH_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_CONF = "camel.source.endpoint.compressionType";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_DOC = "Protocol compression mechanism type One of: [NONE] [ZLIB]";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_CONF = "camel.source.endpoint.exchangeProtocol";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_DOC = "Exchange protocol serialization type One of: [BINARY] [JSON] [SJSON] [COMPACT]";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_DEFAULT = "BINARY";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_CONF = "camel.source.endpoint.clientTimeout";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_DOC = "Client timeout for consumers";
    public static final Integer CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_CONF = "camel.source.endpoint.maxPoolSize";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_DOC = "The Thrift server consumer max thread pool size";
    public static final Integer CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_DEFAULT = 10;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_CONF = "camel.source.endpoint.poolSize";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_DOC = "The Thrift server consumer initial thread pool size";
    public static final Integer CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_DEFAULT = 1;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_CONF = "camel.source.endpoint.negotiationType";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_DOC = "Security negotiation type One of: [PLAINTEXT] [SSL] [SASL]";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_DEFAULT = "PLAINTEXT";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_CONF = "camel.source.endpoint.sslParameters";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_DOC = "Configuration parameters for SSL/TLS security negotiation";
    public static final String CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.thrift.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.thrift.autowiredEnabled";
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.thrift.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Determine if the thrift component is using global SSL context parameters";
    public static final Boolean CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelThriftSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelThriftSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_THRIFT_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_PATH_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_THRIFT_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_THRIFT_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_PATH_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_PATH_SERVICE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_THRIFT_PATH_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_CLIENT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_MAX_POOL_SIZE_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_POOL_SIZE_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_NEGOTIATION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_ENDPOINT_SSL_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_THRIFT_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}