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
package org.apache.camel.kafkaconnector.docker;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDockerSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_DOCKER_PATH_OPERATION_CONF = "camel.source.path.operation";
    public static final String CAMEL_SOURCE_DOCKER_PATH_OPERATION_DOC = "Which operation to use One of: [events] [stats] [auth] [info] [ping] [version] [imagebuild] [imagecreate] [imageinspect] [imagelist] [imagepull] [imagepushimageremove] [imagesearch] [imagetag] [containerattach] [containercommit] [containercopyfile] [containercreate] [containerdiffinspectcontainer] [containerkill] [containerlist] [containerlog] [containerpause] [containerrestart] [containerremove] [containerstartcontainerstop] [containertop] [containerunpause] [containerwait] [execcreate] [execstart]";
    public static final String CAMEL_SOURCE_DOCKER_PATH_OPERATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_CONF = "camel.source.endpoint.email";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_DOC = "Email address associated with the user";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_CONF = "camel.source.endpoint.host";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_DOC = "Docker host";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_DEFAULT = "localhost";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_CONF = "camel.source.endpoint.port";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_DOC = "Docker port";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_DEFAULT = "2375";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_CONF = "camel.source.endpoint.requestTimeout";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_DOC = "Request timeout for response (in seconds)";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_CONF = "camel.source.endpoint.cmdExecFactory";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_DOC = "The fully qualified class name of the DockerCmdExecFactory implementation to use";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_DEFAULT = "com.github.dockerjava.netty.NettyDockerCmdExecFactory";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_CONF = "camel.source.endpoint.followRedirectFilter";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_DOC = "Whether to follow redirect filter";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_CONF = "camel.source.endpoint.loggingFilter";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_DOC = "Whether to use logging filter";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_CONF = "camel.source.endpoint.maxPerRouteConnections";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_DOC = "Maximum route connections";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_DEFAULT = "100";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_CONF = "camel.source.endpoint.maxTotalConnections";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_DOC = "Maximum total connections";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_DEFAULT = "100";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_CONF = "camel.source.endpoint.parameters";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_DOC = "Additional configuration parameters as key/value pairs";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_CONF = "camel.source.endpoint.serverAddress";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_DOC = "Server address for docker registry.";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_DEFAULT = "https://index.docker.io/v1/";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_CONF = "camel.source.endpoint.socket";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_DOC = "Socket connection mode";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_DEFAULT = true;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_CONF = "camel.source.endpoint.certPath";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_DOC = "Location containing the SSL certificate chain";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_DOC = "Password to authenticate with";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_CONF = "camel.source.endpoint.secure";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_DOC = "Use HTTPS communication";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_CONF = "camel.source.endpoint.tlsVerify";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_DOC = "Check TLS";
    public static final Boolean CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_CONF = "camel.source.endpoint.username";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_DOC = "User name to authenticate with";
    public static final String CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_CONF = "camel.component.docker.configuration";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_DOC = "To use the shared docker configuration";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_CONF = "camel.component.docker.email";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_DOC = "Email address associated with the user";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_HOST_CONF = "camel.component.docker.host";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_HOST_DOC = "Docker host";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_HOST_DEFAULT = "localhost";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PORT_CONF = "camel.component.docker.port";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PORT_DOC = "Docker port";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PORT_DEFAULT = "2375";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_CONF = "camel.component.docker.requestTimeout";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_DOC = "Request timeout for response (in seconds)";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.docker.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.docker.autowiredEnabled";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_CONF = "camel.component.docker.cmdExecFactory";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_DOC = "The fully qualified class name of the DockerCmdExecFactory implementation to use";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_DEFAULT = "com.github.dockerjava.netty.NettyDockerCmdExecFactory";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_CONF = "camel.component.docker.followRedirectFilter";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_DOC = "Whether to follow redirect filter";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_CONF = "camel.component.docker.loggingFilter";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_DOC = "Whether to use logging filter";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_CONF = "camel.component.docker.maxPerRouteConnections";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_DOC = "Maximum route connections";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_DEFAULT = "100";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_CONF = "camel.component.docker.maxTotalConnections";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_DOC = "Maximum total connections";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_DEFAULT = "100";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_CONF = "camel.component.docker.parameters";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_DOC = "Additional configuration parameters as key/value pairs";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_CONF = "camel.component.docker.serverAddress";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_DOC = "Server address for docker registry.";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_DEFAULT = "https://index.docker.io/v1/";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_CONF = "camel.component.docker.socket";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_DOC = "Socket connection mode";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_DEFAULT = true;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_CONF = "camel.component.docker.certPath";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_DOC = "Location containing the SSL certificate chain";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_CONF = "camel.component.docker.password";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_DOC = "Password to authenticate with";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_CONF = "camel.component.docker.secure";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_DOC = "Use HTTPS communication";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_CONF = "camel.component.docker.tlsVerify";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_DOC = "Check TLS";
    public static final Boolean CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_DEFAULT = false;
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_CONF = "camel.component.docker.username";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_DOC = "User name to authenticate with";
    public static final String CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_DEFAULT = null;

    public CamelDockerSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDockerSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_DOCKER_PATH_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_PATH_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DOCKER_PATH_OPERATION_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_EMAIL_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DOCKER_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_PORT_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_REQUEST_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_CMD_EXEC_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_FOLLOW_REDIRECT_FILTER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_LOGGING_FILTER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_PER_ROUTE_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_MAX_TOTAL_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_SERVER_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_SOCKET_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_CERT_PATH_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_SECURE_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_TLS_VERIFY_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_EMAIL_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_DOCKER_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_PORT_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_REQUEST_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_CMD_EXEC_FACTORY_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_FOLLOW_REDIRECT_FILTER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_LOGGING_FILTER_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_MAX_PER_ROUTE_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_MAX_TOTAL_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_SERVER_ADDRESS_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_SOCKET_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_CERT_PATH_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_SECURE_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_TLS_VERIFY_DOC);
        conf.define(CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_DOCKER_COMPONENT_USERNAME_DOC);
        return conf;
    }
}